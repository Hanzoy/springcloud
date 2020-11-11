
#创建test表
CREATE TABLE `test` (
                        `id` VARCHAR(36) NOT NULL,
                        `name` VARCHAR(255) DEFAULT NULL,
                        PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4;


insert into courseimooc.test (courseimooc.test.id, courseimooc.test.name) values (2,'测试');

drop table if exists `chapter`;

create table `chapter`(
    `id` char(8) not null comment 'ID',
    `course_id` char(8) comment '课程ID',
    `name` char(50) comment '名称',
    primary key (`id`)
) engine = innodb default charset = utf8mb4 comment='大章';