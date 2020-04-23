package com.example.mobilodev;

import java.util.ArrayList;



public class Person {
    private String userName;
    private String userPassword;
    private int imageID;

    public Person(String userName, String userPassword, int imageID) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.imageID = imageID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public static ArrayList<Person> getData(){
        ArrayList<Person> personArrayList = new ArrayList<Person>();
        personArrayList.add(new Person("admin","1234", R.drawable.ic_account_circle_black_24dp));
        personArrayList.add(new Person("erayb","eray", R.drawable.ic_account_circle_black_24dp));
        personArrayList.add(new Person("emreb","qwerty", R.drawable.ic_account_circle_black_24dp));
        personArrayList.add(new Person("hilals","asdf", R.drawable.ic_account_circle_black_24dp));
        personArrayList.add(new Person("alex","1907", R.drawable.ic_account_circle_black_24dp));
        personArrayList.add(new Person("kuyt","343434", R.drawable.ic_account_circle_black_24dp));
        personArrayList.add(new Person("fernandao","golcu1", R.drawable.ic_account_circle_black_24dp));
        personArrayList.add(new Person("carlos","00001", R.drawable.ic_account_circle_black_24dp));
        personArrayList.add(new Person("zanka","98765", R.drawable.ic_accessibility_black_24dp));
        return personArrayList;
    }


}
