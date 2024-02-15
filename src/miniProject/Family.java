package miniProject;

import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;


    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        mother.setFamily(this);
        father.setFamily(this);
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                '}';
    }

    public void printHuman(){
        System.out.println(Arrays.toString(children));
    }

    public void addChild(Human Child){
        if (getChildren() == null) {
            setChildren(new Human[1]);
            getChildren()[0] = Child;
        } else {
            Human[] array1 = new Human[getChildren().length + 1];
            for (int i = 0; i < getChildren().length; i++){
                array1[i] = getChildren()[i];
            }
            array1[array1.length - 1] = Child;
            setChildren(array1);
        }
    }

    public boolean deleteChild(int idOfHuman){
        if(idOfHuman > getChildren().length){
            return false;
        }
        if (!(idOfHuman == -1)){
            getChildren()[idOfHuman] = null;
            Human[] array2 = new Human[getChildren().length - 1];
            int x = 0;
            for(int i = 0; i < getChildren().length; i++){
                if(getChildren()[i] == null){
                    continue;
                }
                array2[x] = getChildren()[0];
                x++;
            }

        }
        return true;
    }

    public int countFamily(){
        int countFamilyMembers = children.length + 2;
        return countFamilyMembers;
    }

    public void greetPet() {
        System.out.println("Привіт, " + pet.getNickname());
    }

    public void describePet(){
        String petDescription = "У мене є " + pet.getSpecies()  + " їй " + pet.getAge() + " років, він";
        if (pet.getTrickLevel() > 50) {
            petDescription = petDescription + " дуже хитрий";
        } else {
            petDescription = petDescription + " майже не хитрий";
        }
        System.out.println(petDescription);
    }


    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
