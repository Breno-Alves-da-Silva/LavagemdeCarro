/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho;

/**
 *
 * @author Breno
 */
public class Pessoa {
    private String nome;
    private String sobrenome;
    private String sexo;
    private String telefone;
    private String dataNascimento;
    private String endereco;
    public String plano ;
    

    public Pessoa (String nome,String sobrenome, String sexo, String telefone, String dataNascimento, String endereco, String plano) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.plano = plano;
        
     }
     public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getPlano() {
        return plano;
    }
    
     public void setPlano(String novoPlano) {
    this.plano = novoPlano;
}

}
