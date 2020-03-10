import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        /*6) ​Faça um programa em Java que calcule a idade de uma pessoa baseada no seu ano de nascimento.
        Você nãoprecisa ler os valores do teclado, pode apenas declarar e utilizar as variáveis.

        int ano = 2020;
        System.out.println("Digite seu ano de nascimento ");

        int anonascimento = ler.nextInt();
        System.out.println("Sua idade é "+(ano-anonascimento));*/

        /*int j = 2;
        int n = 0;
        while(n <= 15){
            int cont = 0;
            for(int i=2; i < j; i++){
                if((j % i) == 0){
                    cont++;
                }
            }
            if (cont == 0){
                System.out.println(n+")"+" É primo " +j);
                n++;
            }
            j++;
        }*/

        /*7) ​Um número primo é aquele que é divisível apenas por 1 e por ele mesmo.
        Nesse caso, ser divisível é ter o restoda divisão inteira resultando em zero, ou seja,
        dividir um número sem gerar vírgula. Por exemplo, o número 5 podeser dividido apenas por 1
        e por ele mesmo: 5 / 1 = 5, resto 0; e 5 / 5 = 1, resto 0. Faça um programa em Java que 
        imprima na tela os 15 primeiros números primos existentes.

        int i = 100;
        int j = 2;
        while(i < 200){
            int cont = 0;
            for(i=100; i < j; i++){
                if((j % i) == 0){
                    cont++;
                }
            }
            if (cont == 0){
                System.out.println(i+")"+" É primo " +j);
            }
            j++;
        }*/

    }
}
