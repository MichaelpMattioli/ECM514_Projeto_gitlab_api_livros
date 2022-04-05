package br.com.michael.pessoal_gitlab_api_musicas.model;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor

@AllArgsConstructor

@Getter
@Setter
@Entity
public class Musica {
    @Id
    @GeneratedValue

    private Long id;
    private String nome;
    private int avaliacao = 0;
}
