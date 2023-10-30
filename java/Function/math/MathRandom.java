
package Function.math;
import java.util.Random;
public class MathRandom {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(random(500));
            System.out.println(randomMath());
        }
        
        
    }
    public static int randomMath(){
    return (int) (Math.random()*10+5);
    
    }
    public static int random(int max){
    Random a = new Random();
    int ans = a.nextInt(max+1);
    return ans;
    
    
    }
}
