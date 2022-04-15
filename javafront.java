package com.telusko.demorest;

 import javax.xml.bind.annotation.XmlRootElement; 

 @XmlRootElement 
  public class Alien
{
    private int id ; 
    private String name;
     private int points;
      public String getName() {
           return name;
}
public Alien getid( int id )
{
 
}
public void setid(int id ) { 
    this.id = id;
}
 public void setName(String name) { 
     this.name = name;
}
 public int getPoints() {
      return points;
}
 public void setPoints(int points) { 
     this.points=  points; }
};