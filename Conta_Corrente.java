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
public class Conta_Corrente extends Pessoa {
    private int numero_da_conta;
    private int senha;
    private int saldo;

    public Conta_Corrente() {
    }

    public Conta_Corrente(int num_da_conta, int senha, int saldo) {
        this.numero_da_conta = num_da_conta;
        this.senha = senha;
        this.saldo = saldo;
    }

    public int getNumero_da_conta() {
        return numero_da_conta;
    }

    public void setNumero_da_conta(int num_da_conta) {
        this.numero_da_conta = num_da_conta;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public void InformaDados4 (){
    System.out.println("O seu nome é: "+getNome ());
        System.out.println("O seu endereço é: "+getEndereço ());
        System.out.println("O seu cep é : "+getCep());
        System.out.println("O seu cpf é: "+getCpf ());
        System.out.println("O seu rg é : "+getRg());
        System.out.println("O seu numero de conta é: "+getNumero_da_conta());
        System.out.println("O seu saldo é : R$ 0.69"+getSaldo());
    }
}
