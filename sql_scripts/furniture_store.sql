CREATE DATABASE `furniture_store`;

CREATE TABLE `administrator` (
  `user_id` bigint(20) NOT NULL,
  `start_date` date NOT NULL
) 

CREATE TABLE `category` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `name` varchar(128) NOT NULL
) 

CREATE TABLE `client` (
  `client_id` bigint(20) NOT NULL,
  `delivery_address` varchar(128) NOT NULL
) 

CREATE TABLE `furniture` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `price` double NOT NULL,
  `name` varchar(128) NOT NULL,
  `price_creation` double NOT NULL,
  `category_id` bigint(20) NOT NULL
) 

CREATE TABLE `furnitures_in_order` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `order_id` bigint(20) NOT NULL,
  `furniture_id` bigint(20) NOT NULL,
  `quantity` int(11) NOT NULL
) 

CREATE TABLE `materials` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `name` varchar(128) NOT NULL,
  `price` double NOT NULL
) 

CREATE TABLE `materials_furniture` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `furniture_id` bigint(20) NOT NULL,
  `materials_id` bigint(20) NOT NULL,
  `quantity` int(11) NOT NULL
)

CREATE TABLE `orders` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `delivery_price` double NOT NULL,
  `date_of_order` date NOT NULL,
  `total_price` double NOT NULL,
  `status_id` bigint(20) NOT NULL,
  `client_id` bigint(20) NOT NULL
) 

CREATE TABLE `status` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `name` varchar(128) NOT NULL
) 

CREATE TABLE `user` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `name` varchar(128) NOT NULL,
  `username` varchar(128) NOT NULL,
  `password` varchar(128) NOT NULL,
  `email` varchar(128) NOT NULL,
  `phone` varchar(128) NOT NULL
) 

ALTER TABLE `category`
  ADD UNIQUE KEY `id` (`id`);

ALTER TABLE `furniture`
  ADD UNIQUE KEY `id` (`id`);

ALTER TABLE `furnitures_in_order`
  ADD UNIQUE KEY `id` (`id`);

ALTER TABLE `materials`
  ADD UNIQUE KEY `id` (`id`);

ALTER TABLE `materials_furniture`
  ADD UNIQUE KEY `id` (`id`);

ALTER TABLE `orders`
  ADD UNIQUE KEY `id` (`id`);

ALTER TABLE `status`
  ADD UNIQUE KEY `id` (`id`);

ALTER TABLE `user`
  ADD UNIQUE KEY `id` (`id`);

ALTER TABLE `category`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

ALTER TABLE `furniture`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

ALTER TABLE `furnitures_in_order`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

ALTER TABLE `materials`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

ALTER TABLE `materials_furniture`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

ALTER TABLE `orders`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

ALTER TABLE `status`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

ALTER TABLE `user`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;
