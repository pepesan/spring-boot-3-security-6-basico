-- url encriptado: https://bcrypt-generator.com
-- factor de costo: 10
-- salt: generado automaticamente

INSERT INTO `USERS` (`id`, `name`, `username`,
                     `email`, `password`) VALUES
                   (1, 'admin', 'admin', 'admin@gmail.com',
                      '{bcrypt}$2a$10$7btVw0Nj6BRFXriicSrJzO.P0j0f72O3/LThHsE5PWXL42Smf/YY6'),
                    -- password: admin
                   (2, 'pepesan', 'pepesan', 'pepesan@gmail.com',
                        '{bcrypt}$2a$10$c1zHRpr1AK76esh50.T5subN0KTR2.zGOyC3fhRJlWX7WPI9z4Tla');
                    -- password: password
INSERT INTO `roles` VALUES (1,'ROLE_ADMIN'),
                           (2,'ROLE_USER');
INSERT INTO `users_roles` VALUES (1,1),(2,2);