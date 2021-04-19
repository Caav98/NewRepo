import java.util.Scanner;

class calculadora {
  public static void main (String args[]){
    Scanner scan = new Scanner(System.in);
    double num1, num2, suma, resta, multiplicacion, division;
    System.out.println("Por favor ingrese el primer número: ");
    num1 = scan.nextDouble();
    System.out.println("Por favor ingrese el segundo número: ");
    num2 = scan.nextDouble();
    suma = num1 + num2;
    resta = num1 -num2;
    multiplicacion = num1*num2;
    division = num1/num2;
    System.out.println("El resultado de la suma es: "+suma);
    System.out.println("El resultado de la resta es: "+suma);
    System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
    System.out.println("El resultado de la division es: "+division);
  }
}