CREATE DATABASE demo;
USE demo;
CREATE TABLE demo.s (
  sno   INT(8) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  sname VARCHAR(20) NOT NULL,
  ssex  CHAR(1)     DEFAULT '男',
  city  VARCHAR(20) DEFAULT 'beijing',
  sage  INT(3)


);
INSERT INTO s VALUES (200201,'李勇','男','la',18);
INSERT INTO s VALUES (200202 ,'刘晨','男','la',19);
INSERT INTO s VALUES (200203,'张丽','女','la',20);
DESC demo.s;
DROP TABLE demo.s;
SELECT *
FROM s;

# ALTER TABLE demo.s
#     del;


CREATE TABLE Course (
  cno INT(8) UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
  cname VARCHAR(20) NOT NULL
  #   cpno VARCHAR(4) DEFAULT 'null'
);
DESC demo.Course;
DROP TABLE Course;
INSERT INTO demo.Course VALUES (NULL ,'java se');
INSERT INTO demo.Course VALUES (2,'html');
INSERT INTO demo.Course VALUES (3,'mysql');
SELECT *
FROM demo.Course;

CREATE TABLE demo.sc(
  sno INT(8) UNSIGNED,
  cno INT(8) UNSIGNED,
  grade INT(4)
  #   PRIMARY KEY (sno,cno),
  #    FOREIGN KEY (sno) REFERENCES s(sno) ON DELETE SET NULL ,
  #    FOREIGN KEY (cno) REFERENCES Course(cno) ON UPDATE SET NULL
);
DROP TABLE Course;
DESC Course;
INSERT INTO demo.sc VALUES (200201,2,90);
SELECT *
FROM demo.sc;




