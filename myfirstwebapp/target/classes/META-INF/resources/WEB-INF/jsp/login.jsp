<html>
    <head>
        <title> My LOGIN Page </title>
    </head>
    <body>
        Welcome to the login page!
        <pre> ${errorMessage} </pre>
        <form method="post" action="/login"> <!-- Added 'action' attribute with the correct URL -->
            Name: <input type="text" name="name">
            Password: <input type="password" name="password"> <!-- Closed the 'input' tag properly -->
            <input type="submit">
        </form>
    </body>
</html>
