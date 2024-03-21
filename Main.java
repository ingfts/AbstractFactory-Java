public class Main {
    public static void main(String[] args) {
        //Abstract factory --> instance = new + Concrete factory

        FactoringMaleKidsToys factoryMa= new MaleToysFactory();
        FactoringFemKidsToys factoryFe = new FemaleKidsToysFactory();



      //Type--> variable = instance.Function(Attributes)
       Toy car = factoryMa.create("police car", 8, 5F, 0.5F );
        car.create();
      //
        //

        //Type--> variable = instance.Function(Attributes)
        Toy toy1 = factoryFe.create("Doll", 3, 30.5f, 3.0f);
        toy1.create();
    }
}
