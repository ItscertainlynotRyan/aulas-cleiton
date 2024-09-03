import java.util.Scanner;

class atividade_9_Verificação_de_Número_Positivo_Negativo_ou_Zero {
    public static void main(String[] args) {
        Scanner a9 = new Scanner(System.in);
        System.out.println("Insira um número ");
        int n1 = a9.nextInt();
        if (n1 > 0) {
            System.out.println("Ele é positivo");
        } else if (n1 == 0) {
            System.out.println("Seu número é zero");
        } else {
            System.out.println("Ele é negativo");
        }
    }

}

