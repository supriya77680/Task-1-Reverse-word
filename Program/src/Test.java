import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Logger;

public class Test {

    private final static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        logger.info("Pogramm started");

        BufferedWriter writer=null;
        try{
            String inputFile = "input.txt";
            String outPutFile = "output.txt";

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            writer = new BufferedWriter(new FileWriter(outPutFile));

            String line=null;
            while((line=reader.readLine())!=null){
                String res = reverse(line);
                System.out.println(res);
                writer.write(res);
                writer.newLine();

            }


        }
        catch (Exception e){
            logger.warning("File Not Found Exception accured"+e.getMessage());
        }
        finally {
            try {
                if(writer!=null){
                    writer.close();
                }
            }
            catch (Exception e){
                logger.info("Error closing file");
            }
        }
    }

    public static String reverse(String s){
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<arr.length; i++){
            sb.append(reverseWord(arr[i])+" ");
        }
        return sb.toString().trim();
    }
    public static String reverseWord(String s){
        StringBuilder sb = new StringBuilder();
        char ch = ' ';
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i)=='.' || s.charAt(i)==',' || s.charAt(i)=='!' || s.charAt(i)==';'){
                ch=s.charAt(i);
                continue;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        sb.append(ch);
        return sb.toString();
    }
}