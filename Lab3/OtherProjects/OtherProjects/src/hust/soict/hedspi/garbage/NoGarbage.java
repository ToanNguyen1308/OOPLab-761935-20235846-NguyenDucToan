package hust.soict.hedspi.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) throws Exception {
        String filename = "test.txt";
        byte[] inputBytes = Files.readAllBytes(Paths.get(filename));
        long startTime = System.currentTimeMillis();

        StringBuilder outputBuilder = new StringBuilder();
        for (byte b : inputBytes) {
            outputBuilder.append((char) b);
        }

        String outputString = outputBuilder.toString(); // chỉ tạo 1 chuỗi cuối cùng

        long endTime = System.currentTimeMillis();
        System.out.println("Time (NoGarbage): " + (endTime - startTime) + " ms");
    }
}
