package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
		String Score = JOptionPane.showInputDialog("what is 1*2?");
		// 3.  Use an if statement to check if their answer is correct
		if (Score.equalsIgnoreCase("2")) {
			score++;
		}
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
	 Score = JOptionPane.showInputDialog("what is 1*4?");
		// 3.  Use an if statement to check if their answer is correct
		if (Score.equalsIgnoreCase("4")) {
			score++;
		}

		// 6.  After all the questions have been asked, print the user's score 
		System.out.println(score);
	}
}
