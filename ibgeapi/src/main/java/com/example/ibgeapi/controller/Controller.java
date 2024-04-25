package com.example.ibgeapi.controller;

import com.example.ibgeapi.model.Entity;
import com.example.ibgeapi.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/IBGE")
class Controller {

    @Autowired
    private Service service;

    @GetMapping("obterTodos")
    public List<Entity> obterTodos() {return service.obterTodos();}
    @GetMapping("obterNoticias")
    public String obterNoticias() {return service.obterNoticias;};
    @GetMapping("obterReleases")
    public String obterReleases() {return service.obterReleases;};

    @PostMapping("/SalvarNoticias")
    public void salvarNoticias(){ service.salvarNoticias();}

    @PostMapping("/SalvarReleases")
    public void salvarReleases(){ service.salvarReleases();}

}
