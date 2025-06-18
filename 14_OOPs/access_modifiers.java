public class access_modifiers {
    public static void main(String[] args) {
         BankAccount myAcc= new BankAccount();
        myAcc.username="ayushsolanki";
        // System.out.println(myAcc.password); //would cause error as no access
        myAcc.setPassword("ayush2208@@");
        System.out.println(myAcc.username);
    }
}



class BankAccount{
    //allow user to set password , but don't allow to access/check password. 
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password=pwd;
    }
}