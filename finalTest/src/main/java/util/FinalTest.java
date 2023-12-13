
package util;
import test.*;

public class FinalTest {

    public static void main(String[] args) {
        item a = test.item.create("apple", 20);
        item b = test.item.create("banana", 40);
       a.add(a);
        System.out.println(a.add(b));
        System.out.println(a.toString());
       array2test();
       
    }
    public static void array2test(){
       item c = test.item.create("papaya", 20);
        item d = test.item.create("pineapple", 40);

        Container x = new  Container();
        x.add(c);
        x.add(d);
      
        System.out.println(x.toString());
    
    }
}
