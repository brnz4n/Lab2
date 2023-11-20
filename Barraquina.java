package lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class Barraquina {

    private Scanner scanner;
    private ArrayList<VendaCQ> listaVendas;

    public Barraquina() {
        System.out.println("Bem-vindo à barraquinha de técnicas!\n\n");
        scanner = new Scanner(System.in);
        listaVendas = new ArrayList<>();
        executarMenuOperacoes();
    }

    private void executarMenuOperacoes() {
        int opcao;
        Aluno comprador = null;
        CachorroQuente cachorroQuenteEscolhido;
        VendaCQ venda = null;

        do {
            opcao = obterOpcaoMenu();
            switch (opcao) {
                case 1:
                    comprador = registrarAluno();
                    venda = new VendaCQ(comprador);
                    break;
                case 2:
                    String tipoQueijo = escolherTipoQueijo();
                    cachorroQuenteEscolhido = escolherCachorroQuente(tipoQueijo);
                    
                    venda.realizarVenda(cachorroQuenteEscolhido);
                    
                    listaVendas.add(venda);
                    break;
                default:
                    break;
            }

        } while (opcao != -1);
        System.out.println("Até mais!");
    }

    private int obterOpcaoMenu() {
        System.out.println("Escolha uma opção para registrar a venda ou digite -1 para sair!");
        System.out.println("1: Informar os dados do aluno comprador");
        System.out.println("2: Escolher cachorro quente");
        return scanner.nextInt();
    }

    private String escolherTipoQueijo() {
        System.out.println("Escolha a opção de queijo: [1 - Mussarela, 2 - Prato, 3 - Parmesão, 4 - Coalho]");
        int opcaoQueijo = scanner.nextInt();
        String tipoQueijo = null;

        switch (opcaoQueijo) {
            case 1:
                tipoQueijo = "Mussarela";
                break;
            case 2:
                tipoQueijo = "Prato";
                break;
            case 3:
                tipoQueijo = "Parmesão";
                break;
            case 4:
                tipoQueijo = "Coalho";
                break;
            default:
                break;
        }
        return tipoQueijo;
    }

    private CachorroQuente escolherCachorroQuente(String tipoQueijo) {
        System.out.println("\nEscolha a opção de cachorro quente: [1 - Salsicha, 2 - Linguiça, 3 - Frango, 4 - Bacon]");
        int opcaoCachorroQuente = scanner.nextInt();
        CachorroQuente cachorroQuente = null;
        
        switch (opcaoCachorroQuente) {
            case 1:
                cachorroQuente = new Salsicha(tipoQueijo);
                break;
            case 2:
                cachorroQuente = new Linguica(tipoQueijo);
                break;
            case 3:
                cachorroQuente = new Frango(tipoQueijo);
                break;
            case 4:
                cachorroQuente = new Bacon(tipoQueijo);
                break;
            default:
                break;
        }
        return cachorroQuente;
    }

    private Aluno registrarAluno() {
        System.out.print("\nNome: ");
        String nome = scanner.next();
        System.out.print("\nMatrícula: ");
        int matricula = scanner.nextInt();
        return new Aluno(nome, matricula);
    }
}
