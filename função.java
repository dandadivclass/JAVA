public class FuncoesTiagoAguiarYoutubeAula {
    public static void main(String[] args) {
        soma(55, 63);    // argumentos da função
        soma(14, 14);  // a função pode ser usada diversas vezes em diferentes lugares no código
    }

    static void soma(int x, int y) {  //função que espera duas variaveis do tipo inteiro como parâmetro 
        System.out.println(x + y);        // os parênteses recebem o dado que a função irá tratar
        System.out.println(x / y);
        System.out.println(x * y);
    }
}
