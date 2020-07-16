package ee.sda.pojo;

import javax.persistence.*;

@Entity
@Table(name = "Details_of_phone")
public class PhoneDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private int id;

    @Column(name = "Number")
    private int number;

    @Column(name = "Country")
    private String country;

    @OneToOne(mappedBy = "phoneDetails")
    private Student student;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCountry(String country) {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
