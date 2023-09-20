public enum Way {
    TAKE_AWAY("Take Away", 1.0), EAT_HERE("Eat Here", 1.5);

    private String name;
    private double tax;

    @Override
    public String toString() {
        return "Way - " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    Way(String name, double tax) {
        this.name = name;
        this.tax = tax;
    }
}
