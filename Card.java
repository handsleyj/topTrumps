public class Card {
    private String name;
    private Category[] category;

    public Card(String s, int speed, int weight, int era, int legs, int wings) {
        this.name = s;
        this.category = new Category[5];
        this.category[0] = new Category("Speed", speed);
        this.category[1] = new Category("Weight", weight);
        this.category[2] = new Category("Era", era);
        this.category[3] = new Category("Legs", legs);
        this.category[4] = new Category("Wings", wings);
    }

    public String getName() {
        return this.name;
    }

    public Category getCategory(String s) {
        int j = 0;
        boolean found = false;
        do {
            if (this.category[j].getName() != s) {
                j++;
            }
            else {
                found = true;
            }
        }
        while (found == false);
        return category[j];
    }

    public boolean isBetterThan(Card c, String categoryName) {
        if (this.getCategory(categoryName).getValue() > c.getCategory(categoryName).getValue()) {
            return true;
        }
        else {
            return false;
        }
    }
}
