package com.shravani;
public  class Students{
    private int rollnbr;
    private String name;
    private String place;
    

    public Students(){
        super();
    }
    public Students(,int rollnbr,String name,String place){
        this.rollnbr=rollnbr;
        this.name=name;
        this.place=place;

     }
   public int getRollnbr(){

    return rollnbr;
   }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPlace(){
        return place;
    }
    public void setPlace(String place){
        this.place=place;
    }
    public String toString() {
        return "students[rollnbr="+rollnbr+",name="+name+",city="+city];
        
    }
} 