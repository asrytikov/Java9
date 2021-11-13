import java.util.LinkedList;
public class Member {
    private char memberType;
    private int memberID;
    private String name;
    private double fees;
    Member(char pMemberType, int pMemberID, String pName, double pFees){
        memberType = pMemberType;
        memberID = pMemberID;
        name = pName;
        fees = pFees ;
    }
    public void setMemberType(char pMemberType) {
        memberType = pMemberType;
    }
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setFees(double fees) {
        this.fees = fees;
    }
    public char getMemberType() {
        return memberType;
    }

    public int getMemberID() {
        int memberID;
        LinkedList<Member>members = new LinkedList<>();
        memberID = members.size() - 1;
        if (members.size() == 0) {
            memberID =  1;
        }
        return memberID;
    }
    public String getName() {
        return name;
    }
    public double getFees() {
        return fees;
    }
    @Override
    public String toString() {
        return "Member{" +
                "memberType=" + memberType +
                ", memberID=" + memberID +
                ", name='" + name + '\'' +
                ", fees=" + fees +
                '}';
    }

}
