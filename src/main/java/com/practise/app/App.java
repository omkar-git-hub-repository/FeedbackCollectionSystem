package com.practise.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline left-over

        switch (choice) {
            case 1:
                System.out.println("Adding Feedback");
                AddFeedback addFeedback = new AddFeedback();
                addFeedback.addFeedback();
                break;
                
            case 2:
                System.out.println("Updating Feedback");
                break;
            case 3:
                System.out.println("Deleting Feedback");
                break;
            case 4:
                System.out.println("Viewing Feedback");
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
}
