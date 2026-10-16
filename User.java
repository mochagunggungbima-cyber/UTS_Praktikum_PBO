public class User {
    protected int userId;
    protected String password;
    protected String name;
    protected int age;
    protected String emailId;

    public boolean logIn(int userId, String password) {
        return this.userId == userId && this.password.equals(password);
    }

    public void recoverPassword() {
        System.out.println("Proses pemulihan password dikirim ke email: " + emailId);
    }

    public void logOut() {
        System.out.println("User dengan ID " + userId + " berhasil logout.");
    }
    
    public int getUserId() { return userId; }
    public String getPassword() { return password; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmailId() { return emailId; }
}