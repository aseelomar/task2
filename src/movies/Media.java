package movies;

import java.util.Date;

interface Media {
          
   public int type = 1;
   String[] gategory =new String[]{"action","advanture","comedy","SIFI","superHeros","drama","horror","documentary","thriller"};
    public String getTitle();
    public String getCategory();
    public String getProducer();
    public String getDirector();
    public String getActors();
    public String getLanguage();
    public String getPoster();
    public double getDuration();
    public double getRating();
    public double getIMBDRating();
    public Date getReleaseDate();
    public Boolean getIsFavorit();
   
}