-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 02, 2025 at 09:49 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `movie_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_accounts`
--

CREATE TABLE `tbl_accounts` (
  `u_id` int(255) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `u_type` varchar(255) NOT NULL,
  `u_password` varchar(50) NOT NULL,
  `u_phone` varchar(20) NOT NULL,
  `u_image` varchar(255) NOT NULL,
  `u_status` varchar(50) NOT NULL,
  `security_question` varchar(255) NOT NULL,
  `security_answer` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_accounts`
--

INSERT INTO `tbl_accounts` (`u_id`, `u_fname`, `u_lname`, `u_username`, `u_type`, `u_password`, `u_phone`, `u_image`, `u_status`, `security_question`, `security_answer`) VALUES
(2, 'somera', 'JD', 'somera', 'Employee', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', '012341231234', '', 'Deleted', '', ''),
(14, 'test', 'test', 'test', 'Employee', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', '09165165165', '', 'Deleted', '', ''),
(23, 'qweqwww', 'qwe', 'qweqq', 'Employee', 'ukYAUwyTQQK0hAZOuWm08XEDhxFCpSTgriqjYy90tJA=', '9846584658465', '', 'Deleted', '', ''),
(33, 'h', 'h', 'h', 'Employee', 'ukYAUwyTQQK0hAZOuWm08XEDhxFCpSTgriqjYy90tJA=', '32132132132231', '', 'Deleted', '', ''),
(34, 'test3', 'test3', 'test3', 'Employee', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', '84658465846', '', 'Deleted', '', ''),
(35, 'p', 'p', 'p', 'Employee', 'ukYAUwyTQQK0hAZOuWm08XEDhxFCpSTgriqjYy90tJA=', '465465465465', 'src/userimages/358a8efe7ddf86aad18d22a595a3f75e.jpg', 'Deleted', '', ''),
(36, 'o', 'o', 'o', 'Employee', 'ukYAUwyTQQK0hAZOuWm08XEDhxFCpSTgriqjYy90tJA=', '7897987988998', 'src/userimages/eda05644406c0d6100690e6b9fd25bdf.jpg', 'Deleted', '', ''),
(37, 'somera', 'jodee', 'somerajd', 'Employee', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', '012341231234', '', 'Deleted', '', ''),
(38, 'oo', 'o', 'oo', 'Employee', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', '132213312111', '', 'Deleted', '', ''),
(39, 'wqewqe', 'qweqwe', 'qweqwe', 'Employee', 'xa38M2aDO/LMalWu+nE/AUW+ZDkkCBFEeL/Mgr1Q7zU=', '09106083345', '', 'Deleted', '', ''),
(40, 'jods', 'smawea', 'aweaw', 'Employee', 'xa38M2aDO/LMalWu+nE/AUW+ZDkkCBFEeL/Mgr1Q7zU=', '09106083345', '', 'Deleted', '', ''),
(41, 'jodee', 'somera', 'jodss', 'Employee', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', '09957342019', '', 'Deleted', '', ''),
(42, '3212', '3212', '3212', 'Employee', '73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=', '09081618046', '', 'Deleted', '', ''),
(43, 'qwe', 'qwe', 'qwe', 'Employee', 'DR6kwlbNUKKnzL/SKz2ZWfb9ML2EC5/zx8Ze5OId8G0=', '09123456781', '', 'Deleted', '', ''),
(44, 'qweqwe', 'ewqewq', 'qweqwe', 'Employee', 'DR6kwlbNUKKnzL/SKz2ZWfb9ML2EC5/zx8Ze5OId8G0=', '0912312323254', '', 'Deleted', '', ''),
(45, 'qwe', 'qwe', 'ewq', 'Admin', 'PMhJJ5uimLWHo0yrrv/F7LOgRLv5fFFvq37enRr3fPo=', '0912312332123', '', 'Deleted', 'What\'s your favorite food?', 'hehe'),
(46, 'qwewq', 'www', 'ewqewq', 'Admin', 'vQ69B04phIJ00eAyYsFtB9k6LdMu+kHKW67IKzpes5s=', '09845634552', '', 'Active', '', ''),
(47, 'ewqwe', 'qwew', 'www', 'Admin', 'DR6kwlbNUKKnzL/SKz2ZWfb9ML2EC5/zx8Ze5OId8G0=', '091231232023', '', 'Active', '', ''),
(48, 'jodee', 'somera', 'JD', 'Employee', 'pmmZhIL+7CygxdWjEwDJvndrTd5K2Vsc4vNBteMr74M=', '09121232321', '', 'Active', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_logs`
--

CREATE TABLE `tbl_logs` (
  `log_id` int(11) NOT NULL,
  `u_id` int(11) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `action_time` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `log_action` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_logs`
--

INSERT INTO `tbl_logs` (`log_id`, `u_id`, `u_username`, `action_time`, `log_action`) VALUES
(97, 2, 'somera', '2025-05-02 07:38:57', 'Logged as Employee'),
(98, 2, 'somera', '2025-05-02 07:38:57', 'User Changed Their Details'),
(99, 2, 'somera', '2025-05-02 07:38:57', 'Logged as Employee'),
(100, 2, 'somera', '2025-05-02 07:38:57', 'User Changed Their Password'),
(101, 2, 'somera', '2025-05-02 07:38:57', 'Logged as Employee'),
(102, 2, 'somera', '2025-05-02 07:38:57', 'Logged as Employee'),
(103, 2, 'somera', '2025-05-02 07:38:57', 'Logged as Employee'),
(104, 34, 'somera', '2025-05-02 07:38:57', 'Registered for the first time'),
(105, 2, 'somera', '2025-05-02 07:38:57', 'Logged as Employee'),
(106, 2, 'somera', '2025-05-02 07:38:57', 'User Changed Their Details'),
(107, 2, 'somera', '2025-05-02 07:38:57', 'Logged as Employee'),
(108, 2, 'somera', '2025-05-02 07:38:57', 'User Changed Their Details'),
(109, 2, 'somera', '2025-05-02 07:38:57', 'Logged as Employee'),
(110, 2, 'somera', '2025-05-02 07:38:57', 'User Changed Their Details'),
(111, 2, 'somera', '2025-05-02 07:38:57', 'Logged as Employee'),
(112, 2, 'somera', '2025-05-02 07:38:57', 'User Changed Their Details'),
(113, 2, 'somera', '2025-05-02 07:38:57', 'Logged as Employee'),
(114, 2, 'somera', '2025-05-02 07:38:57', 'User Changed Their Details'),
(115, 2, 'somera', '2025-05-02 07:38:57', 'Logged as Employee'),
(116, 2, 'somera', '2025-05-02 07:38:57', 'User Changed Their Details'),
(117, 2, 'somera', '2025-05-02 07:38:57', 'Logged as Employee'),
(118, 2, 'somera', '2025-05-02 07:38:57', 'User Changed Their Details'),
(119, 2, 'somera', '2025-05-02 07:38:58', 'Logged as Employee'),
(120, 2, 'somera', '2025-05-02 07:38:58', 'User Changed Their Details'),
(121, 2, 'somera', '2025-05-02 07:38:58', 'Logged as Employee'),
(122, 2, 'qweqwe', '2025-05-02 07:47:30', 'User Changed Their Details'),
(123, 2, 'qweqwe', '2025-05-02 07:47:30', 'Logged as Employee'),
(127, 2, 'somera', '2025-05-02 07:47:30', 'Forgot, and changed their password'),
(132, 2, 'somera', '2025-05-02 07:47:30', 'Logged as Employee'),
(133, 2, 'somera', '2025-05-02 07:47:31', 'Logged as Employee'),
(134, 2, 'somera', '2025-05-02 07:47:31', 'User Changed Their Details'),
(135, 2, 'somera', '2025-05-02 07:47:31', 'Logged as Employee'),
(136, 2, 'somera', '2025-05-02 07:47:31', 'Logged as Employee'),
(137, 2, 'qweqwe', '2025-05-02 07:47:31', 'User Changed Their Details'),
(138, 2, 'qweqwe', '2025-05-02 07:47:31', 'Logged as Employee'),
(139, 2, 'qweqwe', '2025-05-02 07:47:31', 'User Changed Their Details'),
(140, 2, 'qweqwe', '2025-05-02 07:47:31', 'Logged as Employee'),
(141, 2, 'qweqwe', '2025-05-02 07:47:31', 'User Changed Their Details'),
(142, 2, 'qweqwe', '2025-05-02 07:47:31', 'Logged as Employee'),
(143, 2, 'qweqwe', '2025-05-02 07:47:31', 'User Changed Their Details'),
(144, 2, 'qweqwe', '2025-05-02 07:47:31', 'Logged as Employee'),
(145, 2, 'qweqwe', '2025-05-02 07:47:31', 'User Changed Their Details'),
(146, 2, 'qweqwe', '2025-05-02 07:47:31', 'Logged as Employee'),
(147, 2, 'qweqwe', '2025-05-02 07:47:31', 'User Changed Their Details'),
(148, 2, 'qweqwe', '2025-05-02 07:47:31', 'Logged as Employee'),
(149, 2, 'qweqwe', '2025-05-02 07:47:31', 'User Changed Their Details'),
(150, 2, 'qweqwe', '2025-05-02 07:47:31', 'Logged as Employee'),
(151, 2, 'qweqwe', '2025-05-02 07:47:31', 'User Changed Their Details'),
(153, 14, 'qweqwe', '2025-05-02 07:47:31', 'Logged as Employee'),
(170, 2, 'qweqwe', '2025-05-02 07:47:31', 'Logged as Employee'),
(171, 2, 'qweqwe', '2025-05-02 07:47:31', 'User Changed Their Details'),
(172, 2, 'qweqwe', '2025-05-02 07:47:31', 'Logged as Employee'),
(173, 2, 'qweqwe', '2025-05-02 07:47:31', 'Logged as Employee'),
(176, 2, 'qweqwe', '2025-05-02 07:47:31', 'Logged as Employee'),
(222, 2, 'qweqwe', '2025-05-02 07:47:31', 'Logged as Employee'),
(223, 2, 'qweqwe', '2025-05-02 07:47:31', 'Logged as Employee'),
(224, 2, 'qweqwe', '2025-05-02 07:47:31', 'Logged as Employee'),
(225, 2, 'qweqwe', '2025-05-02 07:47:32', 'Logged as Employee'),
(226, 2, 'qweqwe', '2025-05-02 07:47:32', 'Logged as Employee'),
(227, 2, 'qweqwe', '2025-05-02 07:47:32', 'Logged as Employee'),
(228, 2, 'qweqwe', '2025-05-02 07:47:32', 'Logged as Employee'),
(229, 2, 'qweqwe', '2025-05-02 07:47:32', 'Logged as Employee'),
(230, 2, 'qweqwe', '2025-05-02 07:47:32', 'Logged as Employee'),
(231, 2, 'qweqwe', '2025-05-02 07:47:32', 'Logged as Employee'),
(232, 2, 'JD', '2025-05-02 07:49:01', 'User made transaction ID: The Matrix'),
(233, 2, 'JD', '2025-05-02 07:49:01', 'Logged as Employee'),
(236, 2, 'JD', '2025-05-02 07:49:01', 'Logged as Employee'),
(237, 2, 'JD', '2025-05-02 07:49:01', 'Logged as Employee'),
(238, 2, 'JD', '2025-05-02 07:49:01', 'Logged as Employee'),
(239, 39, 'JD', '2025-05-02 07:49:01', 'Registered for the first time'),
(240, 39, 'JD', '2025-05-02 07:49:01', 'Logged as Employee'),
(241, 39, 'JD', '2025-05-02 07:49:01', 'User made transaction ID: The Matrix'),
(242, 39, 'JD', '2025-05-02 07:49:01', 'User Changed Their Details'),
(244, 39, 'JD', '2025-05-02 07:49:01', 'Logged Out'),
(246, 2, 'JD', '2025-05-02 07:49:02', 'Logged as Employee'),
(247, 2, 'JD', '2025-05-02 07:49:02', 'Logged as Employee'),
(248, 2, 'JD', '2025-05-02 07:49:02', 'Logged as Employee'),
(249, 2, 'JD', '2025-05-02 07:49:02', 'Logged Out'),
(250, 41, 'JD', '2025-05-02 07:49:02', 'Registered for the first time'),
(254, 42, 'JD', '2025-05-02 07:49:02', 'Registered for the first time'),
(255, 42, 'JD', '2025-05-02 07:49:02', 'Logged as Employee'),
(256, 42, 'JD', '2025-05-02 07:49:02', 'Logged Out'),
(259, 2, 'JD', '2025-05-02 07:49:02', 'Logged as Employee'),
(260, 2, 'JD', '2025-05-02 07:49:02', 'User made transaction ID: The Matrix'),
(261, 2, 'JD', '2025-05-02 07:49:02', 'User made transaction ID: The Matrix'),
(262, 2, 'JD', '2025-05-02 07:49:02', 'Logged Out'),
(263, 2, 'JD', '2025-05-02 07:49:02', 'Logged as Employee'),
(264, 43, 'qwe', '2025-04-30 09:35:46', 'Registered for the first time'),
(266, 43, 'qwe', '2025-04-30 09:36:24', 'Logged as Employee'),
(267, 43, 'qwe', '2025-04-30 10:01:35', 'Logged as Employee'),
(268, 43, 'qwe', '2025-04-30 11:05:50', 'Logged Out'),
(269, 43, 'qwe', '2025-04-30 11:06:40', 'Logged as Employee'),
(270, 43, 'qwe', '2025-04-30 11:07:53', 'User made transaction ID: The Matrix'),
(271, 44, 'qweqwe', '2025-04-30 12:47:28', 'Registered for the first time'),
(273, 44, 'qweqwe', '2025-04-30 12:47:45', 'Failed - Inactive Account'),
(274, 44, 'qweqwe', '2025-04-30 12:48:04', 'Logged as Employee'),
(275, 44, 'qweqwe', '2025-04-30 12:50:12', 'User made transaction ID: The Matrix'),
(276, 43, 'qwe', '2025-04-30 14:19:25', 'Logged as Employee'),
(277, 43, 'qwe', '2025-04-30 14:19:45', 'Logged Out'),
(278, 45, 'ewq', '2025-04-30 14:20:50', 'Registered for the first time'),
(279, 45, 'ewq', '2025-04-30 14:21:11', 'Logged as Admin'),
(280, 45, 'ewq', '2025-04-30 14:21:38', 'Admin Deleted Account: qwe'),
(281, 45, 'ewq', '2025-04-30 14:22:06', 'Admin Changed Password'),
(282, 45, 'ewq', '2025-04-30 14:23:12', 'User Changed Their Details'),
(283, 45, 'ewq', '2025-04-30 14:26:03', 'Admin Updated The Movie: The Matrix'),
(284, 45, 'ewq', '2025-04-30 14:27:01', 'Logged Out'),
(285, 44, 'qweqwe', '2025-04-30 14:27:37', 'Logged as Employee'),
(287, 45, 'ewq', '2025-04-30 14:52:43', 'Forgot, and changed their password'),
(288, 45, 'ewq', '2025-04-30 14:52:46', 'Logged as Admin'),
(289, 45, 'ewq', '2025-04-30 14:54:21', 'Admin Updated The Movie: The Matrix1'),
(290, 45, 'ewq', '2025-04-30 14:59:51', 'Logged as Admin'),
(291, 45, 'ewq', '2025-04-30 15:02:20', 'Logged as Admin'),
(292, 45, 'ewq', '2025-04-30 15:02:44', 'Admin Added The Movie: qweqwe'),
(293, 45, 'ewq', '2025-04-30 15:03:26', 'Admin Updated The Movie: The Matrix1'),
(294, 45, 'ewq', '2025-04-30 15:03:28', 'Admin Updated The Movie: The Matrix1'),
(295, 45, 'ewq', '2025-04-30 15:04:31', 'Admin Updated The Movie: The Matrix1'),
(296, 45, 'ewq', '2025-04-30 15:05:03', 'Admin Updated The Movie: The Matrix1'),
(297, 45, 'ewq', '2025-05-02 05:33:25', 'Logged as Admin'),
(298, 45, 'ewq', '2025-05-02 05:33:34', 'Logged Out'),
(299, 45, 'ewq', '2025-05-02 05:34:08', 'Logged as Admin'),
(300, 45, 'ewq', '2025-05-02 05:56:06', 'Logged as Admin'),
(301, 45, 'ewq', '2025-05-02 05:56:43', 'Logged Out'),
(302, 45, 'ewq', '2025-05-02 05:57:32', 'Logged as Admin'),
(303, 45, 'ewq', '2025-05-02 05:57:56', 'Admin Added The Movie: www'),
(304, 45, 'ewq', '2025-05-02 05:58:51', 'Admin Deleted Account: ewq'),
(305, 45, 'ewq', '2025-05-02 05:59:21', 'Admin Added The Movie: nemo'),
(306, 45, 'ewq', '2025-05-02 05:59:45', 'Admin Deleted Account: ewq'),
(307, 45, 'ewq', '2025-05-02 06:32:31', 'Logged as Admin'),
(308, 45, 'ewq', '2025-05-02 06:32:41', 'Admin Deleted Account: ewq'),
(309, 45, 'ewq', '2025-05-02 06:32:55', 'Admin Deleted Account: qweqwe'),
(311, 46, 'ewqewq', '2025-05-02 06:34:52', 'Registered for the first time'),
(312, 46, 'ewqewq', '2025-05-02 06:35:16', 'Logged as Admin'),
(313, 46, 'ewqewq', '2025-05-02 06:35:26', 'Admin Deleted Account: dannyboy'),
(314, 47, 'www', '2025-05-02 06:40:23', 'Registered for the first time'),
(315, 47, 'www', '2025-05-02 06:40:57', 'Logged as Admin'),
(316, 47, 'www', '2025-05-02 06:41:07', 'Admin Deleted Account: test2'),
(318, 47, 'www', '2025-05-02 06:51:40', 'Logged as Admin'),
(319, 47, 'www', '2025-05-02 06:51:52', 'Admin Deleted Account: test55'),
(320, 47, 'www', '2025-05-02 06:52:03', 'Admin Deleted Account: dannyboy'),
(321, 47, 'www', '2025-05-02 06:52:08', 'Admin Deleted Account: p'),
(322, 47, 'www', '2025-05-02 06:52:17', 'Admin Deleted Account: o'),
(323, 47, 'www', '2025-05-02 06:52:21', 'Admin Deleted Account: Valenj'),
(324, 47, 'www', '2025-05-02 06:52:24', 'Admin Deleted Account: Valenj'),
(325, 47, 'www', '2025-05-02 06:52:30', 'Admin Deleted Account: gale12'),
(326, 47, 'www', '2025-05-02 06:52:33', 'Admin Deleted Account: maby12'),
(327, 47, 'www', '2025-05-02 06:53:01', 'Admin Deleted Account: www'),
(328, 47, 'www', '2025-05-02 06:53:26', 'Admin Added The Movie: hehe'),
(329, 47, 'www', '2025-05-02 06:54:14', 'Admin Deleted Account: www'),
(331, 47, 'www', '2025-05-02 07:07:55', 'Logged as Admin'),
(332, 47, 'www', '2025-05-02 07:08:31', 'Admin Added The Movie: huhu'),
(333, 47, 'www', '2025-05-02 07:15:39', 'Logged as Admin'),
(334, 47, 'www', '2025-05-02 07:16:04', 'Admin Added The Movie: qweew'),
(335, 47, 'www', '2025-05-02 07:16:21', 'Admin Deleted Account: www'),
(336, 47, 'www', '2025-05-02 07:17:08', 'Logged as Admin'),
(337, 47, 'www', '2025-05-02 07:17:19', 'Admin Added The Movie: shesh'),
(338, 47, 'www', '2025-05-02 07:17:26', 'Admin Deleted Account: www'),
(339, 47, 'www', '2025-05-02 07:28:59', 'Admin Deleted Account: www'),
(340, 48, 'JD', '2025-05-02 07:39:59', 'Registered for the first time'),
(341, 48, 'JD', '2025-05-02 07:40:20', 'Logged as Employee');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_orders`
--

CREATE TABLE `tbl_orders` (
  `o_id` int(11) NOT NULL,
  `u_id` int(11) NOT NULL,
  `p_id` int(11) NOT NULL,
  `quantity` int(50) NOT NULL,
  `date` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `status` varchar(255) NOT NULL,
  `o_total` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_orders`
--

INSERT INTO `tbl_orders` (`o_id`, `u_id`, `p_id`, `quantity`, `date`, `status`, `o_total`) VALUES
(1, 2, 1, 2, '2025-04-28 10:43:57', 'Succesful', 1000.00),
(2, 39, 1, 3, '2025-04-29 08:03:56', 'Succesful', 3000.00),
(3, 2, 1, 1, '2025-04-29 09:06:26', 'Succesful', 500.00),
(4, 2, 1, 1, '2025-04-29 09:07:06', 'Succesful', 500.00),
(5, 43, 1, 2, '2025-04-30 11:07:51', 'Succesful', 2000.00),
(6, 44, 1, 1, '2025-04-30 12:50:09', 'Succesful', 600.00);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_products`
--

CREATE TABLE `tbl_products` (
  `p_id` int(20) NOT NULL,
  `p_name` varchar(50) NOT NULL,
  `p_price` decimal(10,2) NOT NULL,
  `p_quantity` int(11) NOT NULL,
  `p_status` varchar(50) NOT NULL,
  `p_image` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_products`
--

INSERT INTO `tbl_products` (`p_id`, `p_name`, `p_price`, `p_quantity`, `p_status`, `p_image`) VALUES
(1, 'The Matrix1', 322.00, 10, 'Deleted', 'src/userimages/icons8-user-50.png'),
(2, 'qweqwe', 1232.00, 0, 'Deleted', 'src/userimages/1.jpg'),
(3, 'www', 122.00, 0, 'Deleted', ''),
(4, 'nemo', 123.00, 0, 'Deleted', ''),
(5, 'hehe', 1200.00, 0, 'Available', ''),
(6, 'huhu', 200.00, 0, 'Deleted', ''),
(7, 'qweew', 111.00, 0, 'Deleted', ''),
(8, 'shesh', 123213.00, 0, 'Deleted', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_accounts`
--
ALTER TABLE `tbl_accounts`
  ADD PRIMARY KEY (`u_id`);

--
-- Indexes for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  ADD PRIMARY KEY (`log_id`),
  ADD KEY `fk_log_user_id` (`u_id`);

--
-- Indexes for table `tbl_orders`
--
ALTER TABLE `tbl_orders`
  ADD PRIMARY KEY (`o_id`),
  ADD KEY `uid` (`u_id`),
  ADD KEY `pid` (`p_id`);

--
-- Indexes for table `tbl_products`
--
ALTER TABLE `tbl_products`
  ADD PRIMARY KEY (`p_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_accounts`
--
ALTER TABLE `tbl_accounts`
  MODIFY `u_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;

--
-- AUTO_INCREMENT for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=342;

--
-- AUTO_INCREMENT for table `tbl_orders`
--
ALTER TABLE `tbl_orders`
  MODIFY `o_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbl_products`
--
ALTER TABLE `tbl_products`
  MODIFY `p_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  ADD CONSTRAINT `fk_log_user_id` FOREIGN KEY (`u_id`) REFERENCES `tbl_accounts` (`u_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tbl_orders`
--
ALTER TABLE `tbl_orders`
  ADD CONSTRAINT `pid` FOREIGN KEY (`p_id`) REFERENCES `tbl_products` (`p_id`),
  ADD CONSTRAINT `uid` FOREIGN KEY (`u_id`) REFERENCES `tbl_accounts` (`u_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
