package com.mycompany.app;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {


  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {

  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");
    String username = request.getParameter("username");
    String email = request.getParameter("email");
    String password = request.getParameter("password");

    updateDB(firstName, lastName, username, email, password);

    User user = new User(firstName, lastName, username, email, password);
    request.setAttribute("user", user);

    getServletContext().getRequestDispatcher("/handler.jsp").forward(request, response);
  }

  protected void updateDB(String firstName, String lastName, String username, String email, String password){
    try {
      String url = "jdbc:mysql://localhost8080/gameApp";
      String user = "dbadmin";
      String pw = "smakolyk";
      Class.forName("com.mysql.jdbc.Driver");
      Connection conn = DriverManager.getConnection(url,user, pw);
      conn.close();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}
