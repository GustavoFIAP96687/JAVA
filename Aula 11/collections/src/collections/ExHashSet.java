package collections;

import java.util.HashSet;
import java.util.Iterator;


public class ExHashSet {


    public static void main(String[] args) {
   
        HashSet<String> set = new HashSet<String>();
       
        set.add("um");
        set.add("dois");
        set.add("tres");
        set.add("dois"); //será eliminado da coleção
        set.add("quatro");
       
        set.remove("tres");
           
        System.out.println("Tamanho do set: " + set.size());
       
        Iterator<String> itr = set.iterator();
         
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

