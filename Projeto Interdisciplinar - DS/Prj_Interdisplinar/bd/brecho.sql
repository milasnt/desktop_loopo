-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 29-Out-2024 às 12:07
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 8.0.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `brecho`
--

CREATE DATABASE `brecho`;
USE `brecho`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `data_nasc` date NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `email` varchar(90) DEFAULT NULL,
  `endereco` varchar(130) NOT NULL,
  `cpf` varchar(15) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `nome`, `data_nasc`, `telefone`, `email`, `endereco`, `cpf`) VALUES
(1, 'Marta Depay', '1994-09-19', '(11) 98534-7835', 'martadepay@gmail.com', 'Rua dos Campos Vermelhos, 234', '897.654.342-31'),
(2, 'Sonia Dias ', '1984-12-07', '(11) 98243-9384', 'soniadias34@gmail.com', 'Rua Malick, 5646', '905.990.954.09'),
(3, 'Ana Miranda', '2004-05-11', '(11) 93456-8923', 'mirandaana@gmail.com', 'Rua das Perolas, 78', '934.255.845-12'),
(4, 'Murilo Lima', '1994-09-12', '(11) 93415-9087', 'limamurilo90@gmail.com', 'Rua Augusta,78', '934.209.845-98'),
(5, 'Sergio Dias', '2007-04-09', '(11) 94326-0979', 'sergiodias@outlook.com', 'Avenida Pires do Rio, 896', '214.178.885-05');

-- --------------------------------------------------------

--
-- Estrutura da tabela `desapego`
--

CREATE TABLE `desapego` (
  `cod_desapego` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `id_vestuario` int(11) NOT NULL,
  `data_desapego` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `desapego`
--

INSERT INTO `desapego` (`cod_desapego`, `id_cliente`, `id_vestuario`, `data_desapego`) VALUES
(1, 1, 1, '2024-08-23'),
(2, 2, 2, '2024-06-05'),
(3, 3, 3, '2024-09-20'),
(4, 4, 4, '2024-05-16'),
(5, 5, 5, '2024-10-01');

-- --------------------------------------------------------

--
-- Estrutura da tabela `fila`
--

CREATE TABLE `fila` (
  `cod_fila` int(11) NOT NULL,
  `id_vestuario` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `fila`
--

INSERT INTO `fila` (`cod_fila`, `id_vestuario`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5);

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario_login`
--

CREATE TABLE `funcionario_login` (
  `id_func` int(11) NOT NULL,
  `user` varchar(50) NOT NULL,
  `email` varchar(80) NOT NULL,
  `senha` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `funcionario_login`
--

INSERT INTO `funcionario_login` (`id_func`, `user`, `email`, `senha`) VALUES
(1, 'soniadiretora', 'sonia@gmail.com', '123'),
(2, 'marisafunc', 'marisa@gmail.com', '456'),
(3, 'marcelofunc', 'marcelo@gmail.com', '789');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedido`
--

CREATE TABLE `pedido` (
  `id_cliente` int(11) NOT NULL,
  `cod_fila` int(11) NOT NULL,
  `num_fila` int(11) NOT NULL,
  `data_pedido` datetime NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `pedido`
--

INSERT INTO `pedido` (`id_cliente`, `cod_fila`, `num_fila`, `data_pedido`) VALUES
(1, 1, 78, '2024-08-15 09:56:22'),
(2, 2, 5, '2024-10-04 16:49:39'),
(3, 3, 89, '2024-07-25 16:10:55'),
(4, 4, 2, '2024-10-25 10:42:30'),
(4, 4, 18, '2024-08-30 12:51:23');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tipo`
--

CREATE TABLE `tipo` (
  `id_tipo` int(11) NOT NULL,
  `descricao` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tipo`
--

INSERT INTO `tipo` (`id_tipo`, `descricao`) VALUES
(1, 'Calça '),
(2, 'Jaqueta'),
(3, 'Bermuda'),
(4, 'Cropped'),
(5, 'Blusa');

-- --------------------------------------------------------

--
-- Estrutura da tabela `vestuario`
--

CREATE TABLE `vestuario` (
  `id_vestuario` int(11) NOT NULL,
  `id_tipo` int(11) NOT NULL,
  `descricao` varchar(200) NOT NULL,
  `preco` float NOT NULL,
  `cor` varchar(80) NOT NULL,
  `tamanho` varchar(5) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `vestuario`
--

INSERT INTO `vestuario` (`id_vestuario`, `id_tipo`, `descricao`, `preco`, `cor`, `tamanho`) VALUES
(1, 1, 'Calça Reta Vintage ', 50, 'Preta', 'M'),
(2, 2, 'Jaqueta de Manga Longa Retro Ferrari', 45, 'Preta', 'G'),
(3, 3, 'Bermuda Jeans Cintura Baixa', 30, 'Jeans Escuro', 'P'),
(4, 4, 'Cropped de Malha Manga Comprida', 15, 'Azul Marinho', 'PP'),
(5, 5, 'Blusa Regata de Malha ', 15, 'Verde Musgo', 'M');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`),
  ADD UNIQUE KEY `cpf` (`cpf`);

--
-- Índices para tabela `desapego`
--
ALTER TABLE `desapego`
  ADD PRIMARY KEY (`cod_desapego`);

--
-- Índices para tabela `fila`
--
ALTER TABLE `fila`
  ADD PRIMARY KEY (`cod_fila`);

--
-- Índices para tabela `funcionario_login`
--
ALTER TABLE `funcionario_login`
  ADD PRIMARY KEY (`id_func`);

--
-- Índices para tabela `tipo`
--
ALTER TABLE `tipo`
  ADD PRIMARY KEY (`id_tipo`);

--
-- Índices para tabela `vestuario`
--
ALTER TABLE `vestuario`
  ADD PRIMARY KEY (`id_vestuario`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `desapego`
--
ALTER TABLE `desapego`
  MODIFY `cod_desapego` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `fila`
--
ALTER TABLE `fila`
  MODIFY `cod_fila` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `funcionario_login`
--
ALTER TABLE `funcionario_login`
  MODIFY `id_func` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `tipo`
--
ALTER TABLE `tipo`
  MODIFY `id_tipo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `vestuario`
--
ALTER TABLE `vestuario`
  MODIFY `id_vestuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
