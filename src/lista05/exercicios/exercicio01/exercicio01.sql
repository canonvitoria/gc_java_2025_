-- 1. Define 'programacao_java' como o schema principal
-- Este é o "equivalente"
SET search_path TO programacao_java;

-- 2. Altera a tabela 'integrantes'
ALTER TABLE "Integrantes"
ADD COLUMN id_integrante SERIAL PRIMARY KEY,
ADD COLUMN nome_integrante VARCHAR(100) NOT NULL;

-- 3. Altera a tabela 'filmes_favoritos' 
-- (depende da 'integrantes')
ALTER TABLE "Filmes_Favoritos"
ADD COLUMN id_filme SERIAL PRIMARY KEY,
ADD COLUMN nome_filme VARCHAR(100) NOT NULL,
ADD COLUMN genero VARCHAR(50),
ADD COLUMN id_integrante_fk INT REFERENCES "Integrantes"(id_integrante);

SELECT * FROM programacao_java."Filmes_Favoritos";

SELECT * FROM programacao_java."Filmes_Favoritos"
WHERE nome_filme LIKE 'A%' OR nome_filme LIKE 'D%';

SELECT * FROM programacao_java."Filmes_Favoritos"
WHERE genero = 'Terror';

SELECT * FROM programacao_java."Filmes_Favoritos"
WHERE nome_filme LIKE '%E';