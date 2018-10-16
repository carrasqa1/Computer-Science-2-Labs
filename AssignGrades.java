import java.util.Scanner;

public class AssignGrades{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of students : ");
    int students = sc.nextInt();
    int grades[] = new int[students];

    System.out.println("Enter "+students+" scores: ");

    for(int i = 0;i < students; i++){
      grades[i] = sc.nextInt();
    }
    System.out.println();

    for(int i = 0; i < grades.length; i++){
      if(grades[i] >= 60)
        System.out.println("Student "+ i +" score is "+ grades[i]+ " and grade is A");
      else if(grades[i] >= 50 && grades[i] < 60)
        System.out.println("Student "+ i +" score is "+ grades[i]+ " and grade is B");
      else if(grades[i] >= 40 && grades[i] < 50)
        System.out.println("Student "+ i +" score is "+ grades[i]+ " and grade is C");
      else if(grades[i] >= 28 && grades[i] < 40)
        System.out.println("Student "+ i +" score is "+ grades[i]+ " and grade is D");
      else
        System.out.println("Student "+ i +" score is "+ grades[i]+ " and grade is F");

    }

  }

 }