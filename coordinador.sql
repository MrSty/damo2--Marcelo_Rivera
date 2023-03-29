-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 29, 2023 at 11:08 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `myuca`
--

-- --------------------------------------------------------

--
-- Table structure for table `coordinador`
--

CREATE TABLE `coordinador` (
  `id` int(11) NOT NULL,
  `nombres` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `fechaNac` date NOT NULL,
  `titulo` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `facultad` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `coordinador`
--

INSERT INTO `coordinador` (`id`, `nombres`, `apellidos`, `fechaNac`, `titulo`, `email`, `facultad`) VALUES
(1, 'Roberto Jose', 'Amador Arroliga', '1960-03-20', 'Ingeniero', 'queperezadiosmio.joserto@gmail.com', 'Ciencias, Tecnologia y Ambiente'),
(2, 'Roberto Jose', 'Amador Arroliga', '1980-03-20', 'Ingeniero', 'queperezadiosmio.joserto@gmail.com', 'Ciencias, Tecnologia y Ambiente'),
(3, 'Iver Jose', 'Maliaños Perez', '1958-03-20', 'Master', 'queperezadiosmio.ivereats@gmail.com', 'Humanidades');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `coordinador`
--
ALTER TABLE `coordinador`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `coordinador`
--
ALTER TABLE `coordinador`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
