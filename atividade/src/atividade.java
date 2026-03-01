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
//        System.out.print("Digite uma operção(+,-,/,*): ");
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
//        String tipoAceito = "G";
//        String tipoAceito2 = "A";
//        Double gasolina = 5.50;
//        Double alcool = 4.00;
//
//        System.out.println("Posto de Combustível:");
//        System.out.print("Qual o tipo do combustível(G para gasolina e A para álcool)? ");
//        String tipo = sc.next();
//
//        System.out.print("Quantos litros deseja? ");
//        int litro = sc.nextInt();
//
//        if (tipo.equals(tipoAceito)){
//            Double multiplicacao = (litro * gasolina);
//            System.out.println("O valor total é R$" +multiplicacao);
//        } else if (tipo.equals(tipoAceito2)){
//            Double multiplicacao2 = (litro * alcool);
//            System.out.println("O valor total é R$" +multiplicacao2);
//        }

//        9-
//        System.out.println("Bem vindo(a) ao gerador de tabuada");
//        String numero1 = "1";
//        String numero2 = "2";
//        String numero3 = "3";
//        String numero4 = "4";
//        String numero5 = "5";
//        String numero6 = "6";
//        String numero7 = "7";
//        String numero8 = "8";
//        String numero9 = "9";
//        String numero10 = "10";
//
//        System.out.print("Digite um número de 1 a 10: ");
//        String numero = sc.next();
//
//        if (numero.equals(numero1)){
//            String tabuada1 = """
//                    Tabuada do 1:
//
//                    1 x 1 = 1
//                    1 x 2 = 2
//                    1 x 3 = 3
//                    1 x 4 = 4
//                    1 x 5 = 5
//                    1 x 6 = 6
//                    1 x 7 = 7
//                    1 x 8 = 8
//                    1 x 9 = 9
//                    1 x 10 = 10
//                    """;
//            System.out.println(tabuada1);
//        } else if (numero.equals(numero2)){
//            String tabuada2 = """
//                    Tabuada do 2:
//
//                    2 x 1 = 2
//                    2 x 2 = 4
//                    2 x 3 = 6
//                    2 x 4 = 8
//                    2 x 5 = 10
//                    2 x 6 = 12
//                    2 x 7 = 14
//                    2 x 8 = 16
//                    2 x 9 = 18
//                    2 x 10 = 20
//                    """;
//            System.out.println(tabuada2);
//        } else if (numero.equals(numero3)){
//            String tabuada3 = """
//                    Tabuada do 3:
//
//                    3 x 1 = 3
//                    3 x 2 = 6
//                    3 x 3 = 9
//                    3 x 4 = 12
//                    3 x 5 = 15
//                    3 x 6 = 18
//                    3 x 7 = 21
//                    3 x 8 = 24
//                    3 x 9 = 27
//                    3 x 10 = 30
//                    """;
//            System.out.println(tabuada3);
//        } else if (numero.equals(numero4)){
//            String tabuada4 = """
//                    Tabuada do 4:
//
//                    4 x 1 = 4
//                    4 x 2 = 8
//                    4 x 3 = 12
//                    4 x 4 = 16
//                    4 x 5 = 20
//                    4 x 6 = 24
//                    4 x 7 = 28
//                    4 x 8 = 32
//                    4 x 9 = 36
//                    4 x 10 = 40
//                    """;
//            System.out.println(tabuada4);
//        } else if (numero.equals(numero5)){
//            String tabuada5 = """
//                    Tabuada do 5:
//
//                    5 x 1 = 5
//                    5 x 2 = 10
//                    5 x 3 = 15
//                    5 x 4 = 20
//                    5 x 5 = 25
//                    5 x 6 = 30
//                    5 x 7 = 35
//                    5 x 8 = 40
//                    5 x 9 = 45
//                    5 x 10 = 50
//                    """;
//            System.out.println(tabuada5);
//        } else if (numero.equals(numero6)){
//            String tabuada6 = """
//                    Tabuada do 6:
//
//                    6 x 1 = 6
//                    6 x 2 = 12
//                    6 x 3 = 18
//                    6 x 4 = 24
//                    6 x 5 = 30
//                    6 x 6 = 36
//                    6 x 7 = 42
//                    6 x 8 = 48
//                    6 x 9 = 54
//                    6 x 10 = 60
//                    """;
//            System.out.println(tabuada6);
//        } else if (numero.equals(numero7)){
//            String tabuada7 = """
//                    Tabuada do 7:
//
//                    7 x 1 = 7
//                    7 x 2 = 14
//                    7 x 3 = 21
//                    7 x 4 = 28
//                    7 x 5 = 35
//                    7 x 6 = 42
//                    7 x 7 = 49
//                    7 x 8 = 56
//                    7 x 9 = 63
//                    7 x 10 = 70
//                    """;
//            System.out.println(tabuada7);
//        } else if (numero.equals(numero8)){
//            String tabuada8 = """
//                    Tabuada do 8:
//
//                    8 x 1 = 8
//                    8 x 2 = 16
//                    8 x 3 = 24
//                    8 x 4 = 32
//                    8 x 5 = 40
//                    8 x 6 = 48
//                    8 x 7 = 56
//                    8 x 8 = 64
//                    8 x 9 = 72
//                    8 x 10 = 80
//                    """;
//            System.out.println(tabuada8);
//        } else if (numero.equals(numero9)){
//            String tabuada9 = """
//                    Tabuada do 9:
//
//                    9 x 1 = 9
//                    9 x 2 = 18
//                    9 x 3 = 27
//                    9 x 4 = 36
//                    9 x 5 = 45
//                    9 x 6 = 54
//                    9 x 7 = 63
//                    9 x 8 = 72
//                    9 x 9 = 81
//                    9 x 10 = 90
//                    """;
//            System.out.println(tabuada9);
//        } else if (numero.equals(numero10)){
//            String tabuada10 = """
//                    Tabuada do 10:
//
//                    10 x 1 = 10
//                    10 x 2 = 20
//                    10 x 3 = 30
//                    10 x 4 = 40
//                    10 x 5 = 50
//                    10 x 6 = 60
//                    10 x 7 = 70
//                    10 x 8 = 80
//                    10 x 9 = 90
//                    10 x 10 = 100
//                    """;
//            System.out.println(tabuada10);
//        }

