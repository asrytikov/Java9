public class MultiClubMember extends Member{

    private int membershipPoints;

     MultiClubMember(char pMemberType, int pMemberID, String pName, double pFees, int pMembershipPoints){
         super(pMemberType, pMemberID, pName, pFees);
         membershipPoints = pMembershipPoints;
    }

    public void setMembershipPoints(int membershipPoints) {
        this.membershipPoints = membershipPoints;
    }

    public int getMembershipPoints() {
        int club = 1;
        switch (club) {
            case 1, 2, 3:
                membershipPoints = 0;
            case 4:
                membershipPoints = 100;
        }
        return membershipPoints;
    }

    @Override
    public String toString() {
        return "MultiClubMember{" +
                "membershipPoints=" + membershipPoints +
                '}';
    }
}



