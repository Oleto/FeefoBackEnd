import java.util.Scanner;
public class main {
    public static void main(String [] args){
        Scanner scanner= new Scanner(System.in);
        String NormalizedTitle=normalizedString(scanner.nextLine());
        System.out.println(NormalizedTitle);

    }
    public static String normalizedString(String input){
        if(input.toLowerCase().contains("accountant")){
            return "Accountant";
        }
        else if(input.toLowerCase().contains("engineer")){
            return "Software Engineer";
        }
        else if(input.toLowerCase().contains("surveyor")){
            return "Quantity surveyor";
        }else if(input.toLowerCase().contains("architect")){
            return "Architect";
        }throw new RuntimeException();
    }
}
