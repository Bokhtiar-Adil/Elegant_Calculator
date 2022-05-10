package MyPackage;

public class myClass {
    int roll;
    String name;

    myClass(int x, String y)
    {
        this.roll = x;
        this.name = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}
