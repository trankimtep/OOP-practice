package bai14.entities;

public class GoodStudent extends Student implements Comparable<GoodStudent>{
    private float gpa;
    private String bestRewardName;

    public GoodStudent() {}

    public GoodStudent (String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel, String gpa, String bestRewardName) {
        super(fullName, doB ,sex,phoneNumber,universityName,gradeLevel);
        this.gpa = Float.valueOf(gpa);
        this.bestRewardName = bestRewardName;
    }

    @Override
    public String toString() {
        return ("Full name: " + fullName + "\n" +
                "Birth day" + doB + "\n" +
                "Sex: " + sex + "\n" +
                "Phone number: " + phoneNumber + "\n" +
                "University name: " + universityName + "\n" +
                "Grade level: " + gradeLevel + "\n" +
                "GPA: " + gpa + "\n" +
                "Best reward name: " + bestRewardName + "\n" +
                "-----------------------------------\n");
    }

    @Override
    public void showMyInfo() {
        // TODO Auto-generated method stub
        System.out.println(this);
    }

    @Override
    public int compareTo(final GoodStudent o) {
        // TODO Auto-generated method stub
        if (gpa == o.gpa) {
            return (fullName.compareTo(o.fullName));
        }
        return (int) (gpa - o.gpa);
    }
}
