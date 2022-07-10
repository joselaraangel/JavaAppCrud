ALTER SEQUENCE hibernate_sequence RESTART WITH 1;

DELETE FROM EMPLOYEE;
--DELETE FROM DEPARTMENT;
--DELETE FROM GENDERS;
DELETE FROM EMPLOYEE_WORKED_HOURS


--INSERT INTO DEPARTMENT(id,name,salary) VALUES(100,'HR','250000000.00');
--INSERT INTO DEPARTMENT(id,name,salary) VALUES(101,'PDE','370000000.00');
--INSERT INTO DEPARTEMT(id,name,salary) VALUES(102,'Marketing','140000000.00');


INSERT INTO EMPLOYEE(id,gender_id,job_id,name,last_name,birthdate) VALUES(100,1,100,'Jose','Lara','1990-12-07');
INSERT INTO EMPLOYEE(id,gender_id,job_id,name,last_name,birthdate) VALUES(200,1,100,'Alejandro','Bonilla','1987-04-14');
INSERT INTO EMPLOYEE(id,gender_id,job_id,name,last_name,birthdate) VALUES(300,1,101,'Carlos','Lopez','1990-06-26');

--INSERT INTO GENDERS(id,name) VALUES(1,'Masculino');
--INSERT INTO GENDERS(id,name) VALUES(2,'Femenino');

INSERT INTO EMPLOYEE_WORKED_HOURS(id,employee_id,worked_hours, worked_date) VALUES(1,100,8,'2022-07-08');
INSERT INTO EMPLOYEE_WORKED_HOURS(id,employee_id,worked_hours, worked_date) VALUES(2,200,8,'2022-07-08');
