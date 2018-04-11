<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page  import="java.util.*"%>
<%@ page import="pers.strategy.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="jsFile/jquery-3.3.1.min.js"></script>
<style>
#header {
    background-color:black;
    color:white;
    text-align:center;
    padding:5px;
}
#nav {
    line-height:30px;
    background-color:#eeeeee;
    height:750px;
    width:150px;
    float:left;
    padding:5px;	      
}
#section {
    float:left;
    padding:10px;	 	 
}
#footer {
    background-color:black;
    color:white;
    clear:both;
    text-align:center;
    padding:5px;
   }	 	
   
.product{ 
	background:white;
	width:200px; 
	height300px;  
	float:left;
	padding:5px;
	text-align:center;
} 

img{ 
	width:150px; 
	height:150px; 
	border:2px solid green; 
}  
</style>
<title>商城</title>
</head>
<body>

<script type="text/javascript"> 

function setSession(pName)
{
	var myForm=document.createElement("form")
	myForm.method = "post";
	myForm.action = "ItemCL";
	myForm.style.display = "none";
   	var myInput1 = document.createElement("input");
   	myInput1.name= "type";
   	myInput1.value = pName;
   	myForm.appendChild(myInput1);
	document.body.appendChild(myForm);
	myForm.submit();
	return myForm;
}
	window.onload = function(){
		
		$("#a1").click(function(){
			setSession("SaleComparator");
		});
		$("#a2").click(function(){
			setSession("PopComparator");
		});
		$("#a3").click(function(){
			setSession("CreditComparator");
		});
		$("#a4").click(function(){
			setSession("PriceComparator");
		});
	};
</script>
	<%
		List<ProductInfo> productList;
		if (request.getSession().getAttribute("pxresult") != null)
			productList = (List<ProductInfo>)request.getSession().getAttribute("pxresult");
		else
		{
			ProductList list = new ProductList();
			list.init();
			productList = list.getProductList();
		}
	%>

	<div id="header">
	<h1>大力商城</h1>
	</div>

	<div id="nav">
		<br>
		<h3 id = "goProductList" title="商品">ProductList </h3><br>
	</div>


	<div id="productList" class="section">
		<form action="" method="post" id="f1">
		<table width="50%" border="0">
		<tr>
			<td>
			<ul>
			<li> <a id="a1">销量</a> </li>
			<li> <a id="a2">人气</a> </li>
			<li> <a id="a3">信用</a> </li>
			<li> <a id="a4">价格</a> </li>
			</ul>
			</td>
		</tr>
		<tr>
		<%
		for (int i=0; i<productList.size(); i++){ %>
			<td width="196">
				<img src="<%=productList.get(productList.size()-i-1).getPic_Path()%>">
			</td>	
		<% }%>
		</tr>
		<tr>
		<%
		for (int i=0; i<productList.size(); i++){ %>
			<td>
				价格：<%= productList.get(productList.size()-i-1).getP_Price()%>
			</td>
		<% }%>
		</tr>
		<tr>
		<%
		for (int i=0; i<productList.size(); i++){ %>
			<td>
				销量：<%= productList.get(productList.size()-i-1).getItem().getSale()%>
			</td>
		<% }%>
		</tr>
		</table>
		</form>
	</div>
	
	<div id="footer">
		欢迎来到大力商城
	</div>

</body>
</html>