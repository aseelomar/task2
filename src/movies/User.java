/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movies;

public class User {
    
        public  String name,gender,nationality,image;
        
public User (String name,String gender,String nationality,String image)
    {
        this.name=name;
        this.gender=gender;
        this.nationality=nationality;
        this.image=image;
    }
public  String getName(){
   return  name; 
}
public  String getGender(){
   return  gender; 
}
public  String getNationality(){
   return  nationality; 
}
public  String getImage(){
   return  image; 
}

   
}