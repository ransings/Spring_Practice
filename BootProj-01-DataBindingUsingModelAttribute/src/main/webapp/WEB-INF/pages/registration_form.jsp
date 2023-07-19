<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Home page</title>
</head>
<body>
<div class="container mt-5 ml-5">
<div class="container ml-5">
<h1>Registration Form</h1>
 
 <form class="mt-5"  name="emp1" action="register" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Employee ID:</label>
    <input type="text" class="form-control"  placeholder="Employee ID" name="id">
      </div>
      
     <div class="form-group">
    <label >Employee Name:</label>
    <input type="text" class="form-control"  placeholder="Employee Name" name="name">
      </div>
      
      <div class="form-group">
    <label for="exampleInputEmail1">Employee Salary</label>
    <input type="number" min="1" step="any" class="form-control"  placeholder="Employee Salary" name="salary">
      </div>
      
<!--       <div class="form-group"> -->
<!--     <label for="exampleInputEmail1">Employee location</label> -->
<!--     <input type="text" class="form-control"  placeholder="Employee Location" name="location"> -->
<!--       </div> -->
 
  <button type="submit" class="btn btn-success" value="emp1">Submit</button>
  
</form>
 
</div>
</div>
</body>
</html>