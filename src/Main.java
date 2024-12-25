import java.util.Locale;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Map<Integer, Usuario> usuarios = new HashMap<>();

        while (true) {
            System.out.println("");
            System.out.println("Digite uma opção:");
            System.out.println("1. Quero ser cliente");
            System.out.println("2. Já sou cliente");
            System.out.println("3. Consulta de saldo");
            System.out.println("4. Realizar saque ou depósito");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("");
                    System.out.println("Insira seu nome: ");
                    String nome = scanner.next();
                    System.out.println("Insira sua idade: ");
                    int idade = scanner.nextInt();
                    System.out.println("Insira sua cidade: ");
                    String cidade = scanner.next();
                    System.out.println("Crie um código para login (contendo 6 digitos númericos): ");
                    int idCliente = scanner.nextInt();
                    System.out.println("Insira seu saldo inicial: ");
                    double SaldoCliente = scanner.nextDouble();

                    Usuario usuario = new Usuario(nome, idade, cidade, idCliente, SaldoCliente);
                    usuarios.put(idCliente, usuario);

                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Usuário cadastrado com sucesso!");
                    System.out.println("--------------------------------------------------------------");
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("Digite o seu ID para exibir as informações: ");
                    int idConsulta = scanner.nextInt();

                    if (usuarios.containsKey(idConsulta)) {
                        usuarios.get(idConsulta).exibirInformacoes();
                    } else {
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("Usuário não encontrado.");
                        System.out.println("--------------------------------------------------------------");
                    }
                    break;

                case 3:
                    System.out.println("Confirme seu ID para consultar o saldo disponível: ");
                    int idSaldo = scanner.nextInt();

                    if (usuarios.containsKey(idSaldo)) {
                        Usuario usuarioSaldo = usuarios.get(idSaldo);
                        System.out.println("");
                        System.out.println("Saldo atual: R$ " + usuarioSaldo.getSaldoCliente());

                    } else {
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("Usuário não encontrado.");
                        System.out.println("--------------------------------------------------------------");
                    }
                    break;

                case 4:
                    System.out.println("");
                    System.out.println("Confirme seu ID para realizar saque ou depósito: ");
                    int idOperacao2 = scanner.nextInt();

                    if (usuarios.containsKey(idOperacao2)) {
                        Usuario usuarioOperacao = usuarios.get(idOperacao2);

                        System.out.println("");
                        System.out.println("Escolha a operação:");
                        System.out.println("1. Saque");
                        System.out.println("2. Depósito");
                        int operacao = scanner.nextInt();

                        switch (operacao) {
                            case 1:
                                System.out.println("");
                                System.out.println("Digite o valor para saque: ");
                                double valorSaque = scanner.nextDouble();
                                usuarioOperacao.saque(valorSaque);
                                break;

                            case 2:
                                System.out.println("");
                                System.out.println("Digite o valor para depósito: ");
                                double valorDeposito = scanner.nextDouble();
                                usuarioOperacao.deposito(valorDeposito);
                                break;

                            default:
                                System.out.println("--------------------------------------------------------------");
                                System.out.println("Opção inválida.");
                                System.out.println("--------------------------------------------------------------");
                        }
                    } else {
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("Usuário não encontrado.");
                        System.out.println("--------------------------------------------------------------");
                    }
                    break;

                case 5:
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Saindo...");
                    System.out.println("--------------------------------------------------------------");
                    return;

                default:
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Opção inválida.");
                    System.out.println("--------------------------------------------------------------");

            };


        }
    }
}