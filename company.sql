CREATE TABLE Employee (
  employee_id INT PRIMARY KEY,
  first_name VARCHAR(50),
  last_name VARCHAR(50),
  email VARCHAR(100),
  phone_number VARCHAR(20),
  hire_date DATE,
  job_id INT,
  salary DECIMAL(10, 2),
  commission_pct DECIMAL(4, 3),
  manager_id INT,
  department_id INT
);


CREATE TABLE Department (
  department_id INT PRIMARY KEY,
  department_name VARCHAR(50),
  manager_id INT,
  location_id INT,
  FOREIGN KEY (manager_id) REFERENCES Employee(employee_id),
  FOREIGN KEY (location_id) REFERENCES Location(location_id)
);


CREATE TABLE Jobs (
  job_id INT PRIMARY KEY,
  job_title VARCHAR(50),
  min_salary DECIMAL(10, 2),
  max_salary DECIMAL(10, 2)
);


CREATE TABLE JobHistory (
  employee_id INT,
  start_date DATE,
  PRIMARY KEY (employee_id, start_date),
  FOREIGN KEY (employee_id) REFERENCES Employee(employee_id)
);


CREATE TABLE Location (
  location_id INT PRIMARY KEY,
  street_address VARCHAR(100),
  postal_code VARCHAR(20),
  city VARCHAR(50),
  state VARCHAR(50),
  country_id INT,
  FOREIGN KEY (country_id) REFERENCES Countries(country_id)
);


CREATE TABLE Countries (
  country_id INT PRIMARY KEY,
  country_name VARCHAR(50),
  region_name VARCHAR(50)
);

INSERT INTO Countries (country_id, country_name, region_name)
VALUES
  (1, 'United States', 'North America'),
  (2, 'Ethiopia', 'Africa');




INSERT INTO Employee (employee_id, first_name, last_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id)
VALUES
  (1, 'John', 'Doe', 'john.doe@example.com', '1234567890', '2021-01-01', 1, 5000.00, 0.05, NULL, 1),
  (2, 'Jane', 'Smith', 'jane.smith@example.com', '9876543210', '2021-02-01', 2, 6000.00, 0.10, 1, 2);


INSERT INTO Jobs (job_id, job_title, min_salary, max_salary)
VALUES
  (1, 'Sales Manager', 5000.00, 10000.00),
  (2, 'Marketing Specialist', 4000.00, 8000.00);

INSERT INTO JobHistory (employee_id, start_date)
VALUES
  (1, '2021-01-01'),
  (2, '2021-02-01');
  
INSERT INTO Location (location_id, street_address, postal_code, city, state, country_id)
VALUES
  (1, '123 Main Street', '12345', 'New York', 'NY', 1);
  INSERT INTO Department (department_id, department_name, manager_id, location_id)
VALUES
  (1, 'Sales', 1, 1),
  (2, 'Marketing', 2, 1);
SELECT e.employee_id, e.first_name, e.last_name, e.email, d.department_name, j.job_title, l.city, c.country_name
FROM Employee e
INNER JOIN Department d ON e.department_id = d.department_id
INNER JOIN Jobs j ON e.job_id = j.job_id
INNER JOIN Location l ON d.location_id = l.location_id
INNER JOIN Countries c ON l.country_id = c.country_id;

