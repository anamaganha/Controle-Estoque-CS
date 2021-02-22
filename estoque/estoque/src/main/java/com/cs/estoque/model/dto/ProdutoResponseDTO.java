package com.cs.estoque.model.dto;

import com.cs.estoque.model.UnidadeDeMedida;

import java.io.Serializable;

public class ProdutoResponseDTO implements Serializable {

    private Long Id;
    private String nomeDoProduto;
    private Double precoUnitario;
    private UnidadeDeMedida unidadeDeMedida;
    private Double quantidadeEmEstoque;
    private Double valorTotalDoEstoque;

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public UnidadeDeMedida getUnidadeDeMedida() {
        return unidadeDeMedida;
    }

    public void setUnidadeDeMedida(UnidadeDeMedida unidadeDeMedida) {
        this.unidadeDeMedida = unidadeDeMedida;
    }

    public Double getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(Double quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public Double getValorTotalDoEstoque() {
        return valorTotalDoEstoque;
    }

    public void setValorTotalDoEstoque() {
        this.valorTotalDoEstoque = valorTotalDoEstoque;
    }
}
