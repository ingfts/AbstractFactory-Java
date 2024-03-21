
## Toy Factory Implementation🏭
[![](https://skills.thijs.gg/icons?i=java)](https://skills.thijs.gg)

### Purpose📋:
The code implements a toy factory design pattern to create and manage different types of toys for kids. It utilizes interfaces and classes to define toy creation processes for both female and male toys.

### Components🧪:
1. **Interfaces:**
   - `FactoringFemKidsToys`: Defines a factory interface for creating female kid toys.
   - `FactoringMaleKidsToys`: Defines a factory interface for creating male kid toys.

2. **Toy Classes:**
   - `FemaleKidToy`: Represents a female kid toy with attributes such as type, age group, height, and weight.
   - `MaleKidToy`: Represents a male kid toy with similar attributes as the female kid toy.

3. **Factory Classes:**
   - `FemaleKidsToysFactory`: Implements the factory interface for creating female kid toys. It creates instances of `FemaleKidToy`.
   - `MaleToysFactory`: Implements the factory interface for creating male kid toys. It creates instances of `MaleKidToy`.

4. **Main Class:**
   - `Main`: Contains the main method where toy creation processes are demonstrated. It creates instances of both factory classes and uses them to create specific types of toys.

### Processes🔍:
1. Creation of Factory Interfaces:
   - Two interfaces are defined: one for creating female kid toys (`FactoringFemKidsToys`) and the other for creating male kid toys (`FactoringMaleKidsToys`).

2. Implementation of Toy Classes:
   - `FemaleKidToy` and `MaleKidToy` classes implement the `Toy` interface and represent female and male kid toys, respectively. They contain attributes such as type, age group, height, and weight.

3. Implementation of Factory Classes:
   - `FemaleKidsToysFactory` and `MaleToysFactory` classes implement the factory interfaces to create instances of female and male kid toys, respectively.

4. Main Method Demonstration:
   - In the `Main` class, instances of both factory classes are created. Specific types of toys are then created using these factories, demonstrating the toy creation processes.

### Conclusion🚀:
The implemented toy factory design pattern provides a flexible and scalable approach to create various types of toys for kids, catering to different preferences and requirements.



