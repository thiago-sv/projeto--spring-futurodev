CREATE TABLE permissions (
  id INTEGER AUTO_INCREMENT PRIMARY KEY,
  description varchar(255) NOT NULL);

CREATE TABLE users (
  id INTEGER AUTO_INCREMENT PRIMARY KEY,
  user_name varchar(255) NOT NULL UNIQUE,
  full_name varchar(255),
  password varchar(255) NOT NULL,
  account_non_expired bit DEFAULT NULL,
  account_non_locked bit DEFAULT NULL,
  credentials_non_expired bit DEFAULT NULL,
  enabled bit DEFAULT NULL);

CREATE TABLE user_permissions (
  id_user INTEGER,
  id_permission INTEGER,
  foreign key (id_user) references users(id),
  foreign key (id_permission) references permissions(id)
);

INSERT INTO PERMISSIONS (description) VALUES
	('ADMIN');

INSERT INTO PERMISSIONS (description) VALUES
	('MANAGER');

INSERT INTO PERMISSIONS (description) VALUES
	('COMMON_USER');

INSERT INTO USERS (user_name, full_name, password, account_non_expired, account_non_locked, credentials_non_expired, enabled) VALUES
('eduardo', 'Eduardo Muller', '$2a$10$2MG9wpqjFasvTWZUQqyZR.JWZFmAVvHTC1wU0j911mqniaENGrega', 1, 1, 1, 1);

INSERT INTO USERS (user_name, full_name, password, account_non_expired, account_non_locked, credentials_non_expired, enabled) VALUES
('joao', 'Joao do Caminhao', '$2a$12$fH6tBz0ovRyWHYJws6D3K.p7WQ6zGz/95WddB2xud4H3dJYmjhCN2', 1, 1, 1, 1);

INSERT INTO user_permissions (id_user, id_permission) VALUES
	(1, 1);

INSERT INTO user_permissions (id_user, id_permission) VALUES
	(1, 2);

INSERT INTO user_permissions (id_user, id_permission) VALUES
	(2, 3);