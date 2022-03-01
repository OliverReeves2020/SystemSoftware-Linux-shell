
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/* bellow code reads in commands and any arguements, using the string as an array allows
for multiple diffrent lengths of code to be implemented */

public class shell {
    public static void main(String[] args) throws IOException,
    InterruptedException {
        String [] command = {"ls"};
        var processBuilder = new ProcessBuilder();
        processBuilder.command(command);
        var process = processBuilder.start();

        try (var reader = new BufferedReader(
            new InputStreamReader(process.getInputStream()))){
                String line;
                while ((line = reader.readLine()) != null){
                    System.out.println(line);
                }
            }




        
    }
}
