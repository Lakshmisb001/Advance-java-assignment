package ADV_JAVA;
import javax.swing.*;          // For JFrame, JButton, JLabel
import java.awt.*;             // For layout and color
import java.awt.event.*;       // For ActionListener
public class CountryButton {

	    public static void main(String[] args) {

	        // Create a JFrame
	        JFrame frame = new JFrame("Country Button Event");

	        // Create two buttons
	        JButton indiaButton = new JButton("India");
	        JButton srilankaButton = new JButton("Srilanka");

	        // Create a label to display the message
	        JLabel messageLabel = new JLabel("Click a button");
	        messageLabel.setFont(new Font("Arial", Font.PLAIN, 24));
	        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);

	        // Create a panel to hold the buttons
	        JPanel buttonPanel = new JPanel();
	        buttonPanel.add(indiaButton);
	        buttonPanel.add(srilankaButton);

	        // Set layout of the frame
	        frame.setLayout(new BorderLayout());

	        // Add components to frame
	        frame.add(messageLabel, BorderLayout.CENTER);
	        frame.add(buttonPanel, BorderLayout.SOUTH);

	        // Action listener for India button
	        indiaButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("India is pressed");
	            }
	        });

	        // Action listener for Srilanka button
	        srilankaButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("Srilanka is pressed");
	            }
	        });

	        // Set frame properties
	        frame.setSize(400, 200); // width, height
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);  // Show the frame
	    }
	}
