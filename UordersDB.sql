-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jan 18, 2023 at 02:37 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `UordersDB`
--

-- --------------------------------------------------------

--
-- Table structure for table `Customer`
--

CREATE TABLE `Customer` (
  `Id_customer` int(11) NOT NULL,
  `Fname_Cus` int(11) NOT NULL,
  `Lname_Cus` int(11) NOT NULL,
  `EmailCus` int(11) NOT NULL,
  `PswdCus` int(11) NOT NULL,
  `Item_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `Menu`
--

CREATE TABLE `Menu` (
  `Id_Menu` int(11) NOT NULL,
  `Category` varchar(50) NOT NULL,
  `Menu_pic` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `Menu`
--

INSERT INTO `Menu` (`Id_Menu`, `Category`, `Menu_pic`) VALUES
(1, 'tajine', 'breakfast.png'),
(2, '', '\r\n\r\n\r\n\r\n\r\n\r\n\r\n');

-- --------------------------------------------------------

--
-- Table structure for table `Menu_Item`
--

CREATE TABLE `Menu_Item` (
  `Id_Item` int(11) NOT NULL,
  `Name_Item` varchar(30) NOT NULL,
  `Price` double NOT NULL,
  `M_item_pic` varchar(255) NOT NULL,
  `menu_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `Order`
--

CREATE TABLE `Order` (
  `Id_order` int(11) NOT NULL,
  `comment` varchar(200) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Total` double NOT NULL,
  `order_status` varchar(30) NOT NULL,
  `customer_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `Payment`
--

CREATE TABLE `Payment` (
  `Id_Payment` int(11) NOT NULL,
  `Type` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `Recipient`
--

CREATE TABLE `Recipient` (
  `Id_Recepient` int(11) NOT NULL,
  `Qte_order` int(11) NOT NULL,
  `Qte_item` int(11) NOT NULL,
  `Date` datetime NOT NULL,
  `payment_id` int(11) NOT NULL,
  `item_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `Staff`
--

CREATE TABLE `Staff` (
  `Id_staff` int(11) NOT NULL,
  `Fname_St` int(11) NOT NULL,
  `Lname_St` int(11) NOT NULL,
  `EmailSt` int(11) NOT NULL,
  `Pswd_st` int(11) NOT NULL,
  `Order_Id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Customer`
--
ALTER TABLE `Customer`
  ADD PRIMARY KEY (`Id_customer`),
  ADD KEY `test1` (`Item_id`);

--
-- Indexes for table `Menu`
--
ALTER TABLE `Menu`
  ADD PRIMARY KEY (`Id_Menu`);

--
-- Indexes for table `Menu_Item`
--
ALTER TABLE `Menu_Item`
  ADD PRIMARY KEY (`Id_Item`),
  ADD KEY `test5` (`menu_id`);

--
-- Indexes for table `Order`
--
ALTER TABLE `Order`
  ADD PRIMARY KEY (`Id_order`),
  ADD KEY `test4` (`customer_id`);

--
-- Indexes for table `Payment`
--
ALTER TABLE `Payment`
  ADD PRIMARY KEY (`Id_Payment`);

--
-- Indexes for table `Recipient`
--
ALTER TABLE `Recipient`
  ADD PRIMARY KEY (`Id_Recepient`),
  ADD KEY `test3` (`payment_id`),
  ADD KEY `test2` (`item_id`);

--
-- Indexes for table `Staff`
--
ALTER TABLE `Staff`
  ADD PRIMARY KEY (`Id_staff`),
  ADD KEY `Test` (`Order_Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Customer`
--
ALTER TABLE `Customer`
  MODIFY `Id_customer` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Menu`
--
ALTER TABLE `Menu`
  MODIFY `Id_Menu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `Menu_Item`
--
ALTER TABLE `Menu_Item`
  MODIFY `Id_Item` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Order`
--
ALTER TABLE `Order`
  MODIFY `Id_order` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Payment`
--
ALTER TABLE `Payment`
  MODIFY `Id_Payment` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Recipient`
--
ALTER TABLE `Recipient`
  MODIFY `Id_Recepient` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Staff`
--
ALTER TABLE `Staff`
  MODIFY `Id_staff` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Customer`
--
ALTER TABLE `Customer`
  ADD CONSTRAINT `test1` FOREIGN KEY (`Item_id`) REFERENCES `Menu_Item` (`Id_Item`);

--
-- Constraints for table `Menu_Item`
--
ALTER TABLE `Menu_Item`
  ADD CONSTRAINT `test5` FOREIGN KEY (`menu_id`) REFERENCES `Menu` (`Id_Menu`);

--
-- Constraints for table `Order`
--
ALTER TABLE `Order`
  ADD CONSTRAINT `test4` FOREIGN KEY (`customer_id`) REFERENCES `Customer` (`Id_customer`);

--
-- Constraints for table `Recipient`
--
ALTER TABLE `Recipient`
  ADD CONSTRAINT `test2` FOREIGN KEY (`item_id`) REFERENCES `Menu_Item` (`Id_Item`),
  ADD CONSTRAINT `test3` FOREIGN KEY (`payment_id`) REFERENCES `Payment` (`Id_Payment`);

--
-- Constraints for table `Staff`
--
ALTER TABLE `Staff`
  ADD CONSTRAINT `Test` FOREIGN KEY (`Order_Id`) REFERENCES `Order` (`Id_order`);
COMMIT;

-- Table structure for table `CardPayment`
--

CREATE TABLE `CardPayment` (
  `CardNumber` int(16) NOT NULL,
  `NameCard` varchar(100) NOT NULL,
  `expDate` date NOT NULL,
  `cvc` int(3) NOT NULL,
  `Label` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
