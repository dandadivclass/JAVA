import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println("TIPOS DE DADOS NO JAVA:");
        int idade = 3;  /* o tipo da variavel é muito importante no Java! */
        int idade2 = (int) 3;  /* typecast -> considere esse valor como inteiro */
        Integer idade3 = new Integer(3);   /* classe -> a palavra new cria o objeto(idade3) que recebe um valor inteiro
                                                    o nome dessa classe é Wrapper class, pois o valor dela se envolta ao objeto*/

        float salario = 1890.54f;
        float salario2 = (float) 1890.54;  /* typecast -> considere esse valor como real */
        Float salario3 = new Float(1890.54);   /* classe -> a palavra new cria o objeto(idade3) que recebe um valor real
                                                    o nome dessa classe é Wrapper class, pois o valor dela se envolta ao objeto*/

        char letra = 'G';  /* char recebe apenas UMA letra */
        char letra2 = (char) 'G';
        Character letra3 = new Character('G');  /* classe -> a palavra new cria o objeto(idade3) que recebe um valor caractere
                                                    o nome dessa classe é Wrapper class, pois o valor dela se envolta ao objeto*/

        boolean casado = false;
        boolean casado2 = (boolean) false;
        Boolean casado3 = new Boolean(false);  /* classe -> a palavra new cria o objeto(idade3) que recebe um valor booleano
                                                    o nome dessa classe é Wrapper class, pois o valor dela se envolta ao objeto*/

        byte myNum = 100;
        System.out.println(myNum); /* inves de usar -int- quando lidamos com numeros entre -128 a 127 podemos usar o datatype -byte- */

        short myNum2 = 5000;        /* para numeros entre  -32.768 a 32.767 */
        System.out.println(myNum);

        int myNum3 = 100000;        /* para numeros entre -2.147.483.648 a 2.147.483.647 */
        System.out.println(myNum);

        long myNum4 = 15000000000L;   /* para numeros entre maiores que 15 digitos */
        System.out.println(myNum);

        /* usamos FLOAT quando temos um numero com 6 ou 7 casas decimais (apos o ponto)
        *  e usamos DOUBLE quando temos um numero com cerca de 15 digitos decimais */
        float myNum5 = 5.75f;
        double myNum6 = 19.99d; 

         float nota = teclado.nextFloat();  /* .nextFloat -> método do objeto "teclado" para ler a saída do teclado */
        System.out.printf("Sua nota é %.2f", nota);

        int idade4 = 30;
        String valor = Integer.toString(idade4);
        /* para converter um valor para outro usamos as wrapper class + metodo toString! */
        /* classe String tem o metodo tal */
        String idade5 = "30";
        int valor2 = Integer.parseInt(idade5);  /* parse -> converter para */

        String idade6 = "40.5";
        float valor3 = Float.parseFloat(idade6);

        String idade7 = "50";
        double valor4 = Double.parseDouble(idade7);

        
        System.out.println("Nos informe a sua nota:");
        Scanner teclado = new Scanner(System.in);  /* Scanner -> classe que cria/instancia um objeto com o metodo "new" */


    }
}

  
