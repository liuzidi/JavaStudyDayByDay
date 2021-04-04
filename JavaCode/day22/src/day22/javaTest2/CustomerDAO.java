package day22.javaTest2;

/**
 * @author:liuzidi
 * @Description:
 */
public class CustomerDAO extends DAO<Customer>{
    public static void main(String[] args) {
        CustomerDAO c =new CustomerDAO();
        Customer a =new Customer();
        c.add(a);
    }
}
