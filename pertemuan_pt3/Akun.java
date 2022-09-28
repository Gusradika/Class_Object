package pertemuan_pt3;

public class Akun {

    // Inisialisasi atribut username, password;
    private String username, password;

    public Akun() {
        username = "admin";
        password = "admin";
    }

    // Setter Getter
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswords() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    // Custom Print Debug
    public void printDebug() {
        System.out.println("Username : " + getUsername());
        System.out.println("Password : " + getPasswords());
    }

    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    // Constructor parameter (Akun Baru)
    public Akun(String username, String password) {
        this.username = username;
        this.password = password;

    }
}
