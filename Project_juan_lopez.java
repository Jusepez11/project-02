import java.util.*;
import java.io.*;

public class Project_juan_lopez {
    public static void main(String[] args) throws IOException{
        //declaring objects
        File f = new File("PolicyInformation.txt");
        Scanner sc = new Scanner(f);
        
        //Declaring variables
        int smoker = 0;
        int nonSmoker = 0;

        int pNum;
        String pName; 
        String phFirstName;
        String phLastName;
        int phAge;
        String phSmoking;
        float height;
        float weight;
        float bmi;

        //Declaring arraylist
        ArrayList<Policy> policyList = new ArrayList<>();

        while (sc.hasNextLine()) {
            pNum = Integer.parseInt(sc.nextLine());
            pName = sc.nextLine();
            phFirstName = sc.nextLine();
            phLastName = sc.nextLine();
            phAge = Integer.parseInt(sc.nextLine());
            phSmoking = sc.nextLine();

            if (phSmoking.equalsIgnoreCase("smoker")){
                ++smoker;
            }
            else{
                ++nonSmoker;
            }

            height = Float.parseFloat(sc.nextLine());
            weight = Float.parseFloat(sc.nextLine());

            sc.nextLine();
            policyList.add(new Policy(pNum, pName, phFirstName, phLastName, phAge, phSmoking, height, weight));
        } //End while

        sc.close();

        for (Policy p : policyList){
            p.Display();
            System.out.println("");
        }
        System.out.printf("\n\nThe number of policies with a smoker is:%s\nThe number of policies with a non-smoker is:%s", smoker, nonSmoker);
        
    }//End Main
}//End Class
