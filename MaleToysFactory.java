public class MaleToysFactory implements FactoringMaleKidsToys {
    public Toy create(String type, int ageGroup, float height, float weight) {
        return new MaleKidToy(type, ageGroup, height, weight);
    }
}
