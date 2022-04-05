package br.com.michael.pessoal_gitlab_api_musicas.musicaService;

import br.com.michael.pessoal_gitlab_api_musicas.model.Musica;
import br.com.michael.pessoal_gitlab_api_musicas.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MusicaService {
    //injeção de dependência
    @Autowired
    private MusicaRepository musicaRepository;
    //acessa a base usando o musicaRepository
    //save é um método que foi implementado automaticamente
    //ele faz um insert numa base relacional
    public void salvar (Musica musica){
        this.musicaRepository.save(musica);
    }
    //findAll é um método que foi implementado automaticamente
    //ele faz um SELECT * numa base relacional
    public List<Musica> listar (){
        return this.musicaRepository.findAll();
    }

}
