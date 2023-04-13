package posttest6pbo;
public final class User {
    private String Username, Password, Email;
    
    public User(String Username, String Password, String Email)
    {
        this.Username = Username;
        this.Password = Password;
        this.Email = Email;
    }
// Setter Getter
    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public final void showAkun()
    {
        System.out.println("==========================");
        System.out.println("Username : "+ this.Username);
        System.out.println("Password : "+ this.Password);
        System.out.println("Email    : "+ this.Email);
        System.out.println("==========================");
    }
}
