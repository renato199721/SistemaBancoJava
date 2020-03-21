/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author 8556
 */
public class Pessoa {
   
    private String nome;
    private String endereço;
    private int cep;
    private int cpf;
    private int rg;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereço, int cep, int cpf, int rg) {
        this.nome = nome;
        this.endereço = endereço;
        this.cep = cep;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }
     public void InformaDados () {
     System.out.println("O seu nome é: "+getNome ());
        System.out.println("O seu endereço é: "+getEndereço ());
        System.out.println("O seu cep é : "+getCep());
        System.out.println("O seu cpf é: "+getCpf ());
        System.out.println("O seu rg é : "+getRg());
     }
            
            
    
}
