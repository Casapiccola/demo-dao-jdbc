package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {

        Department department = new Department(1, "Books");
        System.out.println(department);

        LocalDate date = LocalDate.now();

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", date, 3000.0, department);
        System.out.println(seller);

        SellerDao sellerDao = DaoFactory.createSellerDao();
    }
}
