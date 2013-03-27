DROP TABLE unidade_federativa;

CREATE TABLE unidade_federativa
(
  id_unidade_federativa numeric NOT NULL, -- id
  sigla character varying(2) NOT NULL, -- sigla
  nome character varying(60), -- nome
  regiao character varying(20), -- região
  CONSTRAINT unidade_federativa_pk PRIMARY KEY (id_unidade_federativa)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE unidade_federativa
  OWNER TO postgres;
COMMENT ON TABLE unidade_federativa
  IS 'Lista de unidades federativas do Brasil';
COMMENT ON COLUMN unidade_federativa.sigla IS 'sigla';
COMMENT ON COLUMN unidade_federativa.nome IS 'nome';
COMMENT ON COLUMN unidade_federativa.regiao IS 'região';


INSERT INTO unidade_federativa VALUES (1,'GO','Goiás','Centro Oeste');
INSERT INTO unidade_federativa VALUES (2,'MT','Mato Grosso','Centro Oeste');
INSERT INTO unidade_federativa VALUES (3,'MS','Mato Grosso do Sul','Centro Oeste');
INSERT INTO unidade_federativa VALUES (4,'DF','Distrito Federal','Centro Oeste');
INSERT INTO unidade_federativa VALUES (5,'AM','Amazonas','Norte');
INSERT INTO unidade_federativa VALUES (6,'AC','Acre','Norte');
INSERT INTO unidade_federativa VALUES (7,'RO','Rondônia','Norte');
INSERT INTO unidade_federativa VALUES (8,'RR','Roraima','Norte');
INSERT INTO unidade_federativa VALUES (9,'AP','Amapá','Norte');
INSERT INTO unidade_federativa VALUES (10,'TO','Tocantins','Norte');
INSERT INTO unidade_federativa VALUES (11,'PA','Para','Norte');
INSERT INTO unidade_federativa VALUES (12,'MA','Maranhão','Nordeste');
INSERT INTO unidade_federativa VALUES (13,'PI','Piaui','Nordeste');
INSERT INTO unidade_federativa VALUES (14,'CE','Ceara','Nordeste');
INSERT INTO unidade_federativa VALUES (15,'RN','Rio Grande do Norte','Nordeste');
INSERT INTO unidade_federativa VALUES (16,'PB','Paraiba','Nordeste');
INSERT INTO unidade_federativa VALUES (17,'PE','Pernambuco','Nordeste');
INSERT INTO unidade_federativa VALUES (18,'SE','Sergipe','Nordeste');
INSERT INTO unidade_federativa VALUES (19,'AL','Alagoas','Nordeste');
INSERT INTO unidade_federativa VALUES (20,'BA','Bahia','Nordeste');
INSERT INTO unidade_federativa VALUES (21,'SP','São Paulo','Sudeste');
INSERT INTO unidade_federativa VALUES (22,'MG','Minas Gerais','Sudeste');
INSERT INTO unidade_federativa VALUES (23,'RJ','Rio de Janeiro','Sudeste');
INSERT INTO unidade_federativa VALUES (24,'ES','Espirito Santo','Sudeste');
INSERT INTO unidade_federativa VALUES (25,'PR','Parana','Sul');
INSERT INTO unidade_federativa VALUES (26,'SC','Santa Catarina','Sul');
INSERT INTO unidade_federativa VALUES (27,'RS','Rio Grande do Sul','Sul');

