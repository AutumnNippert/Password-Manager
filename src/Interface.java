import java.util.Scanner;

public class Interface {
    public static void initInterface(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("1: Create Account\n2: Login\n3: Delete All\n>>> ");
        String input  = scanner.nextLine();
        if(input.equals("1")){
            System.out.print("text: ");
            String user = scanner.nextLine();

            System.out.print("key: ");
            String textPassword = scanner.nextLine();

            System.out.print("key (again): ");
            String passwordCheck = scanner.nextLine();
            if(textPassword.equals(passwordCheck)){
                System.out.println(Cryptography.encrypt(user, textPassword));
            }
            else{

            }
        }
        else if(input.equals("2")){
            System.out.print("text: ");
            String text = scanner.nextLine();

            System.out.print("key: ");
            String key = scanner.nextLine();

            System.out.println(Cryptography.decrypt(text, key));

        }
        else if(input.equals(3)){

        }

    }
}
