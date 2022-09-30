package br.com.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.produto.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	

}
