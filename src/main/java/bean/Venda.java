
package bean;

import java.sql.Date;


public class Venda {
    private int id_venda;
    private String dataVenda ;
    private double desconto, valorTotal;
    private int id_cliente;
    private int id_funcionario;

    public Venda(int id_venda, String dataVenda, double desconto, double valorTotal, int id_cliente, int id_funcionario) {
        this.id_venda = id_venda;
        this.dataVenda = dataVenda;
        this.desconto = desconto;
        this.valorTotal = valorTotal;
        this.id_cliente = id_cliente;
        this.id_funcionario = id_funcionario;
    }
    public Venda() {
        }

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

   public void setValorTotal(double valorTotal) {
    this.valorTotal = valorTotal;
}

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }
    
    
}
