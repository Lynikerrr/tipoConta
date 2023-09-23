import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        String cliente = "";
        String tipoConta = "";
        double saldo = 0;
        int option = 0;
        String menu = """
                ** Digite sua opção **
                1 - Consultar emprestimo
                2 - Transferir valor
                3 - Alterar tipo de conta
                4 - Sair
                """;

        Scanner entrada = new Scanner(System.in);

        System.out.println("(Nomes disponiveis para teste: Ana, Marcos e Sofia)");
        System.out.println("***************************************************************");
        System.out.println("Bem vindo ao LinkBank! Digite o seu nome para acessar a conta: ");
        System.out.println("***************************************************************");
        cliente = entrada.nextLine();

        switch (cliente) {
            case "Marcos":
                tipoConta = "Conta Poupança";
                saldo = 564200;
                System.out.println("Olá Sr. Marcos, sua " + tipoConta + " tem um saldo total de R$: " + saldo);
                break;
            case "Ana":
                tipoConta = "Conta Corrente";
                saldo = 998330;
                System.out.println("Olá Srta. Ana, sua " + tipoConta + " tem um saldo total de R$: " + saldo);
                break;
            case "Sofia":
                tipoConta = "Conta está BLOQUEADA";
                saldo = -500;
                System.out.println("Ola Srta. Sofia, sua " + tipoConta + " e tem um saldo total de R$: " + saldo);
                break;
            default:
                System.out.println("Você não é nosso cliente ainda? Entre no nosso site e cadastre-se");
        }
        while (option != 4) {
            System.out.println(menu);
            option = entrada.nextInt();
            entrada.nextLine();
            if (option == 1) {
                System.out.println("Aguarde...... Consultando propostas de empréstimo......");
                if (saldo > 200000) {
                    System.out.println("Temos um emprestimo de R$500.000,00 liberado para você");
                } else {
                    System.out.println("Nenhuma proposta de emprestimo liberada :(");
                }
            } else if (option == 2) {
                System.out.println("Insira o valor que deseja transferir: ");
                double transfer = entrada.nextDouble();
                entrada.nextLine();
                System.out.println("Digite o nome do cliente que deseja transferir: ");
                String cTransfer = entrada.nextLine();
                if (transfer < saldo) {
                    System.out.println("Você transferiu R$ " + transfer + " para o cliente " + cTransfer);
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            } else if (option == 3) {
                System.out.println("Para qual tipo deseja alterar sua conta? (Corrente ou Poupança)");
                String tradeC = entrada.nextLine();
                if (tradeC.equalsIgnoreCase("Corrente") || tradeC.equalsIgnoreCase("Poupança")) {
                    tipoConta = tradeC;
                    System.out.println("Parabéns! Sua conta agora é do tipo: " + tradeC);
                } else {
                    System.out.println("Tipo de conta Invalido!");
                }
            } else if (option != 4) {
                System.out.println("Opção invalida");

            }

        }
    }

}

