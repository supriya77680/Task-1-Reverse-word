import java.io.*;
import java.util.logging.Logger;

public class Main {

    private final static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        logger.info("Starting the program to run");

        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            String input = "input.txt";
            String output = "output.txt";

            FileInputStream fileInputStream = new FileInputStream(input);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            bufferedReader = new BufferedReader(inputStreamReader);

            FileOutputStream fileOutputStream = new FileOutputStream(output);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            bufferedWriter = new BufferedWriter(outputStreamWriter);

            String content;
            while ((content=bufferedReader.readLine()) != null) {
                String reverseString = reverse(content);
                System.out.println(reverseString);
                bufferedWriter.write(reverseString);
                bufferedWriter.newLine();
            }

        } catch (Exception e) {
            logger.warning("Exception of file not found" + e.getMessage());
        }

        finally {
        try {
            if(bufferedWriter!=null){
                bufferedWriter.close();
            }
            if(bufferedReader!=null){
                bufferedReader.close();
            }
        }
        catch (Exception e){
            logger.info("Error in closing writer or reader file");
        }
    }
}
        public static String reverse (String s){
            String[] arr = s.split(" ");
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                stringBuilder.append(reverseWord(arr[i]) + " ");
            }
            return stringBuilder.toString().trim();
        }

        public static String reverseWord (String s){
            StringBuilder sb = new StringBuilder();
            char ch = ' ';
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == '!' || s.charAt(i) == ';') {
                    ch = s.charAt(i);
                    continue;
                } else {
                    sb.append(s.charAt(i));
                }
            }
            sb.append(ch);
            return sb.toString();
        }
    }
