import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        //Entrando com as informações do cliente
        String nome = "Vitor";
        String tipoConta = "Conta Corrente";
        double saldo = 5000.00;

        System.out.println("******************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("\n******************");

        //Criação do menu interativo de opções
        int opcao = 0;

        String menu = """
                \n*** Digite a opção que você deseja acessar ***
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                \n Opção:
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            System.out.println("Você escolheu a opção " + opcao);
        }

    }
}