package com.example.test.repository;

import com.example.test.model.produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProduitRespository extends JpaRepository<produit, Integer> {

}
