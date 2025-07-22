package com.practise.app;

import java.util.Scanner;

import com.practise.Entity.Feedbacks;

public class AddFeedback {

    public void addFeedback() {
        
        Feedbacks f = new Feedbacks();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your feedback:");

        System.out.println("Enter your User ID : ");
        f.setId(sc.nextInt());
        sc.nextLine(); // Consume newline left-over

        System.out.println("Enter your name : ");
        f.setUserName(sc.nextLine());

        System.out.println("Enter your Email : ");
        f.setEmail(sc.nextLine());

        System.out.println("Enter Comments : ");
        f.setComments(sc.nextLine());

        System.out.println("Enter Rating : ");
        f.setRating(sc.nextInt());
        sc.nextLine(); // Consume newline left-over
        
    }
    
}
