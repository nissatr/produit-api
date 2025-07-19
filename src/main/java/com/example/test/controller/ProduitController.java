package com.example.test.controller;


import com.example.test.model.produit;
import com.example.test.services.ProduitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/V1")
public class ProduitController {

    private final ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }


    @GetMapping("/all")
    public List<produit> getAllProduit(){
        return produitService.getAllProduit();
    }

    @PostMapping
    public produit createProduit(@RequestBody produit produit) {
        return produitService.createProduit(produit);
    }

    @GetMapping("{id}")
    public produit getProduitById(@PathVariable  int id){
        return produitService.getProduitById(id);
    }


    @DeleteMapping("{id}")
    //la valeur qui viendra de l'url va etre bindi enn idproduit
    public String deleteProduitById(@PathVariable("id") int idproduit ){
             return produitService.deleteProduitById(idproduit);
    }

    @PutMapping("{id}")
    public produit editProduit(@PathVariable int id , @RequestBody produit produit){
        return produitService.editProduit(id,produit);
    }

}


