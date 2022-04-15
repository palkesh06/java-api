package com.telusko.demorest;
import java.util.ArrayList; 
import java.util.List;
import java.sql.* ; 
import com.telusko.demorest.Alien;

public class AlienRepository  {

List<Alien>aliens;

public AlienRepository() {

aliens =new ArrayList<>();
    Alien a1 = new Alien(); 
    a1.setid(101); 
    a1.setName("navin");
    a1.setPoints(60);
    Alien a2 = new Alien(); 
    a2.setid(102); 
    a2.setName("rohit");
    a2.setPoints(80);
    aliens.add(a1); 
    aliens.add(a2);  
  }
  public List<Alien> getAliens( )
  {
      return aliens; 
  }
  public Alien getAlien(int id ){
      for ( Alien i : aliens)
      {
          if ( i.getid() == id )
          return i ; 
      }
      return new Alien(); 
  }
 public void createAlien(Alien a) {
    aliens.add(a); 
 }
public void delte_alein(int id) {
    for ( Alien a : aliens)
    {
        if ( a.getid() == id )
         aliens.remove(a); 
    }
}
}
