package test;

import test.Tool.*;

public class item {

    private final String name;
    private int amount;

    private item(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public static item create(String name, int amount) {
        if (Tool.isUsable(name) && amount > 0) {
            return new item(name, amount);
        }
        return null;
    }

    public int add(item item1) {
        return amount += item1.amount;
    }

    public boolean isMatch(item item1) {
        return (name.equals(item1.name));
    }

    @Override
    public String toString() {
        return "{" + "name=" + name + ", amount=" + amount + '}';
    }

}
