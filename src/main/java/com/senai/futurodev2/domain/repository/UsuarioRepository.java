package com.senai.futurodev2.domain.repository;

import org.springframework.stereotype.Repository;

import com.senai.futurodev2.domain.model.ClienteModel;
import com.senai.futurodev2.domain.model.EnderecoModel;
import com.senai.futurodev2.rest.dto.UsuarioDto;

@Repository
public class UsuarioRepository {

    public void salvarCliente(ClienteModel clienteModel) {
        var insertTable = "insert into cliente (nome, cpf) values ()";
        System.out.println("Cliente inserido com sucesso!" + clienteModel);
    }

    public void salvarEndereco(EnderecoModel enderecoModel) {
        var insertTable = "insert into endereco () values ()";
        System.out.println("Endereço inserido com sucesso!");
    }

    public UsuarioDto getUsuario(String cpf) {
        var selectClienteComEndereco = "select * from cliente inner join endereco ... where cpf = :cpf";
        UsuarioDto usuarioDtoRetornadoDoSql = new UsuarioDto();
        usuarioDtoRetornadoDoSql.setNome("Thiago vieira");
        usuarioDtoRetornadoDoSql.setCpf("12345678900");
        usuarioDtoRetornadoDoSql.setCep("8899900");
        usuarioDtoRetornadoDoSql.setCidade("São José");
        usuarioDtoRetornadoDoSql.setEstado("Santa Catarina");
        usuarioDtoRetornadoDoSql.setRua("Rua 123");
        return usuarioDtoRetornadoDoSql;
    }
}
