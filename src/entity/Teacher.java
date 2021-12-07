package entity;



public class Teacher extends UserProfile{

    private int experience;

    public Teacher(String fullName, String username, String password, int experience) {
        super(fullName, username, password);
        this.experience = experience;
    }
    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String getFullname() {
        return getFullName();
    }
}
