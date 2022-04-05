package br.com.michael.pessoal_gitlab_api_musicas.repository;

import br.com.michael.pessoal_gitlab_api_musicas.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicaRepository  extends JpaRepository <Musica, Long> {
}
