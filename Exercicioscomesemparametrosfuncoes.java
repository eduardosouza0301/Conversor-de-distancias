import java.util.Scanner;

public class Exercicioscomesemparametrosfuncoes {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de medidas de distância");
        System.out.println("1 Converte de metros para kilomatros");
        System.out.println("2 Converte de kilometros para metros");

        int escolha = scanner.nextInt();

        if (escolha == 1) { 
            System.out.println("Digite em metros: ");
            double metros = scanner.nextInt();
            double kilomatros = converterMparaK(metros);
            System.out.println( kilomatros + " kilometros.");
            }

            else if(escolha == 2) {
            System.out.println("Digite em kilometros: ");
            double kilometros = scanner.nextInt();
            double metros = converterKparaM(kilometros);
            System.out.println( metros + " metros: ");   
            }
            else {
                System.out.println("Opção inválida!");
            }

            scanner.close();
    }

    


    public static double converterMparaK(double metros) {
        return metros / 1000;
    }

    public static double converterKparaM(double kilomatros) {
        return kilomatros * 1000;
    }
}