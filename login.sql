-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-11-2023 a las 16:26:25
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
-- Estructura de tabla para la tabla `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `usuario` int(30) NOT NULL,
  `clave` varchar(30) NOT NULL,
  `idLogin` int(11) NOT NULL,
  `recordar` tinyint(2) NOT NULL,
  `ingresos` tinyint(10) NOT NULL,
  `estado` tinyint(4) NOT NULL,
  `etapa_ingreso` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `login`
--

INSERT INTO `login` (`usuario`, `clave`, `idLogin`, `recordar`, `ingresos`, `estado`, `etapa_ingreso`) VALUES
(45555555, '45555', 25, 1, 0, 0, 0),
(34508715, '34508', 26, 0, 0, 0, 0),
(10079708, '10079', 27, 0, 0, 0, 1),
(50000001, 'pepe2', 30, 1, 0, 0, 1),
(50000002, 'pepe2', 32, 1, 0, 0, 1),
(25000001, 'IGiSHIU2b', 33, 1, 0, 0, 1),
(30000002, 'QIxvgD8Ff', 34, 1, 0, 0, 1),
(35000003, '2po0o4ekB', 35, 0, 0, 0, 0),
(40000004, 'XdRIRLWT4', 36, 0, 0, 0, 0),
(22000005, 'gcnmVLdrd', 37, 1, 0, 0, 1),
(26000006, 'LJIJNWPzO', 38, 1, 0, 0, 1),
(32000007, 'akGdcPcRT', 39, 0, 0, 0, 0),
(39000008, '3D5tp1Zc3', 40, 1, 0, 0, 1),
(43000009, 'GYairCHsu', 41, 0, 0, 0, 0),
(28000010, 'VdT6qRrLK', 42, 1, 0, 0, 1),
(27000011, 'QPAYqQjDO', 43, 1, 0, 0, 1),
(33000012, 'pepe1', 44, 1, 0, 0, 1),
(38000013, 'jNDWIdgx5', 45, 1, 0, 0, 0),
(41000014, 'otJUiukUt', 46, 0, 0, 0, 0),
(24000015, '2415', 47, 1, 0, 0, 1),
(29000016, 'NRgrKO8Bt', 48, 0, 0, 0, 0),
(35000017, 'ZQmvaj2o0', 49, 1, 0, 0, 1),
(42000018, 'Zymtb6aaW', 50, 0, 0, 0, 0),
(36000019, '3bcaAkfEv', 51, 1, 0, 0, 1),
(44000020, 'sHyjIRfgz', 52, 0, 0, 0, 0),
(31000021, '0rKJBkTfy', 53, 0, 0, 0, 0),
(37000022, 'ogu9QxoLh', 54, 0, 0, 0, 0),
(45000023, 'PJQ0ciHia', 55, 0, 0, 0, 0),
(26000024, 'roRgh1vNP', 56, 1, 0, 0, 1),
(22000025, 'cEh21FpPo', 57, 1, 0, 0, 1),
(28000026, '3qlACCHtW', 58, 0, 0, 0, 0),
(23000027, '13omkqWXm', 59, 1, 0, 0, 1),
(30000028, 'xaPjqfwV1', 60, 0, 0, 0, 0),
(39000029, 'eRxRD58nb', 61, 0, 0, 0, 0),
(34000030, 'pepe1', 62, 1, 0, 0, 0),
(50000003, 'pepe3', 63, 1, 0, 0, 1),
(50000004, 'JEAFDKySh', 64, 0, 0, 0, 0),
(50000005, 'pepe', 65, 1, 0, 0, 1),
(50000006, 'B0ZslafSA', 66, 0, 0, 0, 0),
(50000007, 'BQHuNhtNH', 67, 0, 0, 0, 0),
(50000008, 'hVt5oDov3', 68, 0, 0, 0, 0),
(50000009, 'HYh1N4Mos', 69, 0, 0, 0, 0),
(50000010, 'sKjGOHkZZ', 70, 0, 0, 0, 0),
(50000011, 'PYYI7hNXH', 71, 0, 0, 0, 0),
(50000012, 'CjBZVwhmx', 72, 0, 0, 0, 0),
(50000013, 'Uqe37hfhs', 73, 0, 0, 0, 0),
(50000014, 'BlfJ1h40h', 74, 0, 0, 0, 0),
(50000015, '67lZXx7Xr', 75, 0, 0, 0, 0),
(50000016, 'XfRWmnBpy', 76, 0, 0, 0, 0),
(50000017, '5iMvHMXqu', 77, 0, 0, 0, 0),
(50000018, 'mUndElRcy', 78, 0, 0, 0, 0),
(50000019, '0Dcj398b3', 79, 0, 0, 0, 0),
(50000020, 'qv0mtqSXX', 80, 0, 0, 0, 0),
(50000021, '0k7BdwCT5', 81, 0, 0, 0, 0),
(50000022, 'XbE86GsTT', 82, 0, 0, 0, 0),
(50000023, 'YMn4B2IMT', 83, 0, 0, 0, 0),
(50000024, 'qg6sGRVrp', 84, 0, 0, 0, 0),
(50000025, '4Czpe7KYR', 85, 0, 0, 0, 0),
(50000026, 'HgMXtlSuG', 86, 0, 0, 0, 0),
(50000027, 'Q65q3KznY', 87, 0, 0, 0, 0),
(50000028, 'qWm9t9pg6', 88, 0, 0, 0, 0),
(50000029, '3mxDZTxpk', 89, 0, 0, 0, 0),
(50000030, 'U7urf9gpy', 90, 0, 0, 0, 0),
(50000031, '6uXRjxjqj', 91, 0, 0, 0, 0),
(50000032, 'nCjjGlL72', 92, 0, 0, 0, 0),
(50000033, '5JxxDBTIa', 93, 0, 0, 0, 0),
(50000034, '8mA8V9Tp5', 94, 0, 0, 0, 0),
(50000041, 'tvad3nAZt', 95, 0, 0, 0, 0),
(50000042, 'FqknC9WsC', 96, 0, 0, 0, 0),
(50000043, 'zR3tYRtVR', 97, 0, 0, 0, 0),
(50000044, 'caNxoPHt1', 98, 0, 0, 0, 0),
(50000045, 'XqNnVvjMr', 99, 0, 0, 0, 0),
(50000046, 'OYGegpM4o', 100, 0, 0, 0, 0),
(50000047, 'nyX8sRoJA', 101, 0, 0, 0, 0),
(50000049, '3uxUCZ4MO', 102, 0, 0, 0, 0),
(50000050, 'FVRbVbjV1', 103, 0, 0, 0, 0),
(50000051, 'PjgaKNBcX', 104, 0, 0, 0, 0),
(50000052, 'gMe6CLWPr', 105, 0, 0, 0, 0),
(50000053, 'GoRA9fRPp', 106, 0, 0, 0, 0),
(50000054, 'v4n3Rmzmp', 107, 0, 0, 0, 0),
(50000055, 'ObHQP7gSf', 108, 0, 0, 0, 0),
(50000056, 'oLjSc8g75', 109, 0, 0, 0, 0),
(50000057, 'LR7J3a2zg', 110, 0, 0, 0, 0),
(50000058, 'saOyv7Q4Y', 111, 0, 0, 0, 0),
(50000059, '2E8jJEi3j', 112, 0, 0, 0, 0),
(50000060, 'bpa8Xknuo', 113, 0, 0, 0, 0),
(50000061, 'poNGI7ywp', 114, 0, 0, 0, 0),
(50000062, 'r7a71GqEw', 115, 0, 0, 0, 0),
(50000063, '6di033Edr', 116, 0, 0, 0, 0),
(50000064, '2sDVGdAFS', 117, 0, 0, 0, 0),
(50000065, 'q7glMirIL', 118, 0, 0, 0, 0),
(50000066, '7CCx5BE1I', 119, 0, 0, 0, 0),
(50000067, 'bthhZvNUJ', 120, 0, 0, 0, 0),
(50000068, 'LWFz1Ly3m', 121, 0, 0, 0, 0),
(50000069, 'FK9POpzJl', 122, 0, 0, 0, 0),
(50000070, 'MrwU3zISV', 123, 0, 0, 0, 0),
(50000071, 'jx5PKDMUz', 124, 0, 0, 0, 0),
(50000072, 'VbVBg2Xl1', 125, 0, 0, 0, 0),
(50000073, 'nkZAoi2nc', 126, 0, 0, 0, 0),
(50000074, 'QpDj5j251', 127, 0, 0, 0, 0),
(50000075, 'yIjFCDPJN', 128, 0, 0, 0, 0),
(50000076, 'X4J5NP6F8', 129, 0, 0, 0, 0),
(50000077, '9PJ6Xh4s1', 130, 0, 0, 0, 0),
(50000078, 'axWkXDmsJ', 131, 0, 0, 0, 0),
(50000079, 'isqgJJvMP', 132, 0, 0, 0, 0),
(50000080, 'a0hksvXFZ', 133, 0, 0, 0, 0),
(50000081, 'pW35kTdzY', 134, 0, 0, 0, 0),
(50000082, 'fGxFOysag', 135, 0, 0, 0, 0),
(50000083, 'DtLq2wm4z', 136, 0, 0, 0, 0),
(50000084, 'k1DwPGOgy', 137, 0, 0, 0, 0),
(50000085, 'OHpDx6Fyk', 138, 1, 0, 0, 0),
(50000086, 'IBObtwfw6', 139, 0, 0, 0, 0),
(50000087, 'QHxtGVsg0', 140, 0, 0, 0, 0),
(50000088, 'u81Al1RD0', 141, 0, 0, 0, 0),
(50000089, 'aF9o9xW4f', 142, 0, 0, 0, 0),
(50000090, 'mT0poJRTy', 143, 0, 0, 0, 0),
(50000091, 'EuZRlEWQb', 144, 0, 0, 0, 0),
(50000092, 'oaBWvK42e', 145, 0, 0, 0, 0),
(50000093, 'gHB2ew9Is', 146, 0, 0, 0, 0),
(50000094, 'srFbqORy1', 147, 0, 0, 0, 0),
(50000095, 'QdAl5BEDy', 148, 1, 0, 0, 0),
(50000096, '6HeTOvUwx', 149, 0, 0, 0, 0),
(50000097, 'Gwad1zzxm', 150, 0, 0, 0, 0),
(50000098, 'JxdSbFPVw', 151, 1, 0, 0, 1),
(50000099, 'J03p6e9kH', 152, 1, 0, 0, 1),
(50000100, 'uiEhbSwGd', 153, 0, 0, 0, 1),
(1, '1', 155, 0, 0, 0, 0),
(2, '2', 156, 0, 0, 0, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`idLogin`),
  ADD KEY `usuario` (`usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `login`
--
ALTER TABLE `login`
  MODIFY `idLogin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=157;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `login`
--
ALTER TABLE `login`
  ADD CONSTRAINT `login_ibfk_1` FOREIGN KEY (`usuario`) REFERENCES `ciudadano` (`DNI`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
