package com.muller.futurodev2.domain.model;

public class ClienteModel {
    private String nome;
    private String cpf;
    private String statusCliente;

    public String getStatusCliente() {
        return statusCliente;
    }

    public void setStatusCliente(String statusCliente) {
        this.statusCliente = statusCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    @Override
    public String toString() {
        return "ClienteModel{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", statusCliente='" + statusCliente + '\'' +
                '}';
    }
}
