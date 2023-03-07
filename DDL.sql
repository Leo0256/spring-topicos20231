create schema if not exists anotacao;

use anotacao;

create user if not exists 'user'@'localhost' identified by 'pass123';

grant select, insert, delete, update on anotacao.* to user@'localhost';

create table if not exists usr_usuario (
  usr_id bigint unsigned not null auto_increment,
  usr_nome varchar(20) not null,
  usr_senha varchar(150) not null,
  primary key (usr_id),
  unique key uni_usuario_nome (usr_nome)
);

create table if not exists usr_descricao (
  usr_desc_id bigint unsigned auto_increment primary key,
  usr_id bigint unsigned not null,
  usr_endereco varchar(255),
  usr_frase varchar(255) default "frase de efeito!",
  constraint usr_usuario_descricao foreign key (usr_id)
  references usr_usuario(usr_id)
);