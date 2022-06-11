package com.example.sudoku;

public class User {
    private String name;
    private Boolean isDoneEasy;
    private Boolean isDoneMedium;
    private Boolean isDoneHard;

    public User(String name){
        this.name = name;
        this.isDoneEasy = false;
        this.isDoneMedium = false;
        this.isDoneHard = false;
    }

    public User(String name, String isDoneEasy, String isDoneMedium, String isDoneHard){
        this.name = name;
        this.isDoneEasy = Boolean.parseBoolean(isDoneEasy);
        this.isDoneMedium = Boolean.parseBoolean(isDoneMedium);
        this.isDoneHard = Boolean.parseBoolean(isDoneHard);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Boolean getIsDoneEasy(){
        return this.isDoneEasy;
    }

    public void setIsDoneEasy(Boolean isDoneEasy){
        this.isDoneEasy = isDoneEasy;
    }

    public Boolean getIsDoneMedium(){
        return this.isDoneMedium;
    }

    public void setsDoneEasy(Boolean isDoneMedium){
        this.isDoneEasy = isDoneMedium;
    }

    public Boolean getIsDoneHard(){
        return this.isDoneHard;
    }

    public void setIsDoneHard(Boolean isDoneHard){
        this.isDoneHard = isDoneHard;
    }
}
