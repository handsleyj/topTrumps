public class Category {
    private String name;
    private int value;

    public Category(String s, int n) {
        this.name = s;
        this.value = n;
    }

    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }
}
