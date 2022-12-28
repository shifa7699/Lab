USE shifadb;
create table Department (Department_ID int Primary Key ,
Department_Name varchar(15) unique,
Department_Head varchar(15)unique,
Department_Description varchar(25)unique);
#drop table department;
insert into Department values
(1,	'Accounts','Ramesh','Accounts Dept'),
(2,'Admin','Vijay','Admin Dept'),
(3,'Sales','Vinod','Sales Dept'),
(4,'HR','Mahesh','HR Dept');
create table Employee(Employee_Id int Primary key,
Employee_Name varchar(20) unique,
Employee_Salary double check(Employee_Salary between 1000 and 100000),
Employee_Contact_No bigint(15) unique,
Employee_Address varchar(15) unique,
Department_Id int ,Foreign Key(Department_ID) references Department(Department_ID));
#drop table Employee;
insert into Employee values
(087,'Vikram',12000,9878761212,	'Address 1',2),
(110,'	Ajay',18000	,9654376143	,'Address 2',1),
(098,'	Rajesh',11000,9965322212,'Address 3',4),
(067,'	Ram	',19000	,8078343732,'Address 4',3),
(045,'	Vimal',	27000,9932113221,'Address 5',4),
(987,'	Kiran',	21000,7076337238,'Address 6',2);




