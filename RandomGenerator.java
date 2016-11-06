
package practice;

import java.util.Calendar;

/**
 *
 * @author Shlez
 */
public class RandomGenerator {
 
    private int random;
    
    public RandomGenerator() {
        this.random = 1;
    }
    
    public RandomGenerator(int random) {
        this.random = random;
    }
    
    public int next() {
        return ((this.random * 25173) + 13849) % 65536;
    }
    
    public static void main(String[] args) {
        
        RandomGenerator random = new RandomGenerator(1258);
        System.out.println("Random Number : " + random.next());
        
    }
}
