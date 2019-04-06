function validateProductForm()
{
	var pName=document.getElementById("pnm").value;
	var pBrand=document.getElementById("pbr").value;
	var pPrice=document.getElementById("ppr").value;

	if(pName == null || pName == "")
	{
		window.alert("Product Name cannot be empty")
		return false;
	}
	if(pBrand == null || pBrand == "")
	{
		window.alert("Product Brand cannot be empty")

		return false;
	}
	if(pPrice == null || pPrice == "")
	{	
		window.alert("Product Price cannot be empty")
		return false;

	return true;
	}
}