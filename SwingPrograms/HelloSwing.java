/*4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
Programming in Blue color plain font with font size of 32 using Jframe and Jlabel*/
package ADV_JAVA;
import javax.swing.*;     // For JFrame and JLabel
import java.awt.*;        // For Font and Color

public class HelloSwing {
	    public static void main(String[] args) {

	        // Create a JFrame (main window)
	        JFrame frame = new JFrame("Swing Hello Program");

	        // Create a JLabel with the desired message
	        JLabel label = new JLabel("Hello! VI C , Welcome to Swing Programming");

	        // Set font to plain style and size 32
	        label.setFont(new Font("Serif", Font.PLAIN, 32));

	        // Set text color to blue
	        label.setForeground(Color.BLUE);

	        // Align the text to the center
	        label.setHorizontalAlignment(SwingConstants.CENTER);

	        // Add label to the frame
	        frame.add(label);

	        // Set the size of the frame (width, height)
	        frame.setSize(800, 200);

	        // Set default close operation
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Make the frame visible
	        frame.setVisible(true);
	    }
	}
