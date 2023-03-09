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

 Date: 29/12/2022 15:09:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` varchar(64) CHARACTER SET ascii COLLATE ascii_bin NOT NULL COMMENT '用户id',
  `user_name` varchar(255) CHARACTER SET ascii COLLATE ascii_bin NULL DEFAULT NULL COMMENT '用户姓名',
  `user_password` varchar(255) CHARACTER SET ascii COLLATE ascii_bin NULL DEFAULT NULL COMMENT '用户密码',
  `user_type` int(1) NULL DEFAULT NULL COMMENT '用户类型：0:管理员，1:普通用户',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = ascii COLLATE = ascii_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('0fcbc970-a880-26e2-ac1f-89badc01eb86', 'Virginia Alvarez', 'WqADhvp2FR', 0);
INSERT INTO `user` VALUES ('2da0428d-c1a9-9df3-2d50-6a54d6fe16fe', 'Debra Watson', 'ZEUGXOCAeY', 1);
INSERT INTO `user` VALUES ('332302ab-29ad-d8b0-756b-479b9f79301f', 'Eva Fernandez', 'DLCLpcfoGp', 1);
INSERT INTO `user` VALUES ('39d1008b-a480-5488-cd21-d77834b1789e', 'Debra Mills', 'm16xQwfEWf', 1);
INSERT INTO `user` VALUES ('3e7583fd-ec79-e0a5-d325-45a957f89fa0', 'Kimberly Mendoza', 'Upqlahz4om', 0);
INSERT INTO `user` VALUES ('7cf1317d-b2dd-6c18-1424-b01847d577d9', 'Shannon Coleman', 'r8lVj6Pckg', 1);
INSERT INTO `user` VALUES ('83f85287-43d4-c422-676c-fbb29513579c', 'Patrick Gomez', 'Krp68aFABo', 1);
INSERT INTO `user` VALUES ('86ed7b78-b6cd-fea4-1e61-b19af6af952c', 'Richard Powell', 'lZIXUYy5mB', 1);
INSERT INTO `user` VALUES ('c1c8efa8-418d-4cfc-fd82-724956f0361c', 'Gerald Hunt', '0Vni8C87Qd', 0);
INSERT INTO `user` VALUES ('e20fee34-c343-987c-7337-410fe05d97dd', 'Leslie Tran', 'k9Xap3A5Zv', 1);

SET FOREIGN_KEY_CHECKS = 1;
