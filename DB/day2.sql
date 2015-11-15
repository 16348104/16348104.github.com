CREATE DATABASE demo;

CREATE TABLE demo.student (
  id   INT(11) PRIMARY KEY,
  name VARCHAR(20) NOT NULL,
  age  INT(3) UNIQUE,
  sex  CHAR(1) DEFAULT '男'
);

DELETE FROM demo.student
WHERE id = 2015003;

UPDATE demo.student
SET id = 2015003
WHERE id = 2015002;

DROP TABLE demo.sc;
DROP TABLE demo.student;

SELECT *
FROM demo.student;

CREATE TABLE demo.course (
  id   INT(11) PRIMARY KEY,
  name VARCHAR(20)
);

INSERT INTO demo.course VALUES (1, 'Java SE');
INSERT INTO demo.course VALUES (2, 'MySQL');
INSERT INTO demo.course VALUES (3, 'HTML');


SELECT *
FROM demo.course;

CREATE TABLE demo.sc (
  sid   INT(11),
  cid   INT(11),
  grade INT(3),
  #   PRIMARY KEY (sid, cid),
  CONSTRAINT fk_sc_sid FOREIGN KEY (sid) REFERENCES demo.student (id)
    ON DELETE CASCADE, # 级联
  CONSTRAINT fk_sc_cid FOREIGN KEY (cid) REFERENCES demo.course (id)
    ON UPDATE SET NULL
);

DROP TABLE demo.sc;

INSERT INTO demo.sc VALUES (2015003, 2, NULL);
INSERT INTO demo.sc VALUES (2, 2, NULL);
INSERT INTO demo.sc VALUES (2, 1, NULL);
INSERT INTO demo.sc VALUES (2, 1, NULL);

SELECT *
FROM demo.sc;

DESC demo.student;
DROP TABLE demo.student;

INSERT INTO demo.student (id, name, age) VALUES (2015001, '张三', 18);
INSERT INTO demo.student VALUES (2015002, '李四', 19, '女');
INSERT INTO demo.student (name, age, sex) VALUES ('王二', 20, '男');

UPDATE demo.student
SET name = '李四', age = 20;

DELETE FROM demo.student;

SELECT *
FROM demo.student;

SELECT
  name,
  sex
FROM demo.student;

SELECT DISTINCT sex
FROM demo.student;

SELECT *
FROM demo.student
WHERE sex = '男';


SELECT *
FROM demo.student
WHERE age BETWEEN 19 AND 20;


SELECT *
FROM demo.student
WHERE name LIKE '_三';

SELECT *
FROM demo.student
ORDER BY convert(sex USING gbk) DESC;
# an v
# asc = ascend
# desc = descend
# result set


DESC scott.dept;
# department
DESC scott.emp;
# employee
DESC scott.salgrade;
# salary grade

SELECT *
FROM scott.emp;
SELECT *
FROM scott.dept;
SELECT *
FROM scott.salgrade;

SELECT *
FROM scott.emp
WHERE ENAME IN ('king', 'scott', 'adams');
SELECT *
FROM scott.emp
WHERE ENAME = 'king' OR ENAME = 'scott' OR ENAME = 'adams';
SELECT *
FROM scott.emp
WHERE EMPNO NOT BETWEEN 7500 AND 7788;

SELECT ename AS n
FROM scott.emp AS e
WHERE e.ENAME = 'allen';

SELECT *
FROM scott.emp
LIMIT 0, 50;


CREATE TABLE demo.test (
  id   INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  text VARCHAR(255)
);
DROP TABLE demo.test;
INSERT INTO demo.test (text) VALUES ('asdf...');
INSERT INTO demo.test VALUES (2147483648, 'test...');

SELECT *
FROM demo.test;