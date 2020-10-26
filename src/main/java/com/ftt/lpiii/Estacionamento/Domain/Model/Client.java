package com.ftt.lpiii.Estacionamento.Domain.Model;

import com.ftt.lpiii.Estacionamento.Domain.Shared.Entity;

@javax.persistence.Entity
public class Client extends Entity {

    //PROPERTIES
    private String name;
    private String cpf;
    private String telefone;
    private String email;

    //GETTERS
    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
