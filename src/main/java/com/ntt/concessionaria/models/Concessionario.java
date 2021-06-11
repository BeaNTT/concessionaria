package com.ntt.concessionaria.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;
//import org.springframework.validation.annotation.Validated;

@Entity

public class Concessionario {
    //var
    @NonNull
    @Size(min=1)
    private String nome;
   
    @NonNull
    @Size(min=1)
    private String via;
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private Regione regione;
   
    @NonNull
    @Size(min=1)
    private String città;

    @OneToMany(mappedBy = "concessionario")
    private Set<Dipendente> listaDipendente;

    @OneToMany(mappedBy = "concessionario")
    public Set<Auto> listaAuto;


    public Set<Auto> getListaAuto() {
        return listaAuto;
    }

    public void setListaAuto(Set<Auto> auto) {
        this.listaAuto = auto;
    }

    public Set<Dipendente> getListaDipendente() {
        return listaDipendente;
    }

    public void setListaDipendente(Set<Dipendente> listaDipendente) {
        this.listaDipendente = listaDipendente;
    }

    public Concessionario(){}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getVia() {
        return via;
    }
    public void setVia(String via) {
        this.via = via;
    }
    public long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Regione getRegione() {
        return regione;
    }
    public void setRegione(Regione regione) {
        this.regione = regione;
    }
    public String getCittà() {
        return città;
    }
    public void setCittà(String città) {
        this.città = città;
    }

    
}
