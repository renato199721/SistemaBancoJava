/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;
        
public class Cadastro {

    
    public void cadastro (Credito c){
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        c.setNome(nome);
        
        System.out.println("Digite seu endereço: ");
        String endereco = entrada.nextLine ();
        c.setEndereço(endereco);
        
        System.out.println("Digite seu cep: ");
        int cep = entrada.nextInt ();
        c.setCep(cep);
        
        System.out.println("Digite seu Cpf: ");
        int cpf = entrada.nextInt ();
        c.setCpf(cpf);
        
        System.out.println("Digite seu Rg: ");
        int rg = entrada.nextInt ();
        c.setRg(rg);
        
        System.out.println("Digite seu numero de conta: ");
        int numero_da_conta = entrada.nextInt();
        c.setNumero_da_conta(numero_da_conta);
        
        System.out.println("Digite sua senha : ");
        int senha = entrada.nextInt ();
        c.setSenha(senha);
        
    }

public void cadastro (Conta_Poupanca cp){
    
    Scanner entrada = new Scanner (System.in);
            
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        cp.setNome(nome);
        
        System.out.println("Digite seu endereço: ");
        String endereco = entrada.nextLine ();
        cp.setEndereço(endereco);
        
        System.out.println("Digite seu cep: ");
        int cep = entrada.nextInt ();
        cp.setCep(cep);
        
        System.out.println("Digite seu Cpf: ");
        int cpf = entrada.nextInt ();
        cp.setCpf(cpf);
        
        System.out.println("Digite seu Rg: ");
        int rg = entrada.nextInt ();
        cp.setRg(rg);
        
        System.out.println("Digite seu numero de conta: ");
        int numero_da_conta = entrada.nextInt();
        cp.setNumero_da_conta(numero_da_conta);
        
        System.out.println("Digite sua senha : ");
        int senha = entrada.nextInt ();
        cp.setSenha(senha);
}       
 public void cadastro (Conta_Salario cs){
     
     Scanner entrada = new Scanner (System.in);
     
             
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        cs.setNome(nome);
        
        System.out.println("Digite seu endereço: ");
        String endereco = entrada.nextLine ();
        cs.setEndereço(endereco);
        
        System.out.println("Digite seu cep: ");
        int cep = entrada.nextInt ();
        cs.setCep(cep);
        
        System.out.println("Digite seu Cpf: ");
        int cpf = entrada.nextInt ();
        cs.setCpf(cpf);
        
        System.out.println("Digite seu Rg: ");
        int rg = entrada.nextInt ();
        cs.setRg(rg);
        
        System.out.println("Digite seu numero de conta: ");
        int numero_da_conta = entrada.nextInt();
        cs.setNumero_da_conta(numero_da_conta);
        
        System.out.println("Digite sua senha : ");
        int senha = entrada.nextInt ();
        cs.setSenha(senha);
        
 }
 
 public void cadastro (Conta_Corrente cc) {
     
     Scanner entrada = new Scanner (System.in);
     
             
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        cc.setNome(nome);
        
        System.out.println("Digite seu endereço: ");
        String endereco = entrada.nextLine ();
        cc.setEndereço(endereco);
        
        System.out.println("Digite seu cep: ");
        int cep = entrada.nextInt ();
        cc.setCep(cep);
        
        System.out.println("Digite seu Cpf: ");
        int cpf = entrada.nextInt ();
        cc.setCpf(cpf);
        
        System.out.println("Digite seu Rg: ");
        int rg = entrada.nextInt ();
        cc.setRg(rg);
        
        System.out.println("Digite seu numero de conta: ");
        int numero_da_conta = entrada.nextInt();
        cc.setNumero_da_conta(numero_da_conta);
        
        System.out.println("Digite sua senha : ");
        int senha = entrada.nextInt ();
        cc.setSenha(senha);
        
 
 
 
 
 
 
 }
        
 
 
 }




            
        


