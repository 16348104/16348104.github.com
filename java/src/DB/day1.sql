CREATE DATABASE demo;

CREATE TABLE demo.student (
  id   INT(11),
  name VARCHAR(20),
  age  INT(3),
  sex  CHAR(1)
);

INSERT INTO demo.student VALUES (2015001, '张三', 18, '男');
INSERT INTO demo.student VALUES (2015002, '李四', 19, '女');
INSERT INTO demo.student VALUES (2015003, '王二', 20, '男');

UPDATE demo.student
SET name = '李四', age = 20;

DELETE FROM demo.student;

SELECT *
FROM demo.student;

SELECT
  name,
  sex
FROM demo.student;

SELECT DISTINCT sex FROM demo.student;

SELECT *
FROM demo.student
WHERE sex = '男'
;


SELECT *
FROM demo.student
WHERE age BETWEEN 19 AND 20
;


SELECT *
FROM demo.student
WHERE name LIKE '%三%'
;

SELECT * FROM demo.student
ORDER BY sex,name DESC ;
# asc = ascend
# desc = descend
# result set
