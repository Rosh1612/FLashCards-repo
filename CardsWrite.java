//notes for flash cards functionality
import java.util.Scanner;
class Note{
static String[] str = new String[55];
public Scanner sc = new Scanner(System.in);

void getString(){//for storing string
// int n = 0;
int j; 
System.out.println("How many notes you want to store? ");
j = sc.nextInt();
if(j<=str.length){
    for(int x=1; x<=j; x++){
        System.out.println("Enter in string note "+x);
        str[x-1] = sc.nextLine();
        // str[0] = "problem create here at 1st index not at zero";
        System.out.println("Successfully insertion at "+x);
        System.out.println("____________________________________________________________________________");
    }
}

else{
    System.out.println("no insertion is possible because required array size ("+j+") is out of available ("+str.length+")");
    getString();
}
}

void getNote(){//for printing string

    System.out.println("Enter note which one you want to see? press 1 for any individual note and 2 for showing all notes  ");
    int noteNo = sc.nextInt();
    switch(noteNo){
        case 1:{
            System.out.println("Enter which perticular note you want to see ");
            int notenn = sc.nextInt();
            System.out.println("Your note is at index "+notenn +" is->"+str[notenn]);
            break;
        }
        case 2:{
            System.out.println("Showing you all available notes in your current directory ");
            System.out.println("directory contains total notes "+str.length);
            int xxx;
            for(xxx =0; xxx<str.length; xxx++){
                if(str[xxx] != null){
                    System.out.println("Your note is at index "+xxx +" is->"+str[xxx]);
                }
                
            }
            break;
        }
    }
    }
    

// System.out.println(" "+n);
// System.out.println("This is string note "+n);
// System.out.println("Your note "+n+" has value ->"+str[n]);
// n++;
}


class CardsWrite{
public static void main(String[] args){

    Note n = new Note();
    Scanner s = new Scanner(System.in);
    int mm;
    do{
        
        System.out.println("which operation you want to perform? press 1 for create string note and 2 for printing note");
        int x = s.nextInt();
        switch(x){
            case 1:
            n.getString();
            break;
            
            case 2:
            n.getNote();
            break;

            // default:
            // return;
        }
        System.out.println("Enter any number for performing operations rather than 0 number (0 is for termination)");
        mm = s.nextInt();
    } while(mm !=0);

}
}