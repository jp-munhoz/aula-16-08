public class User {

    private String user;
    private String location;
    private String job;

    public User(String user, String location, String job) {
        this.user = user;
        this.location = location;
        this.job = job;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
