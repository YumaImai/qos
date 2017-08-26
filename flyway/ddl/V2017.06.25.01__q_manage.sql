create table q_manage
(question_id smallint not null auto_increment,
q_category_parent_id smallint not null,
q_category_child_id smallint not null,
question text character set utf8,
answer text character set utf8,
INDEX(question_id));