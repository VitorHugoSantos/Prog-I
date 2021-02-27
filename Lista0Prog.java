import java.util.Scanner; 
// Para poder pegar os dados que o usuario digita
public class Programa{
    public static void main(String[] args) {
        // Exercício 1
        System.out.println("Exercício 1");
        System.out.println("Programação I");
        System.out.println("   -  Professor: Fernando Bevilacqua");
        System.out.println("   -  Aluno: Vitor Hugo Bittencourt dos Santos");
        System.out.println("   -  Objetivo:");
        System.out.println("            O objetivo dessa disciplina é compreender os conceitos fundamentais");
        System.out.println("            do paradigma de programação orientada a objetos e aplicá-los no");
        System.out.println("            desenvolvimento de soluções de software.");
        System.out.println("   -  Objetivo:Turno: Vespertino"); 

        System.out.println();
        // Exercício 2
        System.out.println();

        System.out.println("Exercício 2");
        int    a = 2;
        int    b = 2;
        double c = 4;
        double d = 4;

        int somaInteiros  = (a + b);
        double somaDouble = (c + d);

        System.out.println("Soma inteiros = " + somaInteiros);
        System.out.println("Soma double = " + somaDouble);

        System.out.println();
        // Exercício 3
        System.out.println();

        System.out.println("Exercício 3");
        int numero = 5;

        for(int i = 0; i < 10; i++){
            System.out.println(i + " x " + numero + " = " + (i * numero));
        }

        System.out.println();
        // Exercício 4
        System.out.println();

        System.out.println("Exercício 4");
        int tabuadaCinco = 5;
        int tabuadaSeis  = 6;

        for(int i = 0; i < 10; i++){
            System.out.println(i + " x " + tabuadaCinco + " = " + (i*tabuadaCinco)
                + "         " + i + " x " + tabuadaSeis + " = " + (i*tabuadaSeis));
        }

        System.out.println();
        // Exercício 5
        System.out.println();

        System.out.println("Exercício 5");
        String atrapalha = "";
        for (int i = 0; i < 100; i++) {
            atrapalha += "atrapalha" + " ";
            System.out.println("Java " + atrapalha + "muita gente");
        }

        System.out.println();
        // Exercício 6
        System.out.println();

        System.out.println("Exercício 6");

        int anoNascimento = 2000;
        int anoAtual = 2021;

        System.out.println("Idade: " + (anoAtual - anoNascimento));


        System.out.println();
        // Exercício 7
        System.out.println();

        System.out.println("Exercício 7");

        int primo = 0;
        for (int i=1; i <= 15; i++) {
            for (int j = 1; j/2 <= i; j++) {
                if (i % j == 0) {
                    primo++;
                }
            }
            if (primo == 2) {
                System.out.println("O número " + i + " é primo!");
            }
            primo = 0;
        }

        System.out.println();
        // Exercício 8
        System.out.println();

        System.out.println("Exercício 8");

        int primo2 = 0;
        for (int i = 100; i < 200; i++) {
            for (int j = 1; j/2 <= i; j++) {
                if (i % j == 0) {
                    primo2++;
                }
            }
            if (primo2 == 2) {
                System.out.println("O número " + i + " é primo!");
            }
            primo2 = 0;
        }

        System.out.println();
        // Exercício 9
        System.out.println();

        System.out.println("Exercício 9");

        
        int aux, resto;
        int quociente = 0;
        int primo3    = 0;
        for (int i = 1; i <= 15; i++) {
            for (int j = 1; j/2 <= i; j++) {
                aux = i;
                while (j <= aux) {
                    aux       = aux - j;
                    quociente = quociente + 1;
                }
                resto = aux;
                if (resto == 0) {
                    primo3++;
                }
            }
            if (primo3 == 2) {
                System.out.println("O número " + i + " é primo!");
            }
            primo3 = 0;
        }

        System.out.println();
        // Exercício 10
        System.out.println();

        System.out.println("Exercício 10");
        int aux2, resto2;
        int quociente2 = 0;
        int primo4 = 0;
        for (int i = 100; i < 200; i++) {
            for (int j = 1; j/2 <= i; j++) {
                aux2 = i;
                while (j <= aux2) {
                    aux2       = aux2 - j;
                    quociente2 = quociente2 + 1;
                }
                resto2 = aux2;
                if (resto2 == 0) {
                    primo4++;
                }
            }
            if (primo4 == 2) {
                System.out.println("O número " + i + " é primo!");
            }
            primo4 = 0;
        }
    }
}