//        10-
//        System.out.print("Digite quanto você ganha por hora: ");
//        Double quantoGanha = sc.nextDouble();
//
//        System.out.print("Digite seu número de horas trabalhadas no mês: ");
//        Double horasTrabalhadas = sc.nextDouble();
//
//        Double salarioBruto = quantoGanha * horasTrabalhadas;
//
//        Double ir = salarioBruto * 0.11;
//        Double inss = salarioBruto * 0.8;
//        Double sindicato = salarioBruto * 0.5;
//
//        Double salarioLiquido = salarioBruto - (ir + inss + sindicato);
//
//        System.out.println("Salário Bruto: R$" +salarioBruto);
//        System.out.println("- IR(11%): R$" +ir);
//        System.out.println("- INSS(8%): R$" +inss);
//        System.out.println("- Sindicato(5%): R$" +sindicato);
//        System.out.println("Salário Líquido: R$" +salarioLiquido);

//        11-
//        String animaisRegistrados = "50 animais registrados";
//        String maiorPeso = "100 kg";
//        String menorPeso = "50 kg";
//
//        int opcao0 = 0;
//
//        while (opcao0 != 2) {
//
//            String menu = """
//                    1 - Cadastrar Peso
//                    2 - Finalizar
//                    """;
//            System.out.println(menu);
//
//            System.out.print("Selecione uma opção: ");
//            int opcao = sc.nextInt();
//
//            switch (opcao){
//
//                case 1:
//                    System.out.print("Qual o peso do animal? ");
//                    Double peso = sc.nextDouble();
//
//                case 2:
//                    System.out.print("Quantidade de animais registrados: " +animaisRegistrados);
//                    System.out.print("Maior peso registrado: " +maiorPeso);
//                    System.out.print("Menor peso registrado: " +menorPeso);
//                    System.out.println("Encerrando sistema...");
//                    break;
//            }
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

//        13-
//        não conseguimos fazer



    }
}
