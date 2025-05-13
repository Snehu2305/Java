import java.io.*;

public class FileAnalysis {
    public static void main(String[] args) {
        // Change this path to the actual file location
        String filePath = "D:\\DYP\\Second Year\\Sem4\\AOOC\\Experiments\\Experiment 7\\Q3\\sample.txt";

        int vowelCount = 0;
        int wordCount = 0;
        int aCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                // Count vowels and 'a'
                for (char ch : line.toLowerCase().toCharArray()) {
                    if ("aeiou".indexOf(ch) != -1) {
                        vowelCount++;
                    }
                    if (ch == 'a') {
                        aCount++;
                    }
                }

                // Count words
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            // Output the results
            System.out.println("Total number of vowels: " + vowelCount);
            System.out.println("Total number of words : " + wordCount);
            System.out.println("Occurrences of 'a'     : " + aCount);

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
