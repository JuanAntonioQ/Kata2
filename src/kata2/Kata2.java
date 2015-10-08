package kata2;

import java.util.HashMap;

public class Kata2 {
    
    public static void main(String[] args) {
        
        Integer[] array = {2,2,11,4,2,6,11,2,3,5,11,5,100};
        String[] array1 = {"Ana", "Juan", "Pedro", "Juan", "Pedro", "Juan", "Pedro"};    
        
        Histogram histo = new Histogram(array);
        
        HashMap <String, Integer> histogram = histo.getHisto();
        
        
        for (Object key : histogram.keySet()) {
            System.out.println(key + ":" + histogram.get(key));
        }
        
    }
    
}
