import java.io.File;
import java.util.Scanner;

class FileInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("File exists.");
            if (file.canRead()) {
                System.out.println("File is readable.");
            }
            if (file.canWrite()) {
                System.out.println("File is writable.");
            }
            if (fileName.endsWith(".txt")) {
                System.out.println("File type: Text file");
            } else if (fileName.endsWith(".pdf")) {
                System.out.println("File type: PDF file");
            } else {
                System.out.println("File type: Unknown");
            }
            long fileLength = file.length();
            System.out.println("File length: " + fileLength + " bytes");
        } else {
            System.out.println("File does not exist.");
        }

        scanner.close();
    }
}
