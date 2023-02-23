import javax.crypto.spec.DESKeySpec;

public class App {
    public static void main(String[] args) throws Exception {
        // Ejemplo clase básica
        User u = new User("Marc", "Guinea", 38);

        System.out.println("User fullname " + u.fullName());
        System.out.println("User age: " + u.age());
        System.out.println("Is underage? " + u.isUnderage());

        // Ejemplo herencia
        Animal c = new Cat("Misifú", "Pardo");
        Animal d = new Dog("Boby", "Pastor");
        
        // También válido, pero entonces no nos valdría para el método "animalSound":
        // Cat c = new Cat("Misifú", "Pardo");
        // Dog d = new Dog("Boby", "Pastor");
        
        animalSound(c);
        animalSound(d);

        // Ejemplo método static
        System.out.println(Math.pi());
    }

    private static void animalSound(Animal a) {
        System.out.println(a.name() + " hace " + a.sound());
    }
}
