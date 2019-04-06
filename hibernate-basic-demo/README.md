# Hibernate

**@Author : Abulkhair<br>
@Email : abulkhair.shaikh93@gmail.com**

This is very basic example to demonstrate Hibernate CRUD operations for beginners.
This project adds deletes and retrieve the customers from database

**Softwares :**
1. Java : 1.8
2. Hibernate : 5.4.2.FINAL
3. h2 DB : 1.4

Steps to create project from scratch

Create maven project and name it.<br>
change complier version to 1.8<br>

<properties> <br>
	<maven.compiler.source>1.8</maven.compiler.source> <br>
	<maven.compiler.target>1.8</maven.compiler.target> <br>
</properties><br>
<br>
Add dependencies
<br>
<dependency><br>
	<groupId>org.hibernate</groupId><br>
	<artifactId>hibernate-core</artifactId><br>
	<version>5.3.7.Final</version><br>
</dependency><br>

<dependency><br>
	<groupId>com.h2database</groupId><br>
	<artifactId>h2</artifactId><br>
	<version>${h2.version}</version><br>
</dependency><br>

Configure connections.<br>
Initilaze SessionFactory<br>
Write Main method to get Object of Session <br>

**Run the main application as normal java application**


  
  
  
  
