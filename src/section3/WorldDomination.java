package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String friend= JOptionPane.showInputDialog("do you know java?");
		// 2. If they say "yes", tell them they will rule the world.
if (friend.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null, "they will rule the world");
}
		// 3. Otherwise, wish them good luck washing dishes.
else {
	JOptionPane.showMessageDialog(null, "good luck, you will wishing dishes");
}
	}
}

