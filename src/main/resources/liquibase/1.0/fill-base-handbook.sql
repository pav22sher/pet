--liquibase formatted sql

--changeset Scherbakov Pavel:fill-base-handbook context:prod

insert into prod.city(city_name)
values
('Москва'),
('Санкт-Петербург'),
('Самара'),
('Саратов'),
('Краснодар'),
('Нижний новгород');

insert into prod.league_level(league_level_name)
values
('Высшая лига'),
('Первая лига'),
('Вторая лига');

insert into prod.position(position_name)
values
('Универсал'),
('Нападающий'),
('Полузащитник'),
('Защитник'),
('Вратарь');