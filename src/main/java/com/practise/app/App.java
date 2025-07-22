package com.practise.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Welcome to Feedback Collection System");
        System.out.println("Please select an option:");
        System.out.println("1. Add Feedback" + "\n2. View Feedback"
                + "\n3. Delete Feedback" + "\n4. Update Feedback");

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
                System.out.println("View Feedback");
                ViewAllFeedback viewAllFeedback = new ViewAllFeedback();
                viewAllFeedback.viewFeedback();
                break;
            case 3:
                System.out.println("Deleting Feedback");
                break;
            case 4:
                System.out.println("Update Feedback");
                UpdateComment updateComment = new UpdateComment();
                updateComment.updateFeedback();
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
}
