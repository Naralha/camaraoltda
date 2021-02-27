insert into
    usuario
values
    (1, 'teste.url', '30', 'Bill Gates');

insert into
    usuario
values
    (2, 'teste.url', '32', 'Steve Jobs');

insert into
    usuario
values
    (3, 'teste.url', '37' 'Ellon Musk',);

insert into
    usuario
values
    (4, 'teste.url', '38', 'Miley Cyrus');

insert into
    usuario
values
    (5, 'teste.url', '39','John Petruci');

INSERT INTO
    public.curriculo(id_curriculo, id_usuario)
VALUES
    (1, 1);

INSERT INTO
    public.curriculo(id_curriculo, id_usuario)
VALUES
    (2, 2);

INSERT INTO
    public.curriculo(id_curriculo, id_usuario)
VALUES
    (3, 3);

INSERT INTO
    public.curriculo(id_curriculo, id_usuario)
VALUES
    (4, 4);

INSERT INTO
    public.curriculo(id_curriculo, id_usuario)
VALUES
    (5, 5);

INSERT INTO
    public.area(id_area, nome_area)
VALUES
    (1, 'Engenharia');

INSERT INTO
    public.area_interesse(id_area_interesse, id_area)
VALUES
    (1, 1);

INSERT INTO public.curriculo_areainteresse(
	id_curriculo, id_area_interesse)
	VALUES (1, 1);
INSERT INTO public.curriculo_areainteresse(
	id_curriculo, id_area_interesse)
	VALUES (2, 1);
INSERT INTO public.curriculo_areainteresse(
	id_curriculo, id_area_interesse)
	VALUES (3, 1);
INSERT INTO public.curriculo_areainteresse(
	id_curriculo, id_area_interesse)
	VALUES (4, 1);
INSERT INTO public.curriculo_areainteresse(
	id_curriculo, id_area_interesse)
	VALUES (5, 1);