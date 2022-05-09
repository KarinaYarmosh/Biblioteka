import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Books implements Serializable{
    private String tytul;
    private String autor;
    private String rok;
    private String stan;

    static ArrayList <Books> Books = new ArrayList<>();

    public String getTytul(){
        return tytul;
    }

    public String getAutor(){
        return autor;
    }

    public String getRok(){
        return rok;
    }

    public void setRok(String rok){
        this.rok = rok;
    }

    public String getStan(){
        return stan;
    }

    public Books(String tytul, String autor, String stan) {
        this.tytul = tytul;
        this.autor = autor;
        this.stan = stan;
    }

    public String toString(){
        return "Tytul ksiazki : "+tytul+" Autor: "+autor+ " Rok: "+rok+" Stan: "+stan;
    }




}
