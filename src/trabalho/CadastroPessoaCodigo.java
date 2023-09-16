/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho;

/**
 *
 * @author Breno
 */
public class CadastroPessoaCodigo {
     private String nome;
    private String sobrenome;
    private String sexo;
    private String telefone;
    private String dataNascimento;
    private String endereco;
    private CadastroCarroCodigo carro;

    public CadastroPessoaCodigo (String sobrenome, String sexo, String telefone, String dataNascimento, String endereco, CadastroCarroCodigo carro) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.carro = carro;
     }
}
