DROP DATABASE IF EXISTS demo4;
CREATE DATABASE demo4;
DROP TABLE IF EXISTS demo4.word;
CREATE TABLE demo4.word (
  id              INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY
  COMMENT '词汇编号',
  english         TEXT
  COMMENT '词汇',
  phonetic_uk     VARCHAR(255) COMMENT '发声',
  phonetic_us     VARCHAR(255) COMMENT '发声',
  audio_uk_male   VARCHAR(255) COMMENT '英语女声',
  audio_uk_female VARCHAR(255) COMMENT '英语男声',
  audio_us_male   VARCHAR(255) COMMENT '美语女声',
  audio_us_female VARCHAR(255) COMMENT '英语男声'

)
  COMMENT '单词表';
SHOW FULL COLUMNS FROM demo4.word;


DROP TABLE IF EXISTS demo4.word_defination;
CREATE TABLE demo4.word_defination (
  id             INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY
  COMMENT '主键id',
  word_id        INT(11) UNSIGNED
  COMMENT '词性标号',
  chinese        TEXT COMMENT '词汇中文解释',
  part_of_speach VARCHAR(255) COMMENT '发音'
)
  COMMENT '词性表';

ALTER TABLE demo4.word_defination
ADD CONSTRAINT fk_char_word FOREIGN KEY (word_id) REFERENCES demo4.word (id);
SHOW FULL COLUMNS FROM demo4.word_defination;


DROP TABLE IF EXISTS demo4.word_sentence;
CREATE TABLE demo4.word_sentence (
  id               INT(11) UNSIGNED AUTO_INCREMENT PRIMARY KEY
  COMMENT '主键id',
  word_id          INT(11) UNSIGNED
  COMMENT '例句表号',
  chinese_sentence TEXT COMMENT '中文例句',
  english_sentence TEXT COMMENT '英语例句',
  audio_male       VARCHAR(255) COMMENT '女生发音',
  audio_female     VARCHAR(255) COMMENT '男生发音',
  source           VARCHAR(255) COMMENT '网站来源'
)
  COMMENT '例句表';
ALTER TABLE demo4.word_sentence
ADD CONSTRAINT fk_exa_ex FOREIGN KEY (word_id) REFERENCES demo4.word (id);
SHOW FULL COLUMNS FROM demo4.word_sentence;

DROP TABLE IF EXISTS demo4.word_root;
CREATE TABLE demo4.word_root (
  id      INT(11) UNSIGNED AUTO_INCREMENT
  COMMENT '主键id',
  word_id INT(11) UNSIGNED
  COMMENT '单词表号',
  prefix  TEXT COMMENT '前缀',
  suffix  TEXT COMMENT '后缀',
  chinese VARCHAR(255) COMMENT '中文意思',
  PRIMARY KEY (id, word_id)
)
  COMMENT '词根表';
ALTER TABLE demo4.word_root
ADD CONSTRAINT fk__wordid FOREIGN KEY (word_id) REFERENCES demo4.word (id);
SHOW FULL COLUMNS FROM demo4.word_root;


