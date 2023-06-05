-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 30 May 2022, 09:31:04
-- Sunucu sürümü: 10.4.24-MariaDB
-- PHP Sürümü: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `tarm`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `address`
--

CREATE TABLE `address` (
  `ad_id` int(11) NOT NULL,
  `u_id` int(11) NOT NULL,
  `u_name` varchar(50) NOT NULL,
  `u_surname` varchar(50) NOT NULL,
  `ad_addressline1` varchar(50) NOT NULL,
  `ad_addressline2` varchar(50) NOT NULL,
  `ad_city` varchar(50) NOT NULL,
  `ad_state_province_region` varchar(50) NOT NULL,
  `ad_zipcode` int(11) NOT NULL,
  `ad_country` varchar(50) NOT NULL,
  `u_phone_no` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `address`
--

INSERT INTO `address` (`ad_id`, `u_id`, `u_name`, `u_surname`, `ad_addressline1`, `ad_addressline2`, `ad_city`, `ad_state_province_region`, `ad_zipcode`, `ad_country`, `u_phone_no`) VALUES
(1, 1, 'Alpay', 'Turgan', 'Genclik Mahallesi isiklar caddesi', 'nizam apartmanı no:55/11', 'Istanbul', 'Muratpasa', 7100, 'Turkey', '5510517404');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `card`
--

CREATE TABLE `card` (
  `crd_id` int(11) NOT NULL,
  `crd_no` int(50) NOT NULL,
  `crd_fname` varchar(50) NOT NULL,
  `crd_exp_date` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `card`
--

INSERT INTO `card` (`crd_id`, `crd_no`, `crd_fname`, `crd_exp_date`) VALUES
(1, 123123, 'Alpay Turgan', '07/21'),
(2, 1111111111, 'Alpay Turgan', '07/21'),
(3, 1232131232, 'Altay Turgut', '07/23');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `menulist`
--

CREATE TABLE `menulist` (
  `menu_id` int(11) NOT NULL,
  `res_id` int(11) NOT NULL,
  `food_name` varchar(50) NOT NULL,
  `food_price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `menulist`
--

INSERT INTO `menulist` (`menu_id`, `res_id`, `food_name`, `food_price`) VALUES
(1, 1, 'Kebap', 80.7),
(2, 1, 'Döner', 40.6);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `orders`
--

CREATE TABLE `orders` (
  `ord_id` int(11) NOT NULL,
  `res_id` int(11) NOT NULL,
  `u_id` int(11) NOT NULL,
  `ad_id` int(11) NOT NULL,
  `crd_id` int(11) NOT NULL,
  `food_price` float NOT NULL,
  `food_quantity` int(11) NOT NULL,
  `total_price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `restaurant`
--

CREATE TABLE `restaurant` (
  `res_id` int(11) NOT NULL,
  `res_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `restaurant`
--

INSERT INTO `restaurant` (`res_id`, `res_name`) VALUES
(1, '7 Mehmet'),
(2, '8 Mehmet');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `user`
--

CREATE TABLE `user` (
  `u_id` int(11) NOT NULL,
  `u_name` varchar(50) NOT NULL,
  `u_surname` varchar(50) NOT NULL,
  `u_phone_no` varchar(50) NOT NULL,
  `u_birthdate` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `user`
--

INSERT INTO `user` (`u_id`, `u_name`, `u_surname`, `u_phone_no`, `u_birthdate`, `u_email`) VALUES
(1, 'Enes', 'Turgan', '5510517404', '06/10/2000', '19000139@emu.edu.tr');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `address`
--
ALTER TABLE `address`
  ADD PRIMARY KEY (`ad_id`);

--
-- Tablo için indeksler `card`
--
ALTER TABLE `card`
  ADD PRIMARY KEY (`crd_id`);

--
-- Tablo için indeksler `menulist`
--
ALTER TABLE `menulist`
  ADD PRIMARY KEY (`menu_id`);

--
-- Tablo için indeksler `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`ord_id`);

--
-- Tablo için indeksler `restaurant`
--
ALTER TABLE `restaurant`
  ADD PRIMARY KEY (`res_id`);

--
-- Tablo için indeksler `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`u_id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `address`
--
ALTER TABLE `address`
  MODIFY `ad_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Tablo için AUTO_INCREMENT değeri `card`
--
ALTER TABLE `card`
  MODIFY `crd_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Tablo için AUTO_INCREMENT değeri `menulist`
--
ALTER TABLE `menulist`
  MODIFY `menu_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Tablo için AUTO_INCREMENT değeri `orders`
--
ALTER TABLE `orders`
  MODIFY `ord_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Tablo için AUTO_INCREMENT değeri `restaurant`
--
ALTER TABLE `restaurant`
  MODIFY `res_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Tablo için AUTO_INCREMENT değeri `user`
--
ALTER TABLE `user`
  MODIFY `u_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
