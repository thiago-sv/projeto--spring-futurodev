package com.senai.futurodev2.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.senai.futurodev2.domain.service.UsuarioService;
import com.senai.futurodev2.rest.dto.UsuarioDto;

import javax.websocket.server.PathParam;

@RestController
public class HelloWorldController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/helloworld")
    public String getHelloWorld() {
        return "Hello World";
    }

    @PostMapping("/usuario")
    public String salvarUsuario(@RequestBody UsuarioDto usuarioDto) {
        usuarioService.salvar(usuarioDto);
        return "Usuário salvo com sucesso!";
    }

    @GetMapping("/usuario/{cpf}")
    public ResponseEntity<UsuarioDto> buscarUsuario(@PathParam("cpf") String cpf) {
        UsuarioDto usuarioDtoLocalizadoPeloCpf = usuarioService.buscarUsuario(cpf);
        return new ResponseEntity<UsuarioDto>(usuarioDtoLocalizadoPeloCpf, HttpStatus.OK);
    }
}
