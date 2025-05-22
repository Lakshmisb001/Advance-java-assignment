<%--8b. Read all the existing records from the table coffee which is from the database test and update an
existing coffee product in the table with its id. [Create a table coffee with fields
( id,coffee_name,price)] using HTML and JSP to get the fields and display the results respectively--%>
<html><body>
<h2>Update Coffee Product</h2>
<form method="post" action="updateCoffee.jsp">
    Enter Coffee ID: <input type="text" name="id"><br>
    New Coffee Name: <input type="text" name="coffee_name"><br>
    New Price: <input type="text" name="price"><br>
    <input type="submit" value="Update">
</form>
</body></html>
