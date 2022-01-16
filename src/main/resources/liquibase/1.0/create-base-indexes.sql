--liquibase formatted sql

--changeset Scherbakov Pavel:create-base-indexes context:prod

create index league_league_level_id_idx  on prod.league(league_level_id);
create index league_city_id_idx  on prod.league(city_id);
create index team_league_id_idx  on prod.team(league_id);
create index player_position_id_idx  on prod.player(position_id);
create index player_team_id_idx on prod.player(team_id);