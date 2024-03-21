public class FemaleKidToy implements Toy {
    private String type;
    private int ageGroup;
    private float height;
    private float weight;

    // Constructor to initialize FemaleToy object
    public FemaleKidToy(String type, int ageGroup, float height, float weight) {
        this.type = type;
        this.ageGroup = ageGroup;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void create() {
        System.out.println("------Manufacturing information-----");
        System.out.println("Female kid toy");
        System.out.println("\nType of toy: " + this.type + "\nAge group: " + this.ageGroup + "\nHeight: " + this.height + "cm\nWeight: " + this.weight + "kg");
    }
}
