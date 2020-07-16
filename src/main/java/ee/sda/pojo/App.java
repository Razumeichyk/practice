package ee.sda.pojo;

import java.time.LocalDateTime;

public class App {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "as@bm.tt", "Anyb", "Serf");
        Account acc1 = new Account(123, "Abc1765", LocalDateTime.now());
        emp1.setAccount(acc1);
    }
}
