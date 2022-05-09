import java.io.*;
import javax.swing.*;
import java.util.Scanner;

public class View2 extends JFrame{

    Scanner in = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void init2() {

        System.out.println("Baza danych Ksiazki");


        System.out.println("");
        int pin2 = 1;
        while (pin2 != 5) {
            System.out.println("Prosze wpisac liczbe:\n"+
                    "1 - Wypisac baze\n"+
                    "2 - Dodac ksiazke\n"+
                    "3 - Usunac ksiazke\n"+
                    "4 - Oznaczyć jako przeczytane/nieprzeczytane\n"+
                    "5 - Przejsc do statystyk");
            int pin = in.nextInt();
            pin2 = pin;
            if (pin == 1) {
                try (BufferedReader br = new BufferedReader(new FileReader("notes3.txt"))) {
                    String line = null;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                }
                catch(IOException ex){
                    System.out.println(ex.getMessage());
                }
            } else if (pin == 2){
                try(FileWriter writer = new FileWriter("notes3.txt", true))
                {
                    writer.append("\n");
                    writer.append("21");
                    writer.append(" ");
                    System.out.println("Prosze podac ksiazke");
                    String book = br.readLine();//*
                    writer.append(book);
                    writer.append(" ");
                    writer.append("by");
                    System.out.println("Prosze podac autora");
                    String author = br.readLine();
                    writer.append(author);
                    writer.append(" ");
                    writer.append("(");
                    System.out.println("Prosze podac rok");
                    String year = br.readLine();
                    writer.append(year);
                    writer.append(")");
                    writer.flush();
                }
                catch(IOException ex){

                    System.out.println(ex.getMessage());
                }
            }else if (pin == 3){
                System.out.println("3");
            }else if (pin == 4){
                System.out.println("4");
            }else if (pin == 5){
                System.out.println("Wyjscie z bazy dannych");
            } else {
                System.out.println("Prosze wpisac tylko dane numery");
            }
            }

        }
    }