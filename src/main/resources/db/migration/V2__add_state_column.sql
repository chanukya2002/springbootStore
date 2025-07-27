ALTER TABLE `store`.`users`
ADD COLUMN `state` VARCHAR(255) NOT NULL AFTER `password`;