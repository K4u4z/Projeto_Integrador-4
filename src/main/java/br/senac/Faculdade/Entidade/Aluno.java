package br.senac.Faculdade.Entidade;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity (name = "Alunos")
public class Aluno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "RA")
    int ra;

    @Column(name = "Nome")
    String nome;

    @Column(name ="Data de cadastro")
    Date dataCadastro;


    public Aluno() {
    }

    public Aluno(String nome, Date dataCadastro, boolean ativo) {
        super();
        this.ra = ra;
        this.nome = nome;
        this.dataCadastro = dataCadastro;
        this.ativo = ativo;

    }
    public Boolean isAtivo(){
        return ativo;
    }


    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }


    @Column (name = "ativo")
    private boolean ativo;


    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "ra=" + ra +
                ", nome='" + nome + '\'' +
                ", dataCadastro=" + dataCadastro +
                '}';
    }
}
