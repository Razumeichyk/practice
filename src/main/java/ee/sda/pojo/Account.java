package ee.sda.pojo;

import java.time.LocalDateTime;

public class Account {

    private Integer id;
    private String accountNumber;
    private LocalDateTime dateOfEmployment;

    public Account(Integer id, String accountNumber, LocalDateTime dateOfEmployment) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.dateOfEmployment = dateOfEmployment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public LocalDateTime getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(LocalDateTime dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }
}
