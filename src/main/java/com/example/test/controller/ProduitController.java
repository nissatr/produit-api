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

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/all")
    public List<produit> getAllProduit(){
        return produitService.getAllProduit();
    }

    @PostMapping
    public produit createProduit(@RequestBody produit produit) {
        return produitService.createProduit(produit);
    }

}
