CREATE DATABASE demo2;
DROP DATABASE IF EXISTS demo2;

DROP TABLE IF EXISTS demo2.TABLE_1;
CREATE TABLE demo2.TABLE_1
(
  id       INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(255) COMMENT '用户名',
  password VARCHAR(255) COMMENT '密码'

  COMMENT '管理员'
);
DROP TABLE IF EXISTS demo2.TABLE_2;
CREATE TABLE demo2.TABLE_2 (
  id            INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  activity_name VARCHAR(255) COMMENT '活动名'
  COMMENT '活动表'
);
DROP TABLE IF EXISTS demo2.enroll;
CREATE TABLE demo2.enroll (
  id             INT(11),
  actvity_id     VARCHAR(255) COMMENT '活动',
  CONSTRAINT fk_en_acid FOREIGN KEY (actvity_id) REFERENCES demo2.TABLE_2 (id),
  student_number INT(11) COMMENT '学号',
  student_name   INT(255) COMMENT '学生名'
  COMMENT '注册活动'
);


# -------------------
CREATE DATABASE demo3;

DROP DATABASE IF EXISTS demo3;

DROP TABLE IF EXISTS demo3.dept;
CREATE TABLE demo3.dept (
  id   INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255)
);

DROP TABLE IF EXISTS demo3.student;
CREATE TABLE demo3.student (
  id      INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  name    VARCHAR(255),
  dept_id INT(11) UNSIGNED
);
ALTER TABLE demo3.student
ADD CONSTRAINT fk_stu_id FOREIGN KEY (dept_id) REFERENCES demo3.dept (id);

INSERT INTO demo3.dept VALUES (NULL, 'EE');
INSERT INTO demo3.dept VALUES (NULL, 'CS');
INSERT INTO demo3.dept VALUES (NULL, 'SS');
SELECT *
FROM demo3.dept;
INSERT INTO demo3.student VALUES (NULL, 's001', 1);
INSERT INTO demo3.student VALUES (NULL, 's002', 2);
INSERT INTO demo3.student VALUES (NULL, 's003', NULL);
INSERT INTO demo3.student VALUES (NULL, 's003', 0);
SELECT *
FROM demo3.student;
ALTER TABLE demo3.dept
MODIFY name TEXT;

DESC demo3.dept;
ALTER TABLE demo3.student
CHANGE name Sname VARCHAR(255);

DESC demo3.student;

