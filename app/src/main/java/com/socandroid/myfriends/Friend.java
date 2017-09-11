package com.socandroid.myfriends;

/**
 * Created by oluwalekefakorede on 11/09/2017.
 */

public class Friend {
    private String name;
    private int pictureDrawable;

    public Friend(String name, int pic){
        this.name = name;
        pictureDrawable = pic;
    }
    public void setName(String friendName){
        name = friendName;
    }
    public String getName(){
        return name;
    }
    public void setPictureDrawable(int pic){
        pictureDrawable = pic;
    }
    public int getPictureDrawable(){
        return pictureDrawable;
    }
}
