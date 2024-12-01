
package model;

public class Imovel {
    
    private int id;
    private double precoDiaria;
    private String descricao;
    private String tipo;

    public Imovel(int id, double precoDiaria, String descricao, String tipo) {
        this.id = id;
        this.precoDiaria = precoDiaria;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    

    
    
    
    
    
    
}
