<%@taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>JPA Application</title>
</head>
<body>
<div class="container">

<div class="container center" >
<h1 style="color:lime;font-size:35px;text-align:center">Registration Form</h1>
</div>

<div class="container">
<frm:form modelAttribute="std">

<div class="col-auto">
    <label class="col-form-label">Student ID</label>
    </div>
    <div class="col-auto">
    <frm:input path="id" readonly="true" class="form-control"/>
  	</div> 

  <div class="col-auto">
    <label class="col-form-label">Student Name</label>
    </div>
    <div class="col-auto">
    <frm:input path="name" class="form-control" />
  	</div> 
 
  <div class="col-auto">
    <label class="col-form-label" >Department Name </label>
    </div>  
    <div class="col-auto">
    <frm:input path="dept" class="form-control" />
  	</div>
  
  <div class="col-auto">
    <label class="col-form-label">Fees</label>
    </div> 
    <div class="col-auto">
    <frm:input class="form-control" path="fees"/>
  	</div>
  
  <div class="col-auto">
    <label for="exampleInputEmail1" class="col-form-label">Percentage</label>
    </div> 
    <div class="col-auto">
    <frm:input class="form-control" path="percentage"/>
  	</div>
 
  <div class="ml-3">
  <button type="submit" class="btn btn-primary mt-5">Edit</button>
  </div>

</frm:form>

</div>

</div>


</body>
</html>