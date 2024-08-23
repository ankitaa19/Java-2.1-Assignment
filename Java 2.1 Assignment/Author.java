public class Author {
    private final String name;
    private final String email;
    private final char gender;

    public Author(String name, String email, char gender) {
        if (gender != 'm' && gender != 'f') {
            throw new IllegalArgumentException("Gender must be 'm' or 'f'");
        }
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}