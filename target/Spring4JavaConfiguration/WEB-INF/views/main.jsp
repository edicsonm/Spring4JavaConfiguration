<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
    <form method="post">
        <h2>Hello User!</h2>
        <input type="text" name="firstName" placeholder="First Name">
        <select name="lastName">
            <c:forEach items="${listAllFamilyNames}" var="lastName">
                <option><c:out value="${lastName}"/></option>
            </c:forEach>
        </select>
        <input type="submit" value="Submit">

        <h1>Your Profile</h1>
        firstName: <c:out value="${user.firstName}" /><br/>
        lastName: <c:out value="${user.lastName}" /><br/>
        userName: <c:out value="${user.userName}" />
    </form>
</body>
</html>
