//Dupla: Gabriel Lacerda e Maria Alice Rocha-P2

import java.util.Scanner;

public class atividade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        1-
//        System.out.print("Digite seu nome: ");
//        String nome = sc.next();
//
//        System.out.print("Digite sua idade: ");
//        int idade = sc.nextInt();
//
//        System.out.println("Olá " +nome+ " sua idade é " +idade+ "!");

//        2-
//        System.out.print("Digite um número: ");
//        int numeroInt = sc.nextInt();
//        if (numeroInt %2 == 0){
//            System.out.println("O número é par!");
//        }else{
//            System.out.println("O número não é par!");
//        }

//        3-
//        System.out.print("Digite um número: ");
//        int n1 = sc.nextInt();
//
//        System.out.print("Digite outro número: ");
//        int n2 = sc.nextInt();
//
//        System.out.print("Digite uma operção(+,-,/,*)");
//        String operacao = sc.next();
//
//        switch (operacao){
//            case "+" -> System.out.print("A soma é " +(n1 + n2));
//            case "-" -> System.out.print("A subtração é " +(n1 - n2));
//            case "/" -> System.out.print("A divisão é " +(n1 / n2));
//            case "*" -> System.out.print("A multiplicação é " +(n1 * n2));
//    }

//        4-
//        System.out.print("Digite uma nota de 0 a 10: ");
//        int nota = sc.nextInt();
//
//        if (nota >= 7) {
//            System.out.println("Aprovado!");
//        } else if (nota >= 5 && nota < 7) {
//            System.out.println("Recuperação!");
//        } else if (nota < 5) {
//            System.out.println("Reprovado!");
//        }

//        5-
//        System.out.println("Digite três números");
//        System.out.print("Número 1: ");
//        int n1 = sc.nextInt();
//        System.out.print("Número 2: ");
//        int n2 = sc.nextInt();
//        System.out.print("Número 3: ");
//        int n3 = sc.nextInt();
//
//        if (n1 > n2 && n1 > n3) {
//            System.out.print("O " +n1+ " é maior!");
//        } else if (n3 > n2 && n3 > n1) {
//            System.out.print("O " +n3+ " é maior!");
//        } else if (n2 > n1 && n2 > n3) {
//            System.out.print("O " +n2+ " é maior!");
//        }

//        6-
//        System.out.print("Digite seu peso: ");
//        double peso = sc.nextDouble();
//        System.out.print("Digite sua altura: ");
//        double altura = sc.nextDouble();
//
//        double imc = peso / (altura * altura);
//
//        System.out.print("IMC: " +imc);
//
//        if (imc < 18.5){
//            System.out.println("Abaixo do peso");
//        } else if (imc < 25) {
//            System.out.println("Peso normal");
//        } else if (imc < 30) {
//            System.out.println("Sobrepeso");
//        } else {
//            System.out.println("Obeso");
//        }

//        7-
//        String usuarioCerto = "admin";
//        String senhaCerta = "1234";
//
//        System.out.print("Digite seu usuário: ");
//        String usuario = sc.next();
//
//        System.out.print("Digite sua senha: ");
//        String senha = sc.next();
//
//        if (usuario.equals(usuarioCerto) && senha.equals(senhaCerta)){
//            System.out.println("Login bem-sucedido!");
//        } else {
//            System.out.println("Usuário ou senha incorretos!");
//        }

//        8-



//        11-
//        String menu = """
//                1 - Cadastrar Peso
//                2 - Finalizar
//                """;
//        System.out.println(menu);
//        System.out.print("Selecione uma opção: ");
//        int opcao = sc.nextInt();
//
//        while (opcao == 1){
//            System.out.print();
//        }

//        12-
//        System.out.println("Seja bem vindo ao banco");
//        System.out.print("Número da conta: ");
//        int conta = sc.nextInt();
//
//        System.out.print("Nome do cliente: ");
//        String nome = sc.next();
//
//        System.out.print("Saldo inicial: ");
//        int saldo = sc.nextInt();
//
//        int opcao = 0;
//
//        while (opcao != 4) {
//
//            String menu = """
//            1 - Consultar saldo
//            2 - Depositar
//            3 - Sacar
//            4 - Sair
//            """;
//
//            System.out.println(menu);
//            System.out.print("Selecione uma opção: ");
//            opcao = sc.nextInt();
//
//            switch (opcao) {
//
//                case 1:
//                    System.out.println("Saldo atual: " + saldo);
//                    break;
//
//                case 2:
//                    System.out.print("Qual o valor do depósito? ");
//                    int deposito = sc.nextInt();
//                    saldo += deposito;
//                    System.out.println("Seu saldo final é de: " + saldo);
//                    break;
//
//                case 3:
//                    System.out.print("Qual o valor deseja sacar? ");
//                    int saque = sc.nextInt();
//
//                    if (saque <= saldo) {
//                        saldo -= saque;
//                        System.out.println("Seu saldo final é: " + saldo);
//                    } else {
//                        System.out.println("Saldo insuficiente!");
//                    }
//                    break;
//
//                case 4:
//                    System.out.println("Encerrando o sistema...");
//                    break;
//
//                default:
//                    System.out.println("Opção inválida!");
//            }
//        }




    }
}
