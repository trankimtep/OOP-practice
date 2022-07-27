package timoday.bai5.entity;

public class People {
    private String name;
    private String dateOfBirth;
    private String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getYearOfBirth() {
        String[] arr = new String[3];
        arr = getDateOfBirth().split("/");
        return Integer.valueOf(arr[2]);
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public People() {}

    public People(String name, String dateOfBirth, String job) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.job = job;
    }

    @Override
    public String toString(){
        return   "Ten = " + name + "\n"
                +"Ngay sinh = " + dateOfBirth + "\n"
                +"Nghe nghiep = " + job + "\n";
    }
}
