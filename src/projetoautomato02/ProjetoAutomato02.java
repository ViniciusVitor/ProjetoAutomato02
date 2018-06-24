/*
{W|W contem a cadeia aba ou um númerpo par de a's}
 */
package projetoautomato02;

import java.util.Scanner;

/**
 *
 * @author Vinícius
 */
public class ProjetoAutomato02 {

    char cadeia[];   
    int contaA;    
    boolean resposta;

    public static void main(String[] args) {
        ProjetoAutomato02 auto = new ProjetoAutomato02();
        String subCadeia;
        Scanner input = new Scanner(System.in);
        System.out.println("Coloque sua cadeia: ");
        subCadeia = input.nextLine();
        subCadeia = subCadeia.toLowerCase();
        auto.cadeia = subCadeia.toCharArray();

        if (subCadeia.equals("aba")) {
            auto.CadeiaAceita();

        } else if(subCadeia.equals("")){
            auto.CadeiaAceita();
        }else {
            auto.Automato();
        }
    }

    public void Automato() {
        ProjetoAutomato02 auto = new ProjetoAutomato02();       
        contaA = 0;

       
        for (int i = 0; i < cadeia.length; i++) {
            if (cadeia[i] == 'a') {
                contaA++;
                resposta = true;                
                
            } else if (cadeia[i] == 'b') {
                resposta = true;
                
            } else {                          
                resposta = false;
                break;
                
            }
        }
        if (resposta == true && contaA % 2 == 0) {
            auto.CadeiaAceita();
        }else{
            auto.CadeiaNaoAceita();
        }

    }

    public void CadeiaAceita() {
        System.out.println("Cadeia aceita!");
    }
     public void CadeiaNaoAceita() {
        System.out.println("Cadeia NÃO aceita!");
    }

}
