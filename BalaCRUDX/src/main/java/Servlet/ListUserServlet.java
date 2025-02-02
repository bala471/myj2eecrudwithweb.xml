package Servlet;

import DAO.UserDao;
import Model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class ListUserServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        List<User> list = UserDao.getAllUsers();
        request.setAttribute("list", list);
        request.getRequestDispatcher("list-user.jsp").forward(request, response);
    }
}
