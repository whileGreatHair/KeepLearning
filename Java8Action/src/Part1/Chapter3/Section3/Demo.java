package Part1.Chapter3.Section3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author yiqru
 * @date 2022/2/24 10:20 AM
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        String result = processFile();
    }

    private static String processFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            return br.readLine();
        }
    }
}
