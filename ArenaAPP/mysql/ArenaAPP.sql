create database if not exists ArenaAPP;
use ArenaAPP;

CREATE TABLE if not exists usuario (
  id_usuario int auto_increment PRIMARY KEY,
  fk_equipe int,
  email varchar(255) NOT NULL,
  nome varchar(255) NOT NULL,
  dataDeNascimento DATE NOT NULL,
  senha varchar(255) NOT NULL,
  sexo enum('M', 'F') NOT NULL,
  biografia varchar(510) default '' NOT NULL,
  cidade varchar(30) NOT null,
);

CREATE TABLE if not exists endereco (
   id_endereco int auto_increment primary key,
   bairro varchar(255) NOT NULL,
   rua varchar(255) NOT NULL,
   numero int NOT NULL,
   cidade varchar(30) NOT NULL
);


CREATE TABLE if not exists equipe (
   id_equipe int NOT NULL auto_increment primary KEY,
   nome varchar(255) UNIQUE NOT NULL,
   fk_dono int unique,
   fk_adm int unique,
   descricao varchar(510) default '' NOT NULL,
   PraticaDom BOOLEAN DEFAULT '0' NOT NULL,
   PraticaSeg BOOLEAN DEFAULT '0' NOT NULL,
   PraticaTer BOOLEAN DEFAULT '0' NOT NULL,
   PraticaQua BOOLEAN DEFAULT '0' NOT NULL,
   PraticaQui BOOLEAN DEFAULT '0' NOT NULL,
   PraticaSex BOOLEAN DEFAULT '0' NOT NULL,
   PraticaSab BOOLEAN DEFAULT '0' NOT NULL,
   linkWhatsapp varchar(300) default '' NOT NULL,
   linkInstagram varchar(300) default '' NOT NULL,
   esporte varchar(30) NOT NULL,
   fk_endereco int,
   foreign key (fk_adm) references usuario(id_usuario),
   foreign key (fk_endereco) references endereco(id_endereco),
   foreign key (fk_dono) references usuario(id_usuario)
   ON DELETE CASCADE
);

ALTER TABLE usuario ADD CONSTRAINT fk_equipe
FOREIGN KEY(fk_equipe) REFERENCES equipe(id_equipe)
on delete set NULL;