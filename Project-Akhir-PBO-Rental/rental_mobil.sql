-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 21 Bulan Mei 2023 pada 16.04
-- Versi server: 10.4.21-MariaDB
-- Versi PHP: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rental_mobil`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `Username` varchar(20) NOT NULL,
  `Pass` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`Username`, `Pass`) VALUES
('adit', 'admin'),
('agil', 'admin'),
('pey', 'admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `peminjam`
--

CREATE TABLE `peminjam` (
  `Nama` varchar(30) NOT NULL,
  `NIK` varchar(30) NOT NULL,
  `Alamat` text NOT NULL,
  `NoHp` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `peminjam`
--

INSERT INTO `peminjam` (`Nama`, `NIK`, `Alamat`, `NoHp`) VALUES
('Andiko Suryo', '34012312', 'Jln. Pangeran', '081232132'),
('aristo Razag', '2032131', 'WONOSOBO COY', '0813-2132-1213');

-- --------------------------------------------------------

--
-- Struktur dari tabel `rental`
--

CREATE TABLE `rental` (
  `id` int(11) NOT NULL,
  `peminjam` varchar(30) NOT NULL,
  `tgl_pinjam` date NOT NULL,
  `jenis_mobil` varchar(30) NOT NULL,
  `plat_nomor` varchar(10) NOT NULL,
  `sewa/hari` int(11) NOT NULL,
  `lama_sewa` int(11) NOT NULL,
  `total_biaya` int(11) NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `rental`
--

INSERT INTO `rental` (`id`, `peminjam`, `tgl_pinjam`, `jenis_mobil`, `plat_nomor`, `sewa/hari`, `lama_sewa`, `total_biaya`, `status`) VALUES
(4, 'harish', '2023-05-21', 'Mobil Pribadi', 'AB-2325-DD', 400000, 2, 800000, 'DIKEMBALIKAN'),
(6, 'adit', '2023-01-31', 'Mobil Pribadi', 'AB-2325-DD', 400000, 3, 1200000, 'BATAL');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`Username`);

--
-- Indeks untuk tabel `rental`
--
ALTER TABLE `rental`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `rental`
--
ALTER TABLE `rental`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
