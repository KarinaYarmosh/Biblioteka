import java.io.*;

public class Dzieci extends Books implements Serializable{
    private String rok;

    public Dzieci(String tytul, String autor, String rok, String stan){
        super(tytul, autor, stan);
        this.rok = rok;
    }
}

