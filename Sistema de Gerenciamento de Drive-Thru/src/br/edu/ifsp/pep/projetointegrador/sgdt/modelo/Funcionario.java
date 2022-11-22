package br.edu.ifsp.pep.projetointegrador.sgdt.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "funcionario", uniqueConstraints = {
    @UniqueConstraint(
            name = "uniqueCpfNome",
            columnNames = {"cpf", "nome_funcionario"})
})
@NamedQueries(value = {
    @NamedQuery(name = "Funcionario.buscarPorNome",
            query = "SELECT f FROM Funcionario f WHERE f.nome LIKE :nome AND f.status = true"),
    @NamedQuery(name = "Funcionario.buscarPorCPF",
            query = "SELECT f FROM Funcionario f WHERE f.cpf = :cpf AND f.status = true")
})
public class Funcionario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_funcionario")
    private Integer id;

    @Column(name = "cpf", nullable = false, length = 14)
    private String cpf;
    
    @Column(name = "senha", length = 16, nullable = false)
    private String senha;

    @Column(name = "nome_funcionario", length = 60, nullable = false)
    private String nome;

    @Column(name = "data_nascimento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;

    @Column(name = "cargo", nullable = false)
    @Enumerated(EnumType.STRING)
    private Cargo cargo;

    @Column(name = "estado_civil", nullable = false)
    @Enumerated(EnumType.STRING)
    private EstadoCivil estadoCivil;

    @Column(name = "status_funcionario", nullable = false)
    private boolean status;

    @OneToMany(mappedBy = "funcionario", cascade = {CascadeType.ALL, CascadeType.PERSIST})
    private List<Caixa> listaResponsabilidadeCaixas;

    public enum Cargo {
        ATENDENTE("Atendente"), COZINHEIRO("Cozinheiro"), GERENTE("Gerente");

        public final String cargoFuncionario;

        Cargo(String cargoFunc) {
            cargoFuncionario = cargoFunc;
        }
    }

    public enum EstadoCivil {
        SOLTEIRO("Solteiro"), CASADO("Casado"), VIUVO("Viúvo"),
        DIVORCIADO("Divorciado"), UNIAO_ESTAVEL("União Estável");

        public final String estadoCivilFuncionario;

        private EstadoCivil(String estadoCFunc) {
            this.estadoCivilFuncionario = estadoCFunc;
        }
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

//    public List<Caixa> getListaResponsabilidadeCaixas() {
//        return listaResponsabilidadeCaixas;
//    }
//
//    public void setListaResponsabilidadeCaixas(List<Caixa> listaResponsabilidadeCaixas) {
//        this.listaResponsabilidadeCaixas = listaResponsabilidadeCaixas;
//    }

    public Funcionario(String cpf, String nome, String senha, Date dataNascimento, Cargo cargo, EstadoCivil estadoCivil) {
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.cargo = cargo;
        this.estadoCivil = estadoCivil;
        this.status = true;
    }

    public Funcionario() {
    }
}
