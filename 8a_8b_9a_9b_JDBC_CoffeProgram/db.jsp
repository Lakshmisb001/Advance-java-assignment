<%@ page import="java.sql.*" %>
<%
    String url = "jdbc:mysql://localhost:3306/test";
    String username = "root";
    String password = ""; // Add password if needed

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection(url, username, password);
%>
