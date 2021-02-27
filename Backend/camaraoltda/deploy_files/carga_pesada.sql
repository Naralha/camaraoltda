insert into usuario values (1,'teste.url','30','Bill Gates');
insert into usuario values (2,'teste.url','32','Steve Jobs');
insert into usuario values (3,'teste.url','37','Ellon Musk');
insert into usuario values (4,'teste.url','38','Miley Cyrus');
insert into usuario values (5,'teste.url','39','John Petruci');

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
	
	

	
	
	