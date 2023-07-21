import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 99;
        int maior;
        maior = (n1 > n2) ? n1 : n2;
        /* se n1 for maior que n2 o resultado é n1,
        se n1 for menor que n2 o resultado é n2 */
        System.out.println(maior);

        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res;
        res = (nome1 == nome2) ?"igual":"diferente";
        /* se o nome1 for igual ao nome2 o resultado é "igual"
        * senão, o resultado é "diferente */
        System.out.println(res);

        String dado = "Daniela";
        String dado2 = new String("Daniela");
        String valor;
        valor = (dado.equals(dado2) ?"sim, mesmo nome" :"não, nome diferente");
        /* o método .equals retorna true ou false caso o CONTEUDO de
        um objeto e outro objeto(classes tbm) seja igual */
        System.out.println(valor);

        /* maior = n1 > n2 ? n1 : n2
        *   dependendo da condição anterior ao "?" o resultado será x ou y (após o "?" OU ":") */
    }
}
