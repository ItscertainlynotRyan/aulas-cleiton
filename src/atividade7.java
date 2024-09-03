import java.util.Scanner;

class atividade7 {
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int n1 = cl.nextInt();

        System.out.println("Digite o segundo numero: ");
        int n2 = cl.nextInt();

        System.out.println("Digite 1 se deseja somar, 2 para subtrair, 3 se deseja multiplicar e 4 se deseja dividir 1: ");
        int op = cl.nextInt();

        switch (op) {
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                System.out.println(n1 / n2);
                break;
        }

    }


}