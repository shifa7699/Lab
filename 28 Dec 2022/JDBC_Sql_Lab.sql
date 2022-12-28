USE shifadb;
create table Department (Department_ID int Primary Key ,
Department_Name varchar(15) unique,
Department_Head varchar(15)unique,
Department_Description varchar(25)unique);

create table Employee(Employee_Id int Primary key,
Employee_Name varchar(20) unique,
Employee_Salary double check(Employee_Salary between 1000 and 100000),
Employee_Contact_No bigint(15) unique,
Employee_Address varchar(15) unique,
Department_Id int ,Foreign Key(Department_ID) references Department(Department_ID));



