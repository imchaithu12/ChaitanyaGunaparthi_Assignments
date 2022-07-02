package lambda;
import java.util.HashMap;

public class MixQ7 {
    public static void main(String[] args) {
        StringBuilder mix=new StringBuilder();
        HashMap<Integer,String> foor=new HashMap<>();
        foor.put(1,"nice");
        foor.put(2,"done");
        foor.put(3,"join");
        foor.put(4,"aggregate");
        //this method will make the key value pairs a string using string builder
        foor.entrySet().forEach(t-> mix.append(t));
        System.out.println(mix);
    }
}