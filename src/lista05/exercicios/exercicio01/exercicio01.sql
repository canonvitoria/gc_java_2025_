-- 1. Define 'programacao_java' como o schema principal da sessão
-- "equivalente" do USE 
SET search_path TO programacao_java;

-- 2. Altera a tabela 'integrantes'
ALTER TABLE programacao_java.integrantes
ADD COLUMN id_integrante SERIAL PRIMARY KEY,
ADD COLUMN nome_integrante VARCHAR(100) NOT NULL;

-- 3. Altera a tabela 'filmes_favoritos'
ALTER TABLE filmes_favoritos
ADD COLUMN id_filme SERIAL PRIMARY KEY,
ADD COLUMN nome_filme VARCHAR(100) NOT NULL,
ADD COLUMN genero VARCHAR(50),
ADD COLUMN id_integrante_fk INT REFERENCES integrantes(id_integrante);