/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movies;

import java.util.Date;

/**
 *
 * @author lenovo
 */
class Series implements Media {
      
            public String title,category,producer,director,actors,language,poster;
            public double duration,rating,IMBDRating;
            public Date releaseDate;
            public Boolean isFavorit;
            
    public Series(String title,String category,String producer,String director,String actors,String language,String poster,double duration ,double rating,double IMBDRating,Date releaseDate,Boolean isFavorit)
    {
        this.title=title;
        this.category=category;
        this.producer=producer;
        this.director=director;
        this.actors=actors;
        this.language=language;
        this.poster=poster;
        this.duration=duration;
        this.rating=rating;
        this.IMBDRating=IMBDRating;
        this.releaseDate=releaseDate;
        this.isFavorit=isFavorit;
        
    }

    Series() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
     @Override
    public String getTitle(){
        return title;
    }
    public String getCategory(){
        return category;
    }
    public String getProducer(){
        return producer;
    }
    public String getDirector(){
        return director;
    }
    public String getActors(){
        return actors;
    }
    public String getLanguage(){
        return language;
    }
    public String getPoster(){
        return poster;
    }
    public double getDuration(){
       return duration;
   }
    public double getRating(){
       return rating;
   }
    public double getIMBDRating(){
        return IMBDRating;
   
}
    public Date getReleaseDate(){
        return releaseDate;
    }
    public Boolean getIsFavorit(){
        return isFavorit;
    }

    public void setIsFavorit( Boolean isFavorit){
       this.isFavorit=isFavorit;
    }
    
}
