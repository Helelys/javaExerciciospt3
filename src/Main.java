import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        /* Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.


        int contagem = 1;
        int senha = 2001;
        System.out.println("Digite sua senha: ");

        int senhaDigitada = teclado.nextInt();


        while (senhaDigitada != senha && contagem < 3) {
            System.out.println("Senha inválida, digite novamente: ");
            contagem++;
            senhaDigitada = teclado.nextInt();

            if (contagem == 3) {
                System.out.println("Número de tentativas excedido.");
            }
        }

        if (senhaDigitada == senha) {
            System.out.println("Bem vindo!");
        }

         */ //Login com senha errada, validação de tentativas e tela de boas-vindas

        /* Escreva um programa para ler as coordenadas (X ,Y) de uma quantidade indeterminada de pontos no sistema
        cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
        menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = teclado.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = teclado.nextInt();

        while (primeiroNumero != 0 || segundoNumero != 0) {
            if (primeiroNumero > 0 && segundoNumero > 0) {
                System.out.println("Primeiro (Ambos positivos)");

                System.out.println("Digite o primeiro número: ");
                primeiroNumero = teclado.nextInt();
                System.out.println("Digite o segundo número: ");
                segundoNumero = teclado.nextInt();
            }
            else if (primeiroNumero < 0 && segundoNumero > 0) {
                System.out.println("Segundo (O primeiro negativo e o segundo positivo)");

                System.out.println("Digite o primeiro número: ");
                primeiroNumero = teclado.nextInt();
                System.out.println("Digite o segundo número: ");
                segundoNumero = teclado.nextInt();
            }
            else if (primeiroNumero < 0 && segundoNumero < 0) {
                System.out.println("Terceiro (Ambos negativos");

                System.out.println("Digite o primeiro número: ");
                primeiroNumero = teclado.nextInt();
                System.out.println("Digite o segundo número: ");
                segundoNumero = teclado.nextInt();
            }
            else if (primeiroNumero > 0 && segundoNumero < 0) {
                System.out.println("Quarto (O primeiro positivo e o segundo negativo");

                System.out.println("Digite o primeiro número: ");
                primeiroNumero = teclado.nextInt();
                System.out.println("Digite o segundo número: ");
                segundoNumero = teclado.nextInt();
            }
            if (primeiroNumero == 0 || segundoNumero == 0) {
                System.out.println("Processo nulo, finalizado.");
                break;
            }
        }

         */ // Plano cartesiano

        /* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        exemplo.

        System.out.printf("Digite um número de 1 a 4: conforme a tabela: %n" +
                "1- Álcool.%n" +
                "2- Gasolina.%n" +
                "3- Diesel.%n" +
                "4- Fim.%n");

        int pedido = teclado.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (pedido < 4) {
            if (pedido == 1) {
                alcool++;
                System.out.println("Deseja mais algo? ");
                pedido = teclado.nextInt();
            }
            else if (pedido == 2) {
                gasolina++;
                System.out.println("Deseja mais algo? ");
                pedido = teclado.nextInt();
            }
            else if (pedido == 3) {
                diesel++;
                System.out.println("Deseja mais algo? ");
                pedido = teclado.nextInt();
            }
        }

        if (pedido == 4) {
            System.out.println("Processo finalizado. ");
            System.out.printf("Lista de compras: Álcool: %s, Gasolina: %s, Diesel: %s. Volte sempre.", alcool, gasolina, diesel);
        }

         */ //Posto de gasolina


        teclado.close();

    }
}