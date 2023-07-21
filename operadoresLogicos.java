public class Main {
    public static void main(String[] args) {
       System.out.println("TIPOS DE DADOS NO JAVA:");

        byte x, y, z;
        x = 70;
        y = 6;
        z = 89;
        boolean resultado;
        resultado = (x < y && y > z) ? true : false;
        /* resultado = (x < y || y > z) ? true : false;   || = ou */
        /* resultado = (x < y ^ y > z) ? true : false;    ^ = ou exclusivo */
        System.out.println(resultado);

        byte numero = 90;
        byte numero2 = 99;
        boolean res;
        res = (numero > numero2 ^ numero < numero2) ? true : false;
      
        /* no OU EXCLUSIVO apenas UM dos valores PRECISA ser verdadeiro
        * diferente do OU, que pode ser um ou os dois verdadeiros*/
      
        System.out.println(res);
    }
}
