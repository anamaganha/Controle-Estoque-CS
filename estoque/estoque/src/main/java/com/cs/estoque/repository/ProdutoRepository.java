package com.cs.estoque.repository;

import com.cs.estoque.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository <Produto, Long> {
    List<Produto> findAll();
}
