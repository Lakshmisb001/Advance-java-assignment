/*5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
display the concerned color whenever the specific tab is selected in the Pan*/
package ADV_JAVA;
import javax.swing.*;
import java.awt.*;
public class ColorTabbedPane2 {

	    public static void main(String[] args) {
	        JFrame frame = new JFrame("CMY Tabbed Pane");

	        // Create TabbedPane
	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Cyan Panel
	        JPanel cyanPanel = new JPanel();
	        cyanPanel.setBackground(Color.CYAN);
	        tabbedPane.addTab("CYAN", cyanPanel);

	        // Magenta Panel
	        JPanel magentaPanel = new JPanel();
	        magentaPanel.setBackground(Color.MAGENTA);
	        tabbedPane.addTab("MAGENTA", magentaPanel);

	        // Yellow Panel
	        JPanel yellowPanel = new JPanel();
	        yellowPanel.setBackground(Color.YELLOW);
	        tabbedPane.addTab("YELLOW", yellowPanel);

	        // Add tabbed pane to frame
	        frame.add(tabbedPane);
	        frame.setSize(400, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}
