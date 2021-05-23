insert into login values (1,null,'BillGates','senha123','U');
insert into login values (2,null,'SteveJobs','senha123','U');
insert into login values (3,null,'EllonMusk','senha123','U');
insert into login values (4,null,'MileyCyrus','senha123','U');
insert into login values (5,null,'John Petruci','senha123','U');
insert into login values (6,null,'Joao das Dores','senha123','E');
insert into login values (7,null,'Maria Ortis','senha123','E');

insert into usuario values (1,'teste.url','30','Bill Gates',1);
insert into usuario values (2,'teste.url','32','Steve Jobs',2);
insert into usuario values (3,'teste.url','37','Ellon Musk',3);
insert into usuario values (4,'teste.url','38','Miley Cyrus',4);
insert into usuario values (5,'teste.url','39','John Petruci',5);

insert into endereco values (1,'Tijuca','20271-065','Rio de Janeiro','401','RJ','343','Brasil','Rua professor Gabizo');

insert into empresa values (1,'1234567','Nasa LTDA','Nasa','21-24549900',1);



insert into login_empresa values (1,6);
insert into login_empresa values (1,7);

INSERT INTO public.area(
	id_area, nome_area)
	VALUES (1, 'TI');
INSERT INTO public.area(
	id_area, nome_area)
	VALUES (2, 'Business');
INSERT INTO public.area(
	id_area, nome_area)
	VALUES (3, 'Engenharia');
	
	
INSERT INTO public.curriculo(
	id_curriculo, id_area, id_usuario)
	VALUES (1, 1, 1);
INSERT INTO public.curriculo(
	id_curriculo, id_area, id_usuario)
	VALUES (2, 2, 2);
INSERT INTO public.curriculo(
	id_curriculo, id_area, id_usuario)
	VALUES (3, 3, 3);
INSERT INTO public.curriculo(
	id_curriculo, id_area, id_usuario)
	VALUES (4, 2, 4);
INSERT INTO public.curriculo(
	id_curriculo, id_area, id_usuario)
	VALUES (5, 1, 5);

INSERT INTO public.competencia(
	id_competencia, descricao, tipo, id_area)
	VALUES (1, 'Java', 'S', 1);
INSERT INTO public.competencia(
	id_competencia, descricao, tipo, id_area)
	VALUES (2, 'Spring', 'C', 1);
INSERT INTO public.competencia(
	id_competencia, descricao, tipo, id_area)
	VALUES (3, 'Struts', 'C', 1);
INSERT INTO public.competencia(
	id_competencia, descricao, tipo, id_area)
	VALUES (4, 'Java EE', 'C', 1);
INSERT INTO public.competencia(
	id_competencia, descricao, tipo, id_area)
	VALUES (5, 'Spring Rest', 'C', 1);

	
INSERT INTO public.curriculo_competencia(
	id_curriculo, id_competencia)
	VALUES (1, 2);
INSERT INTO public.curriculo_competencia(
	id_curriculo, id_competencia)
	VALUES (1, 3);
INSERT INTO public.curriculo_competencia(
	id_curriculo, id_competencia)
	VALUES (5, 4);
	
	
INSERT INTO public.relacionamento_competencia(
	id_relacionamento_competencia, id_filho, id_pai)
	VALUES (1, 2, 1);
INSERT INTO public.relacionamento_competencia(
	id_relacionamento_competencia, id_filho, id_pai)
	VALUES (2, 3, 1);
INSERT INTO public.relacionamento_competencia(
	id_relacionamento_competencia, id_filho, id_pai)
	VALUES (3, 4, 1);
	
INSERT INTO public.formacao(
	id_formacao, status, curso, dt_fim, dt_inicio, instituto, id_usuario)
	VALUES (1, 'E', 'engenharia', '10-02-2020', '20-02-2020', 'UFRJ', 1);
INSERT INTO public.formacao(
	id_formacao, status, curso, dt_fim, dt_inicio, instituto, id_usuario)
	VALUES (2, 'E', 'engenharia', '10-02-2020', '20-02-2020', 'UFRJ', 2);
INSERT INTO public.formacao(
	id_formacao, status, curso, dt_fim, dt_inicio, instituto, id_usuario)
	VALUES (3, 'E', 'administracao', '10-02-2020', '20-02-2020', 'UFRJ', 3);
INSERT INTO public.formacao(
	id_formacao, status, curso, dt_fim, dt_inicio, instituto, id_usuario)
	VALUES (4, 'E', 'medicina', '10-02-2020', '20-02-2020', 'UFRJ', 4);
INSERT INTO public.formacao(
	id_formacao, status, curso, dt_fim, dt_inicio, instituto, id_usuario)
	VALUES (5, 'E', 'matematica', '10-02-2020', '20-02-2020', 'UFRJ', 5);

insert into relacionamento_competencia values (4,5,2);
	
insert into experiencia values (1,'Programador','01/01/1990','01/01/1995','Ebix',2);
insert into experiencia values (2,'Programador','01/01/1990','01/01/1995','DXC',4);
insert into experiencia values (3,'Programador','01/01/1995','01/01/1997','Stefanini',2);

insert into vaga values (1,'Emprego de FDP',1,'Aberto',1,'Programador de Tamagoshi',2,1);
insert into vaga values (2,'Mamador de Glande de TI',1,'Aberto',1,'Mamar glande  24/7',2,1);
	
	