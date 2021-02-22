package com.cs.estoque.service.validator;

import com.cs.estoque.model.Produto;
import org.springframework.stereotype.Service;

@Service
public class ProdutoValidator {

    public void validarCamposCadastroProduto(Produto produto){
        if(produto==null) throw new RuntimeException("Favor, enviar um produto válido.");

        validarNomeDoProdutoEhValido(produto.getNomeDoProduto());
        validarQuantidadeProdutoEhValida(produto.getQuantidadeEmEstoque());
        validarValorProdutoEhValida(produto.getPrecoUnitario());
    }
    private void validarNomeDoProdutoEhValido(String nome){
        if (nome==null || nome.isEmpty()) throw new RuntimeException("Favor, digitar um nome válido");

    }
    private void validarQuantidadeProdutoEhValida(Double quantidade){
        if(quantidade<0) throw new RuntimeException("Favor, digite uma quantidade válida");
    }
    private void validarValorProdutoEhValida(Double valorUnitario){
        if(valorUnitario<0) throw new RuntimeException("Favor digitar um valor unitário do produto válido");
    }
}
