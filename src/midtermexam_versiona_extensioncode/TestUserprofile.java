/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author Sandy Su
 */
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name (user ID):");
        String userID = scanner.nextLine();
        
        System.out.println("What is your favorite Genre?");
        UserProfile.getGenres();
        System.out.println();
        String genre = scanner.nextLine();
        
        UserProfile user = new UserProfile(userID, genre);
        System.out.println("User profile created!");
    }
}
