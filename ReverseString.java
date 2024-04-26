import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite uma string: ");
        String inputString = scanner.nextLine();
        
        
        scanner.close();
        
        
        System.out.println("String revertida: " + reverterString(inputString));
    }
    
    
    public static String reverterString(String str) {
        
        StringBuilder reversedString = new StringBuilder();
        
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString.append(str.charAt(i));
        }
        
        
        return reversedString.toString();
    }
}