public enum BeverageSize {
    S("Small",100), M("Medium",150), L("Large",200);

    private String name;
    private int calories;

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    BeverageSize(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }
}
