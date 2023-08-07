-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 07, 2023 at 06:57 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `desktophotel`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customerId` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `roomNumber` int(11) NOT NULL,
  `roomType` varchar(10) NOT NULL,
  `bed` varchar(10) NOT NULL,
  `mobile` int(15) NOT NULL,
  `address` varchar(60) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `email` varchar(30) NOT NULL,
  `idType` varchar(20) NOT NULL,
  `idNumber` varchar(20) NOT NULL,
  `joinDate` varchar(11) NOT NULL,
  `CheckOutDate` varchar(11) NOT NULL,
  `Price` double NOT NULL,
  `NumberofDays` int(11) NOT NULL,
  `discount` double NOT NULL,
  `paymentMode` varchar(10) NOT NULL,
  `advancePayment` double NOT NULL,
  `status` varchar(10) NOT NULL,
  `totalAmount` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customerId`, `name`, `roomNumber`, `roomType`, `bed`, `mobile`, `address`, `gender`, `email`, `idType`, `idNumber`, `joinDate`, `CheckOutDate`, `Price`, `NumberofDays`, `discount`, `paymentMode`, `advancePayment`, `status`, `totalAmount`) VALUES
(1, 'fcdsfsd', 101, 'Non AC', 'Single', 42435, 'fsfsdg', 'Male', 'sfsdgfdf', 'Aadhaar Card', '32323123', '08-05-2023', '', 1000, 0, 0, 'Cash', 0, 'Checked in', 0),
(2, 'nfskjfhs', 102, 'Non AC', 'Single', 634287356, 'dbcfjsdfs', 'Male', 'hcjxgjhvc', 'Aadhaar Card', '34286237842', '08-05-2023', '08-05-2023', 1000, 1, 100, 'Cash', 0, 'Checkedout', 900),
(3, 'ehdfkjsf', 103, 'AC', 'Single', 376427834, 'hfdjsf', 'Male', 'jasdsjf', 'Aadhaar Card', '472984735', '08-05-2023', '08-05-2023', 1500, 1, 100, 'Online', 500, 'Checkedout', 1400);

-- --------------------------------------------------------

--
-- Table structure for table `info`
--

CREATE TABLE `info` (
  `admin` varchar(20) NOT NULL,
  `adminPassword` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `info`
--

INSERT INTO `info` (`admin`, `adminPassword`) VALUES
('Satish', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `roomNumber` int(11) NOT NULL,
  `price` double NOT NULL,
  `roomType` varchar(10) NOT NULL,
  `bed` varchar(10) NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`roomNumber`, `price`, `roomType`, `bed`, `status`) VALUES
(101, 1000, 'Non AC', 'Single', 'Occupied'),
(102, 1000, 'Non AC', 'Single', 'Available'),
(103, 1500, 'AC', 'Single', 'Available'),
(104, 1500, 'AC', 'Single', 'Available'),
(105, 1700, 'Non AC', 'Double', 'Available'),
(106, 1700, 'Non AC', 'Double', 'Available'),
(107, 2000, 'AC', 'Double', 'Available');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customerId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `customerId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
