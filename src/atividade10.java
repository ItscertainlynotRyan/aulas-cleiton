import java.util.Scanner;

public class atividade10 {

    public static void main(String[] args) {
        System.out.println("Digite o valor total da compra: ");
        Scanner compra = new Scanner(System.in);
        double vltcompra = compra.nextDouble();
        if (vltcompra >= 500.00) {
            double desc2o = vltcompra / 100 * 20;
            double valdesc = vltcompra - desc2o;
            System.out.println("Valor original é : " + vltcompra + "$ você ganhou 20% de então o  novo valor será de: " + desc2o + "$ portanto o valor final de sua compra será: " + valdesc + "$");
        } else if (vltcompra >= 200.00 && vltcompra < 500.00) {
            double desc2o = vltcompra / 100 * 10;
            double valdesc = vltcompra - desc2o;
            System.out.println("Valor original é : " + vltcompra + "$ você ganhou 10% de desconto então o  novo valor  será de: " + desc2o + "$ portanto o valor final de sua compra será: " + valdesc + "$");
        } else {
            double desc2o = vltcompra / 100 * 5;
            double valdesc = vltcompra - desc2o;
            System.out.println("Valor original é : " + vltcompra + "$ você ganhou 5% de desconto então o  novo valor será de: " + desc2o + "$ portanto o valor final de sua compra será: " + valdesc + "$");
        }

    }
}

