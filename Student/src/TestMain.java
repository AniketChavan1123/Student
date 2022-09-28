import java.util.Scanner;

public class TestMain {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        Student stu[] = new Student[3];
        stu[0]=new Student();
        stu[1]=new Student();
        stu[2]=new Student();
        String name;
        int fees;
        Student demo = new Student();


        stu[0].setStudentId(12);
        stu[0].setStudentName("Raj");
        stu[0].setCity("Pune");
        stu[0].setMarks1(61);
        stu[0].setMarks2(87);
        stu[0].setMarks3(69);
        stu[0].setFeePerMonth(1200.0f);

        stu[1].setStudentId(15);
        stu[1].setStudentName("Shami");
        stu[1].setCity("Delhi");
        stu[1].setMarks1(74);
        stu[1].setMarks2(59);
        stu[1].setMarks3(82);
        stu[1].setFeePerMonth(1745.00f);

        stu[2].setStudentId(18);
        stu[2].setStudentName("Veer");
        stu[2].setCity("Kanpur");
        stu[2].setMarks1(92);
        stu[2].setMarks2(48);
        stu[2].setMarks3(53);
        stu[2].setFeePerMonth(1311.0f);

        System.out.println(displayHighest(stu)+" scored highest marks");
        demo = leastFee(stu);
        System.out.println(demo.getStudentName()+" pays least i.e "+demo.getAnnualFee());
        displayEligibility(stu);


    }

    static String displayHighest(Student stu[])
    {
        int max=0;
        String name="";
        for (int i = 0; i < stu.length; i++) {
            if(max<=stu[i].getTotalMarks())
            {
                max=stu[i].getTotalMarks();
                name=stu[i].getStudentName();
            }
        }
        return name;
    }
    static Student leastFee(Student stu[])
    {
        int j=0;
        float min=stu[1].getFeePerMonth();
        for (int i = 0; i < stu.length; i++) {
            if(min>=stu[i].getFeePerMonth())
            {
                min=stu[i].getFeePerMonth();
                j=i;
            }
        }
        return stu[j];
    }

    static void displayEligibility(Student stu[])
    {
        for (int i = 0; i < stu.length; i++) {
            if(stu[i].getResult())
            {
                stu[i].setEligibleForScholarship(true);
            }
            else
                stu[i].setEligibleForScholarship(false);

            System.out.println("Student name : "+stu[i].getStudentName());
            System.out.println("Total marks : "+stu[i].getTotalMarks());
            System.out.println("Average marks   : "+stu[i].getAverage());
            System.out.println("Result : "+(stu[i].getResult()?"Pass":"fail"));
            System.out.println("Result : "+(stu[i].isEligibleForScholarship()?
                    "Scholarship Available ":"Scholarship Not Available"));
            System.out.println();





        }
    }
}
