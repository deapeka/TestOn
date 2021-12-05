package entity.access;

import java.util.UUID;

public abstract class UserProfile {

    private UUID userId;
    private String fullName;
    private String username;
    private String password;


    public UserProfile(UUID id, String fullName, String username, String password) {
        this.userId = id;
        this.fullName = fullName;
        this.username = username;
        this.password = password;
    }

    public UserProfile() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "fullName='" + fullName + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    //create abstract method
}
