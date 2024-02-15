package miniProject;
public class Main {
    public static void main(String[] args) {
        Human human01 = new Human();
        Human human02 = new Human();
        Family family01 = new Family(human02, human01);
        Human human03 = new Human();
        family01.addChild(human03);
        Pet pet01 = new Pet();
        family01.setPet(pet01);

        Pet pet1 = new Pet("dog", "Frida");
        Human human1 = new Human("Arthur", "King", 1963, 90);
        System.out.println(human1);
        Human human2 = new Human("Sandra", "Taylor", 1965, 80);
        System.out.println(human2);
        Family family1 = new Family(human2, human1);
        Human human3 = new Human("Jacky", "King", 1990, 4, family1);
        System.out.println(human3);
        family1.addChild(human3);
        Human human4 = new Human("Mark", "King", 1992, 5, family1);
        System.out.println(human4);
        family1.addChild(human4);
        family1.setPet(pet1);
        family1.printHuman();
        System.out.println(family1.countFamily());
        System.out.println(family1.getIdOfHuman(human3));
        family1.deleteChild(0);

        Pet pet2 = new Pet("cat", "Mia");
        Human human5 = new Human("Mike", "Smith", 1962, 85);
        System.out.println(human5);
        Human human6 = new Human("Helen", "Miller", 1964, 75);
        System.out.println(human6);
        Family family2 = new Family(human6, human5);
        Human human7 = new Human("Edward", "Smith", 1989, 3, family2);
        System.out.println(human7);
        family2.addChild(human7);
        Human human8 = new Human("Kelly", "Smith", 1992, 4, family2);
        System.out.println(human8);
        family2.addChild(human8);
        family2.setPet(pet2);
        family2.printHuman();
        System.out.println(family2.countFamily());
        System.out.println(family2.getIdOfHuman(human7));
        family2.deleteChild(0);

        String[] arrayHabits = {"sing", "ran"};
        Pet pet3 = new Pet("cat","Oliver", 1, 60, arrayHabits);
        Human human9 = new Human("Jacky", "King", 1990, 80, family1);
        System.out.println(human9);
        Human human10 = new Human("Edward", "Smith", 1989, 90, family2);
        System.out.println(human10);
        Family family3 = new Family(human10, human9);
        Human human11 = new Human("Samuel", "Smith", 2020, 5, family3);
        System.out.println(human11);
        family3.addChild(human11);
        Human human12 = new Human("Emily", "Smith", 2021, 3, family3);
        System.out.println(human12);
        family3.addChild(human12);
        family3.setPet(pet3);
        family3.printHuman();
        System.out.println(family3.countFamily());
        System.out.println(family3.getIdOfHuman(human12));
        family3.deleteChild(1);


        String[] arrayHabits1 = {"jump", "miss"};
        Pet pet4 = new Pet("cat","Lola", 2, 50, arrayHabits1);
        Human human13 = new Human("Mark", "King", 1992, 70, family1);
        Human human14 = new Human("Kelly", "Smith", 1992, 80, family2);
        Family family4 = new Family(human14, human13);
        Human human15 = new Human("Emma", "King", 2022, 3, family4);
        family4.addChild(human15);
        family4.setPet(pet4);
        System.out.println(human15);
        human15.getName();
        human15.setFamily(family4);
        human15.getSurname();
        human15.getFamily().getPet();
        human15.getIq();
        human15.getYear();
        human15.setIq(3);
        human15.setYear(2022);
        human15.setName("Emma");
        human15.setSurname("King");
        human15.equals(human14);
        human15.hashCode();


        System.out.println(pet4);
        pet4.eat();
        pet4.respond();
        pet4.foul();


    }
}
