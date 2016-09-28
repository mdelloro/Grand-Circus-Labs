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
SELECT * FROM northwind.orders WHERE country_region IS NOT NULL;
--#7
SELECT country_region,  city FROM northwind.customers ORDER BY country_region ASC, city ASC; 
--#8
INSERT INTO northwind.customers (company)
VALUES ('microsoft');
--#9
UPDATE northwind.orders set ship_zip_postal_code = '9721' WHERE ship_city = 'Portland';
--#10
DELETE FROM northwind.order_details WHERE quantity = '1'; 

--#11
SELECT AVG(quantity), MAX(quantity), MIN(quantity) FROM northwind.order_details;

--#12
SELECT AVG(quantity), MAX(quantity), MIN(quantity) 
FROM order_details
GROUP BY order_id;
--#13
SELECT customer_ID FROM Orders wHERE ID = 65;
--#14
SELECT * FROM Orders INNER JOIN customers ON Orders.Customer_ID = Customers.ID;
SELECT * FROM Orders LEFT JOIN customers ON Orders.Customer_ID = Customers.ID;
SELECT * FROM Orders RIGHT JOIN customers ON Orders.Customer_ID = Customers.ID;
--#15
SELECT Employees.first_name FROM Employees WHERE EMployees.notes IS NULL;
--#16
SELECT Ship_city FROM Orders o INNER JOIN Customers c ON o.customer_id = c.id
WHEREE first_name = 'Francisco';