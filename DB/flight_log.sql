-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema flight_log
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `flight_log` ;

-- -----------------------------------------------------
-- Schema flight_log
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `flight_log` DEFAULT CHARACTER SET utf8 ;
USE `flight_log` ;

-- -----------------------------------------------------
-- Table `flight_log`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `flight_log` ;

CREATE TABLE IF NOT EXISTS `flight_log` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `date` VARCHAR(80) NOT NULL,
  `takeoff_time` VARCHAR(45) NOT NULL,
  `duration_in_hours` DOUBLE NULL,
  `location` VARCHAR(45) NOT NULL,
  `aircraft_tail_number` INT NOT NULL,
  `pilot_in_command_name` VARCHAR(45) NOT NULL,
  `pilot_name` VARCHAR(45) NOT NULL,
  `crew_cheif_name` VARCHAR(45) NOT NULL,
  `medic_name` VARCHAR(45) NULL,
  `mission_enviroment` VARCHAR(45) NOT NULL,
  `mission_type` VARCHAR(45) NOT NULL,
  `special_equipment` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS flight_log_user@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'flight_log_user'@'localhost' IDENTIFIED BY 'flight_log_user';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'flight_log_user'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `flight_log`
-- -----------------------------------------------------
START TRANSACTION;
USE `flight_log`;
INSERT INTO `flight_log` (`id`, `date`, `takeoff_time`, `duration_in_hours`, `location`, `aircraft_tail_number`, `pilot_in_command_name`, `pilot_name`, `crew_cheif_name`, `medic_name`, `mission_enviroment`, `mission_type`, `special_equipment`) VALUES (1, '2022-01-11', '1700', 1.5, 'TAC lll', 934, 'Lucy Van Pelt', 'Snoopy', 'Charli Brown', 'Woodstock', 'Training', 'MEDEVAC', 'Rescue Hoist');
INSERT INTO `flight_log` (`id`, `date`, `takeoff_time`, `duration_in_hours`, `location`, `aircraft_tail_number`, `pilot_in_command_name`, `pilot_name`, `crew_cheif_name`, `medic_name`, `mission_enviroment`, `mission_type`, `special_equipment`) VALUES (2, '2021-12-24', '1200', 2, 'MTA\'s', 382, 'Peppermint Patty', 'Franklin', 'Charli Brown', 'Marcie', 'Training', 'Fire', 'Fire Bucket');
INSERT INTO `flight_log` (`id`, `date`, `takeoff_time`, `duration_in_hours`, `location`, `aircraft_tail_number`, `pilot_in_command_name`, `pilot_name`, `crew_cheif_name`, `medic_name`, `mission_enviroment`, `mission_type`, `special_equipment`) VALUES (3, '2021-11-20', '1400', 5.7, 'Baghdad', 284, 'Sally Brown', 'Schroeder', 'Charli Brown', 'Violet', 'Combat', 'Air Assult', '240s');
INSERT INTO `flight_log` (`id`, `date`, `takeoff_time`, `duration_in_hours`, `location`, `aircraft_tail_number`, `pilot_in_command_name`, `pilot_name`, `crew_cheif_name`, `medic_name`, `mission_enviroment`, `mission_type`, `special_equipment`) VALUES (4, '2021-10-29', '0930', 3.4, 'Erbil', 934, 'Peppermint Patty', 'Snoopy', 'Charli Brown', 'Marcie', 'Combat', 'MEDEVAC', 'Rescue Hoist');
INSERT INTO `flight_log` (`id`, `date`, `takeoff_time`, `duration_in_hours`, `location`, `aircraft_tail_number`, `pilot_in_command_name`, `pilot_name`, `crew_cheif_name`, `medic_name`, `mission_enviroment`, `mission_type`, `special_equipment`) VALUES (5, '2021-05-19', '1245', 1.7, 'Denver', 284, 'Lucy Van Pelt', 'Franklin', 'Charli Brown', 'Woodstock', 'Training', 'Fire', 'Fire Bucket');
INSERT INTO `flight_log` (`id`, `date`, `takeoff_time`, `duration_in_hours`, `location`, `aircraft_tail_number`, `pilot_in_command_name`, `pilot_name`, `crew_cheif_name`, `medic_name`, `mission_enviroment`, `mission_type`, `special_equipment`) VALUES (6, '2021-02-14', '2030', 2.6, 'AAAB', 382, 'Sally Brown', 'Schroeder', 'Charli Brown', 'Violet', 'Combat', 'Air Assult', 'Sling Load');
INSERT INTO `flight_log` (`id`, `date`, `takeoff_time`, `duration_in_hours`, `location`, `aircraft_tail_number`, `pilot_in_command_name`, `pilot_name`, `crew_cheif_name`, `medic_name`, `mission_enviroment`, `mission_type`, `special_equipment`) VALUES (7, '2021-01-11', '1111', 1.1, 'MTA\'s', 934, 'Lucy Van Pelt', 'Snoopy', 'Charli Brown', 'Woodstock', 'Training', 'MEDEVAC', 'Rescue Hoist');
INSERT INTO `flight_log` (`id`, `date`, `takeoff_time`, `duration_in_hours`, `location`, `aircraft_tail_number`, `pilot_in_command_name`, `pilot_name`, `crew_cheif_name`, `medic_name`, `mission_enviroment`, `mission_type`, `special_equipment`) VALUES (8, '2020-12-25', '1445', 3, 'TAC lll', 382, 'Peppermint Patty', 'Snoopy', 'Charli Brown', 'Marcie', 'Training', 'Air Assult', 'Sling Load');
INSERT INTO `flight_log` (`id`, `date`, `takeoff_time`, `duration_in_hours`, `location`, `aircraft_tail_number`, `pilot_in_command_name`, `pilot_name`, `crew_cheif_name`, `medic_name`, `mission_enviroment`, `mission_type`, `special_equipment`) VALUES (9, '2020-11-20', '1230', 2.6, 'Baghdad', 284, 'Sally Brown', 'Schroeder', 'Charli Brown', 'Marcie', 'Combat', 'Air Assult', '240s');
INSERT INTO `flight_log` (`id`, `date`, `takeoff_time`, `duration_in_hours`, `location`, `aircraft_tail_number`, `pilot_in_command_name`, `pilot_name`, `crew_cheif_name`, `medic_name`, `mission_enviroment`, `mission_type`, `special_equipment`) VALUES (10, '2020-10-29', '1340', 3, 'Erbil', 934, 'Sally Brown', 'Franklin', 'Charli Brown', 'Woodstock', 'Combat', 'Fire', 'Fire Bucket');

COMMIT;

