import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ThreeLetterWordCounter {
    public static void main(String[] args) {
        String filename = "file.txt"; 
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+"); 
                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z]", "");
                    if (word.length() == 3) {
                        count++;
                    }
                }
            }
            System.out.println("Number of three-letter words in the file: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
