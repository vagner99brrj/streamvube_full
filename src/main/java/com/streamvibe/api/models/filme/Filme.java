package com.streamvibe.api.models.filme;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String estudio;
    private double duracao;
    private String imagem;

    @Enumerated(EnumType.STRING)
    private Genero genero;

    private String diretor;
    private String elenco;
    private String sinopse;

    private Boolean ativo = true;

    public Filme (DadosCadastroFilme dados) {
        this.nome = dados.nome();
        this.estudio = dados.estudio();
        this.duracao = dados.duracao();
        this.imagem = dados.imagem();
        this.genero = dados.genero();
        this.diretor = dados.diretor();
        this.elenco = dados.elenco();
        this.sinopse = dados.sinopse();
        
        
        
    }

    public void excluirFilmeLogica() {
         this.ativo = false;
    }

    public void atualizarInformacoes(DadosAtualizacaoFilme dados){
        if(dados.nome()!=null){
            this.nome = dados.nome();
        }
        if(dados.estudio()!=null){
            this.estudio = dados.estudio();
        }
        if (dados.diretor()!=null){
            this.diretor = dados.diretor();
        }
    }

}
