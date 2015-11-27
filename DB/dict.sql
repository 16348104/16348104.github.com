DROP DATABASE IF EXISTS demo4;
CREATE DATABASE demo4;
DROP TABLE IF EXISTS demo4.word;
CREATE TABLE demo4.word (
  word_id    INT UNSIGNED AUTO_INCREMENT PRIMARY KEY
  COMMENT '词汇编号',
  vocabulary TEXT NOT NULL
  COMMENT '词汇',
  ipa_uk     VARCHAR(255) COMMENT '英语音标',
  ipa_us     VARCHAR(255) COMMENT '美语音标'

)
  COMMENT '单词表';
SHOW FULL COLUMNS FROM demo4.word;




DROP TABLE IF EXISTS demo4.character;
CREATE TABLE demo4.character (
  id             INT UNSIGNED AUTO_INCREMENT PRIMARY KEY
  COMMENT '主键id',
  character_id   INT UNSIGNED
  COMMENT '词性标号',
  chinese        TEXT COMMENT '词汇中文解释',
  part_of_speach VARCHAR(255) COMMENT '发音'
)
  COMMENT '词性表';

ALTER TABLE demo4.character
ADD CONSTRAINT fk_char_word FOREIGN KEY (character_id) REFERENCES demo4.word (word_id);
SHOW FULL COLUMNS FROM demo4.character;


DROP TABLE IF EXISTS demo4.example;
CREATE TABLE demo4.example (
  id               INT UNSIGNED AUTO_INCREMENT PRIMARY KEY
  COMMENT '主键id',
  example_id       INT UNSIGNED
  COMMENT '例句表号',
  chinese_sentence TEXT COMMENT '中文例句',
  english_sentence TEXT COMMENT '英语例句',
  web_origin       VARCHAR(255) COMMENT '网站来源'
)
  COMMENT '例句表';
ALTER TABLE demo4.example
ADD CONSTRAINT fk_exa_ex FOREIGN KEY (example_id) REFERENCES demo4.character (id);
SHOW FULL COLUMNS FROM demo4.example;

DROP TABLE IF EXISTS demo4.root;
CREATE TABLE demo4.root (
  id               INT UNSIGNED AUTO_INCREMENT
  COMMENT '主键id',
  root_id       INT UNSIGNED
  COMMENT '单词表号',
  prefix TEXT COMMENT '前缀',
  suffix TEXT COMMENT '后缀',
  chinese       VARCHAR(255) COMMENT '中文意思',
  PRIMARY KEY (id,root_id)
)
  COMMENT '词根表';
ALTER TABLE demo4.root ADD CONSTRAINT fk_rootid_wordid FOREIGN KEY (root_id)REFERENCES demo4.word(word_id);
SHOW FULL COLUMNS FROM demo4.root;


