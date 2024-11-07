package com.browncoffe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.browncoffe.entities.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long>{

}
