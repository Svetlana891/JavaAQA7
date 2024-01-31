package task2;

public class Tree {
    public String type;
    public int height;
    public int countOfSticks;
    public String colour;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getCountOfSticks() {
        return countOfSticks;
    }

    public void setCountOfSticks(int countOfSticks) {
        this.countOfSticks = countOfSticks;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Tree(String type, int height) {
        this.type = type;
        this.height = height;
        this.countOfSticks = 13;
        this.colour = "green";
    }

    public Tree(int height, int countOfSticks, String colour) {
        this.height = height;
        this.countOfSticks = countOfSticks;
        this.colour = colour;
        this.type = "fir";
    }

    public Tree(){
        this.height = 350;
        this.countOfSticks = 29;
        this.colour = "yellow";
    }

    public Tree(String type, Tree newTree ) {
        this.type = type;
        this.height = 350;
        this.countOfSticks = 29;
        this.colour = "yellow";
    }

    public void getInfo(){
        System.out.println(getType());
        System.out.println(getHeight());
        System.out.println(getCountOfSticks());
        System.out.println(getColour());
    }
}
