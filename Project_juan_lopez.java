import java.util.*;

import javax.sql.PooledConnection;

import java.io.*;

public class Project_juan_lopez {
    public static void main(String[] args) throws IOException{
        //declaring objects
        Policy policy = new Policy();
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

            /**
             * @param
             * saving the info from the txt file into varibles to then save it into an array
             */
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
            if (sc.hasNextLine())
                {
                    sc.nextLine();
                }
            policy.setPolicyNumber(pNum);
            policy.setProviderName(pName);
            policy.setPolicyHolderFirstName(phFirstName);
            policy.setPolicyHolderLastName(phLastName);
            policy.setPolicyHolderAge(phAge);
            policy.setPolicyHolderSmokingStatus(phSmoking);
            policy.setPolicyHolderHeight(height);
            policy.setPolicyHolderWeight(weight);
            policyList.add(policy);
        } //End while

        sc.close();

        for (Policy p : policyList){
            p.Display();
            System.out.println("");
        }
        System.out.printf("\nThe number of policies with a smoker is:%s\nThe number of policies with a non-smoker is:%s", smoker, nonSmoker);
        
    }//End Main
}//End Class
