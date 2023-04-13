import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class CandidateCode {

    public static void main (String []args){
        Scanner scanner=new Scanner(System.in);
        int noOfStudents=scanner.nextInt();
        ArrayList<Integer> recordedStudentlist=new ArrayList<>();
        for(int i=0;i<noOfStudents;i++){
            recordedStudentlist.add(scanner.nextInt());
        }
        System.out.println(noOfStudents);
        //System.out.println(recordedStudentlist);
        LinkedHashSet<Integer> actualPresentStudents=new LinkedHashSet<>();
        for(int i:recordedStudentlist){
            actualPresentStudents.add(i);
        }
        System.out.println(actualPresentStudents);
        LinkedHashSet<Integer> presentStudentlist=new LinkedHashSet<>();
        LinkedHashSet<Integer> absentStudentlist=new LinkedHashSet<>();
        LinkedHashSet<Integer> finalList=new LinkedHashSet<>();
        for(int j=1;j<=noOfStudents;j++){
          // for(int k:actualPresentStudents){
               if(actualPresentStudents.contains(j)){
                   presentStudentlist.add(j);
               }else absentStudentlist.add(j);
           //}
        }
        System.out.println(presentStudentlist);
        System.out.println(absentStudentlist);
    }
}
