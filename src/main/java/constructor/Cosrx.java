package constructor;

public class Cosrx extends Brand {
    String name;

    public Cosrx(String name, String brandType) {
        super(brandType);
        this.name = name;
    }

    public Cosrx(String name) {
        super("Beauty");
        this.name = name;
    }

    public static void main(String[] args) {
        Cosrx cosrx = new Cosrx("Essence");
        System.out.println(cosrx.brandType);
        System.out.println(cosrx.name);

        cosrx = new Cosrx("Cream", "Cosrx");
        System.out.println(cosrx.name);
        System.out.println(cosrx.brandType);
    }
}
