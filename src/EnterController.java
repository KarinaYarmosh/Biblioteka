/*import Custemerts;
import Notdividual;
import NotIndividual;*/

import java.util.*; //ArrayList, Scanner
import java.io.*;

public class EnterController {
    private Books books;
    private Dorosli dorosli;
    private Dzieci dzieci;
    private BooksEnterView custemersEnterView;
    Scanner in = new Scanner(System.in);
    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<String> book_atributes = new ArrayList<String>();
    int regorlog;
    int indorfirm;
    int stroki;
    String book_tytul;
    String book_autor;
    String book_rok;
    String book_stan;


    /*public EnterController(Custemers custemers, Individual individual, NotIndividual notIndividual){
        this.custemers = custemers;
        this.individual = individual;
        this.notIndividual = notIndividual;
        //this.custemersEnterView = custemersEnterView;
    }*/

    public ArrayList<String> Startwindow(String args[]) throws IOException, ClassNotFoundException{
        BooksEnterView.reg_login();
        regorlog = Integer.parseInt(scan.readLine());
        if (regorlog == 1) {
            InputStream is = new BufferedInputStream(new FileInputStream("notes.txt"));
            /*try {
                byte[] c = new byte[1024];
                int count = 0;
                int readChars = 0;
                boolean empty = true;
                while ((readChars = is.read(c)) != -1) {
                    empty = false;
                    for (int i = 0; i < readChars; ++i) {
                        if (c[i] == '\n') {
                            ++count;
                        }
                    }
                }
                stroki = (count == 0 && !empty) ? 1 : count;
            } finally {
                is.close();
            }*/
            BooksEnterView.register();
            indorfirm = Integer.parseInt(scan.readLine());
            if (indorfirm == 1) {

                BooksEnterView.tytul();
                book_tytul = scan.readLine();

                BooksEnterView.autor();
                book_autor = scan.readLine();

                BooksEnterView.rok();
                book_rok = scan.readLine();

                BooksEnterView.stan();
                book_stan = scan.readLine();

                Books books = new Books(book_tytul, book_autor, book_rok);

                //создаем 2 потока для сериализации объекта и сохранения его в файл
                FileOutputStream outputStream = new FileOutputStream("save1.ser");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

                // сохраняем игру в файл
                objectOutputStream.writeObject(books);

                //закрываем поток и освобождаем ресурсы
                objectOutputStream.close();

                book_atributes.add(book_tytul);
                book_atributes.add(book_autor);
                book_atributes.add(book_rok);
                book_atributes.add(book_stan);

            } else if (indorfirm == 2) {
                /*BooksEnterView.tytul();
                book_tytul = scan.readLine();

                BooksEnterView.autor();
                book_autor = scan.readLine();

                BooksEnterView.rok();
                book_rok = scan.readLine();

                BooksEnterView.stan();
                book_stan = scan.readLine();

                book_atributes.add(book_tytul);
                book_atributes.add(book_autor);
                book_atributes.add(book_rok);
                book_atributes.add(book_stan);*/
                FileInputStream fileInputStream = new FileInputStream("save1.ser");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                Books books = (Books) objectInputStream.readObject();

                System.out.println(books);
            } else if (indorfirm == 3) {

            }
        } else if (regorlog == 2) {

        }
        return book_atributes;
    }
}