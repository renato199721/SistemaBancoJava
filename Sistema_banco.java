/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

public class Sistema_banco {

    
    public static void main(String[] args) {
       
        Scanner entradaInt = new Scanner (System.in);
        
        Cadastro cad = new Cadastro ();
        
        int num;
        System.out.println("Escolha seu tipo de conta ");
        System.out.println("(1) Credito, (2) Conta Poupança, (3)Conta Salário, (4)Conta Corrente ");
        num = entradaInt.nextInt();
        
        switch (num){
            
            case 1:
                Credito c = new Credito ();
                cad.cadastro(c);
                c.InformaDados1();
                break;
                
                case 2:
                Conta_Poupanca cp = new Conta_Poupanca ();
                cad.cadastro(cp);
                cp.InformaDados2();
                break;
                    
                    case 3:
                Conta_Salario cs = new Conta_Salario ();
                cad.cadastro(cs);
                cs.InformaDados3();
                break;
                        
                    case 4:
                Conta_Corrente cc = new Conta_Corrente ();
                        cad.cadastro(cc);
                        cc.InformaDados4();
            break;
            
            
            
            
        }
    }
    
}
