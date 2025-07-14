package com.streamvibe.api.models.usuario;

import com.streamvibe.api.models.enedreco.DadosCadastroEndereco;
//import com.streamvibe.api.models.enedreco.Endereco;

public record DadosCadastroUsuario(
    String nome,
    String dataNascimento,
    String email,
    String senha,
    String cpf,
    DadosCadastroEndereco endereco
) {
    
}