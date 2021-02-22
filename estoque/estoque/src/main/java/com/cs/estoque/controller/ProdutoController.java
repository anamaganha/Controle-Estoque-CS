package com.cs.estoque.controller;

import com.cs.estoque.model.Produto;
import com.cs.estoque.model.dto.ProdutoRequestDTO;
import com.cs.estoque.model.dto.ProdutoResponseDTO;
import com.cs.estoque.model.factory.ProdutoFactory;
import com.cs.estoque.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoResponseDTO salvarProduto(@RequestBody ProdutoRequestDTO produto){
        Produto produtoSalvo = produtoService.cadastrarProduto(ProdutoFactory.dtoToEntity(produto));
        return ProdutoFactory.entityToDto(produtoSalvo);
    }

}
