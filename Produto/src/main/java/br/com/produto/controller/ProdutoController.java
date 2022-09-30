package br.com.produto.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.produto.command.ListaComandos;
import br.com.produto.model.Produto;
import br.com.produto.repository.ProdutoRepository;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
	
	private ProdutoRepository produtoRepository;
	private ListaComandos comandos;
	
	
	public ProdutoController(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
		this.comandos = new ListaComandos();
	}
	
	
	@GetMapping("/listar")
	public List<Produto> listaProdutos() {
		return comandos.listaProdutos(produtoRepository);
	}
	
	@PostMapping("/salvar")
	public Produto criaProduto(@RequestBody Produto produto) {
		return comandos.criaProduto(produtoRepository, produto);
	}

	@DeleteMapping("/{id}")
	public void deletaPedido(@PathVariable("id")Long id) {
		comandos.deletaProduto(produtoRepository, id);
	}

	@PutMapping("/update/{id}")
	public Produto alteraProduto(@PathVariable Long id, @RequestBody Produto produto) {
		return comandos.updatePedido(produtoRepository, id, produto);
	}
}
