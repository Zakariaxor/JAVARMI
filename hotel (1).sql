-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Serveur: localhost
-- Généré le : Lun 03 Janvier 2022 à 09:37
-- Version du serveur: 5.5.8
-- Version de PHP: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `hotel`
--

-- --------------------------------------------------------

--
-- Structure de la table `hotel`
--

CREATE TABLE IF NOT EXISTS `hotel` (
  `id_hotel` int(11) NOT NULL AUTO_INCREMENT,
  `hotel` varchar(100) NOT NULL,
  `ville` varchar(100) NOT NULL,
  `pays` varchar(100) NOT NULL,
  `etoile` varchar(100) NOT NULL,
  `prix` varchar(100) NOT NULL,
  PRIMARY KEY (`id_hotel`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Contenu de la table `hotel`
--

INSERT INTO `hotel` (`id_hotel`, `hotel`, `ville`, `pays`, `etoile`, `prix`) VALUES
(1, 'ff', 'ff', 'ff', 'ff', 'ff''1'),
(2, 'df', 'sdf', 'dsf', 'sdf', '56546''1');

-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

CREATE TABLE IF NOT EXISTS `reservation` (
  `id_reservation` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(100) NOT NULL,
  `date_debut` varchar(100) NOT NULL,
  `date_fin` varchar(100) NOT NULL,
  `nbre_p` varchar(100) NOT NULL,
  `type_chambre` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  PRIMARY KEY (`id_reservation`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Contenu de la table `reservation`
--

INSERT INTO `reservation` (`id_reservation`, `nom`, `date_debut`, `date_fin`, `nbre_p`, `type_chambre`, `email`) VALUES
(1, '55', '5', '5', '5', '5', '5'),
(2, '787', '97897', '897', '2', '798798', '8797'),
(3, '1', '1', '1', '1', '1', '1');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom_user` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`id`, `nom_user`, `email`, `password`) VALUES
(1, 'v', 'v', 'v'),
(2, 'v', 'v', 'v'),
(3, '4', '4', '4'),
(4, '4', '4', '4'),
(5, '4', '4', '4'),
(6, '4', '4', '4'),
(7, '4', '4', '4'),
(8, '7', '7', '7'),
(9, 'df', 'df', 'df');
