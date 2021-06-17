CREATE DATABASE groupi_Lauren;

USE groupi_Lauren;

CREATE TABLE Employee(
	EmployeeID INT PRIMARY KEY AUTO_INCREMENT,
	Fname VARCHAR(20),
	Lname VARCHAR(20),
	Address VARCHAR(100),
	NIN CHAR(9),
	SortCode CHAR(6),
	BankAccountNo CHAR(8),
	StartingSalary DECIMAL(8,2));

CREATE TABLE SalesEmployee(
	EmployeeID INT,
	CommissionRate DECIMAL(8,2),
	TotalSales DECIMAL(8,2),
	PRIMARY KEY (EmployeeID),
	FOREIGN KEY (EmployeeID) REFERENCES Employee (EmployeeID));

CREATE TABLE TechnicalEmployee(
	EmployeeID INT,
	CV text,
	PassportPhoto VARCHAR(100),
	PRIMARY KEY (EmployeeID),
	FOREIGN KEY (EmployeeID) REFERENCES Employee (EmployeeID));

CREATE TABLE Project(
	ProjectID INT PRIMARY KEY AUTO_INCREMENT,
	ProjectName VARCHAR(40),
	StartDate Date,
	EndDate	Date);

CREATE TABLE TechnicalEmployee_Project(
	EmployeeID INT,
	ProjectID INT,
	PRIMARY KEY (EmployeeID, ProjectID),
	FOREIGN KEY (EmployeeID) REFERENCES Employee (EmployeeID),
	FOREIGN KEY (ProjectID) REFERENCES Project (ProjectID));

INSERT INTO Employee (Fname, Lname, Address, NIN, SortCode, BankAccountNo, StartingSalary)
	VALUES ('Jake', 'Foster', '23 Location Street', GG334455A, 839283, 99999999, 8000.00); 

INSERT INTO Employee (Fname, Lname, Address, NIN, SortCode, BankAccountNo, StartingSalary)
	VALUES ('Toby', 'Bell', '42 Place Road', EZ336455C, 839243, 92999999, 8000.00); 

INSERT INTO Employee (Fname, Lname, Address, NIN, SortCode, BankAccountNo, StartingSalary)
	VALUES ('Anna', 'Paluch', '88 Area Lane', OG334465D, 859283, 19999999, 8000.00); 

INSERT INTO Employee (Fname, Lname, Address, NIN, SortCode, BankAccountNo, StartingSalary)
	VALUES ('Lauren', 'Danton', '77 Field Road', OO734455A, 139283, 99996999, 8000.00); 
	
INSERT INTO SalesEmployee (EmployeeID, CommissionRate, TotalSales) 
	VALUES (2, 0.05, 600.00);

INSERT INTO SalesEmployee (EmployeeID, CommissionRate, TotalSales) 
	VALUES (3, 0.06, 700.00);

INSERT INTO TechnicalEmployee (EmployeeID, CV)
	VALUES (1, 'Technology is cool');

INSERT INTO TechnicalEmployee (EmployeeID, CV)
	VALUES (4, 'I like mySQL');

INSERT INTO Project (ProjectName, StartDate, EndDate)
	VALUES ('Fix Error', 2021-04-12, 2021-05-12);

INSERT INTO Project (ProjectName, StartDate, EndDate)
	VALUES ('Make Database', 2021-05-16, 2021-05-25);

INSERT INTO Project (ProjectName, StartDate, EndDate)
	VALUES ('Edit Software', 2021-06-01, 2021-06-07);

INSERT INTO TechnicalEmployee_Project (EmployeeID, ProjectID)
	VALUES (1,2);

INSERT INTO TechnicalEmployee_Project (EmployeeID, ProjectID)
	VALUES (4,2);

INSERT INTO TechnicalEmployee_Project (EmployeeID, ProjectID)
	VALUES (1,1);

INSERT INTO TechnicalEmployee_Project (EmployeeID, ProjectID)
	VALUES (4,1);

SELECT Employee.EmployeeID, CONCAT(Fname, ' ', Lname) AS Name FROM Employee WHERE Employee.EmployeeID IN (SELECT EmployeeID FROM SalesEmployee);

SELECT Employee.EmployeeID, CONCAT(Fname, ' ', Lname) AS Name FROM Employee WHERE Employee.EmployeeID IN (SELECT EmployeeID FROM TechnicalEmployee);

SELECT Employee.EmployeeID, CONCAT(Fname, ' ', Lname) AS Name FROM Employee WHERE MAX(TotalSales) FROM SalesEmployee;

SELECT Employee.EmployeeID, CONCAT(Fname, ' ', Lname) AS Name FROM Employee WHERE Employee.EmployeeID IN (SELECT EmployeeID FROM TechnicalEmployee_Project);

SELECT Employee.EmployeeID, CONCAT(Fname, ' ', Lname) AS Name FROM Employee WHERE Employee.EmployeeID NOT IN (SELECT EmployeeID FROM TechnicalEmployee_Project);

SELECT ProjectID, ProjectName AS Project Name, StartDate, EndDate FROM Project WHERE Project.ProjectID NOT IN (SELECT ProjectID FROM TechnicalEmployee_Project);

SELECT TechnicalEmployee_Project.ProjectID AS Project ID, COUNT(TechnicalEmployee_Project.ProjectID) AS Number of Employees FROM TechnicalEmployee_Project;

