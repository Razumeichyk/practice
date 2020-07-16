package ee.sda.pojo;

public class Administrator extends Person{


    public Administrator(String firstName, String lastName, String email, String password) {
        super(firstName);
        super(lastName);
        super(email);
        super(password);
    }



    public void addBook(){
        Book book = new Book();
    }
}
