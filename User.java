public class User {
    private int id_number;
    private String name;
    private String password;


    @Override
    public String toString() {
        return "User{" +
                "id_number=" + id_number +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId_number() {
        return id_number;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setId_number(int id_number) {
        this.id_number = id_number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
