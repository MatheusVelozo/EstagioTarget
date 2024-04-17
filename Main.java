import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //===================================QUESTÃO 01=======================================
        /*
        int indice = 13;
        int soma = 0;
        int k = 0;

        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }
        System.out.println(soma);
       }
    */

        //=========================================QUESTÃO 02========================================
        /*
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para verificar se pertence à sequência de Fibonacci: ");
        int numero = sc.nextInt();
        sc.close();

        int[] fibonacci = {0,1,1,2,3,5,8,13,21,34};

        boolean encontrado = false;
        for (int numeroSeq : fibonacci) {
            if (numero == numeroSeq) {
                encontrado = true;
                break;
            }
        }
            if (encontrado) {
                System.out.println("O número pertence à sequência!");
            } else {
                System.out.println("O número não pertence à sequência!");
            }

         */
        //==========================================QUESTÃO 03=========================================
        /*

       --------------------A= Primeira sequencia 1,3,5,7,9,11...------------------

        int ultimoNumero = 1;

        System.out.print("Sequência: ");
        System.out.print(ultimoNumero + ", ");

        for (int i = 0; i < 5; i++) {
            ultimoNumero += 2;
            System.out.print(ultimoNumero);
            if (i < 4) {
                System.out.print(", ");
            }
        }

       -------------------------B= Segunda sequencia 2,4,8,16,32,64,128...-------------------

        int ultimoNumero = 2;

        System.out.print("Sequência: ");
        System.out.print(ultimoNumero + ", ");

        for (int i = 0; i < 6; i++) {
            ultimoNumero *= 2;
            System.out.print(ultimoNumero);
            if (i < 5) {
                System.out.print(", ");
            }

       ---------------------C= Terceira sequencia 0, 1, 4, 9, 16, 25, 36, 49...----------------------

        int ultimoNumero = 0;
        int[] numerosASomar = {1,3,5,7,9,11,13};

        System.out.print("Sequência: ");
        System.out.print(ultimoNumero + ", ");

        for (int i = 0; i < 7; i++) {
            ultimoNumero += numerosASomar[i];
            System.out.print(ultimoNumero);
            if (i < 6) {
                System.out.print(", ");
            }

        -----------------------D= Quarta sequencia = 4, 16, 36, 64, 100...----------------------------

        int[] numeros = {4,6,8,10};

        System.out.print("Sequência: ");

        for ( int numero : numeros) {
            int numeroQuadrado = (int) Math.pow(numero, 2);
            System.out.printf(String.valueOf(numeroQuadrado) + ", ");

        }
        */
        /*
        -----------------E= Quinta sequencia é um  Fibonacci, não consegui implementar o código.--------------

        -----------------F= Sexta sequencia, não consegui implementar o código.-------------------------------
        -----------------Esta sequencia é dada por todos os numeros que começam com a letra D.----------------


        =====================================SOLUÇÃO QUESTÃO 4============================================

        A solução para este caso é acender uma lampada e apaga-la após um tempo, acender outra e ir até a sala,
        a lampada quente e desligada, foi o primeiro interruptor,
        a lampada acessa o segundo,
        e a lampada fria e apagada o terceiro.
         */


        //==========================================QUESTÃO 05=========================================
        /*
        String entrada = "ESTAGIO DESENVOLVIMENTO";

        String invertida = inverterString(entrada);
        System.out.println(invertida);
    }

        public static String inverterString(String str){

            StringBuilder invertida = new StringBuilder();

            for (int i = str.length() - 1; i >= 0; i--) {
                invertida.append(str.charAt(i));
            }
            return invertida.toString();

        }
    }
         */