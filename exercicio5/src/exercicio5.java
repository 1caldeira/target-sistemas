//5) Escreva um programa que inverta os caracteres de um string.
//IMPORTANTE:
//a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
//b) Evite usar funções prontas, como, por exemplo, reverse;


public class exercicio5 {
    public static void main(String[] args) {

        String frase = "Qualquer frase sera invertida";

        String fraseInvertida = "";

        for(int i = frase.length()-1; i >= 0; i--){
            fraseInvertida += frase.charAt(i);
        }

        System.out.println(fraseInvertida);
    }
}
