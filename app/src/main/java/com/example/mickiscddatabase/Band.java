package com.example.mickiscddatabase;

public class Band {
    private int mId;
    private String mName;
    private String mDescription;
    private String mWorks;
    private String mWords;

    //connect the albums string to band details
    public Band(int id, String name, String description, String works, String words) {
        mId = id;
        mName = name;
        mDescription = description;
        mWorks = works;
        mWords = words;

    }
    //initialize the string variable with array values

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }

    public String getWorks() { return mWorks; }

    public void setWorks(String works) {
        this.mWorks = works;
    }

    public String getWords() {return mWords; }

    public void setWords(String words) { this.mWords = words; }
}

