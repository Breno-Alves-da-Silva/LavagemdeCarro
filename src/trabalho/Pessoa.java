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
    private String plano;
    

    public Pessoa (String nome,String sobrenome, String sexo, String telefone, String dataNascimento, String endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        
     }
    
     public void addPlano(String planoU){
         this.plano = planoU;
             
  }
      public String todosOsDados(){
        return "Nome e Sobrenome: " + this.nome + " " + this.sobrenome ;
    }
}
