package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	// Pega tudos que contem a palavra titulo ignorando letras maiusculas
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);
}
