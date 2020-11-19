package com.ftt.lpiii.Estacionamento.Domain.Model;

import com.ftt.lpiii.Estacionamento.Domain.Shared.Entity;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@javax.persistence.Entity
public class Client extends Entity {

    //PROPERTIES
    private String name;
    private String cpf;
    private String telefone;
    private String email;

    @OneToMany(mappedBy = "client",fetch = FetchType.EAGER)
    @Column(insertable=false, updatable=false)
    private List<Occupation> occupation;

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

    public List<Occupation> getOccupation() {
        return occupation;
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

    public void setOccupation(List<Occupation> occupation) {
        this.occupation = occupation;
    }
}
