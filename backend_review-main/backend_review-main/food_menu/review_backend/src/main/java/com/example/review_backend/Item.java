package com.example.review_backend;

public class Item {
String CName;
String Cdescription;
String Cprice;
String imageName;



public String getCName(){
    return CName;
}
public void setCName(String CName){
    this.CName = CName;
}


public String getCdescription(){
    return Cdescription;
}
public void setCdescription(String Cdescription){
    this.Cdescription = Cdescription;
}

public String getCprice(){
    return Cprice;
}
public void setCprice(String Cprice){
    this.Cprice = Cprice;
}

public String getimageName(){
    return imageName;
}
public void setimageName(String imageName){
    this.imageName = imageName;
}
    
}