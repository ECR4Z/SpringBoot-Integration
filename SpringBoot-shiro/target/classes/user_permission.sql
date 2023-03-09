/*
 Navicat Premium Data Transfer

 Source Server         : Local-MySQL-5.7
 Source Server Type    : MySQL
 Source Server Version : 50740 (5.7.40-log)
 Source Host           : localhost:3306
 Source Schema         : ssm_db

 Target Server Type    : MySQL
 Target Server Version : 50740 (5.7.40-log)
 File Encoding         : 65001

 Date: 29/12/2022 15:09:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_permission
-- ----------------------------
DROP TABLE IF EXISTS `user_permission`;
CREATE TABLE `user_permission`  (
  `role_type` varchar(255) CHARACTER SET ascii COLLATE ascii_bin NOT NULL,
  `role_permission` varchar(255) CHARACTER SET ascii COLLATE ascii_bin NULL DEFAULT NULL,
  PRIMARY KEY (`role_type`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = ascii COLLATE = ascii_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_permission
-- ----------------------------
INSERT INTO `user_permission` VALUES ('0', 'admin:queryByName,user:queryAllUser');
INSERT INTO `user_permission` VALUES ('1', 'user:queryAllUser');

SET FOREIGN_KEY_CHECKS = 1;
