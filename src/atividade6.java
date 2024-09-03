import java.util.Scanner;

public class atividade6{
    public static void main(String[] args) {
        Scanner md = new Scanner(System.in);
        System.out.println("insira a média final do aluno ");
        int mdf = md.nextInt();
        if (mdf >= 7) {
            System.out.println(": aprovado");
        }
        else if ( mdf >= 5 && mdf < 7 ) {
            System.out.println(": Recuperação");
        }else {
            System.out.println(": reprovado");
        }





    }
}
