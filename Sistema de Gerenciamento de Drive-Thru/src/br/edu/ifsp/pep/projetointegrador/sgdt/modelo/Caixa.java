package br.edu.ifsp.pep.projetointegrador.sgdt.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
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
    @Column(name = "id")
    private Integer id;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "data_caixa", nullable = false)
    private Date dataCaixa;
    
    @JoinColumn(name = "funcionario", nullable = false)
    @ManyToOne()
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;
    
    @Column(name = "estado_caixa", nullable = false)
    private EstadoCaixa estadoCaixa;
    
    @Column(name = "abertura", nullable = false, precision = 10, scale = 2)
    private BigDecimal abertura;
    
    @Column(name = "entradas", precision = 10, scale = 2)
    private BigDecimal entradas;
    
    @Column(name = "saidas", precision = 10, scale = 2)
    private BigDecimal saidas;
    
    public enum EstadoCaixa{
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
}
