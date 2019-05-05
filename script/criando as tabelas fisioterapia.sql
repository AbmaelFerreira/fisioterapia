create database fisioterapia;

create table paciente(
	 id int primary key not null auto_increment,
     nome varchar(40) not null,
     planoSaude varchar(40) not null,
     dtNascimento Date ,
     telefone varchar(40) ,
     profissao varchar(40) ,
     diagnostico varchar(100),
     acao varchar(40)
  )
  
  create table agendamento(
	 id int primary key not null auto_increment,
     paciente int,
     agendamento_data Date,
     controle int,
     situacao varchar(40),
     financeiro int
  )
  
 
  select * from agendamento
  
  
  
  create table paciente(
	id int primary key not null auto_increment,
    nome varchar(40) not null
  )
  
   ALTER TABLE paciente 
   ADD COLUMN agendamento int;
   
   alter table agendamento 
   add column plano_saude int
   
      
   ALTER TABLE paciente 
   ADD FOREIGN KEY (agendamento)
   REFERENCES playlists(id)
   
   select * from agendamento data_nascimento
   select agendament0_dtAgendamento.id as id1_0_, agendament0_.controle as controle2_0_, agendament0_.dt_agendamento as dt_agend3_0_, agendament0_.financeiro as financei4_0_, agendament0_.situacao as situacao5_0_ from agendamento agendament0_
   
   INSERT INTO `fisioterapia`.`agendamento` (`id`, `paciente`, `dtAgendamento`, `controle`, `situacao`, `financeiro`) VALUES ('1', '1', '29/04/2019', '1', '1', '0');
   
   UPDATE `fisioterapia`.`agendamento` SET `dtAgendamento`='2019-04-29' WHERE `id`='1';
   
   ALTER TABLE `fisioterapia`.`agendamento` 
CHANGE COLUMN `dtAgendamento` `agendamento_data` DATE NULL DEFAULT NULL ;


   ALTER TABLE agendamento
CHANGE COLUMN id_paciente id_pacientes DATE NULL DEFAULT NULL ;

ALTER TABLE `fisioterapia`.`agendamento` 
CHANGE COLUMN `id_pacientes` `id_pacientes` INT(15) NULL DEFAULT NULL ;

--Alterando a data para datatime
ALTER TABLE `fisioterapia`.`agendamento` 
CHANGE COLUMN `agendamento_data` `agendamento_data` DATETIME NOT NULL ,
CHANGE COLUMN `plano_saude` `plano_saude` INT(11) NOT NULL ;

select agendament0_.id as id1_0_, agendament0_.controle as controle2_0_, agendament0_.agendamento_data as agendame3_0_, agendament0_.financeiro as financei4_0_, agendament0_.id_pacientes as id_pacie5_0_, agendament0_.plano_saude as plano_sa6_0_, agendament0_.situacao as situacao7_0_ from agendamento agendament0_



ALTER TABLE `fisioterapia`.`agendamento` 
CHANGE COLUMN `agendamento_data` `agendamento_data` DATE NOT NULL ;


INSERT INTO `fisioterapia`.`agendamento` (`id`, `id_pacientes`, `agendamento_data`, `controle`, `situacao`, `financeiro`, `plano_saude`) VALUES ('2', '1', '2019-05-06', '2', '2', '1', '1');
INSERT INTO `fisioterapia`.`agendamento` (`id`, `id_pacientes`, `agendamento_data`, `controle`, `situacao`, `financeiro`, `plano_saude`) VALUES ('3', '2', '2019-05-03', '2', '2', '1', '0');
UPDATE `fisioterapia`.`agendamento` SET `id_pacientes`='1', `agendamento_data`='2019-05-03', `financeiro`='1', `plano_saude`='1' WHERE `id`='1';
INSERT INTO `fisioterapia`.`agendamento` (`id`, `id_pacientes`, `agendamento_data`, `controle`, `situacao`, `financeiro`, `plano_saude`) VALUES ('4', '2', '2019-05-04', '2', '2', '1', '0');
INSERT INTO `fisioterapia`.`agendamento` (`id`, `id_pacientes`, `agendamento_data`, `controle`, `situacao`, `financeiro`, `plano_saude`) VALUES ('5', '3', '2019-05-06', '2', '2', '1', '0');


ALTER TABLE `fisioterapia`.`agendamento` 
CHANGE COLUMN `financeiro` `tipopaciente` INT(11) NOT NULL ;



	ALTER TABLE paciente 
   ADD COLUMN agendamento int;
   
      
   ALTER TABLE paciente 
   FOREIGN KEY (agendamento)
   REFERENCES agendamento(id)

ALTER TABLE `fisioterapia`.`agendamento` 
CHANGE COLUMN `id_pacientes` `nome_paciente` VARCHAR(40) NOT NULL ;

ALTER TABLE `fisioterapia`.`paciente` 
DROP COLUMN `agendamento`;



alter table paciente drop foreign key paciente_ibfk_1













