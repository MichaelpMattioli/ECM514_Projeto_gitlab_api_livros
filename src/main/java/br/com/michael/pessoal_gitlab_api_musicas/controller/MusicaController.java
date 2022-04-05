package br.com.michael.pessoal_gitlab_api_musicas.controller;

import br.com.michael.pessoal_gitlab_api_musicas.musicaService.MusicaService;
import br.com.michael.pessoal_gitlab_api_musicas.model.Musica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/musicas")

public class MusicaController {
    @Autowired
    private MusicaService musicaService;

    @PostMapping("/salvar")
    public void salvar (@RequestBody Musica musica){
        this.musicaService.salvar(musica);
    }

    @GetMapping
    public List<Musica> listar (){
        return this.musicaService.listar();
    }
}
