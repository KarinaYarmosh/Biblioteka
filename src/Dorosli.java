import java.io.*;

public class Dorosli extends Books implements Serializable{
    private String rok;

    public Dorosli(String tytul, String autor, String rok, String stan){
        super(tytul, autor, stan);
        this.rok = rok;
    }
}
