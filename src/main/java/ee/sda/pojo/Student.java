package ee.sda.pojo;

import javax.persistence.*;

@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private int id;

    @Column(name = "Name")
    private  String name;

    @OneToOne
    @JoinColumn(name = "Phone_details_id")
    private PhoneDetails phoneDetails;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PhoneDetails getPhoneDetails() {
        return phoneDetails;
    }

    public void setPhoneDetails(PhoneDetails phoneDetails) {
        this.phoneDetails = phoneDetails;
    }
}
