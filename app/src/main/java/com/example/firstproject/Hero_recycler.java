package com.example.firstproject;

public class Hero_recycler {
    String name,team;

    int image;

    public Hero_recycler(){

    }
    public Hero_recycler(String name, String team){
        this.name=name;
        this.team=team;
    }
    /*public Hero(int image,String name, String team)
    {
      this.image=image;
      this.name=name;
      this.team=team;
    }*/


    /*public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }


}
