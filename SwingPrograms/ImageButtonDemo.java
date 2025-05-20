package ADV_JAVA;
import javax.swing.*;          // For JFrame, JButton, JLabel, ImageIcon
import java.awt.*;             // For layout
import java.awt.event.*;       // For ActionListener

public class ImageButtonDemo {

	    public static void main(String[] args) {

	        // Create JFrame
	        JFrame frame = new JFrame("Image Button Demo");

	        // Create label to display messages
	        JLabel messageLabel = new JLabel("Click an image button");
	        messageLabel.setFont(new Font("Arial", Font.PLAIN, 24));
	        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);

	        // Load images (make sure images exist in the same folder)
	        ImageIcon digitalClockIcon = new ImageIcon("C:\\Users\\Lakshmi S Basnakar\\OneDrive\\Pictures/digitalcopy.png");
	        ImageIcon hourGlassIcon = new ImageIcon("C:\\Users\\Lakshmi S Basnakar\\OneDrive\\Pictures/hourglass.png");

	        // Create buttons with images
	        JButton digitalClockButton = new JButton(digitalClockIcon);
	        JButton hourGlassButton = new JButton(hourGlassIcon);

	        // Set tooltips (optional) for better accessibility
	        digitalClockButton.setToolTipText("Digital Clock");
	        hourGlassButton.setToolTipText("Hour Glass");

	        // Create a panel to hold buttons
	        JPanel buttonPanel = new JPanel();
	        buttonPanel.add(digitalClockButton);
	        buttonPanel.add(hourGlassButton);

	        // Add action listener for Digital Clock button
	        digitalClockButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("Digital Clock is pressed");
	            }
	        });

	        // Add action listener for Hour Glass button
	        hourGlassButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("Hour Glass is pressed");
	            }
	        });

	        // Set layout and add components
	        frame.setLayout(new BorderLayout());
	        frame.add(messageLabel, BorderLayout.NORTH);
	        frame.add(buttonPanel, BorderLayout.CENTER);

	        // Set frame properties
	        frame.setSize(500, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}

