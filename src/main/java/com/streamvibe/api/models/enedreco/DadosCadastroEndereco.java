package com.streamvibe.api.models.enedreco; 

public record DadosCadastroEndereco(
    String rua,
    String numero,
    String bairro,
    String cep,
    String cidade,
    String complemento) {
    
}
