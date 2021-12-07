package entity;

public class Student extends UserProfile{
 private int studyYear;

    public Student(String fullName, String username, String password, int studyYear) {
        super(fullName, username, password);
        this.studyYear = studyYear;
    }
    public int getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }

    @Override
    public String getFullname() {
        return getFullName();
    }
}
