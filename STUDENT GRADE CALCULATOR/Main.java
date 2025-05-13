import java.util.*;

class Grade{
    public String grade(int avgper){
        switch (avgper / 10) {
            case 10:
                return "A+";
            case 9:
                return "A";
            case 8:
                return "B+";
            case 7:
                return "B";
            case 6:
                return "C";
            case 5:
                return "D";
            default:
                return "F";
        }
    }
}

public class Main{
    public static void main(String[] args){
        Grade g = new Grade();
        Scanner sc = new Scanner(System.in);

        //Taking total no.of subjects
        System.out.println("Enter the total no.of subjects");
        int totalsubs = sc.nextInt();
        int totalmarks = 0;

        //Sum up the marks obtained in all subjects.
        for (int i=0; i<totalsubs; i++) {
            System.out.println("Enter the marks obtained in subject " + (i + 1));
            int marks = sc.nextInt();
            totalmarks += marks;
        }

        //Calculating the Percentage
        int avgper = totalmarks / totalsubs;

        //Assign grades based on average percentage.
        String Grade = g.grade(avgper);

        //Displaying all the information
        System.out.println("Total marks obtained : " + totalmarks);
        System.out.println("Percentage obtained : " + avgper+"%");
        System.out.println("Grade obtained : " + Grade);

        sc.close();
        
    }
}
