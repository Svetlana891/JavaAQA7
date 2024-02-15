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
        Human human2 = new Human("Sandra", "Taylor", 1965, 80);
        Family family1 = new Family(human2, human1);
        Human human3 = new Human("Jacky", "King", 1990, 40, family1);
        family1.addChild(human3);
        Human human4 = new Human("Mark", "King", 1992, 50, family1);
        family1.addChild(human4);
        family1.printHuman();
        System.out.println(family1.countFamily());
        System.out.println(family1.getIdOfHuman(human3));
        family1.deleteChild(0);

        Pet pet2 = new Pet("cat", "Mia");
        Human human5 = new Human("Mike", "Smith", 1962, 85);
        Human human6 = new Human("Helen", "Miller", 1964, 75);
        Family family2 = new Family(human6, human5);
        Human human7 = new Human("Edward", "Smith", 1989, 30, family2);
        family2.addChild(human7);
        Human human8 = new Human("Kelly", "Smith", 1992, 40, family2);
        family2.addChild(human8);
        family2.printHuman();
        System.out.println(family2.countFamily());
        System.out.println(family2.getIdOfHuman(human7));
        family2.deleteChild(0);

        String[] arrayHabits = {"sing", "ran"};
        Pet pet3 = new Pet("cat","Oliver", 1, 60, arrayHabits);
        Human human9 = new Human("Jacky", "King", 1990, 80, family1);
        Human human10 = new Human("Edward", "Smith", 1989, 90, family2);
        Family family3 = new Family(human10, human9);
        Human human11 = new Human("Samuel", "Smith", 2020, 5, family3);
        family3.addChild(human11);
        Human human12 = new Human("Emily", "Smith", 2020, 3, family3);
        family3.addChild(human12);
        family3.printHuman();
        System.out.println(family3.countFamily());
        System.out.println(family3.getIdOfHuman(human12));
        family3.deleteChild(1);















    }
}
