package br.com.eteczonaleste.entity;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "entregas")
public class Entregas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JoinColumn(name = "ra")
    private Alunos id_aluno;
    
    @PrimaryKeyJoinColumn(name = "id")
    private Funcionarios id_funcionarios;

    
    @Temporal(TemporalType.DATE)
    private Date data_retirada;

    @Temporal(TemporalType.TIME)
    private Date hora_retirada;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Alunos getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(Alunos id_aluno) {
        this.id_aluno = id_aluno;
    }

    public Funcionarios getId_funcionarios() {
        return id_funcionarios;
    }

    public void setId_funcionarios(Funcionarios id_funcionarios) {
        this.id_funcionarios = id_funcionarios;
    }


    public Date getData_retirada() {
        return data_retirada;
    }

    public void setData_retirada(Date data_retirada) {
        this.data_retirada = data_retirada;
    }

    public Date getHora_retirada() {
        return hora_retirada;
    }

    public void setHora_retirada(Date hora_retirada) {
        this.hora_retirada = hora_retirada;
    }

}
