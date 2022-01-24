CREATE TABLE IF NOT EXISTS SHOP (ID INT PRIMARY KEY, name VARCHAR(255), Stock INT);
INSERT INTO SHOP (ID, name, Stock) VALUES (1, 'WhiteCollar', 345);
insert into SHOP (ID, name, Stock) VALUES(2, 'Elprado', 350);
insert into SHOP (ID, name, Stock) VALUES(3, 'ThysenShop', 231);
insert into SHOP (ID, name, Stock) VALUES(4, 'CentroBotín', 670);

CREATE TABLE IF NOT EXISTS ARTWORK (ID INT PRIMARY KEY, name VARCHAR(255), author VARCHAR(255), prize DOUBLE, date DATETIME, shop_id INT);
INSERT INTO ARTWORK (ID, name, author, prize, date, shop_id) VALUES (1, 'El grito', 'E. Munch', 300000, '2018-07-04', 1);
INSERT INTO ARTWORK (ID, name, author, prize, date, shop_id) VALUES (2, 'Guernica', 'P. Picasso', 7200000, '2021-11-24', 2);
INSERT INTO ARTWORK (ID, name, author, prize, date, shop_id) VALUES (3, 'Ofelia','J.E. Millais ', 605000, '2021-11-24', 2);
INSERT INTO ARTWORK (ID, name, author, prize, date, shop_id) VALUES (4, 'Metropolis', 'G. Grosz', 5600345, '2021-11-24', 1);
INSERT INTO ARTWORK (ID, name, author, prize, date, shop_id) VALUES (5, 'Christinas World','A. Wyeth', 505040, '2021-11-24', 2);
INSERT INTO ARTWORK (ID, name, author, prize, date, shop_id) VALUES (6, 'La vocacion de San Mateo','M. Caravaggio', 239400, '2021-11-24', 4);
INSERT INTO ARTWORK (ID, name, author, prize, date, shop_id) VALUES (7, 'La noche estrellada','V. Van Gogh', 7604549,'2021-11-24', 4);