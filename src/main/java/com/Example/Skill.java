package com.Example;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Skill {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("level")
    @Expose
    private String level;
    @SerializedName("keywords")
    @Expose
    private List<String> keywords = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Skill() {
    }

    /**
     * 
     * @param keywords
     * @param level
     * @param name
     */
    public Skill(String name, String level, List<String> keywords) {
        super();
        this.name = name;
        this.level = level;
        this.keywords = keywords;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

}
