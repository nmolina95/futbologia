INSERT INTO PAISES (ID, NOMBRE) VALUES (1, 'España');
INSERT INTO PAISES (ID, NOMBRE) VALUES (2, 'Inglaterra');
INSERT INTO PAISES (ID, NOMBRE) VALUES (3, 'Italia');
INSERT INTO PAISES (ID, NOMBRE) VALUES (4, 'Alemania');
INSERT INTO PAISES (ID, NOMBRE) VALUES (5, 'Francia');
INSERT INTO PAISES (ID, NOMBRE) VALUES (6, 'Portugal');
INSERT INTO PAISES (ID, NOMBRE) VALUES (7, 'Paises Bajos');
INSERT INTO PAISES (ID, NOMBRE) VALUES (8, 'Escocia');
INSERT INTO PAISES (ID, NOMBRE) VALUES (9, 'Turquía');
INSERT INTO PAISES (ID, NOMBRE) VALUES (10, 'Rusia');

INSERT INTO LIGAS (ID, NOMBRE) VALUES (1, 'La Liga');
INSERT INTO LIGAS (ID, NOMBRE) VALUES (2, 'Premier League');
INSERT INTO LIGAS (ID, NOMBRE) VALUES (3, 'Serie A');
INSERT INTO LIGAS (ID, NOMBRE) VALUES (4, 'Bundesliga');
INSERT INTO LIGAS (ID, NOMBRE) VALUES (5, 'Ligue 1');
INSERT INTO LIGAS (ID, NOMBRE) VALUES (6, 'Primeira Liga');
INSERT INTO LIGAS (ID, NOMBRE) VALUES (7, 'Eredivise');
INSERT INTO LIGAS (ID, NOMBRE) VALUES (8, 'Scottish Premiership');
INSERT INTO LIGAS (ID, NOMBRE) VALUES (9, 'Süper Lig');
INSERT INTO LIGAS (ID, NOMBRE) VALUES (10, 'Premier League Rusa');

INSERT INTO EQUIPOS (ID, NOMBRE, LIGA_ID, PAIS_ID) VALUES (1, 'Real Madrid', 1, 1);
INSERT INTO EQUIPOS (ID, NOMBRE, LIGA_ID, PAIS_ID) VALUES (2, 'FC Barcelona', 1, 1);
INSERT INTO EQUIPOS (ID, NOMBRE, LIGA_ID, PAIS_ID) VALUES (3, 'Manchester United', 2, 2);
INSERT INTO EQUIPOS (ID, NOMBRE, LIGA_ID, PAIS_ID) VALUES (4, 'Liverpool FC', 2, 2);
INSERT INTO EQUIPOS (ID, NOMBRE, LIGA_ID, PAIS_ID) VALUES (5, 'Juventus FC', 3, 3);
INSERT INTO EQUIPOS (ID, NOMBRE, LIGA_ID, PAIS_ID) VALUES (6, 'AC Milan', 3, 3);
INSERT INTO EQUIPOS (ID, NOMBRE, LIGA_ID, PAIS_ID) VALUES (7, 'Bayern Munich', 4, 4);
INSERT INTO EQUIPOS (ID, NOMBRE, LIGA_ID, PAIS_ID) VALUES (8, 'Borussia Dortmund', 4, 4);
INSERT INTO EQUIPOS (ID, NOMBRE, LIGA_ID, PAIS_ID) VALUES (9, 'Paris Saint-Germain', 5, 5);
INSERT INTO EQUIPOS (ID, NOMBRE, LIGA_ID, PAIS_ID) VALUES (10, 'Olympique de Marseille', 5, 5);
INSERT INTO EQUIPOS (ID, NOMBRE, LIGA_ID, PAIS_ID) VALUES (11, 'FC Porto', 6, 6);
INSERT INTO EQUIPOS (ID, NOMBRE, LIGA_ID, PAIS_ID) VALUES (12, 'Sporting CP', 6, 6);
INSERT INTO EQUIPOS (ID, NOMBRE, LIGA_ID, PAIS_ID) VALUES (13, 'Ajax Amsterdam', 7, 7);
INSERT INTO EQUIPOS (ID, NOMBRE, LIGA_ID, PAIS_ID) VALUES (14, 'Feyenoord', 7, 7);
INSERT INTO EQUIPOS (ID, NOMBRE, LIGA_ID, PAIS_ID) VALUES (15, 'Celtic FC', 8, 8);
INSERT INTO EQUIPOS (ID, NOMBRE, LIGA_ID, PAIS_ID) VALUES (16, 'Rangers FC', 8, 8);
INSERT INTO EQUIPOS (ID, NOMBRE, LIGA_ID, PAIS_ID) VALUES (17, 'Galatasaray SK', 9, 9);
INSERT INTO EQUIPOS (ID, NOMBRE, LIGA_ID, PAIS_ID) VALUES (18, 'Fenerbahçe SK', 9, 9);
INSERT INTO EQUIPOS (ID, NOMBRE, LIGA_ID, PAIS_ID) VALUES (19, 'FC Zenit Saint Petersburg', 10, 10);
INSERT INTO EQUIPOS (ID, NOMBRE, LIGA_ID, PAIS_ID) VALUES (20, 'Spartak Moscow', 10, 10);
INSERT INTO EQUIPOS (ID, NOMBRE, LIGA_ID, PAIS_ID) VALUES (21, 'SL Benfica', 6, 6);
INSERT INTO EQUIPOS (ID, NOMBRE, LIGA_ID, PAIS_ID) VALUES (22, 'Besiktas JK', 9, 9);
INSERT INTO EQUIPOS (ID, NOMBRE, LIGA_ID, PAIS_ID) VALUES (23, 'SSC Napoli', 3, 3);
INSERT INTO EQUIPOS (ID, NOMBRE, LIGA_ID, PAIS_ID) VALUES (24, 'Atlético Madrid', 1, 1);

INSERT INTO USUARIOS (ID, USERNAME, PASSWORD) VALUES (1, 'admin', '$2a$10$dOdulzYJUmC9juIqukwkoeKJ2hQdnPD5OvtRgglrUmiUaMwYSvCkS');