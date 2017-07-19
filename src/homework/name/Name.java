package homework.name;

import java.util.Scanner;

public class Name {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you full name in the format | Surname | Name | Middle  name |: ");

        String fullName = sc.nextLine();


        System.out.print("Name: ");

        int count = 0;

        for (int i = 0; i <= fullName.length() - 1; i++) {

            if (fullName.charAt(i) != ' ') {
                System.out.print(fullName.charAt(i));


            } else {
                count++;
                if (count == 1) {
                    System.out.print("\nSurname: ");
                } else {
                    System.out.print("\nSecond name: ");
                }

            }


        }

    }

}
