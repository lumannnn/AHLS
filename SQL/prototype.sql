CREATE TABLE IF NOT EXISTS activity_log (
	id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	data VARCHAR(255),
	time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
	);

CREATE TABLE IF NOT EXISTS user (
	id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	username VARCHAR(255),
	registered TIMESTAMP DEFAULT CURRENT_TIMESTAMP
	);

CREATE USER 'ahls'@'localhost' IDENTIFIED BY 'PASSWORD(ahls)';
GRANT ALL ON ahls.* TO 'ahls'@'localhost';