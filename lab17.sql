--#1
SELECT * FROM northwind.customers;
--#2
SELECT DISTINCT country_region from northwind.customers;
--#3
SELECT last_name  from northwind.customers WHERE last_name LIKE 'b%';
--#4
SELECT  * from northwind.orders LIMIT 100;
--#5
SELECT * FROM northwind.customers WHERE zip_postal_code = '1010,' or'3012'or '12209' or '05023'; 
--#6
SELECT * FROM northwind.customers WHERE country_region <> 'NULL';
--#7
SELECT country_region,  city FROM northwind.customers ORDER BY country_region ASC, city ASC; 
--#8
INSERT INTO northwind.customers ( company)
VALUES ('microsoft');
--#9
UPDATE northwind.orders set ship_country_region = 'EuroZone' WHERE ship_country_region = 'France';
--#10
DELETE FROM northwind.order_details WHEN quantity = '1'; 

--#11
SELECT AVG(quantity) FROM northwind.order_details;
SELECT MAX(quantity) FROM northwind.order_details;
SELECT MIN(quantity) FROM northwind.order_details; 
--#12

--#13

--#14

--#15

--#16