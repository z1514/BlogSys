INSERT INTO user (id, username, password, name, email) VALUES (1, 'admin', '123456', 'andy', 'zjx@gmail.com');
INSERT INTO user (id, username, password, name, email)  VALUES (2, 'andy', '$2a$10$N.zmdr9k7uOCQb376NoUnuTJ8iAt6Z5EHsM8lE9lBOsl7iKTVKIUi', 'andy', 'zjx@gmail.com');

INSERT INTO authority (id, name) VALUES (1, 'ROLE_ADMIN');
INSERT INTO authority (id, name) VALUES (2, 'ROLE_USER');

INSERT INTO user_authority (user_id, authority_id) VALUES (1, 1);
INSERT INTO user_authority (user_id, authority_id) VALUES (2, 2);
