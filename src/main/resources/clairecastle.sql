/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : clairecastle

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2016-12-19 23:34:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for adopt
-- ----------------------------
DROP TABLE IF EXISTS `adopt`;
CREATE TABLE `adopt` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) DEFAULT NULL COMMENT '用户id',
  `babyid` int(11) DEFAULT NULL COMMENT '宝宝id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for album
-- ----------------------------
DROP TABLE IF EXISTS `album`;
CREATE TABLE `album` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_time` datetime DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `edit_time` datetime DEFAULT NULL,
  `cover` int(11) DEFAULT NULL COMMENT '封面id',
  `tag` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for album2photo
-- ----------------------------
DROP TABLE IF EXISTS `album2photo`;
CREATE TABLE `album2photo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `albumid` int(11) DEFAULT NULL COMMENT '相册id',
  `photoid` int(11) DEFAULT NULL COMMENT '图片id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for animal
-- ----------------------------
DROP TABLE IF EXISTS `animal`;
CREATE TABLE `animal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `exist_num` int(11) DEFAULT NULL,
  `endanger` varchar(255) DEFAULT NULL,
  `living_range` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for baby
-- ----------------------------
DROP TABLE IF EXISTS `baby`;
CREATE TABLE `baby` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ch_name` varchar(255) DEFAULT NULL,
  `eng_name` varchar(255) DEFAULT NULL,
  `groupid` int(11) DEFAULT NULL,
  `birthday` varchar(255) DEFAULT NULL,
  `nationality` varchar(255) DEFAULT NULL COMMENT '国籍',
  `sex` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `eye_col` varchar(255) DEFAULT NULL,
  `further_color` varchar(255) DEFAULT NULL,
  `animalid` varchar(255) DEFAULT NULL COMMENT '属于什么动物',
  `is_single` int(11) DEFAULT NULL,
  `favorite_fruit` varchar(255) DEFAULT NULL,
  `favorite_color` varchar(255) DEFAULT NULL,
  `favorite_sport` varchar(255) DEFAULT NULL,
  `skill` varchar(255) DEFAULT NULL COMMENT '技能',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for group
-- ----------------------------
DROP TABLE IF EXISTS `group`;
CREATE TABLE `group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `leader` varchar(255) DEFAULT NULL,
  `tags` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `number_of_members` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for myalbum
-- ----------------------------
DROP TABLE IF EXISTS `myalbum`;
CREATE TABLE `myalbum` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ownerid` int(11) DEFAULT NULL,
  `albumid` int(11) DEFAULT NULL,
  `type` int(11) DEFAULT NULL COMMENT '类型，标识是什么的相册',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for photo
-- ----------------------------
DROP TABLE IF EXISTS `photo`;
CREATE TABLE `photo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `url` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `passwd` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `register_time` datetime DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
