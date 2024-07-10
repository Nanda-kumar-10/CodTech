import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args){
        System.out.println("------Welecome to Students Grade Tracker!------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many students: ");
        int no = sc.nextInt();
        int[][] crd=new int[no][];
        int[] tolcrd=new int[no];
        int noSub;
        String[] StudentName = new String[no];
        int[] grdpt = new int[no];
        for(int i=0;i<no;i++){
            System.out.print("Enter the name of student "+(i+1)+" :");
            StudentName[i] = sc.next();
            System.out.print("Enter the number of subjects for which grade to be calculated: ");
            noSub = sc.nextInt();
            crd[i] = new int[noSub];
            grdpt[i]=0;
            tolcrd[i]=0;
            for(int j=0; j<noSub;j++){
                System.out.print("Enter the number of credits for course " +(j+1)+" :");
                crd[i][j] = sc.nextInt();
                System.out.print("Enter the Grade obtained in this subject (O/A+/A/B+/B/F): ");
                String s = sc.next();
                String letter = s.toUpperCase();
                switch (letter) {
                    case "O": grdpt[i] += 10*crd[i][j]; break;
                    case "A+": grdpt[i] += 9*crd[i][j]; break;
                    case "A": grdpt[i] += 8*crd[i][j]; break;
                    case "B+": grdpt[i] += 7*crd[i][j]; break;
                    case "B": grdpt[i] += 6*crd[i][j]; break;
                    case "F": grdpt[i] += 0*crd[i][j]; break;         
                    default: System.err.println("Enter the correct grade!!"); break;
                }
                tolcrd[i] +=crd[i][j];
            }
            System.out.println("The GPA of "+StudentName[i]+" is: "+ String.format("%.2f",(float) grdpt[i]/tolcrd[i]));

        }
        System.out.println("-------Exiting the Program-------");
        sc.close();
    }
}