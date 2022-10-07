package com.muller.futurodev2.domain.service;

import com.muller.futurodev2.domain.model.ClienteModel;
import com.muller.futurodev2.domain.model.EnderecoModel;
import com.muller.futurodev2.domain.repository.UsuarioRepository;
import com.muller.futurodev2.rest.dto.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public void salvar(UsuarioDto usuarioDto) {
        ClienteModel clienteModel = new ClienteModel();
        clienteModel.setCpf(usuarioDto.getCpf());
        clienteModel.setNome(usuarioDto.getNome());
        String statusDoCliente = statusDoClienteNoSerasa(usuarioDto.getCpf());
        clienteModel.setStatusCliente(statusDoCliente);
        usuarioRepository.salvarCliente(clienteModel);

        EnderecoModel enderecoModel = new EnderecoModel();
        enderecoModel.setCep(usuarioDto.getCep());
        enderecoModel.setCidade(usuarioDto.getCidade());
        enderecoModel.setEstado(usuarioDto.getEstado());
        enderecoModel.setRua(usuarioDto.getRua());
        usuarioRepository.salvarEndereco(enderecoModel);
        System.out.println("Cliente e endereço salvo com sucesso!");
    }

    public UsuarioDto buscarUsuario(String cpf) {
        return usuarioRepository.getUsuario(cpf);
    }

    private String statusDoClienteNoSerasa(String cpf) {
        // requisição para a API do Serasa;
        return "BOM";
    }
}
