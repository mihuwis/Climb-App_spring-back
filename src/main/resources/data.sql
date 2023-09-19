-- CLIMBING AREAS
insert into climbing_area (ID, NAME_OF_AREA, COUNTRY, IS_OUTDOOR)
values (10001, 'Garaż', 'Poland', false);

insert into climbing_area (ID, NAME_OF_AREA, COUNTRY, IS_OUTDOOR)
values (10002, 'Bronx', 'Poland', false);

insert into climbing_area (ID, NAME_OF_AREA, COUNTRY, IS_OUTDOOR)
values (10003, 'Dolina Bolechowicka', 'Poland', true);

insert into climbing_area (ID, NAME_OF_AREA, COUNTRY, IS_OUTDOOR)
values (10004, 'Siurana', 'Spain', true);

-- ROUTES PER AREA

-- GARAŻ

insert into CLIMBING_LINE (ID, ROUTE_NAME, CLIMBING_AREA_ID, GRADE, MOVES)
values (1004, 'Zielona', 10001, 400, 40);

insert into CLIMBING_LINE (ID, ROUTE_NAME, CLIMBING_AREA_ID, GRADE, MOVES)
values (1005, 'Fioletowa', 10001, 500, 40);

insert into CLIMBING_LINE (ID, ROUTE_NAME, CLIMBING_AREA_ID, GRADE, MOVES)
values (1006, 'Pomarańczowa', 10001, 600, 40);

insert into CLIMBING_LINE (ID, ROUTE_NAME, CLIMBING_AREA_ID, GRADE, MOVES)
values (1007, 'Czerwona', 10001, 700, 40);

-- Bolechowice

insert into CLIMBING_LINE (ID, ROUTE_NAME, CLIMBING_AREA_ID, GRADE, MOVES)
values (1008, 'Ryski nad tablicą', 10003, 450, 36);

insert into CLIMBING_LINE (ID, ROUTE_NAME, CLIMBING_AREA_ID, GRADE, MOVES)
values (1009, 'Brzytwa Ochama', 10003, 600, 31);

insert into CLIMBING_LINE (ID, ROUTE_NAME, CLIMBING_AREA_ID, GRADE, MOVES)
values (1010, 'Abazy', 10003, 800, 32);

-- Hiszpania
-- Siurana

insert into CLIMBING_LINE (ID, ROUTE_NAME, CLIMBING_AREA_ID, GRADE, MOVES)
values (1011, 'Espero Primavera', 10004, 800, 36);

insert into CLIMBING_LINE (ID, ROUTE_NAME, CLIMBING_AREA_ID, GRADE, MOVES)
values (1012, 'Pota de Elefante', 10004, 950, 31);

insert into CLIMBING_LINE (ID, ROUTE_NAME, CLIMBING_AREA_ID, GRADE, MOVES)
values (1013, 'Bistec de biceps', 10004, 800, 32);