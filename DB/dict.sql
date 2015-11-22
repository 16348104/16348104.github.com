DROP DATABASE IF EXISTS demo4;
CREATE DATABASE demo4;
DROP TABLE IF EXISTS demo4.word;
CREATE TABLE demo4.word (
  word_id    SMALLINT(8) UNIQUE AUTO_INCREMENT PRIMARY KEY
  COMMENT '词汇编号',
  vocabulary TEXT NOT NULL
  COMMENT '词汇',
  ipa_uk     VARCHAR(255) COMMENT '英语音标',
  ipa_us     VARCHAR(255) COMMENT '美语音标'

)
  COMMENT '单词表';
ALTER TABLE demo4.word
ADD english VARCHAR(255);
SHOW FULL COLUMNS FROM demo4.word;

DROP TABLE IF EXISTS demo4.character;
CREATE TABLE demo4.character (
  id           INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY
  COMMENT '主键id',
  character_id SMALLINT(8) UNIQUE
  COMMENT '词性标号',
  CONSTRAINT fk_ch_word_id FOREIGN KEY (character_id) REFERENCES demo4.word (word_id),
  explain      TEXT COMMENT '解释'

)
  COMMENT '词性表';

SHOW FULL COLUMNS FROM demo4.character;


DROP TABLE IF EXISTS demo4.example;
CREATE TABLE demo4.example (
  id         INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY
  COMMENT '主键id',
  example_id SMALLINT(8) UNIQUE
  COMMENT '例句号',
  CONSTRAINT fk_ex_id FOREIGN KEY (example_id) REFERENCES demo4.character (id),
  Chinese    LONGTEXT COMMENT '中文例句',
  English    LONGTEXT COMMENT '英语例句',
  web_origin VARCHAR(255) COMMENT '网站来源'


)
  COMMENT '例句表';
SHOW FULL COLUMNS FROM demo4.example;

# alter TABLE MODIFY