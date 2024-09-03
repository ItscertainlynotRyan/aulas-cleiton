class atividade_5_verificação_de_Dias_da_Semana {
    public static void main(String[] args) {

        int diasemana = 4; // 0 = Domigo, 1 = Segunda-feira", " 2 =Terça-feira",  "3 = Quarta-feira" , " = Quinta-feira" , "5 = Sexta-feira" , "6 = Sabado" );

        switch (diasemana) {
            case 0:
                System.out.println("Domingo");
                break;
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sabado");
                break;
        }
        if (diasemana > 0 && diasemana > 7) {
            System.out.println("não há dia da semana correspondente ");
        }

    }
}