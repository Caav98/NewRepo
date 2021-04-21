import java.util.Scanner;

public class paresImpares{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;

            System.out.print("Introduce un número entero: ");
            num1 = scan.nextInt();
            System.out.print("Introduce otro número entero mayor que el anterior: ");
            num2 = scan.nextInt();
            if (num1 >= num2) 
                System.out.println("El segundo número debe ser estrictamente mayor que el primero");                  


        System.out.println("\nNúmeros pares desde " + num1 + " hasta " + num2 + " : ");
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("\nNúmeros impares desde " + num1 + " hasta " + num2 + " : ");
        int i = num1;
        while (i<=num2) {
            i++;
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
} 
