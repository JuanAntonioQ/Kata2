package kata2;

import java.util.HashMap;

public class Kata2 {
    
    public static void main(String[] args) {
        
        int[] array = {2,2,11,4,2,6,11,2,3,5,11,5,100};
        
        
        Histogram histo = new Histogram(array);
        
        HashMap <Integer, Integer> histogram = histo.getHisto();
        
        
        for (int key : histogram.keySet()) {
            System.out.println(key + ":" + histogram.get(key));
        }
        
    }
    
}
