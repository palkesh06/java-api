package com.telusko.demorest;
import java.util.Arrays;
import java.util.List;
@Path("aliens")
public class AlienResource{
AlienRepository repo= new AlienRepository();
@GET
@Produces(MediaType.APPLICATION_XML)
    public List<Alien> getAliens()
   {
   System.out.println("getAlien called...");
   return repo.getAliens();
   }
   @GET 
   @PATH("alien/{id}")
   @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) // activate dependency mediamoxcy 
   public Alien getAlien(@PATHPARAM("id")int id ){
       return repo.getAlien(id); 
   }
   @POST
   @PATH("alien")
   public Alien createAlien(Alien a )
   {
      repo.createAlien(a); 
      return a ; 
   }
   @DELETE 
   @PATH("DELETE_ALEIN/{id}")
   public void delete_aleien(@PATH_PARRAM({id}) int id )
   {
       repo.delte_alein(id); 
   }
   
}