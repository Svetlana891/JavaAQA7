package task3;

public class Abstract {
    public String studentFullName;
    public String itemName;
    public int numberOfPage;
    public int yearOfIssue;
    public String coverColor;
    public String nameOfInstitutionWhereTheStudentStudied;

    public void getInfo(){
        System.out.println(studentFullName + " " + itemName + " " + numberOfPage + " " + yearOfIssue + " " + coverColor
                + " " + nameOfInstitutionWhereTheStudentStudied);
    }

}
