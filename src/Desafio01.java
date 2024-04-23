import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        String nome = "Jenifer Herrera Said";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;

        System.out.println("*********************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*********************************");

        String menu = """               
                
                Operações
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:""";

        Scanner banco = new Scanner (System.in);

        while (opcao !=4) {
            System.out.println(menu);
            opcao = banco.nextInt();
            if (opcao == 1){
                System.out.println("O saldo atual é R$" + saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber: ");
                double saldoAdicional = banco.nextDouble();
                saldo = saldo + saldoAdicional;
                System.out.println("Saldo atualizado: R$" + saldo);
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir: ");
                double saldoSubtraido = banco.nextDouble();
                if (saldoSubtraido > saldo){
                    System.out.println("Saldo insuficiente. Tente novamente.");
                } else {
                    saldo -= saldoSubtraido;
                }
                System.out.println("Saldo atualizado: R$" + saldo);
            } else if (opcao == 4) {
                System.out.println("Finalizando o acesso, agradecemos por sua preferência!");
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}
