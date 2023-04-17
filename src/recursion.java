/* 
# Name : Anthony Rivera and Mamadou SY
# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Mini Project: 5

# Date: 04/15/2023

# Summary: problem 1 - use with and without recursion to keep track of the number of guesses you have to answer a question correctly. Problem 2- Keep track of weight (kgs) as well as reps done during workout.

# The TA for this class is Hari Krishna Yaram 
 (HariKrishna.Yaram@rockets.utoledo.edu)
# The tutor for this class is Yash Kakade 
(yashsanjay.kakade@rockets.utoledo.edu).
 Please reach out to either of them if you need help with 
 hints on the assignment.
  

# Youtube link: https://youtu.be/uODNaTfRw6I



# You must put this line as a comment at the top of your 
Java source file. â€œThis code is my own work. I did not get 
any help from any online source such as chegg.com or ChatGPT; from a 
classmate, or any other person other than the instructor 
or TA or tutor for this course. I understand that getting 
outside help from this course other than from the instructor 
or TA or tutor  will result in a grade of 0 in this 
assignment and other disciplinary actions for academic 
dishonesty.â€  
*/



import java.util.Scanner;
public class recursion{
    public static void lives(int guesses){  // method for recursion problem 1 - use recursion to keep track of the number of guesses you have to answer a question correctly
        if(guesses!=0){
            System.out.println("You have " +  guesses  +   " guesses remaining");
            guesses--;
            lives(guesses);
        }else{
            System.out.println("You are out of guesses"); // base case for problem 1
        }
    }


    public static void pyramid(int set, int pesa, int reps){
        if(reps<2){
            System.out.println("You have reached the end of the workout!");
        }else{
            System.out.println("Set" + set + " Current weight  " + pesa +"kg" + " Current reps remaining " + reps);
            set++;
            pesa+=10;
            reps-=2;
            pyramid(set, pesa, reps);
        }
        // example (set 1, weight 60kg, 10 reps)
        // (set 2, weight 70kg, 8 reps)
        // (set 3, weight 80kg, 6 reps)

    }
public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
    System.out.println("We will solve problem 1 with no recursion, enter the number of guesses:");
    int accept = input.nextInt();
    for(int i =accept; i>0;i--){
    System.out.println("You have  " + i + "guesses remaining");     
   }
   System.out.println("--------------------------------");
   System.out.println("Now we solve with our recursion method");
      lives(accept); //calling method for recursion problem 1 
         System.out.println("--------------------------------");


         System.out.println("--------------------------------");


   System.out.println("Begin problem 2, solved with recursion");    
   pyramid(1, 60, 10);


   System.out.println("--------------------------------");

   System.out.println("Problem two solved without recursion");

   System.out.println("number of sets begins at one");

   int man_set= 1;

   System.out.println("Input starting weight");

   int man_pesa=input.nextInt();

   System.out.println("Input starting reps");

   int man_reps=input.nextInt();


   for(int j=man_reps; j>0; j--){
    while(man_reps>=2){
    System.out.println("Set" + man_set + " Current weight  " + man_pesa +"kg" + " Current reps remaining " + man_reps);   
    man_set++;
    man_pesa+=10;
    man_reps-=2;
   }

input.close();
}

//keeping track of ONE variable seems to be easier when NOT using recursion

// recursion seems faster although it is sometimes memory inefficient

// recursion requires less hassle to implement safe guards regarding logic
}
}