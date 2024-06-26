import java.util.Scanner;
public class StudentGradeCalculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects :");
        int numsubjects = sc.nextInt();
        int marks[] = new int[numsubjects];
        for(int i=0 ; i<numsubjects ; i++)
        {
            System.out.println("Enter marks for subjects " + (i +1) + " :");
            marks[i] = sc.nextInt();

        }
        int totalmarks = 0;
        for(int mark : marks)
        {
            totalmarks += mark;
        }
        double averagePercentage = (double) totalmarks / numsubjects;
        char Grade;
        if(averagePercentage >= 90)
        {
            Grade = 'A';
        }
        else if(averagePercentage >= 80)
        {
            Grade = 'B';
        }
        else if(averagePercentage >= 70)
        {
            Grade = 'C';
        }
        else if(averagePercentage >= 60)
        {
            Grade = 'D';
        }
        else
        {
            Grade = 'F';
        }
        System.out.println("Total marks :" + totalmarks);
        System.out.println("Avearge Percentage :" + averagePercentage + "%");
        System.out.println("Grade :" + Grade);
        sc.close();
    }
}
