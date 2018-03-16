package decoratorPattern;

public abstract class Beverage {
    protected String description = "Unknown Beverage";
    protected int size = 0;

    public String getDescription() {
        return description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract double cost();

    public void printInfo() {
        System.out.println(getDescription() + ": $" + cost());
    }
}
