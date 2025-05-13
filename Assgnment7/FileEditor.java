import java.io.*;
import java.util.Scanner;

public class FileEditor {
    public static void main(String[] args) {
        // Check if filename is provided via command line
        if (args.length == 0) {
            System.out.println("Usage: java FileEditor <filename>");
            return;
        }

        String filename = args[0];
        File file = new File(filename);
        Scanner scanner = new Scanner(System.in);

        // If file exists, display contents
        if (file.exists()) {
            System.out.println("\n--- File Contents ---");
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }

            // Ask user if they want to append
            System.out.print("\nDo you want to add data to the end of the file? (Yes/No): ");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("Yes")) {
                appendToFile(file, scanner);
            } else {
                System.out.println("No changes made.");
            }

        } else {
            System.out.println("File does not exist. Creating new file...");
            appendToFile(file, scanner);
        }
    }

    // Method to accept user input and write to file
    private static void appendToFile(File file, Scanner scanner) {
        System.out.println("Enter data (type 'exit' on a new line to stop):");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                writer.write(input);
                writer.newLine();
            }
            System.out.println("Data saved to file: " + file.getName());
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
