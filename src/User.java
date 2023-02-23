public class User {
    private String name;
    private String surname;
    private int age;

    /**
     * Esto es el constructor de la clase
     */
    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    /* Esto es un método que devuelve name + surname */
    public String fullName() {
        return this.name + " " + this.surname;
    }

    /* Esto es un getter */
    public int age() {
        return this.age;
    }

    public boolean isUnderage() {
        if (this.age < 18) {
            return true;
        }

        return false;
    }
}
