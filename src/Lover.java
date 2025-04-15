class Lover {
    String name;
    int age;

    // 1. Default constructor
    Lover() {
        name = "Unknown";
        age = 0;
    }

    // 2. Only name
    Lover(String name) {
        this.name = name;
        this.age = 0;
    }

    // 3. Name + age
    Lover(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("Hi! I'm " + name + " and I'm " + age + " years old.");
    }

    void forNameShow (String name){
        String herName = name;
        // herName = "randi amgi";
        this.name= herName;
        System.out.println("name is :"+ herName);
    }
}
