import java.util.Scanner;
import java.lang.*;

class Choose{
    String str;
    Scanner sc = new Scanner(System.in);

    void operation(){

        do{
            System.out.println("Choose operation you want to perform");
        System.out.println("write-> create for create directory_choose for directory choose,");
        System.out.println(" updateinfo for updating information and n for terminating process");
        
         System.out.println("Enter operation you want to perform");
        str = sc.nextLine();
        
        switch(str){
            case 'create':{
                create_note();
                break;
            }
            case 'directory_choose':{
                dir_choose();
                break;
            }
            case 'updateinfo' :{
                updateinfo();
                break;
            }
            default:{
                System.out.println("Please choose correct option");
            }
        }
        int n=0;
        n++;
    }while(n >4 ); //choosing n for ending the opertation
    }

    void create_note(){
        System.out.println("Create note");
    }
    void dir_choose(){
        System.out.println("Choose directory for your note");
    }
    void updateinfo(){
        System.out.println("updateinfo on page");
    }
}

class FlashCardOption{
    public static void main(String []ar){
        Choose c = new Choose();
        c.operation();
    }
}