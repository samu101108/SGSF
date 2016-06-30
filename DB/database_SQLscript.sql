create database androidapp;
use androidapp;

create table cliente(
id integer(4) primary key,
nome_completo varchar(50),
celular int(11),
email varchar(30),
senha varchar(8)
);

create table empresa(
nome_completo_emp varchar(50),
razao_social varchar(50),
cnpj int(14),
cpf int(11),
celular int(11),
email varchar(30),
senha varchar(8),
telefone_fixo int(10),
endereco varchar(50),
complemento varchar(60),
cep int(8),
descricao_breve varchar(200),
website varchar(50),
facebook varchar(80)
);

create table servicos(
aniversario varchar(30),
casamento varchar(30),
bodas varchar(30),
studio varchar(30)
);

