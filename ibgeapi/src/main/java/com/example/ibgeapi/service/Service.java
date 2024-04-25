package com.example.ibgeapi.service;

import com.example.ibgeapi.model.Entity;
import com.example.ibgeapi.repository.IbgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
public class Service {



    @Autowired
    private IbgeRepository ibgeRepository;

    public String obterTodos(){
        String todos = "";
        String apiUrl = "https://servicodados.ibge.gov.br/api/v3/noticias";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            todos = responseEntity.getBody();
        } else {
            todos = "Falha ao obter todos" + responseEntity.getStatusCode();
        }
        return todos;

    };
    public String obterNoticias(){
        String noticias = "";
        String apiUrl = "https://servicodados.ibge.gov.br/api/v3/noticias/?tipo=noticia";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            noticias = responseEntity.getBody();
        } else {
            noticias = "Falha as noticias" + responseEntity.getStatusCode();
        }
        return noticias;

    };

    public String obterReleases(){
        String releases = "";
        String apiUrl = "https://servicodados.ibge.gov.br/api/v3/noticias/?tipo=release";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            releases = responseEntity.getBody();
        } else {
            releases = "Falha as noticias" + responseEntity.getStatusCode();
        }
        return releases;
    };

    public void salvarReleases(){
        Entity climaVO = this.salvarReleases();
        Entity Entity = this.salvarReleases(climaVO);
        this..save(Entity);
    }

    public void salvarNoticias(){
        Entity Entity = this.salvarNoticias();
        Entity Entity = this.salvarNoticias(Entity);
        this.Entity.save(Entity);
    }
}
