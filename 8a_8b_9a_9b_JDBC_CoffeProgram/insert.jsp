<%--8a. Q1. Read all the existing records from the table coffee which is from the database test and insert a
new coffee product into it [Create a table coffee with fields ( id,coffee_name,price)] using HTML and
JSP to get the fields and display the results respectively--%>
<%@ include file="db.jsp" %>
<html><body>
<h2>Insert New Coffee Product</h2>
<form method="post">
    ID: <input type="text" name="id"><br>
    Coffee Name: <input type="text" name="coffee_name"><br>
    Price: <input type="text" name="price"><br>
    <input type="submit" value="Insert">
</form>

<%
    String id = request.getParameter("id");
    String name = request.getParameter("coffee_name");
    String price = request.getParameter("price");

    if (id != null && name != null && price != null) {
        PreparedStatement pst = conn.prepareStatement("INSERT INTO coffee VALUES (?, ?, ?)");
        pst.setInt(1, Integer.parseInt(id));
        pst.setString(2, name);
        pst.setDouble(3, Double.parseDouble(price));
        pst.executeUpdate();
        out.println("<p>Inserted successfully!</p>");
    }
%>

<jsp:include page="report.jsp" />
</body></html>
