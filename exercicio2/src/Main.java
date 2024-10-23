//2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’,
// seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int count = 0;


        for (int i = 0; i < word.length(); i++){

            if(word.charAt(i) == 'a'|| word.charAt(i) == 'A'){
                count++;
            }

        }

        if(count > 0){
            System.out.println("a letra A aparece " + count + " vezes");
        } else {
            System.out.println("a letra A nao existe na String digitada");
        }

    }
}