import java.util.Scanner;

class atividade_4_Verificação_de_Login {
    public static void main(String[] args) {
        String user = "Ryan";
        String password = "Ryan123";
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite seu usuario");

        String usuarioinf = scanner.nextLine();

        System.out.println("Digite sua senha");
        String passwordinf = scanner.nextLine();

        if (user.equals(usuarioinf) && password.equals(passwordinf)) {
            System.out.println("Parabéns deu certinho ");
        } else {
            System.out.println("usuario ou senha não identificados ou  estão incorretos ");
        }
        scanner.close();
    }
}