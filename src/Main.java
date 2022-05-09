import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException{

        Model model = new Model();
        Controller controller = new Controller(model);
        View view = new View(controller);
        SwingUtilities.invokeLater(() -> {
            view.init();
        });

        SwingUtilities.invokeLater(() -> {
            ArrayList<String> book_atributes = new ArrayList<String>();
            EnterController enterController = new EnterController();
            try {
                book_atributes = enterController.Startwindow(args);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Throwable t){
                System.out.println(t);
            }
            for (int i = 0; i <= 3; i++) {
                System.out.println(book_atributes.get(i));
            }
        });


    }

    /////
    static void x() {
        for(Books b:Books.Books){
            System.out.println(b);
        }
    }
}
