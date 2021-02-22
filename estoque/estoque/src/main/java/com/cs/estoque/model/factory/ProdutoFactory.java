package com.cs.estoque.model.factory;

import com.cs.estoque.model.Produto;
import com.cs.estoque.model.dto.ProdutoRequestDTO;
import com.cs.estoque.model.dto.ProdutoResponseDTO;

public class ProdutoFactory {

    public static Produto dtoToEntity (ProdutoRequestDTO produtoRequestDTO){
        Produto produto = new Produto();
        produto.setNomeDoProduto(produtoRequestDTO.getNomeDoProduto());
        produto.setPrecoUnitario(produtoRequestDTO.getPrecoUnitario());
        produto.setQuantidadeEmEstoque(produtoRequestDTO.getQuantidadeEmEstoque());
        produto.setUnidadeDeMedida(produtoRequestDTO.getUnidadeDeMedida());
        produto.setValorTotalDoEstoque();
        return produto;
    }

    public static ProdutoResponseDTO entityToDto (Produto produto){
        ProdutoResponseDTO produtoResponseDTO = new ProdutoResponseDTO();
        produtoResponseDTO.setId(produto.getId());
        produtoResponseDTO.setNomeDoProduto(produto.getNomeDoProduto());
        produtoResponseDTO.setPrecoUnitario(produto.getPrecoUnitario());
        produtoResponseDTO.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque());
        return produtoResponseDTO;
    }
}
