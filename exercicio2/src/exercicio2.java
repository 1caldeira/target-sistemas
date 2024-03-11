//2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
// (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
// ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(c < n){
            System.out.println(c);
            c = a + b;
            a = b;
            b = c;
        }
        if(c == n){
            System.out.println(n+" pertence à sequência de fibonacci!");
        }else{
            System.out.println(n+" não pertence à sequência de fibonacci!");
        }
    }
}