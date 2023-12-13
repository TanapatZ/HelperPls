package test;

import java.util.Arrays;
import java.util.Objects;
import test.item.*;
import test.Tool.*;

public class Container {

    private final item Item[] = new item[999];

    @Override
    public String toString() {
      
        StringBuilder sb = new StringBuilder();
        sb.append(Tool.count(Item));
        for (int i = 0; i < Tool.count(Item); i++) {

            sb.append(Item[i].toString());
        }

        sb.append('}');
        return sb.toString();
    }

    public boolean add(item item) {

        for (int i = 0; i <= Tool.count(Item); i++) {
             if (this.Item[i] == null && item != null ) {

                this.Item[i] = item;
                return true;
            }
            if (item != null && this.Item[i].isMatch(item)) {
                this.Item[i] = item;
                return true;
            }
           

            
        }

        return false;
    }

    public boolean remove(item item) {
        int count = Tool.count(Item);
        for (int i = 0; i <= this.Item.length; i++) {
            if (this.Item[i] == null) {

                return false;
            }

            if (this.Item[i].isMatch(item)) {
                Item[i] = Item[--count];
                this.Item[count] = null;
                return true;
            }
        }

        return false;
    }
}
