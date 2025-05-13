import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File {
    public static void main(String[] args) {
        
        String filePath = "D:\\DYP\\Second Year\\Sem4\\AOOC\\Experiments\\Experiment 7\\Q1\\sample.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Contents of the file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file:");
            e.printStackTrace();
        }
    }
}
