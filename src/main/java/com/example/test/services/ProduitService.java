package com.example.test.services;

import com.example.test.model.produit;
import com.example.test.repository.ProduitRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProduitService {

    private final ProduitRespository produitRespository;


    public ProduitService(ProduitRespository produitRespository) {
        this.produitRespository = produitRespository;
    }
    public List<produit> getAllProduit(){

        return produitRespository.findAll();
    }

    public produit createProduit(produit produit) {
        return produitRespository.save(produit);
    }

}
