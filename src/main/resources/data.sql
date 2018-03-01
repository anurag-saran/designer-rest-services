-- insert into project values(1001,'First proj','DemoProj','<html>',sysdate(),sysdate());
-- insert into project values(1002,'Second proj','DemoProj','<html>',sysdate(),sysdate());
-- insert into project values(1003,'third proj','DemoProj','<html>',sysdate(),sysdate()); 
--
 insert into project values(1001,'First proj','DemoProj','<html>');
 insert into project values(1002,'Second proj','DemoProj','<html>');
 insert into project values(1003,'third proj','DemoProj','<html>'); 

 create table user
 (
 	id integer not null,
 	name varchar(255) not null,
 	locaton varchar(255),
 	birth_date timestamp,
 	primary key(id)
 );
 
 INSERT INTO USER(ID, NAME, LOCATION, BIRTH_DATE) 
 VALUES(1001,ANURAG,'NY',sysdate());
