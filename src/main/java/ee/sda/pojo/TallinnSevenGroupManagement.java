package ee.sda.pojo;

import ee.sda.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TallinnSevenGroupManagement {

    public static void main(String[] args) {


        Student viktoria = new Student();
        viktoria.setId(1);
        viktoria.setName("Viktoria");

        PhoneDetails viktoriaPhoneDetails = new PhoneDetails();
        viktoriaPhoneDetails.setNumber(2374532);
        viktoriaPhoneDetails.getCountry("Eesti");
        viktoriaPhoneDetails.setId(1);

        viktoria.setPhoneDetails(viktoriaPhoneDetails);
        viktoriaPhoneDetails.setStudent(viktoria);

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            Transaction transaction = session.beginTransaction();
            session.save(viktoria);
            transaction.commit();

        } catch (Exception ex) {

        } finally {
            session.close();
        }
    }
}
