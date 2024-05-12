import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Teacher teacher=new Teacher();
        Student student=new Student();
        SystemAdministrator systemAdministrator=new SystemAdministrator();
        curatorOfPractice curatorOfPractice=new curatorOfPractice();
        System.out.println("╭--------------------------------------------------╮");
        System.out.println("| WELCOME,PLEASE WRITE PASSWORD AND LOGIN TO ENTER |");
        System.out.println("╰--------------------------------------------------╯");
        String password=scanner.nextLine();
        String login= scanner.nextLine();
        if(teacher.verification(password,login)==true){

        }else if(student.verification(password,login)==true){
            
        } else if (systemAdministrator.verification(password,login)==true) {
            
        }else if (curatorOfPractice.verification(password,login)){

        }else{
            System.out.println("TRY AGAIN");
        }


    }
}
