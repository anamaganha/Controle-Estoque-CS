package com.cs.estoque.service;

import com.cs.estoque.model.Produto;
import com.cs.estoque.repository.ProdutoRepository;
import com.cs.estoque.service.validator.ProdutoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    ProdutoValidator produtoValidator;

    public Produto getProdutoById(Long id){
        return this.produtoRepository.findById(id).orElseThrow(()-> new RuntimeException("Produto não encontrado"));
    }

    public Produto cadastrarProduto(Produto produto){
        produtoValidator.validarCamposCadastroProduto(produto);
        return  produtoRepository.save(produto);
    }
    
}
