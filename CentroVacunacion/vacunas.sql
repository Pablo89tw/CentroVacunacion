-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-10-2023 a las 01:24:29
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
  `email` varchar(20) NOT NULL,
  `celular` int(11) NOT NULL,
  `ambitoTrabajo` varchar(20) NOT NULL,
  `dosisAplicadas` tinyint(10) NOT NULL,
  `fechaProxCita` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medico`
--

CREATE TABLE `medico` (
  `idCentro` tinyint(20) NOT NULL,
  `idMedico` tinyint(20) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Matricula` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
  `Neurologicas` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `stocks`
--

CREATE TABLE `stocks` (
  `idStock` int(20) NOT NULL,
  `idCentro` tinyint(20) NOT NULL,
  `numeroSerie` int(20) NOT NULL,
  `Marca` varchar(20) NOT NULL,
  `fechaVencimiento` date NOT NULL,
  `estado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turnero`
--

CREATE TABLE `turnero` (
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
-- Volcado de datos para la tabla `turnero`
--

INSERT INTO `turnero` (`idTurnos`, `fecha`, `idCentro`, `8_9`, `9_10`, `10_11`, `11_12`, `12_13`, `13_14`, `14_15`, `15_16`, `16_17`) VALUES
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
  `idMedico` tinyint(5) NOT NULL,
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
  `Ubicacion` varchar(20) NOT NULL,
  `Citas` tinyint(10) NOT NULL,
  `Estado` tinyint(1) NOT NULL,
  `idVial` tinyint(20) NOT NULL,
  `idMedico` tinyint(20) NOT NULL,
  `tipo` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `viales`
--

CREATE TABLE `viales` (
  `idVial` tinyint(10) NOT NULL,
  `NumeroSerie` tinyint(20) NOT NULL,
  `Marca` varchar(20) NOT NULL,
  `Antigeno` varchar(20) NOT NULL,
  `FechaVencimiento` date NOT NULL,
  `idLaboratorio` tinyint(20) NOT NULL,
  `Estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
-- Indices de la tabla `medico`
--
ALTER TABLE `medico`
  ADD PRIMARY KEY (`idMedico`),
  ADD KEY `idCentro` (`idCentro`);

--
-- Indices de la tabla `patologias`
--
ALTER TABLE `patologias`
  ADD PRIMARY KEY (`DNI`);

--
-- Indices de la tabla `stocks`
--
ALTER TABLE `stocks`
  ADD PRIMARY KEY (`idStock`);

--
-- Indices de la tabla `turnero`
--
ALTER TABLE `turnero`
  ADD PRIMARY KEY (`idTurnos`);

--
-- Indices de la tabla `turno`
--
ALTER TABLE `turno`
  ADD PRIMARY KEY (`idCitaVacunacion`),
  ADD UNIQUE KEY `idCitaVacunacion` (`idCitaVacunacion`),
  ADD UNIQUE KEY `idTurno` (`idTurno`),
  ADD KEY `idMedico` (`idMedico`),
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
  ADD KEY `idLaboratorio` (`idLaboratorio`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  MODIFY `idCiudadano` tinyint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `fabricante`
--
ALTER TABLE `fabricante`
  MODIFY `idEmpresa` tinyint(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `medico`
--
ALTER TABLE `medico`
  MODIFY `idMedico` tinyint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `turnero`
--
ALTER TABLE `turnero`
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
  MODIFY `idCentro` tinyint(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `viales`
--
ALTER TABLE `viales`
  MODIFY `idVial` tinyint(10) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `medico`
--
ALTER TABLE `medico`
  ADD CONSTRAINT `medico_ibfk_1` FOREIGN KEY (`idCentro`) REFERENCES `vacunatorio` (`idCentro`);

--
-- Filtros para la tabla `patologias`
--
ALTER TABLE `patologias`
  ADD CONSTRAINT `patologias_ibfk_1` FOREIGN KEY (`DNI`) REFERENCES `ciudadano` (`DNI`);

--
-- Filtros para la tabla `turno`
--
ALTER TABLE `turno`
  ADD CONSTRAINT `turno_ibfk_1` FOREIGN KEY (`idVial`) REFERENCES `vacunatorio` (`idVial`),
  ADD CONSTRAINT `turno_ibfk_3` FOREIGN KEY (`idCentro`) REFERENCES `vacunatorio` (`idCentro`),
  ADD CONSTRAINT `turno_ibfk_6` FOREIGN KEY (`idTurno`) REFERENCES `turnero` (`idTurnos`),
  ADD CONSTRAINT `turno_ibfk_7` FOREIGN KEY (`DNI`) REFERENCES `ciudadano` (`DNI`);

--
-- Filtros para la tabla `vacunatorio`
--
ALTER TABLE `vacunatorio`
  ADD CONSTRAINT `vacunatorio_ibfk_1` FOREIGN KEY (`idCentro`) REFERENCES `stocks` (`idCentro`),
  ADD CONSTRAINT `vacunatorio_ibfk_2` FOREIGN KEY (`idVial`) REFERENCES `viales` (`idVial`);

--
-- Filtros para la tabla `viales`
--
ALTER TABLE `viales`
  ADD CONSTRAINT `viales_ibfk_1` FOREIGN KEY (`idLaboratorio`) REFERENCES `fabricante` (`idEmpresa`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
