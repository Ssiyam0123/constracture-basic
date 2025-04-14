public class App {
    public static void main(String[] args) {

        Lover l1 = new Lover(); // Default constructor
        l1.introduce();

        Lover l2 = new Lover("Mehjabin"); // Only name
        l2.introduce();

        Lover l3 = new Lover("Mehjabin", 21); // Name + age
        l3.introduce();
    }
}
