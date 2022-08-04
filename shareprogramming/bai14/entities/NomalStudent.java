package bai14.entities;

public class NomalStudent extends Student implements Comparable<NomalStudent>{
    private float englishScore;
    private float entryTestScore;


    public NomalStudent(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel, String englishScore, String entryTestScore) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.englishScore = Float.parseFloat(englishScore.trim());
        this.entryTestScore = Float.parseFloat(entryTestScore.trim());
    }

    @Override
    public String toString() {
        return ("Full name: " + fullName + "\n" +
                "Birth day" + doB + "\n" +
                "Sex: " + sex + "\n" +
                "Phone number: " + phoneNumber + "\n" +
                "University name: " + universityName + "\n" +
                "Grade level: " + gradeLevel + "\n" +
                "English score: " + englishScore + "\n" +
                "Entry test score: " + entryTestScore + "\n" +
                "-----------------------------------\n");
    }

    @Override
    public void showMyInfo() {
        // TODO Auto-generated method stub
        System.out.println(this);
        
    }

    @Override
    public int compareTo(NomalStudent o) {
        // TODO Auto-generated method stub
        if (englishScore == o.englishScore && entryTestScore == o.englishScore) {
            return (fullName.compareTo(o.fullName));
        }
        if (entryTestScore == o.entryTestScore) {
            return (int)(englishScore - o.englishScore);
        }
        return (int)(entryTestScore - o.entryTestScore);
    }
}
