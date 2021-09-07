create schema oficina;

use oficina;

create user 'celso'@'localhost' identified by 'pass123';

grant select, insert, delete, update on oficina.* to celso@'localhost';

create table veiculos (
  id bigint unsigned not null auto_increment,
  modelo varchar(20) not null,
  placa varchar(20) not null,
  ano varchar(20) not null,
  proprietario varchar(50) not null,
  primary key (id),
  unique key uni_veiculo_id (id)
);


create table clientes (
  id bigint unsigned not null auto_increment,
  telefone varchar(50) not null,
  veiculos varchar(20) not null,
  primary key (id),
  unique key uni_cliente_id (id)
);

create table manutencoes (
  id bigint unsigned not null auto_increment,
  servico varchar(50) not null,
  valor varchar(20) not null,
  dia varchar(20) not null,
  id_cliente bigint unsigned not null,
  id_veiculo bigint unsigned not null,  
  primary key (id),
  unique key uni_servico_id (id),
  foreign key cliente_id_fk (id_cliente) references clientes (id) on delete restrict on update cascade,
  foreign key veiculo_id_fk (id_veiculo) references veiculos (id) on delete restrict on update cascade
);
show tables;