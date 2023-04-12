public class Policy {
    private int pNum;
    private int phAge;
    private String pName; 
    private String phFirstName;
    private String phLastName;
    private String phSmoking;
    private float bmi;
    private float height;
    private float weight;
    
    public Policy() {
        pNum = 0;
        pName = "";
        phFirstName = "";
        phLastName = "";
        phAge = 0;
        phSmoking = "";
        height = 0;
        weight = 0;
        
    }

    public Policy(int n, String pN, String phFN, String phLN, int phA, String phS, float h , float w ) {
        pNum = n;
        pName = pN;
        phFirstName = phFN;
        phLastName = phLN;
        phAge = phA;
        phSmoking = phS;
        height = h;
        //weight = w;
        
    }


    // <----------------------------------<Setters>------------------------------>
    public void setPolicyNumber(int n) {
        pNum = n;
    }

    public void setProviderName(String pN) {
        pName = pN;
    }

    public void setPolicyHolderFirstName(String phFN) {
        phFirstName = phFN;
    }
    
    public void setPolicyHolderLastName(String phLN) {
        phLastName = phLN;
    }

    public void setPolicyHolderAge(int phA) {
        phAge = phA;
    }

    public void setPolicyHolderSmokingStatus(String phS) {
        phSmoking = phS;
    }

    public void setPolicyHolderHeight(float h) {
        height = h;
    }

    public void setPolicyHolderWeight(float w) {
        weight = w;
    }


    // <----------------------------------<Getters>------------------------------>
    public int getPolicyNumber() {
        return pNum;
    }

    public String getProviderName() {
        return pName;
    }

    public String getPolicyHolderFirstName() {
        return phFirstName;
    }
    
    public String getPolicyHolderLastName() {
        return phLastName;
    }

    public int getPolicyHolderAge() {
        return phAge;
    }

    public String getPolicyHolderSmokingStatus() {
        return phSmoking;
    }

    public float getPolicyHolderHeight() {
        return height;
    }

    public float getPolicyHolderWeight() {
        return weight;
    }

    public float getBmi() {
        bmi = (weight*703)/(height*height);
        return bmi;
    }


    //total price of the insurance Policy
    public float insurancePolicyPrice() {
        //returns the base fee of 600 + the aditional fee depending on the bmi, + 75 if the policy holder is over 50, and an extra 100 if the policy holder is a smoker
        return (600 + ((bmi-35)*20) + (phAge>50 ? 75:0) + (phSmoking.equalsIgnoreCase("smoker")?100:0));
    }

    //Display result
    public void Display(){
        System.out.printf("\nPolicy Number: %s\n", pNum);
        System.out.printf("Provider Name: %s\n", pName);
        System.out.printf("Policyholder’s First Name:%s\n", phFirstName);
        System.out.printf("Policyholder’s Last Name: %s\n", phLastName);
        System.out.printf("Policyholder’s Age: %s\n", phAge);
        System.out.printf("Policyholder’s Smoking Status: %s\n", phSmoking);
        System.out.printf("Policyholder’s Height: %.1f inches\n", height);
        System.out.printf("Policyholder’s Weight: %.1f pounds\n", weight);
        System.out.printf("Policyholder’s BMI: %.2f\n", getBmi());
        System.out.printf("Policy Price: $%.2f\n", insurancePolicyPrice());
    }
}