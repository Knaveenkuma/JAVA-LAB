import java.io.*;

class BinaryFileReadWrite {
    public static void main(String[] args) {
        String fileName = "binaryfile.dat";
        
        try (FileOutputStream fos = new FileOutputStream(fileName);
             DataOutputStream dos = new DataOutputStream(fos)) {
            dos.writeInt(42);
            dos.writeDouble(3.14);
            dos.writeBoolean(true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream(fileName);
             DataInputStream dis = new DataInputStream(fis)) {
            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            boolean booleanValue = dis.readBoolean();

            System.out.println("Read int value: " + intValue);
            System.out.println("Read double value: " + doubleValue);
            System.out.println("Read boolean value: " + booleanValue);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter writer = new FileWriter(fileName);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write("Hello, this is a binary file example.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader reader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Read: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
