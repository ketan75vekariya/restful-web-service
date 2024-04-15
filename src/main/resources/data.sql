insert into user_details (id, birthdate,name) values(10001, current_date(),'Prisha');
insert into user_details (id, birthdate,name) values(10002, current_date(),'Ketan');
insert into user_details (id, birthdate,name) values(10003, current_date(),'Ekta');



insert into post (id, description, user_id) values (20001, 'Lorem ipsum dolor sit amet, consectetur adipiscing elit.' ,10001);
insert into post (id, description, user_id) values (20002, 'Vestibulum a risus ex. Maecenas mattis libero eu efficitur interdum.' ,10001);
insert into post (id, description, user_id) values (20003, 'Nam consectetur nisi nec magna euismod, sed cursus odio sollicitudin.' ,10002);
insert into post (id, description, user_id) values (20004, 'Ut faucibus porttitor risus. Cras pretium mi enim, gravida cursus metus rutrum vel.', 10003);

