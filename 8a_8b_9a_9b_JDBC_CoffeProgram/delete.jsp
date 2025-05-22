<%--9a. Read all the existing records from the table coffee which is from the database test and delete
an existing coffee product from the table with its id and display the rest of the records using
HTML and JSP to get the field and display the results respectively%-->
<%@ include file="db.jsp" %>
<html><body>
<h2>Delete Coffee Product</h2>
<form method="post">
    Enter Coffee ID to Delete: <input type="text" name="id"><br>
    <input type="submit" value="Delete">
</form>

<%
    String id = request.getParameter("id");
    if (id != null) {
        PreparedStatement pst = conn.prepareStatement("DELETE FROM coffee WHERE id=?");
        pst.setInt(1, Integer.parseInt(id));
        pst.executeUpdate();
        out.println("<p>Deleted successfully!</p>");
    }
%>
<jsp:include page="report.jsp" />
</body></html>
