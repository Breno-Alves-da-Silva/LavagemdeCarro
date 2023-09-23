/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho;

/**
 *
 * @author Breno
 */
public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String placa;
    private String[] agenda;
 

    public Carro ( String marca,String modelo, int ano, String cor, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
    }
    
    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }
    public void setAgendaUm(String agenda){
       this.agenda[0]= agenda;
    }
    public void setAgendaDois(String agenda){
       this.agenda[1]= agenda;
    }
    public void setAgendaTres(String agenda){
       this.agenda[2]= agenda;
    }
    public void setAgendaQuatro(String agenda){
       this.agenda[3]= agenda;
    }
    
}
