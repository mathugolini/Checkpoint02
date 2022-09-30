package br.com.produto.command;

import java.util.List;

import br.com.produto.model.Produto;
import br.com.produto.repository.ProdutoRepository;


public class ListaComandos {

	public List<Produto> listaProdutos(ProdutoRepository produtoRepository) {
		return produtoRepository.findAll();
	}
	
	public Produto criaProduto(ProdutoRepository produtoRepository, Produto produto) {
		return produtoRepository.save(produto);
	}

	public void deletaProduto(ProdutoRepository produtoRepository, Long id) {
		if (produtoRepository.existsById(id)) {
			produtoRepository.deleteById(id);
		}
	}
	
	public Produto updatePedido(ProdutoRepository produtoRepository, Long id, Produto novoProduto) {
		
		Produto produto = produtoRepository.getById(id);
     
		produto.setNome(novoProduto.getNome());
		produto.setCategoria(novoProduto.getCategoria());
		produto.setPreco(novoProduto.getPreco());
	
       return produtoRepository.save(produto); 
    }
}
