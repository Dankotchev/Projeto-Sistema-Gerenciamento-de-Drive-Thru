package br.edu.ifsp.pep.projetointegrador.sgdt.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "caixa")
public class Caixa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_caixa")
    private Integer id;

    @Temporal(TemporalType.DATE)
    @Column(name = "data", nullable = false)
    private Date dataCaixa;

    @JoinColumn(name = "funcionario_id", nullable = false)
    @ManyToOne()
    private Funcionario funcionario;

    @Column(name = "estado", nullable = false)
    @Enumerated(EnumType.STRING)
    private EstadoCaixa estadoCaixa;

    @Column(name = "abertura", nullable = false, precision = 10, scale = 2)
    private BigDecimal abertura;

    @Column(name = "entradas", precision = 10, scale = 2)
    private BigDecimal entradas;

    @Column(name = "saidas", precision = 10, scale = 2)
    private BigDecimal saidas;

    @Column(name = "status_caixa", nullable = false)
    private boolean status;

    public enum EstadoCaixa {
        ABERTO, FECHADO
    }

    //  Código Gerado
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataCaixa() {
        return dataCaixa;
    }

    public void setDataCaixa(Date dataCaixa) {
        this.dataCaixa = dataCaixa;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public EstadoCaixa getEstadoCaixa() {
        return estadoCaixa;
    }

    public void setEstadoCaixa(EstadoCaixa estadoCaixa) {
        this.estadoCaixa = estadoCaixa;
    }

    public BigDecimal getAbertura() {
        return abertura;
    }

    public void setAbertura(BigDecimal abertura) {
        this.abertura = abertura;
    }

    public BigDecimal getEntradas() {
        return entradas;
    }

    public void setEntradas(BigDecimal entradas) {
        this.entradas = entradas;
    }

    public BigDecimal getSaidas() {
        return saidas;
    }

    public void setSaidas(BigDecimal saidas) {
        this.saidas = saidas;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Caixa(Date dataCaixa, Funcionario funcionario) {
        this.dataCaixa = dataCaixa;
        this.funcionario = funcionario;
        this.estadoCaixa = Caixa.EstadoCaixa.ABERTO;
        this.abertura = new BigDecimal(0);
        this.entradas = new BigDecimal(0);
        this.saidas = new BigDecimal(0);
        this.status = true;
    }

    public Caixa() {
    }

    @Override
    public String toString() {
        return "Caixa{" + "id=" + id + ", dataCaixa=" + dataCaixa + ", funcionario=" + funcionario + ", estadoCaixa=" + estadoCaixa + ", abertura=" + abertura + ", entradas=" + entradas + ", saidas=" + saidas + ", status=" + status + '}';
    }
}
