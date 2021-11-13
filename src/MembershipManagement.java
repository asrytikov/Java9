import java.util.LinkedList;
import java.util.Scanner;
public class MembershipManagement {
    final private Scanner reader;

    public Scanner getReader() {
        return reader;
    }
    public int getIntInput() {
        int num = 0;
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Введите число");
            num = input.nextInt();
            System.out.printf("Вы ввели %d.%n%n", num);
        } catch (Exception exp) {
            System.out.println("Вы ввели не число");
        }
        return num;
    }

    public String getStringInput() {
        String name = "Peter";
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Введите имя");
            name = input.nextLine();
        } catch (Exception exp) {
            System.out.println("Вы ввели не имя");
        }
        return name;
    }
    public void printClubOptions() {
        String multipleLines = "1) Club Mercury"
                + System.lineSeparator() + "2) Club Neptune"
                + System.lineSeparator() + "3) Club Jupiter"
                + System.lineSeparator() + "4) Multi Clubs";
        System.out.println(multipleLines);
        int club;
        club = getIntInput();
    }
    public int getChoice() {
        int choice;
        String multipleLines = "WELCOME TO OZONE FITNESS CENTER"
                + System.lineSeparator() + "================================"
                + System.lineSeparator() + "1) Add Member"
                + System.lineSeparator() + "2) Remove Member"
                + System.lineSeparator() + "3) Display Member Information"
                + System.lineSeparator() + "Please select an option (or Enter -1 to quit):";
        System.out.println(multipleLines);
        getIntInput();
        choice = getIntInput();
        return choice;
}
    public String addMembers(LinkedList<Member> m) {
        printClubOptions();
        getIntInput();
        getStringInput();
        int club = 1;
        String mem;
        double fees;
        int memberID;
        Member mbr = new Member(char pMemberType, int pMemberID, String pName, double pFees);
        Calculator<Integer> cal;
        cal = (n) -> {
            switch (n) {
                case 1:
                    return 900;
                case 2:
                    return 950;
                case 3:
                    return 1000;
                default:
                    return -1;
            }
        };
        fees = cal.calculateFees(club);
        memberID = mbr.getMemberID();
        String name = getStringInput();
        mem = {"%memberID%, + %name% + %fees% + %club% + %membershipPoints%}';

    };
        return mem;

//        SingleClubMember singleClubMember = new SingleClubMember(memberType, memberID, name, fees, club);
//        return String;

//        String = memberType, memberID , name, fees , club , MembershipPoints ;

    //Вычисление идентификатора посетителя

    LinkedList<Member> members = new LinkedList<>();

    public void removeMember(LinkedList<Member> m) {
        int memberID;
        getIntInput();
        memberID = getIntInput();
        members.remove(memberID);
    }
    public void printMemberInfo(LinkedList<Member> m) {
        int memberID;
        getIntInput();
        memberID = getIntInput();
        for (int i = 0; i < m.size(); i++) {
            if (m.get(i).getMemberID() == memberID) {
                String[] memberInfo = m.get(i).toString().split(", ");
                System.out.println("\n\nMember Type =" + memberInfo[memberID]);
            }
        }

    }
}