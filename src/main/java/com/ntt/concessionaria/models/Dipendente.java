package com.ntt.concessionaria.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

//import org.hibernate.annotations.ManyToAny;
//import org.hibernate.validator.constraints.ru.INN;
import org.springframework.lang.NonNull;


@Entity
public class Dipendente {
    //var
    @NonNull
    @Size(min=1)
    private String nome;
    
    @NonNull
    @Size(min=1)
    private String cognome;
    
    @NonNull
    @ManyToOne
    @JoinColumn(name="dipendente_id")
    private Concessionario concessionario;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private Double stipendio;
    
    @Min(18)
    private Integer età;
    
    public Dipendente(){}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public Concessionario getConcessionario() {
        return concessionario;
    }
    public void setConcessionario(Concessionario concessionario) {
        this.concessionario = concessionario;
    }
    public long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public double getStipendio() {
        return stipendio;
    }
    public void setStipendio(Double stipendio) {
        this.stipendio = stipendio;
    }
    public int getEtà() {
        return età;
    }
    public void setEtà(Integer età) {
        this.età = età;
    }

    

    
}
