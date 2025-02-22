class SuperMost {
    private int privateValue = 100;
    public int getPrivateValue() {
    return privateValue;
    }
}
class Super extends SuperMost {
    protected int protectedValue = 200;
}

class SubClass extends Super {
    int defaultValue = 300; 

    void displayValues() {
        System.out.println("Private Value   : " + getPrivateValue());

        System.out.println("Protected Value : " +  protectedValue);
 
        System.out.println("Default Value   : " +    defaultValue);
    }
}

public class Main {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.displayValues();
    }
}

