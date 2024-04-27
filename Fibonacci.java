import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        
        if (numero < 0) {
            System.out.println("O número deve ser positivo.");
        } else {
            
            System.out.println("Série de Fibonacci até o " + numero + "º termo:");
            for (int i = 0; i <= numero; i++) {
                System.out.print(calcularFibonacci(i) + " ");
            }
        }
        
        
        scanner.close();
    }
    
    
    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}