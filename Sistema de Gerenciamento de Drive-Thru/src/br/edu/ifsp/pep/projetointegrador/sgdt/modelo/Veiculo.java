package br.edu.ifsp.pep.projetointegrador.sgdt.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "veiculo", uniqueConstraints = {
    @UniqueConstraint(
            name = "unique_id_placa",
            columnNames = {"id", "placa"})
})
@NamedQueries(value = {
    @NamedQuery(name = "Veiculo.buscarTodos",
            query = "SELECT v FROM Veiculo v"),
    @NamedQuery(name = "Veiculo.buscarPorPlaca",
            query = "SELECT v FROM Veiculo v WHERE v.placa = :placa")
})
public class Veiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "placa", length = 8)
    private String placa;

    @Column(name = "status", nullable = false)
    private boolean status;

    @OneToMany(mappedBy = "veiculo")
    private List<Pedido> listaPedidos;

    // Código Gerado
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(List<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public Veiculo(String placa) {
        this.placa = placa;
        this.status = true;
    }

    public Veiculo() {
    }
}
