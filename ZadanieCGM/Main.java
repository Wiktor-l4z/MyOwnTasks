import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {



        public static final String STRING_FORMAT = "%-60s%s%n";

        public static void main(String[] args) {
            FileReader in = null;
            try {
                in = new FileReader("myinput.txt");
                BufferedReader br = new BufferedReader(in);

                StringBuilder stringBuilder = new StringBuilder();

                String temp;
                while ((temp = br.readLine()) != null) {
                    stringBuilder.append(temp);
                    stringBuilder.append("\n");
                }

                String[] split = stringBuilder.toString().split("\n\n");
                String[] paragraph1 = split[0].split("\n");
                String[] paragraph2 = split[1].split("\n");

                int counter = 0;
                while (true) {
                    String tempP1 = "";
                    String tempP2 = "";

                    if (paragraph1.length > counter) {
                        tempP1 = paragraph1[counter];
                    }
                    if (paragraph2.length > counter) {
                        tempP2 = paragraph2[counter];
                    }

                    System.out.printf(STRING_FORMAT, tempP1, tempP2);
                    counter++;

                    if (counter > Math.max(paragraph1.length, paragraph2.length)) {
                        break;
                    }
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }

    }


