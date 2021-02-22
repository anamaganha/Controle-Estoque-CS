package com.cs.estoque.model;

import javax.persistence.*;

@Entity
@Table(name ="Produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nomeDoProduto", nullable = false)
    private String nomeDoProduto;

    @Column(name = "precoUnitario", nullable = false)
    private Double precoUnitario;

    @Column(name = "unidadeDeMedida", nullable = false)
    @Enumerated(EnumType.STRING)
    private UnidadeDeMedida unidadeDeMedida;

    @Column(name = "quantidadeEmEstoque", nullable = false)
    private Double quantidadeEmEstoque;

    @Column(name = "valorTotalDoEstoque", nullable = false)
    private Double valorTotalDoEstoque;

    public Produto(){

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
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
        this.valorTotalDoEstoque = this.quantidadeEmEstoque * this.precoUnitario;
    }
}
