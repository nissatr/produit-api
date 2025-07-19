package com.example.test.services;

import com.example.test.model.produit;
import com.example.test.repository.ProduitRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        return produitRespository.save(produit) ;
    }

    public produit getProduitById(int id) {
        Optional<produit> optionalproduit = produitRespository.findById(id);
        if (optionalproduit.isEmpty()) {
            throw new RuntimeException(" Désolée produit inexistant");
        }
        return optionalproduit.get();
    }
    public String deleteProduitById(int id) {
        Optional<produit> produitasupprimer= produitRespository.findById(id);
        if (produitasupprimer.isEmpty()) {
            throw new RuntimeException("désolé le produit inexistant , suppression impossible");
        }else{
            produitRespository.delete(produitasupprimer.get());
            return "produit est suprimé avec succés";
        }
    }

    public produit editProduit(int id,produit produit) {
        Optional<produit> optionalproduit = produitRespository.findById(id);
        if (optionalproduit.isEmpty()) {
            throw new RuntimeException("produit not found");

        }
        optionalproduit.get().setName(produit.getName());
        optionalproduit.get().setPrice(produit.getPrice());

        return produitRespository.save(optionalproduit.get());

    }

}
