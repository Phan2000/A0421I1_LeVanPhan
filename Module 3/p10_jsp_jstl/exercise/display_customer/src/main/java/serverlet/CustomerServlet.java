package serverlet;

import model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet" , urlPatterns = {"/list"})
public class CustomerServlet extends HttpServlet {
    List<Customer> customer_List = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        customer_List.add(new Customer("Nguyen Hoang Nam","1983-08-20","Ha Noi", "123.img"));
        customer_List.add(new Customer("Tran Dang Khoa","1984-08-21","Thanh Hoa", "456.img"));
        customer_List.add(new Customer("Hoang Van Cong","1985-08-22","Lang Son", "789.img"));
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
    }
}
