// Name: Sammy Hasan-Silva
// Class: CS 4306/Section# 01
// Term:Spring 2023
// Instructor: Dr.Haddad
// Assignment:2

// Algorithm Design Block


// Logical Steps:
// CREATE a pointer variable, p1
// p1 iterates through the string
//   if there is an 'A'
//      then iterate until we find a 'B'
//           if there is a 'B', then:
//          count as a substring
// now we continue with the next p1
//after this iteration we print the count of substrings and comparisons
//
//*note my algorithm works for lowercase and uppercase




//PSEUDOCODE:
// . . .
//     loop i until string length:
//
//        p1 <- char i
//        increase comparisons + 1
//
//        if (p1 == 'A/a') :
//          then
//                  loop j = i +1 until end string length:
//
//                      increase comparisons by 1
//
//            if (str.charAt(j) is 'B/b'
//            increase substring count by 1
//   end loop
//   print (substrings)
//   print (comparisons)
//
//
// . . .
// Code Section
// Working code goes here

import java.util.Scanner;

public class Substrings {

    public static void main(String[] args) {

        // Variables
        Scanner scan = new Scanner(System.in);
        boolean done = false;
        int choice = 0;
        String inputString = "";
        int subStringCount = 0;
        int comparisons = 0;
        int p1;
        String str = "";

        while (!done) {

            System.out.println(menu);

            try {
                choice = scan.nextInt();
            } catch (Exception e){
                System.out.println("Please input a string with no spaces");
            }


            switch (choice) {
                //INPUT STRING
                case 1 -> {
                    System.out.println("Input string:");
                    inputString = scan.next();
                    str = inputString;
                }
                //BEGIN COUNTING SUBSTRINGS
                case 2 -> {

                    for (int i = 0; i < str.length(); i++) {

                        p1 = str.charAt(i);
                        comparisons++;

                        if (p1 == 'A' || p1 == 'a') {

                            // iterate the rest of the list
                            for (int j = i + 1; j < inputString.length(); j++) {

                                comparisons++;

                                if (str.charAt(j) == 'B' || str.charAt(j) == 'b') {
                                    //System.out.println("We found a Substring");
                                    subStringCount++;

                                }

                            }


                        }

                    }
                    System.out.println("Input String:\t" + str);
                    System.out.println("# of substrings:\t" + subStringCount);
                    System.out.println("# of comparisons:\t" + comparisons);
                }
                //EXIT
                case 3 -> done = true;
                default -> throw new IllegalStateException("Unexpected value: " + choice);
            }// end switch case
        }//end while

    } // end main

     static String menu = """
                
            -----------------MAIN MENU--------------
            1. Read input string
            2. Run algorithm and display output(substrings and number of comparisons) 
            3. Exit program
            Enter option number:
                        
                """;


} // end class



//my old algorithm

//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//            String str = "";
//            int option;
//
//            do {
//                System.out.println("-----------------MAIN MENU--------------");
//                System.out.println("1. Read input string");
//                System.out.println("2. Run algorithm and display output (substrings and number of comparisons)");
//                System.out.println("3. Exit program");
//                System.out.print("Enter option number: ");
//                option = input.nextInt();
//
//                if (option == 1) {
//                    input.nextLine(); // consume the newline character
//                    System.out.print("Enter input string: ");
//                    str = input.nextLine();
//                } else if (option == 2) {
//                    int count = 0;
//                    int comparisons = 0;
//                    for (int i = 0; i < str.length(); i++) {
//                        if (str.charAt(i) == 'A'||str.charAt(i) == 'a') {
//                            for (int j = i + 1; j < str.length(); j++) {
//                                comparisons++;
//                                if (str.charAt(j) == 'B'||str.charAt(j) == 'b') {
//                                    count++;
//                                    break;
//                                }
//                            }
//                        }
//                    }
//                    System.out.println("\nInput string: " + str);
//                    System.out.println("# of substrings: " + count);
//                    System.out.println("# of comparisons: " + comparisons + "\n");
//                }
//            } while (option != 3);
//        }