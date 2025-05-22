<%--8c. Develop a JDBC project using JSP to append the fields empno, empname and basicsalary
into the table Emp of the database Employee by getting the fields through keyboard and
Generate the report as follows for the TABLE Emp (Emp_NO , Emp_Name, Basicsalary ) using
HTML and JSP to get the fields and display the results respectively--%>
<%@ include file="db.jsp" %>
<h2>All Coffee Products</h2>
<table border="1">
<tr><th>ID</th><th>Name</th><th>Price</th></tr>
<%
    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM coffee");
    while (rs.next()) {
        out.println("<tr><td>" + rs.getInt("id") + "</td><td>" +
                             rs.getString("coffee_name") + "</td><td>" +
                             rs.getDouble("price") + "</td></tr>");
    }
%>
</table>
