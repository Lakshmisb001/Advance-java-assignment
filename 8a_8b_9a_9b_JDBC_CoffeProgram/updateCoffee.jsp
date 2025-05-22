<%@ include file="db.jsp" %>
<html><body>
<%
    String id = request.getParameter("id");
    String name = request.getParameter("coffee_name");
    String price = request.getParameter("price");

    if (id != null && name != null && price != null) {
        PreparedStatement pst = conn.prepareStatement("UPDATE coffee SET coffee_name=?, price=? WHERE id=?");
        pst.setString(1, name);
        pst.setDouble(2, Double.parseDouble(price));
        pst.setInt(3, Integer.parseInt(id));
        int rows = pst.executeUpdate();
        if (rows > 0)
            out.println("<p>Coffee record updated successfully!</p>");
        else
            out.println("<p>Coffee ID not found!</p>");
    }
%>
<jsp:include page="report.jsp" />
</body></html>
