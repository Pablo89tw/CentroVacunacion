-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-10-2023 a las 03:05:47
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vacunas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudadano`
--

CREATE TABLE `ciudadano` (
  `idCiudadano` tinyint(20) NOT NULL,
  `DNI` int(100) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `latitud` double NOT NULL,
  `longitud` double NOT NULL,
  `email` varchar(20) NOT NULL,
  `celular` int(11) NOT NULL,
  `ambitoTrabajo` varchar(20) NOT NULL,
  `dosisAplicadas` tinyint(10) NOT NULL,
  `fechaProxCita` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ciudadano`
--

INSERT INTO `ciudadano` (`idCiudadano`, `DNI`, `apellido`, `nombre`, `latitud`, `longitud`, `email`, `celular`, `ambitoTrabajo`, `dosisAplicadas`, `fechaProxCita`) VALUES
(19, 34585965, 'Falopa', 'Treinta', 0, 0, 'manarata', 64532165, 'Arte y Entretenimien', 0, '0000-00-00 00:00:00'),
(20, 1412312, 'sdas', 'asdas', -31.610045314497373, -60.66770553588867, 'asddsa', 12412312, 'Arte y Entretenimien', 0, NULL),
(21, 41231, 'sdasd', 'sadas', -31.631460102558652, -60.68787384033203, 'sadsa', 412321, 'Gobierno y Administr', 0, NULL),
(23, 3, 'sdsad', 'sadas', -31.670914715537975, -60.72418212890625, 'sadas', 12312, 'Gobierno y Administr', 0, NULL),
(25, 21312312, 'Marica', 'Ferrera', -31.634090931085215, -60.64659118652344, 'maricaFerrera@gmail.', 4123123, 'Agricultura y Agroin', 0, NULL),
(26, 2312, 'd', 's', -31.626198222280603, -60.76263427734375, 's', 2312, 'Gobierno y Administr', 0, NULL),
(27, 21312, 'fas', 'fas', -31.63730628711834, -60.69414138793945, 'sadas', 2412, 'Arte y Entretenimien', 0, NULL),
(28, 34508715, 'Torti', 'Juan', -31.640210973410955, -60.690568685531616, 'juantorti1964@hotmai', 14122312, 'Arte y Entretenimien', 0, NULL),
(29, 412312312, 'Massa', 'Felipe', -31.61106865879486, -60.69972038269043, 'dasdasdas', 421312312, 'Construcción y Arqui', 0, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fabricante`
--

CREATE TABLE `fabricante` (
  `idEmpresa` tinyint(5) NOT NULL,
  `Cuit` varchar(13) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `País` varchar(20) NOT NULL,
  `Direccion` varchar(20) NOT NULL,
  `Stock` int(15) NOT NULL,
  `Viales` varchar(20) NOT NULL,
  `VolumenVial` tinyint(5) NOT NULL,
  `Estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `fabricante`
--

INSERT INTO `fabricante` (`idEmpresa`, `Cuit`, `Nombre`, `País`, `Direccion`, `Stock`, `Viales`, `VolumenVial`, `Estado`) VALUES
(1, '50-12313223-0', 'Pfizer', 'Estados Unidos', '123 MainStreet NY', 500000000, 'Pfizer', 5, 0),
(2, '98-76543210-9', 'Johnson Johnson', 'Estados Unidos', 'Miami 3350', 47000000, 'Johnson Johnson', 10, 0),
(3, '17-54698759-9', 'AstraZeneca', 'Argentina', 'Buenos Aires', 164543534, 'AstraZeneca', 10, 0),
(4, '20-45698753-5', 'Sinopharm y Sinovac', 'Conurbano', 'Villa 11-14', 41231231, 'Sinopharm y Sinovac', 4, 0),
(5, '99-98765432-1', 'Sputnik V', 'Rusia', 'Moscu 4050', 170000000, 'Sputnik V\"', 5, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `geo`
--

CREATE TABLE `geo` (
  `idGeo` tinyint(4) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `latitud` float NOT NULL,
  `longitud` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `geo`
--

INSERT INTO `geo` (`idGeo`, `nombre`, `latitud`, `longitud`) VALUES
(1, 'CABA', -34.6118, -58.4173),
(2, 'La Plata', -34.9206, -57.9536),
(3, 'San Miguel de Tucumán', -26.8083, -65.2226),
(4, 'Salta', -24.7829, -65.4129),
(5, 'San Salvador de Jujuy', -24.1858, -65.2995),
(6, 'San Fernando del Valle de Catamarca', -28.4696, -65.7852),
(7, 'Resistencia', -27.4512, -58.9866),
(8, 'Santa Rosa', -36.6174, -64.2882),
(9, 'Neuquén', -38.9516, -68.0591),
(10, 'Viedma', -40.8113, -63.0017),
(11, 'Rawson', -43.3, -65.1023),
(12, 'Ushuaia', -54.804, -68.3073),
(13, 'La Rioja', -29.4111, -66.8567),
(14, 'San Juan', -31.5375, -68.5364),
(15, 'San Luis', -33.3017, -66.3378),
(16, 'Santa Fe', -31.6182, -60.6995),
(17, 'Córdoba', -31.4201, -64.1888),
(18, 'Rosario', -32.9422, -60.6618),
(19, 'Mendoza', -32.8894, -68.8458),
(20, 'San Carlos de Bariloche', -41.1334, -71.3103),
(21, 'Mar del Plata', -38.0055, -57.5426),
(22, 'Gran Salta', -24.7801, -65.4117),
(23, 'Gran Santa Rosa', -36.6167, -64.2872),
(24, 'San Rafael', -34.6177, -68.3303),
(25, 'Gran San Juan', -31.5357, -68.5364),
(26, 'Tandil', -37.3217, -59.1332),
(27, 'Gran Neuquén', -38.9489, -68.105),
(28, 'Comodoro Rivadavia', -45.8644, -67.4965),
(29, 'Gran Junín', -34.5832, -60.945),
(30, 'Gran Bahía Blanca', -38.7167, -62.2833),
(31, 'Santiago del Estero', -27.7951, -64.2615),
(32, 'Corrientes', -27.4698, -58.8301),
(33, 'Posadas', -27.3671, -55.8961);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `patologias`
--

CREATE TABLE `patologias` (
  `DNI` int(20) NOT NULL,
  `Cardiovasculares` tinyint(1) NOT NULL,
  `Diabetes` tinyint(1) NOT NULL,
  `Respiratorias_Cronicas` tinyint(1) NOT NULL,
  `Inmunosupresion` tinyint(1) NOT NULL,
  `Obesidad` tinyint(1) NOT NULL,
  `Renales_cronicas` tinyint(1) NOT NULL,
  `Embarazo` tinyint(1) NOT NULL,
  `Hepaticas_cronicas` tinyint(1) NOT NULL,
  `Neurologicas` tinyint(1) NOT NULL,
  `otra` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `patologias`
--

INSERT INTO `patologias` (`DNI`, `Cardiovasculares`, `Diabetes`, `Respiratorias_Cronicas`, `Inmunosupresion`, `Obesidad`, `Renales_cronicas`, `Embarazo`, `Hepaticas_cronicas`, `Neurologicas`, `otra`) VALUES
(34585965, 0, 0, 1, 0, 0, 0, 0, 0, 0, 'pepas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turnero_1`
--

CREATE TABLE `turnero_1` (
  `idTurnos` tinyint(20) NOT NULL,
  `fecha` date NOT NULL,
  `idCentro` tinyint(20) NOT NULL,
  `8_9` tinyint(5) NOT NULL DEFAULT 5,
  `9_10` tinyint(5) NOT NULL DEFAULT 5,
  `10_11` tinyint(5) NOT NULL DEFAULT 5,
  `11_12` tinyint(5) NOT NULL DEFAULT 5,
  `12_13` tinyint(5) NOT NULL DEFAULT 5,
  `13_14` tinyint(5) NOT NULL DEFAULT 5,
  `14_15` tinyint(5) NOT NULL DEFAULT 5,
  `15_16` tinyint(5) NOT NULL DEFAULT 5,
  `16_17` tinyint(5) NOT NULL DEFAULT 5
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `turnero_1`
--

INSERT INTO `turnero_1` (`idTurnos`, `fecha`, `idCentro`, `8_9`, `9_10`, `10_11`, `11_12`, `12_13`, `13_14`, `14_15`, `15_16`, `16_17`) VALUES
(1, '2000-01-01', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(2, '2023-10-02', 1, 5, 0, 5, 5, 5, 0, 5, 5, 5),
(3, '2023-10-03', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(4, '2023-10-04', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(5, '2023-10-05', 1, 0, 0, 0, 0, 3, 5, 2, 4, 4),
(6, '2023-10-06', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(7, '2023-10-07', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(8, '2023-10-08', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(9, '2023-10-09', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(10, '2023-10-10', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(11, '2023-10-11', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(12, '2023-10-12', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(13, '2023-10-13', 1, 5, 2, 5, 5, 5, 5, 5, 5, 5),
(14, '2023-10-14', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(15, '2023-10-15', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(16, '2023-10-16', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(17, '2023-10-17', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(18, '2023-10-18', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(19, '2023-10-19', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(20, '2023-10-20', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(21, '2023-10-21', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(22, '2023-10-22', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(23, '2023-10-23', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(24, '2023-10-24', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(25, '2023-10-25', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(26, '2023-10-26', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(27, '2023-10-27', 1, 5, 5, 5, 2, 5, 5, 4, 5, 4),
(28, '2023-10-28', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(29, '2023-10-29', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(30, '2023-10-30', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(31, '2023-10-31', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(32, '2023-11-01', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(33, '2023-11-02', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(34, '2023-11-03', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(35, '2023-11-04', 1, 5, 5, 5, 2, 5, 5, 5, 5, 5),
(36, '2023-11-05', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(37, '2023-11-06', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(38, '2023-11-07', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(39, '2023-11-08', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(40, '2023-11-09', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(41, '2023-11-10', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(42, '2023-11-11', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(43, '2023-11-12', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(44, '2023-11-13', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(45, '2023-11-14', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(46, '2023-11-15', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(47, '2023-11-16', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(48, '2023-11-17', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(49, '2023-11-18', 1, 5, 5, 4, 4, 5, 4, 5, 5, 4),
(50, '2023-11-19', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(51, '2023-11-20', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(52, '2023-11-21', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(53, '2023-11-22', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(54, '2023-11-23', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(55, '2023-11-24', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(56, '2023-11-25', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(57, '2023-11-26', 1, 5, 5, 2, 5, 5, 5, 5, 5, 5),
(58, '2023-11-27', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(59, '2023-11-28', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(60, '2023-11-29', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(61, '2023-11-30', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(62, '2023-12-01', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(63, '2023-12-02', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(64, '2023-12-03', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(65, '2023-12-04', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(66, '2023-12-05', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(67, '2023-12-06', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(68, '2023-12-07', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(69, '2023-12-08', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(70, '2023-12-09', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(71, '2023-12-10', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(72, '2023-12-11', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(73, '2023-12-12', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(74, '2023-12-13', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(75, '2023-12-14', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(76, '2023-12-15', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(77, '2023-12-16', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(78, '2023-12-17', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(79, '2023-12-18', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(80, '2023-12-19', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(81, '2023-12-20', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(82, '2023-12-21', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(83, '2023-12-22', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(84, '2023-12-23', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(85, '2023-12-24', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(86, '2023-12-25', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(87, '2023-12-26', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(88, '2023-12-27', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(89, '2023-12-28', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(90, '2023-12-29', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(91, '2023-12-30', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(92, '2023-12-31', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turnero_2`
--

CREATE TABLE `turnero_2` (
  `idTurnos` tinyint(20) NOT NULL,
  `fecha` date NOT NULL,
  `idCentro` tinyint(20) NOT NULL,
  `8_9` tinyint(5) NOT NULL DEFAULT 5,
  `9_10` tinyint(5) NOT NULL DEFAULT 5,
  `10_11` tinyint(5) NOT NULL DEFAULT 5,
  `11_12` tinyint(5) NOT NULL DEFAULT 5,
  `12_13` tinyint(5) NOT NULL DEFAULT 5,
  `13_14` tinyint(5) NOT NULL DEFAULT 5,
  `14_15` tinyint(5) NOT NULL DEFAULT 5,
  `15_16` tinyint(5) NOT NULL DEFAULT 5,
  `16_17` tinyint(5) NOT NULL DEFAULT 5
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `turnero_2`
--

INSERT INTO `turnero_2` (`idTurnos`, `fecha`, `idCentro`, `8_9`, `9_10`, `10_11`, `11_12`, `12_13`, `13_14`, `14_15`, `15_16`, `16_17`) VALUES
(1, '2000-01-01', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(2, '2023-10-02', 1, 5, 0, 5, 5, 5, 0, 5, 5, 5),
(3, '2023-10-03', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(4, '2023-10-04', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(5, '2023-10-05', 1, 0, 0, 0, 0, 3, 5, 2, 4, 4),
(6, '2023-10-06', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(7, '2023-10-07', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(8, '2023-10-08', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(9, '2023-10-09', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(10, '2023-10-10', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(11, '2023-10-11', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(12, '2023-10-12', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(13, '2023-10-13', 1, 5, 2, 5, 5, 5, 5, 5, 5, 5),
(14, '2023-10-14', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(15, '2023-10-15', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(16, '2023-10-16', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(17, '2023-10-17', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(18, '2023-10-18', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(19, '2023-10-19', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(20, '2023-10-20', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(21, '2023-10-21', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(22, '2023-10-22', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(23, '2023-10-23', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(24, '2023-10-24', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(25, '2023-10-25', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(26, '2023-10-26', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(27, '2023-10-27', 1, 5, 5, 5, 2, 5, 5, 4, 5, 4),
(28, '2023-10-28', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(29, '2023-10-29', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(30, '2023-10-30', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(31, '2023-10-31', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(32, '2023-11-01', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(33, '2023-11-02', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(34, '2023-11-03', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(35, '2023-11-04', 1, 5, 5, 5, 2, 5, 5, 5, 5, 5),
(36, '2023-11-05', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(37, '2023-11-06', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(38, '2023-11-07', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(39, '2023-11-08', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(40, '2023-11-09', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(41, '2023-11-10', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(42, '2023-11-11', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(43, '2023-11-12', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(44, '2023-11-13', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(45, '2023-11-14', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(46, '2023-11-15', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(47, '2023-11-16', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(48, '2023-11-17', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(49, '2023-11-18', 1, 5, 5, 4, 4, 5, 4, 5, 5, 4),
(50, '2023-11-19', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(51, '2023-11-20', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(52, '2023-11-21', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(53, '2023-11-22', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(54, '2023-11-23', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(55, '2023-11-24', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(56, '2023-11-25', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(57, '2023-11-26', 1, 5, 5, 2, 5, 5, 5, 5, 5, 5),
(58, '2023-11-27', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(59, '2023-11-28', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(60, '2023-11-29', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(61, '2023-11-30', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(62, '2023-12-01', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(63, '2023-12-02', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(64, '2023-12-03', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(65, '2023-12-04', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(66, '2023-12-05', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(67, '2023-12-06', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(68, '2023-12-07', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(69, '2023-12-08', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(70, '2023-12-09', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(71, '2023-12-10', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(72, '2023-12-11', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(73, '2023-12-12', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(74, '2023-12-13', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(75, '2023-12-14', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(76, '2023-12-15', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(77, '2023-12-16', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(78, '2023-12-17', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(79, '2023-12-18', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(80, '2023-12-19', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(81, '2023-12-20', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(82, '2023-12-21', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(83, '2023-12-22', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(84, '2023-12-23', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(85, '2023-12-24', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(86, '2023-12-25', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(87, '2023-12-26', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(88, '2023-12-27', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(89, '2023-12-28', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(90, '2023-12-29', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(91, '2023-12-30', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(92, '2023-12-31', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turnero_3`
--

CREATE TABLE `turnero_3` (
  `idTurnos` tinyint(20) NOT NULL,
  `fecha` date NOT NULL,
  `idCentro` tinyint(20) NOT NULL,
  `8_9` tinyint(5) NOT NULL DEFAULT 5,
  `9_10` tinyint(5) NOT NULL DEFAULT 5,
  `10_11` tinyint(5) NOT NULL DEFAULT 5,
  `11_12` tinyint(5) NOT NULL DEFAULT 5,
  `12_13` tinyint(5) NOT NULL DEFAULT 5,
  `13_14` tinyint(5) NOT NULL DEFAULT 5,
  `14_15` tinyint(5) NOT NULL DEFAULT 5,
  `15_16` tinyint(5) NOT NULL DEFAULT 5,
  `16_17` tinyint(5) NOT NULL DEFAULT 5
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `turnero_3`
--

INSERT INTO `turnero_3` (`idTurnos`, `fecha`, `idCentro`, `8_9`, `9_10`, `10_11`, `11_12`, `12_13`, `13_14`, `14_15`, `15_16`, `16_17`) VALUES
(1, '2000-01-01', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(2, '2023-10-02', 1, 5, 0, 5, 5, 5, 0, 5, 5, 5),
(3, '2023-10-03', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(4, '2023-10-04', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(5, '2023-10-05', 1, 0, 0, 0, 0, 3, 5, 2, 4, 4),
(6, '2023-10-06', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(7, '2023-10-07', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(8, '2023-10-08', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(9, '2023-10-09', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(10, '2023-10-10', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(11, '2023-10-11', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(12, '2023-10-12', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(13, '2023-10-13', 1, 5, 2, 5, 5, 5, 5, 5, 5, 5),
(14, '2023-10-14', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(15, '2023-10-15', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(16, '2023-10-16', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(17, '2023-10-17', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(18, '2023-10-18', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(19, '2023-10-19', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(20, '2023-10-20', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(21, '2023-10-21', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(22, '2023-10-22', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(23, '2023-10-23', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(24, '2023-10-24', 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(25, '2023-10-25', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(26, '2023-10-26', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(27, '2023-10-27', 1, 5, 5, 5, 2, 5, 5, 4, 5, 4),
(28, '2023-10-28', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(29, '2023-10-29', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(30, '2023-10-30', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(31, '2023-10-31', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(32, '2023-11-01', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(33, '2023-11-02', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(34, '2023-11-03', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(35, '2023-11-04', 1, 5, 5, 5, 2, 5, 5, 5, 5, 5),
(36, '2023-11-05', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(37, '2023-11-06', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(38, '2023-11-07', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(39, '2023-11-08', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(40, '2023-11-09', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(41, '2023-11-10', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(42, '2023-11-11', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(43, '2023-11-12', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(44, '2023-11-13', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(45, '2023-11-14', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(46, '2023-11-15', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(47, '2023-11-16', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(48, '2023-11-17', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(49, '2023-11-18', 1, 5, 5, 4, 4, 5, 4, 5, 5, 4),
(50, '2023-11-19', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(51, '2023-11-20', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(52, '2023-11-21', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(53, '2023-11-22', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(54, '2023-11-23', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(55, '2023-11-24', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(56, '2023-11-25', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(57, '2023-11-26', 1, 5, 5, 2, 5, 5, 5, 5, 5, 5),
(58, '2023-11-27', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(59, '2023-11-28', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(60, '2023-11-29', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(61, '2023-11-30', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(62, '2023-12-01', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(63, '2023-12-02', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(64, '2023-12-03', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(65, '2023-12-04', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(66, '2023-12-05', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(67, '2023-12-06', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(68, '2023-12-07', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(69, '2023-12-08', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(70, '2023-12-09', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(71, '2023-12-10', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(72, '2023-12-11', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(73, '2023-12-12', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(74, '2023-12-13', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(75, '2023-12-14', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(76, '2023-12-15', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(77, '2023-12-16', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(78, '2023-12-17', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(79, '2023-12-18', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(80, '2023-12-19', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(81, '2023-12-20', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(82, '2023-12-21', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(83, '2023-12-22', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(84, '2023-12-23', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(85, '2023-12-24', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(86, '2023-12-25', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(87, '2023-12-26', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(88, '2023-12-27', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(89, '2023-12-28', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(90, '2023-12-29', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(91, '2023-12-30', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5),
(92, '2023-12-31', 1, 5, 5, 5, 5, 5, 5, 5, 5, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turno`
--

CREATE TABLE `turno` (
  `idCitaVacunacion` tinyint(100) NOT NULL,
  `DNI` int(20) NOT NULL,
  `fecha` datetime NOT NULL,
  `horario` varchar(20) NOT NULL,
  `idCentro` tinyint(20) NOT NULL,
  `codigoRefuerzo` varchar(20) NOT NULL,
  `idVial` tinyint(20) NOT NULL,
  `idTurno` tinyint(20) NOT NULL,
  `estado` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vacunatorio`
--

CREATE TABLE `vacunatorio` (
  `idCentro` tinyint(11) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Direccion` text NOT NULL,
  `latitud` double NOT NULL,
  `longitud` double NOT NULL,
  `Citas` tinyint(10) NOT NULL,
  `Estado` tinyint(1) NOT NULL,
  `idVial` tinyint(20) NOT NULL,
  `tipo` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vacunatorio`
--

INSERT INTO `vacunatorio` (`idCentro`, `Nombre`, `Direccion`, `latitud`, `longitud`, `Citas`, `Estado`, `idVial`, `tipo`) VALUES
(1, 'Esquina encendida', 'Avenida Facundo Zuviria 3200', -31.65474161037564, -60.723938556304304, 4, 0, 27, 'dani'),
(2, 'La redonda', 'Salvador del Carril 3000', -31.619257404754777, -60.69506533559279, 1, 0, 28, 'si'),
(3, 'El Birri', 'Av. Gral. Lopez 3699-3641', -31.654640004725557, -60.724482201066316, 1, 0, 16, '0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `viales`
--

CREATE TABLE `viales` (
  `idVial` tinyint(10) NOT NULL,
  `NumeroSerie` int(50) NOT NULL,
  `Marca` varchar(20) NOT NULL,
  `Antigeno` varchar(20) NOT NULL,
  `FechaVencimiento` date NOT NULL,
  `idLaboratorio` tinyint(20) NOT NULL,
  `Estado` tinyint(1) NOT NULL,
  `idVacunatorio` tinyint(20) DEFAULT NULL,
  `fechaColocacion` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `viales`
--

INSERT INTO `viales` (`idVial`, `NumeroSerie`, `Marca`, `Antigeno`, `FechaVencimiento`, `idLaboratorio`, `Estado`, `idVacunatorio`, `fechaColocacion`) VALUES
(1, 127, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-03', 4, 0, 3, NULL),
(9, 810331, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 3, NULL),
(10, 350007, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-03', 2, 0, 2, NULL),
(11, 344303, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 2, NULL),
(12, 505642, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 3, NULL),
(13, 675000, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-03', 1, 0, 3, NULL),
(14, 438313, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 3, NULL),
(15, 487152, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 3, NULL),
(16, 847697, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-03', 2, 0, 1, NULL),
(17, 375969, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 1, NULL),
(18, 737512, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-03', 4, 0, 1, NULL),
(19, 246644, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 2, NULL),
(20, 114312, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-03', 2, 0, 3, NULL),
(21, 592060, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-03', 2, 0, 3, NULL),
(22, 401362, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-03', 4, 0, 1, NULL),
(23, 290312, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 1, NULL),
(24, 599168, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-03', 2, 0, 3, NULL),
(25, 40209, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-03', 4, 0, 3, NULL),
(26, 990104, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 2, NULL),
(27, 481288, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-03', 4, 0, 2, NULL),
(28, 662420, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 1, NULL),
(29, 863580, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-03', 1, 0, 2, NULL),
(30, 249659, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 1, NULL),
(31, 326722, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 2, NULL),
(32, 647418, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-03', 1, 0, 2, NULL),
(33, 200299, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-03', 4, 0, 1, NULL),
(34, 605109, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 3, NULL),
(35, 576562, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-03', 2, 0, 2, NULL),
(36, 692062, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 2, NULL),
(37, 858888, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-03', 2, 0, 3, NULL),
(38, 323146, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 2, NULL),
(39, 227457, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-03', 2, 0, 1, NULL),
(40, 89176, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-03', 1, 0, 2, NULL),
(41, 457219, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 1, NULL),
(42, 283529, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-03', 1, 0, 2, NULL),
(43, 289020, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-03', 2, 0, 3, NULL),
(44, 132513, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 2, NULL),
(45, 406155, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 2, NULL),
(46, 128670, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-03', 2, 0, 2, NULL),
(47, 866036, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-03', 4, 0, 1, NULL),
(48, 10995, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-03', 4, 0, 3, NULL),
(49, 737249, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-03', 4, 0, 2, NULL),
(50, 233351, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 2, NULL),
(51, 400199, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 3, NULL),
(52, 283485, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-03', 1, 0, 3, NULL),
(53, 985774, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 2, NULL),
(54, 453142, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 1, NULL),
(55, 298762, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 2, NULL),
(56, 779911, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-03', 2, 0, 3, NULL),
(57, 146020, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 3, NULL),
(58, 970477, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-03', 4, 0, 3, NULL),
(59, 655039, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-03', 2, 0, 1, NULL),
(60, 431741, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 1, NULL),
(61, 115204, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-03', 1, 0, 2, NULL),
(62, 761417, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 3, NULL),
(63, 336957, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 1, NULL),
(64, 535823, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 3, NULL),
(65, 35522, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 2, NULL),
(66, 253992, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-03', 2, 0, 1, NULL),
(67, 384929, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 3, NULL),
(68, 300299, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 2, NULL),
(69, 530752, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 1, NULL),
(70, 640628, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-03', 2, 0, 1, NULL),
(71, 419071, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-03', 1, 0, 2, NULL),
(72, 209814, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 3, NULL),
(73, 14526, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 3, NULL),
(74, 42487, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-03', 4, 0, 3, NULL),
(75, 608363, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 1, NULL),
(76, 779426, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-03', 2, 0, 2, NULL),
(77, 21756, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-03', 4, 0, 3, NULL),
(78, 302682, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 1, NULL),
(79, 700615, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 1, NULL),
(80, 642633, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-03', 1, 0, 1, NULL),
(81, 882899, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-03', 4, 0, 3, NULL),
(82, 608160, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 2, NULL),
(83, 652151, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 1, NULL),
(84, 638655, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-03', 2, 0, 3, NULL),
(85, 22646, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-03', 4, 0, 1, NULL),
(86, 406645, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 2, NULL),
(87, 529907, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 1, NULL),
(88, 627550, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 2, NULL),
(89, 720275, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-03', 1, 0, 3, NULL),
(90, 195411, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-03', 4, 0, 1, NULL),
(91, 586182, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-03', 4, 0, 2, NULL),
(92, 169039, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-03', 4, 0, 2, NULL),
(93, 318346, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-03', 2, 0, 3, NULL),
(94, 712723, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-03', 2, 0, 1, NULL),
(95, 727580, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-03', 1, 0, 3, NULL),
(96, 951809, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 2, NULL),
(97, 609553, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-03', 4, 0, 1, NULL),
(98, 860653, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-03', 2, 0, 1, NULL),
(99, 14683, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 3, NULL),
(100, 954861, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 3, NULL),
(101, 468484, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-03', 2, 0, 2, NULL),
(102, 329582, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-03', 1, 0, 3, NULL),
(103, 337842, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-03', 2, 0, 1, NULL),
(104, 760898, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-03', 4, 0, 2, NULL),
(105, 725691, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 3, NULL),
(106, 380047, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-03', 4, 0, 3, NULL),
(107, 16957, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 2, NULL),
(108, 224011, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-03', 1, 0, 1, NULL),
(109, 805888, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 2, NULL),
(110, 566687, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 3, NULL),
(111, 769436, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-03', 2, 0, 2, NULL),
(112, 819851, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 1, NULL),
(113, 770267, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-03', 2, 0, 2, NULL),
(114, 361900, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 3, NULL),
(115, 280565, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-03', 1, 0, 1, NULL),
(116, 476268, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-03', 1, 0, 1, NULL),
(117, 114823, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 3, NULL),
(118, 653426, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-03', 1, 0, 3, NULL),
(119, 494281, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-03', 1, 0, 3, NULL),
(120, 495800, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 1, NULL),
(121, 982262, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 3, NULL),
(122, 950421, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-03', 4, 0, 3, NULL),
(123, 719921, 'AstraZeneca', 'Proteína de pico del', '2024-01-03', 3, 0, 3, NULL),
(124, 338684, 'Johnson_Johnson', 'Partículas SARS-CoV-', '2024-01-03', 2, 0, 1, NULL),
(125, 344450, 'Sinopharm y Sinovac', 'Partículas SARS-CoV-', '2024-01-03', 4, 0, 2, NULL),
(126, 836688, 'Pfizer', 'ARN mensajero (ARNm)', '2024-01-03', 1, 0, 1, NULL),
(127, 721765, 'Sputnik V', 'Adenovirus Ad26 y Ad', '2024-01-03', 5, 0, 1, NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  ADD PRIMARY KEY (`idCiudadano`),
  ADD UNIQUE KEY `DNI` (`DNI`);

--
-- Indices de la tabla `fabricante`
--
ALTER TABLE `fabricante`
  ADD PRIMARY KEY (`idEmpresa`),
  ADD UNIQUE KEY `Cuit` (`Cuit`);

--
-- Indices de la tabla `geo`
--
ALTER TABLE `geo`
  ADD PRIMARY KEY (`idGeo`),
  ADD UNIQUE KEY `nombre` (`nombre`);

--
-- Indices de la tabla `patologias`
--
ALTER TABLE `patologias`
  ADD PRIMARY KEY (`DNI`);

--
-- Indices de la tabla `turnero_1`
--
ALTER TABLE `turnero_1`
  ADD PRIMARY KEY (`idTurnos`);

--
-- Indices de la tabla `turnero_2`
--
ALTER TABLE `turnero_2`
  ADD PRIMARY KEY (`idTurnos`);

--
-- Indices de la tabla `turnero_3`
--
ALTER TABLE `turnero_3`
  ADD PRIMARY KEY (`idTurnos`);

--
-- Indices de la tabla `turno`
--
ALTER TABLE `turno`
  ADD PRIMARY KEY (`idCitaVacunacion`),
  ADD UNIQUE KEY `idCitaVacunacion` (`idCitaVacunacion`),
  ADD UNIQUE KEY `idTurno` (`idTurno`),
  ADD KEY `idCentro` (`idCentro`),
  ADD KEY `citavacunacion_ibfk_1` (`idVial`),
  ADD KEY `DNI` (`DNI`);

--
-- Indices de la tabla `vacunatorio`
--
ALTER TABLE `vacunatorio`
  ADD PRIMARY KEY (`idCentro`),
  ADD UNIQUE KEY `idVial` (`idVial`),
  ADD UNIQUE KEY `idVial_2` (`idVial`),
  ADD KEY `Citas` (`Citas`),
  ADD KEY `idVial_3` (`idVial`);

--
-- Indices de la tabla `viales`
--
ALTER TABLE `viales`
  ADD PRIMARY KEY (`idVial`),
  ADD UNIQUE KEY `NumeroSerie` (`NumeroSerie`),
  ADD KEY `idLaboratorio` (`idLaboratorio`),
  ADD KEY `idVacunatorio` (`idVacunatorio`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  MODIFY `idCiudadano` tinyint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT de la tabla `fabricante`
--
ALTER TABLE `fabricante`
  MODIFY `idEmpresa` tinyint(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `geo`
--
ALTER TABLE `geo`
  MODIFY `idGeo` tinyint(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=66;

--
-- AUTO_INCREMENT de la tabla `turnero_1`
--
ALTER TABLE `turnero_1`
  MODIFY `idTurnos` tinyint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=93;

--
-- AUTO_INCREMENT de la tabla `turnero_2`
--
ALTER TABLE `turnero_2`
  MODIFY `idTurnos` tinyint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=93;

--
-- AUTO_INCREMENT de la tabla `turnero_3`
--
ALTER TABLE `turnero_3`
  MODIFY `idTurnos` tinyint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=93;

--
-- AUTO_INCREMENT de la tabla `turno`
--
ALTER TABLE `turno`
  MODIFY `idCitaVacunacion` tinyint(100) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `vacunatorio`
--
ALTER TABLE `vacunatorio`
  MODIFY `idCentro` tinyint(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `viales`
--
ALTER TABLE `viales`
  MODIFY `idVial` tinyint(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=128;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `patologias`
--
ALTER TABLE `patologias`
  ADD CONSTRAINT `patologias_ibfk_1` FOREIGN KEY (`DNI`) REFERENCES `ciudadano` (`DNI`);

--
-- Filtros para la tabla `turno`
--
ALTER TABLE `turno`
  ADD CONSTRAINT `turno_ibfk_3` FOREIGN KEY (`idCentro`) REFERENCES `vacunatorio` (`idCentro`),
  ADD CONSTRAINT `turno_ibfk_6` FOREIGN KEY (`idTurno`) REFERENCES `turnero_1` (`idTurnos`),
  ADD CONSTRAINT `turno_ibfk_7` FOREIGN KEY (`DNI`) REFERENCES `ciudadano` (`DNI`);

--
-- Filtros para la tabla `viales`
--
ALTER TABLE `viales`
  ADD CONSTRAINT `viales_ibfk_1` FOREIGN KEY (`idLaboratorio`) REFERENCES `fabricante` (`idEmpresa`),
  ADD CONSTRAINT `viales_ibfk_2` FOREIGN KEY (`idVacunatorio`) REFERENCES `vacunatorio` (`idCentro`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
