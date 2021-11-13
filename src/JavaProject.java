import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class JavaProject {
    public static void main(String[] args) {

        String mem;
        MembershipManagement mm = new MembershipManagement();
        String path = "D:/док/members.csv";
        FileHandler fh = new FileHandler();
        fh.readFile();

//        LinkedList<Member> members = new LinkedList<>();
        LinkedList<Member> members = fh.readFile();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
//        line = bufferedReader.readLine();
//        members.add(line);
        String path = "D:/док/members.csv";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line;


        int choice = mm.getChoice();

        if (choice == 1) {
            mm.addMembers(members);
        }
        else if (choice == 2) {
            mm.removeMember(members);
        }
        else if (choice == 3) {
            mm.printMemberInfo(members);
        }

        }









    }


