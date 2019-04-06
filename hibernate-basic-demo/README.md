# Hibernate

@Author : Abulkhair
@Email : abulkhair.shaikh93@gmail.com

This is very basic example to demonstrate Hibernate CRUD operations for beginners.
This project adds deletes and retrieve the customers from database

Softwares : 
Java : 1.8
Hibernate : 5.4.2.FINAL
h2 DB : 1.4

Steps to create project from scratch

1. create maven project and name it.
2. change complier version to 1.8
<properties> 
	<maven.compiler.source>1.8</maven.compiler.source>
	<maven.compiler.target>1.8</maven.compiler.target>
</properties>
3.Add dependencies

<dependency>
	<groupId>org.hibernate</groupId>
	<artifactId>hibernate-core</artifactId>
	<version>5.3.7.Final</version>
</dependency>

<dependency>
	<groupId>com.h2database</groupId>
	<artifactId>h2</artifactId>
	<version>${h2.version}</version>
</dependency>

4.Configure connections.
5.Initilaze SessionFactory
6.Write Main method to get Object of Session 

Run the main application as normal java application


  
  
  
  