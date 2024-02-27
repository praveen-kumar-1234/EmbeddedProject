<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<body>
<h1>Welcome to Spring Boot @Embedded and @Embeddable annotations</h1>

<form action="/insert" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required>
    <br>
    <label for="street">Street:</label>
    <input type="text" id="street" name="address.street" required>
    <br>
    <label for="city">City:</label>
    <input type="text" id="city" name="address.city" required>
    <br>
    <label for="zipCode">Zip Code:</label>
    <input type="text" id="zipCode" name="address.zipCode" required>
    <br>
    <button type="submit">Submit</button>
</form>
</body>