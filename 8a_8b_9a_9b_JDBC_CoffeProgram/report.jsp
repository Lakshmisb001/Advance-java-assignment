<%--9b. Read all the existing records from the table coffee which is from the database test and query
coffee name starting with ‘D’ in the table using HTML and JSP to get the field and display the
results respectively--%>
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
