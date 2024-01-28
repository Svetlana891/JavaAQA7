package task3;

public class Main {
    public static void main(String[] args) {
        Abstract student1 = new Abstract();
        student1.studentFullName = "Anderson";
        student1.itemName = "Philosophy";
        student1.numberOfPage = 100;
        student1.yearOfIssue = 2024;
        student1.coverColor = "Red";
        student1.nameOfInstitutionWhereTheStudentStudied = "University of London";
        student1.getInfo();

    }
}
