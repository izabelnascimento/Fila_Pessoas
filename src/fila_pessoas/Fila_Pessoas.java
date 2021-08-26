package fila_pessoas;
import java.util.Scanner;

public class Fila_Pessoas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        FilaDinamica fd = new FilaDinamica<Pessoa>();
        FilaEstatica fe = new FilaEstatica<Pessoa>(5);
        int op1, op2, op3, numeroFila = 0;
        
        System.out.println("Você deseja utilizar fila:");
        System.out.println("1 - Dinâmica");
        System.out.println("2 - Estática");
        op1 = entrada.nextInt();
        
        if(op1==1){
            do{
                System.out.println(".............................................");
                System.out.println("Essas são as opções da fila:");
                System.out.println("1 - Inserir");
                System.out.println("2 - Excluir");
                System.out.println("3 - Consultar próximo");
                System.out.println("4 - Consultar tamanho");
                System.out.println("0 - Voltar");
                op2 = entrada.nextInt();
                System.out.println(".............................................");

                switch(op2){

                    case 1:
                        Pessoa p1 = new Pessoa();
                        numeroFila++;
                        p1.setId(numeroFila);
                        System.out.println("Id: " + p1.getId());
                        System.out.println("Nome: ");
                        p1.setNome(entrada.next());
                        fd.inserir(p1);
                        break;
                    case 2:
                        fd.remover();
                        if(fd.isVazia()){
                            System.out.println("Fila vazia!");
                        }else{
                            System.out.println("Removido da fila!");
                        }
                        break;
                    case 3:
                        System.out.println(fd.get());
                        break;
                    case 4:
                        System.out.println(fd.getTamanho());
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }

            }while(op2!=0);
        }else{
            do{
                System.out.println(".............................................");
                System.out.println("Essas são as opções da fila:");
                System.out.println("1 - Inserir");
                System.out.println("2 - Excluir");
                System.out.println("3 - Consultar próximo");
                System.out.println("4 - Está cheia?");
                System.out.println("0 - Voltar");
                op3 = entrada.nextInt();
                System.out.println(".............................................");

                switch(op3){

                    case 1:
                        Pessoa p1 = new Pessoa();
                        numeroFila++;
                        p1.setId(numeroFila);
                        System.out.println("Id: " + p1.getId());
                        System.out.println("Nome: ");
                        p1.setNome(entrada.next());
                        fe.inserir(p1);
                        break;
                    case 2:
                        fe.remover();
                        if(fd.isVazia()){
                            System.out.println("Fila vazia!");
                        }else{
                            System.out.println("Removido da fila!");
                        }
                        break;
                    case 3:
                        System.out.println(fe.get());
                        break;
                    case 4:
                        System.out.println(fe.isCheia());
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            }while(op3!=0);
        }
    }
}
