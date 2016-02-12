/*
 * model class
 * purpose:
 * 1. allow the user to load the data from a data source, such as a file.
 * 2. allow the user to update the data in the file.
 */
package JavaMVCModels;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author m
 */
public class HelloWorldModel {
    
    // Method to extract the data from the file.
    public String getData() throws FileNotFoundException, IOException {
        
        if (!new File("C:\\Users\\m\\file.txt").isFile()) {
            // Create -- Make sure file exists -- the file before continuing.
            Files.createFile(Paths.get("C:\\Users\\m\\file.txt"));
        }
        
        String data;
        // We will be using a try-with-resource block
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\m\\file.txt"))) {
            // Access the data from the file
            // Create a new StringBuilder
            StringBuilder string = new StringBuilder();
            
            // Read line-by-line
            String line = reader.readLine();
            string.append("<html>");
            // While there comes a new line, execute this:
            while (line != null) {
                // Add these lines to the String builder
                string.append(line);
                string.append("<br />");
                // Read the next line
                line = reader.readLine();
            }
            string.append("</html>");
            data = string.toString();
        } catch (Exception er) {
            // Since there was an error, you probably want to notify the user
            // for that error. So return the error.
            data = er.getMessage();
        }
        // Return the string read from the file
        return data;
    }
    
    // Method to save the data from the user.
    public boolean writeData(String data) throws IOException, FileNotFoundException {
        // Save the data to the File
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\m\\file.txt"))) {
            // Write the data to the File
            writer.write(data);
            // Return indicating the data was written
            return true;
        } catch (Exception er) {
            return false;
        }
    }
}
