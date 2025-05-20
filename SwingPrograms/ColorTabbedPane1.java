/*5b. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and
display the concerned color whenever the specific tab is selected in the Pan.*/
package ADV_JAVA;
import javax.swing.*;
import java.awt.*;
public class ColorTabbedPane1 {

	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Tabbed Color Pane");

	        // Create TabbedPane
	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Red Panel
	        JPanel redPanel = new JPanel();
	        redPanel.setBackground(Color.RED);
	        tabbedPane.addTab("RED", redPanel);

	        // Blue Panel
	        JPanel bluePanel = new JPanel();
	        bluePanel.setBackground(Color.BLUE);
	        tabbedPane.addTab("BLUE", bluePanel);

	        // Green Panel
	        JPanel greenPanel = new JPanel();
	        greenPanel.setBackground(Color.GREEN);
	        tabbedPane.addTab("GREEN", greenPanel);

	        // Add tabbed pane to frame
	        frame.add(tabbedPane);
	        frame.setSize(400, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}

