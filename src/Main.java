import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("inputs//input_AoC_2b.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        List<String> listOfStrings = new ArrayList<>();

        String s;
        //put Strings in array
        while ((s = br.readLine()) != null) {
            if (s.isBlank()) continue;

            listOfStrings.add(s);
        }

        String location = "5";
        String bathroomCode = "";

        for(String inputString : listOfStrings) {
            for(int i=0; i<inputString.length(); i++){
                char symbol = inputString.charAt(i);

                if(symbol == 'U'){
                    if(location.equals("3")){
                        location = "1";
                    }
                    else if(location.equals("6")){
                        location = "2";
                    }
                    else if(location.equals("7")){
                        location = "3";
                    }
                    else if(location.equals("8")){
                        location = "4";
                    }
                    else if(location.equals("A")){
                        location = "6";
                    }
                    else if(location.equals("B")){
                        location = "7";
                    }
                    else if(location.equals("C")){
                        location = "8";
                    }
                    else if(location.equals("D")){
                        location = "B";
                    }

                }
                else if(symbol == 'D'){
                    if(location.equals("1")){
                        location = "3";
                    }
                    else if(location.equals("2")){
                        location = "6";
                    }
                    else if(location.equals("3")){
                        location = "7";
                    }
                    else if(location.equals("4")){
                        location = "8";
                    }
                    else if(location.equals("6")){
                        location = "A";
                    }
                    else if(location.equals("7")){
                        location = "B";
                    }
                    else if(location.equals("8")){
                        location = "C";
                    }
                    else if(location.equals("B")){
                        location = "D";
                    }
                }
                else if(symbol == 'L'){
                    if(location.equals("9")){
                        location = "8";
                    }
                    else if(location.equals("4")){
                        location = "3";
                    }
                    else if(location.equals("8")){
                        location = "7";
                    }
                    else if(location.equals("C")){
                        location = "B";
                    }
                    else if(location.equals("3")){
                        location = "2";
                    }
                    else if(location.equals("7")){
                        location = "6";
                    }
                    else if(location.equals("B")){
                        location = "A";
                    }
                    else if(location.equals("6")){
                        location = "5";
                    }
                }
                else if(symbol == 'R'){
                    if(location.equals("5")){
                        location = "6";
                    }
                    else if(location.equals("2")){
                        location = "3";
                    }
                    else if(location.equals("6")){
                        location = "7";
                    }
                    else if(location.equals("A")){
                        location = "B";
                    }
                    else if(location.equals("3")){
                        location = "4";
                    }
                    else if(location.equals("7")){
                        location = "8";
                    }
                    else if(location.equals("B")){
                        location = "C";
                    }
                    else if(location.equals("8")){
                        location = "9";
                    }
                }
            }
            bathroomCode += location;
        }
        System.out.println(bathroomCode);
    }
}