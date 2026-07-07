-- V2: Migration para adicionar coluna de descrição de missão na tabela de missões

ALTER TABLE tb_missoes
ADD COLUMN descricao TEXT;