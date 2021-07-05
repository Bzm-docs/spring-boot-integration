/*
 Navicat Premium Data Transfer

 Source Server         : 159.75.136.164
 Source Server Type    : MySQL
 Source Server Version : 50733
 Source Host           : 159.75.136.164:3306
 Source Schema         : bzm

 Target Server Type    : MySQL
 Target Server Version : 50733
 File Encoding         : 65001

 Date: 05/07/2021 15:42:02
*/

SET NAMES utf8mb4;
SET
FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_users
-- ----------------------------
DROP TABLE IF EXISTS `t_users`;
CREATE TABLE `t_users`
(
    `id`       int(6) NOT NULL AUTO_INCREMENT,
    `username` varchar(80) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
    `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
    `regdate`  timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
    `role`     varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
    `state`    tinyint(255) NULL DEFAULT NULL,
    `email`    varchar(120) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_users
-- ----------------------------
INSERT INTO `t_users`
VALUES (1, 'admin', '123456', '2021-03-14 12:08:59', '超级管理员', 1, '2794127547@qq.com');

SET
FOREIGN_KEY_CHECKS = 1;
