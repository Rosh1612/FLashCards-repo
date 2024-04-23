//flashcard login 
import java.util.Scanner;

class Login{
    private String[] user = new String[]{
        "rosh1", //at 0 index
        "abc123",//at 1 index
        "ABC123",//at 2 index
        "Roshan",//at 3 index
    };
    // private final String u2 = "Rosh2";
    private String[] temp = new String[4];
    public Scanner sc = new Scanner(System.in);
    static int x = 0;

    public String password(int UserNo){
        System.out.print("For Username user-" +UserNo +" Enter password : ");
        temp[UserNo] = sc.nextLine();
        return temp[UserNo];     
}

public void getUser(){
    // System.out.print("Enter user number : ");
    // x = sc.nextInt();
    login();
}
    public void login(){
        int n = 0;
        int UserNo = x+2;
        if(user[UserNo]==(password(UserNo))){ //cannot use == equals operator because it'll check refrence value and we need to check value on that refrence so use mentioned approach
        // if(user[UserNo].equals(password(UserNo))){ //cannot use == equals operator because it'll check refrence value and we need to check value on that refrence so use mentioned approach
         
            System.out.println("_______________________________________________________________");
            System.out.println("Redirecting to your account");
            System.out.println("_______________________________________________________________");
            //will start login session code

        }
        else{
            System.out.println("Wrong password");
            
                System.out.println("Do you want to forget password -> press y for 1 and 0 for no and 2 for creating new account");
                n = sc.nextInt();
                switch(n){

                    case 0:{
                        int nn;
                        System.out.println("want to get guest account-> press 1 for yes and 0 for getting out");
                        nn = sc.nextInt();
                        switch(nn){
                            case 1:{
                                guestuser();
                                break;                
                            }
                            case 0:{
                                break;
                            }
                        }
                        break;
                    }
                    case 1:{
                        System.out.println("Enter phone number to get otp to confirm enter into your account");
                        //procedure to write
                    }
                    case 2:{
                        System.out.println("Enter phone number for creating new account");
                        //procedure to write
                    }
                }
            } 
    }

    void guestuser(){
        // char c1[] = new c1[10];
        System.out.println("Ready to start creating your deck of cards");
    }
}

class loginFlashCards{
    public static void main(String []args){
        Login l1 = new Login();
        
        // System.out.println("Enter user number(existing from 0 to 3) for log into account - ");
        l1.getUser();
        // l1.login();
    }
}