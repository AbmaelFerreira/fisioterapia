create table playlists (
	id int not null auto_increment primary key,
    nome varchar(60) not null,
    descricao varchar(60) not null
     
)

CREATE TABLE pacientes (
  id INT NOT NULL AUTO_INCREMENT,
  titulo VARCHAR(60) NOT NULL,
  banda VARCHAR(45) NOT NULL,
  nota INT NOT NULL,
  PRIMARY KEY (id) ,
   );
   
   ALTER TABLE pacientes
   ADD COLUMN agendamento int;
   
      
   ALTER TABLE pacientes
   ADD FOREIGN KEY (agendamento)
   REFERENCES playlists(id)
   

   