create database  george;
use george;
/*Question 1:*/
create table manager(
mid int primary key,
fullname varchar(100),
shift varchar(100),
salary double
);

insert into manager(mid , fullname , shift , salary) values(101, 'kingsley' , 'am' , 35000);
insert into manager(mid , fullname , shift , salary) values(102, 'Sarah' , 'am' , 20000);
insert into manager(mid , fullname , shift , salary) values(103, 'Ifeoma' , 'pm' , 25000);
insert into manager(mid , fullname , shift , salary) values(104, 'Ann' , 'pm' , 5000);
insert into manager(mid , fullname , shift , salary) values(105, 'Sophia' , 'am' , 22000);
insert into manager(mid , fullname , shift , salary) values(106, 'John' , 'am' , 15000);
insert into manager(mid , fullname , shift , salary) values(107, 'Nelson' , 'pm' , 7500);
insert into manager(mid , fullname , shift , salary) values(108, 'Cynthia' , 'pm' , 5000);
insert into manager(mid , fullname , shift , salary) values(109, 'Philip' , 'pm' , 11000);
insert into manager(mid , fullname , shift , salary) values(110, 'Amaka' , 'am' , 30000);

select * from manager;
/*Question 2: Displaying the Managers Average*/

select avg(salary) from manager;
/*Question 3: Displaying the number of orders in a day*/
use george;
create table corder(
cid int primary key auto_increment,
cname varchar(100),
phone varchar(100),
address varchar(100),
 itemid varchar(100),

qty int,
total double,
date varchar(100)
);
select * from corder;
insert into corder(cid, cname, phone, address, qty, total, date) values (001 , 'ifeanyi' , 023456789 , 'Waveley' , 17 , 17, 'Tuesday');

insert into corder(cid, cname, phone, address, qty, total, date) values (002 , 'ezekiel' , 023455689 , 'Scotland' , 23 , 23, 'Wednesday');
insert into corder(cid, cname, phone, address, qty, total, date) values (003 , 'Emmanuel' , 011456789 , 'Birmingham' , 47 , 47, 'Thursday');
insert into corder(cid, cname, phone, address, qty, total, date) values (004 , 'John' , 0236732289 , 'Coventry' , 14 , 14, 'Friday');
insert into corder(cid, cname, phone, address, qty, total, date) values (005 , 'victor' , 09083456789 , 'Waveley' , 87 , 87, 'Tuesday');
insert into corder(cid, cname, phone, address, qty, total, date) values (006 , 'chucks' , 0211456789 , 'Waveley' , 27 , 27, 'Monday');
insert into corder(cid, cname, phone, address, qty, total, date) values (007 , 'sylvia' , 023453789 , 'Waveley' , 10 , 10, 'Thursday');
insert into corder(cid, cname, phone, address, qty, total, date) values (008 , 'pam' , 02346546789 , 'Waveley' , 50 , 50, 'Friday');
insert into corder(cid, cname, phone, address, qty, total, date) values (009 , 'ahamefula' , 0234906789 , 'Waveley' , 63 , 63, 'Wednesday');
insert into corder(cid, cname, phone, address, qty, total, date) values (010 , 'clinton' , 0234226789 , 'Waveley' , 7 , 7, 'Tuesday');

select count(cid) from corder;

/*Display total amount of order*/
SELECT total,
 COUNT(cid) 
FROM corder
GROUP BY  total
ORDER BY COUNT(cid) DESC 

/* Question5 Display the number of dishes serve in hotel*/ 

create table item(
itemid  varchar(100) primary key,
dish varchar(100),
category varchar(100),
price double
);
drop table item;
use george;
create table item(
itemid  varchar(100) primary key,
dish varchar(100),
category varchar(100),
price double
);

insert into item( itemid, dish, category, price) values( 01, 'rice' , 'carbohdyrate' , 15);
insert into item( itemid, dish, category, price) values( 02, 'egg' , 'protein' , 5.00);
insert into item( itemid, dish, category, price) values( 03, 'beans' , 'iron' , 10.00);
insert into item( itemid, dish, category, price) values( 04, 'egusi' , 'fats and oil' , 35.00);
insert into item( itemid, dish, category, price) values( 05, 'chips' , 'carbohdyrate' , 4.00);
insert into item( itemid, dish, category, price) values( 06, 'chicken' , 'protein' , 15.00);
insert into item( itemid, dish, category, price) values( 07, 'bread' , 'carbohdyrate' , 7.00);
insert into item( itemid, dish, category, price) values( 08, 'plaintain' , 'iron' , 5.00);
insert into item( itemid, dish, category, price) values( 09, 'soup' , 'fats and oil' , 7.00);
insert into item( itemid, dish, category, price) values( 10, 'yam' , 'carbohdyrate' , 15.00);
select * from item;
select count(dish) from item;

/*Question 6 - Display dishes as per category*/
select * from item where category = 'protein';
select * from item where category = 'carbohdyrate';
select * from item where category = 'fats and oil';
select * from item where category = 'iron';student

