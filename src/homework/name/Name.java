package homework.name;

import java.util.Scanner;

public class Name {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you full name in the format | Surname | Name | Middle  name |: ");

        String fullName = sc.nextLine();

        int count = 0;
        int count2 = 0;

        for (int i = 0; i <= fullName.length() - 1; i++) {
            if (fullName.charAt(i) == ' ') {
                count = i;
                break;
            }
        }

        for (int k = count + 1; k <= fullName.length() - 1; k++) {
            if (fullName.charAt(k) == ' ') {
                count2 = k;
                break;

            }
        }


        System.out.print("\nSurname: ");
        for (int i = 0; i <= count; i++) {

            System.out.print(fullName.charAt(i));
        }

        System.out.print("\nName: ");
        for (int i = count + 1; i <= count2; i++) {
            System.out.print(fullName.charAt(i));
        }


        System.out.print("\nMiddle name: ");
        for (int i = count2 + 1; i <= fullName.length() - 1; i++) {
            System.out.print(fullName.charAt(i));
        }



    }

}
