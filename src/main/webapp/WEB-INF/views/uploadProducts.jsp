<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload Products</title>
</head>
<body>
 <form:form commandName="UploadProducts" action="uploadProducts" method="post" enctype="multipart/form-data">
  <table>
   <tr>
    <td>Product Details Excel Sheet</td>
    <td><input type="file" name="multipartFile"/></td>
   </tr>
   <tr>
    <td>
     <input type="submit" value="Upload"/>
    </td>
   </tr>
  </table>
 </form:form>
</body>
</html>