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
