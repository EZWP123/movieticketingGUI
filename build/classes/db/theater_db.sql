-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 25, 2025 at 10:07 AM
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
-- Database: `theater_db`
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
  `u_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_accounts`
--

INSERT INTO `tbl_accounts` (`u_id`, `u_fname`, `u_lname`, `u_username`, `u_type`, `u_password`, `u_phone`, `u_status`) VALUES
(1, 'John', 'Parker', 'Johnparker', 'Admin', '12345678', '01234567890', 'Active'),
(2, 'daniel', 'failadona', 'dannyboy', 'Employee', '12345678', '012341231234', 'Active'),
(3, 'testing', 'testing', 'test', 'Employee', 'testing12345678', '12345678901', 'Pending'),
(5, 'ross', 'sabio', 'rosssabio', 'Employee', '12345678', '09150419620', 'Pending'),
(6, 'ross', 'sabio', 'rosssabio', 'Employee', '12345678', '09150419620', 'Pending'),
(7, 'Test', '3', 'Test3', 'Employee', '12345678', '0912345678911', 'Pending'),
(8, 'test4', 'test4', 'test4', 'Employee', '12345678', '09123456789', 'Pending'),
(9, 'test5', 'test5', 'test5', 'Employee', '12345678', '09123456789', 'Pending'),
(10, 'test 6', 'test 6', 'test 6', 'Employee', '12345678', '01234567891', 'Pending'),
(11, 'test 6', 'test 6', 'test 7', 'Employee', '12345678', '012345678911', 'Pending'),
(12, 'John', 'Evergreen', 'Johneve', 'Employee', '12345678', '012345678901', 'Pending'),
(13, 'alcaya', 'M', 'alcaya', 'Employee', 'alcayamarlo', '09151391914', 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_movies`
--

CREATE TABLE `tbl_movies` (
  `m_id` int(11) NOT NULL,
  `m_title` varchar(255) NOT NULL,
  `m_director` varchar(255) NOT NULL,
  `m_Ryear` varchar(255) NOT NULL,
  `m_genre` varchar(255) NOT NULL,
  `m_rating` int(11) NOT NULL,
  `m_theaterType` varchar(255) NOT NULL,
  `m_description` varchar(255) NOT NULL,
  `m_price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_accounts`
--
ALTER TABLE `tbl_accounts`
  ADD PRIMARY KEY (`u_id`);

--
-- Indexes for table `tbl_movies`
--
ALTER TABLE `tbl_movies`
  ADD PRIMARY KEY (`m_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_accounts`
--
ALTER TABLE `tbl_accounts`
  MODIFY `u_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
