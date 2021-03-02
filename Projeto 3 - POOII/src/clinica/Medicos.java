
package clinica;

//IMPORTANDO A CLASSE SCANNER
import java.util.Scanner;

//CLASSE MEDICOS
public class Medicos {
    
    //METODO PRINCIPAL
    public static void main(String[] args) {
        
        //ATRIBUIÇÃO DE VARIAVEIS
        String nome_medicos;
        String crm_medicos;
        String especialidade_medicos;
        int admissao_medicos;
        double salario_medicos;
        double reajuste_medicos = 0;
        int controle;
        
        // MÉTODO DE CONDIÇÂO PARA INICAR O BOLOCO DE ENTRADA DE DADOS
        Scanner a = new Scanner (System.in);
        System.out.print("SEJA BEM VINDO AO SISTEMA DE GESTÃO DE MÉDICOS" + "\n" +
               "Digite 1 para iniciar o sistema: ");
        controle = a.nextInt();
        
        if (controle == 1) {
            
            //ENTRADA DE DADOS DE INFORMÇÕES SIMPLES DO MÉDICOS
            Scanner ler = new Scanner (System.in);
            System.out.print("Digite o nome do Médico(a): ");
            nome_medicos = ler.nextLine();
            System.out.print("Digite o crm do Médico(a): ");
            crm_medicos = ler.nextLine();
            System.out.print("Digite a especialidade do Médico(a): ");
            especialidade_medicos = ler.nextLine();
            System.out.print("Digite o ano de admissão do Médico(a): ");
            admissao_medicos = ler.nextInt();
            System.out.print("Digite o salário do Médico(a): ");
            salario_medicos = ler.nextDouble();

            
            // ESTRUTURA DE CONDIÇÃO CASO O VALOR DO SALÁRIO FOR NEGATIVO
            while (salario_medicos<0){

               System.out.print("Valor inválido, "
                       + "Digite novamente o salário do Médico(a): ");
               salario_medicos = ler.nextDouble(); 


            }

            //ESTRUTURA DE CONDIÇÃO PARA O REAJUSTE SALARIAL DO MÉDICO  
            if (salario_medicos>=2000){

                reajuste_medicos = salario_medicos * 1.2;


            }

            else if(salario_medicos>=1000 && salario_medicos<2000){

                 reajuste_medicos = salario_medicos * 1.1;

            }

            else if (salario_medicos>0 && salario_medicos<1000){

                reajuste_medicos = salario_medicos * 1.05;

            }

            else{

               reajuste_medicos = salario_medicos;

            }



            //SAIDA DE DADOS MOSTRANDO QUAIS DADOS FORAM ADICIONADOS OU ATUALIZADOS
            System.out.println("Médico(a): " + nome_medicos + "\n" +
                               "CRM: " + crm_medicos + "\n" +
                               "Especialidade: " + especialidade_medicos + "\n" +
                               "Ano de Admissão: " + admissao_medicos +"\n" +
                                "Salário :" + salario_medicos + "\n" +
                                "Reajuste Salarial: " + reajuste_medicos);

            
            // ENCERRAMENTO DO PROGRAMA CASO O NUMERO 1 NÃO SEJA DIGITADO
        } else {
            
            System.exit(0);
            
        }
        
        
        
       
    }
    
}
