package com.Example;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Basics {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("picture")
    @Expose
    private String picture;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("profiles")
    @Expose
    private List<Profile> profiles = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Basics() {
    }

    /**
     * 
     * @param summary
     * @param picture
     * @param phone
     * @param location
     * @param website
     * @param email
     * @param name
     * @param label
     * @param profiles
     */
    public Basics(String name, String label, String picture, String email, String phone, String website, String summary, Location location, List<Profile> profiles) {
        super();
        this.name = name;
        this.label = label;
        this.picture = picture;
        this.email = email;
        this.phone = phone;
        this.website = website;
        this.summary = summary;
        this.location = location;
        this.profiles = profiles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
    }

}
