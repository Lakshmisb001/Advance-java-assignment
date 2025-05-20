package ADV_JAVA;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CountryListConsole {

	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Country List");

	        // List of countries
	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada", "Denmark", 
	            "France", "Great Britain", "Japan", "Africa", 
	            "Greenland", "Singapore"
	        };

	        // Create JList and enable multiple selections
	        JList<String> countryList = new JList<>(countries);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

	        // Add listener to detect selection changes
	        countryList.addListSelectionListener(e -> {
	            if (!e.getValueIsAdjusting()) {
	                java.util.List<String> selected = countryList.getSelectedValuesList();
	                for (String country : selected) {
	                    System.out.println("Selected: " + country);
	                }
	            }
	        });

	        // Add to scroll pane and frame
	        frame.add(new JScrollPane(countryList));
	        frame.setSize(300, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
	}

