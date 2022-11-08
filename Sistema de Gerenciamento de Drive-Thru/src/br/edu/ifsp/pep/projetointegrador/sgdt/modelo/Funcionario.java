package br.edu.ifsp.pep.projetointegrador.sgdt.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "funcionario", uniqueConstraints = {
    @UniqueConstraint(
            name = "unique_cpf_rg_nome",
            columnNames = {"cpf", "rg", "nome"})
})
public class Funcionario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "cpf", nullable = false, length = 11)
    private String cpf;


    @Column(name = "Nome", length = 60, nullable = false)
    private String nome;

    @Column(name = "data_nascimento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;

    @Column(name = "cargo", nullable = false)
    private Cargo cargo;

    @Column(name = "estado_civil", nullable = false)
    private EstadoCivil estadoCivil;
    
    @OneToMany(mappedBy = "funcionario")
    private List<Caixa> listaResponsabilidadeCaixas;

    public enum Cargo {
        ATENDENTE, COZINHEIRO, GERENTE
    }

    public enum EstadoCivil {
        SOLTEIRO, CASADO, VIUVO, DIVORCIADO, UNIAO_ESTAVEL
    }

    // Código Gerado
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public List<Caixa> getListaResponsabilidadeCaixas() {
        return listaResponsabilidadeCaixas;
    }

    public void setListaResponsabilidadeCaixas(List<Caixa> listaResponsabilidadeCaixas) {
        this.listaResponsabilidadeCaixas = listaResponsabilidadeCaixas;
    }
}
