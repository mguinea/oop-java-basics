public abstract class Animal {
    protected String name; // Al ser protected, será accesible desde una clase hija
    private String type; // Al ser privada, no será accesible desde una clase hija

    public Animal (String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String name () {
        return this.name;
    }

    public String type () {
        return this.type;
    }

    public abstract String sound (); // Al ser un método abstracto, se tiene que implementar en la clase hija
}
