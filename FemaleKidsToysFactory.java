public class FemaleKidsToysFactory implements FactoringFemKidsToys {
    // ---Type-> Function -> (Attributes inherited from the FactoringFemToys class, originally defined in the FemaleToy class, are implemented using polymorphism)
    public Toy create(String type, int ageGroup, float height, float weight){
        return new FemaleKidToy(type, ageGroup, height, weight);
    }


}
