--liquibase formatted sql

--changeset Scherbakov Pavel:create-base-tables context:prod

create table prod.city
(
    city_id bigserial
        constraint city_pkey
            primary key,
    city_name varchar(255) not null
        constraint city_city_name_key
            unique
);
comment on table prod.city is 'Город';
comment on column prod.city.city_name is 'Название города';
alter table prod.city owner to prod;

create table prod.position
(
    position_id bigserial
        constraint position_pkey
            primary key,
    position_name varchar(255) not null
        constraint position_position_name_key
            unique
);
comment on table prod.position is 'Позиция игрока';
comment on column prod.position.position_name is 'Название позиции';
alter table prod.position owner to prod;

create table prod.league_level
(
    league_level_id bigserial
        constraint league_level_pkey
            primary key,
    league_level_name varchar(255) not null
        constraint league_level_league_level_name_key
            unique
);
comment on table prod.league_level is 'Уровень лиги';
comment on column prod.league_level.league_level_name is 'Название уровня лиги';
alter table prod.league_level owner to prod;

create table prod.league
(
    league_id bigserial
        constraint league_pkey
            primary key,
    league_level_id bigint
        constraint league_level_id_fkey
            references prod.league_level,
    city_id bigint
        constraint city_id_fkey
            references prod.city
);
comment on table prod.league is 'Лига';
comment on column prod.league.league_level_id is 'Уровень лиги';
comment on column prod.league.city_id is 'Город';
alter table prod.league owner to prod;

create table prod.team
(
    team_id bigserial
        constraint team_pkey
            primary key,
    team_name varchar(255) not null
        constraint team_team_name_key
            unique,
    league_id bigint not null
        constraint league_id_fkey
            references prod.league
);
comment on table prod.team is 'Команда';
comment on column prod.team.team_name is 'Название команды';
comment on column prod.team.league_id is 'Лига';
alter table prod.team owner to prod;

create table prod.player
(
    player_id bigserial
        constraint player_pkey
            primary key,
    player_first_name varchar(255) not null,
    player_last_name varchar(255) not null,
    player_second_name varchar(255),
    position_id bigint not null
        constraint position_id_fkey
            references prod.position,
    team_id bigint not null
        constraint team_id_fkey
            references prod.team
);
comment on table prod.player is 'Игрок';
comment on column prod.player.player_first_name is 'Имя игрока';
comment on column prod.player.player_last_name is 'Фамилия игрока';
comment on column prod.player.player_second_name is 'Отчество играка';
comment on column prod.player.position_id is 'Позиция';
comment on column prod.player.team_id is 'Команда';
alter table prod.player owner to prod;