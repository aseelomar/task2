/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movies;

import java.util.Scanner;

public class MediaOperations {
    
    
   public Boolean  validate;
   
   
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    String type = myObj.nextLine();
    
    public MediaOperations(String type)
    {
       this.type= type;
       MediaValidat mediaOperations = new MediaValidat();
       validate= mediaOperations.validateMediaController(type);
     }
    
    public void save()
    {
           if(validate== true)
               System.out.println("successful save");
           else
               System.out.println("failed save");
    }
    
    public void update()
    {
           if(validate== true)
               System.out.println("successful update");
           else
               System.out.println("failed update");
    }
    public Object[] list()
    {
            Object[] movie = new Object[10];
            Object[] Series = new Object[10];
            if( type == "movie")
                return movie;
            else if (type == "Series");
                return Series;
    }

    public void AddToFavorite(){
        
     Movie MovieFavoreite = new Movie();
     Series seriesFavorite = new Series();
     if( type == "movie"){
         MovieFavoreite.setIsFavorit(true);
         System.out.println("successful AddToFavorite");
     }else if(type == "Series"){
          seriesFavorite.setIsFavorit(true);
      System.out.println("successful AddToFavorite");   
     }
    }
    
    }



       
