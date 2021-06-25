package com.cleanclaims.example;

import com.google.gson.annotations.SerializedName;

public class Issue {
    private Address address;
    private String issueSource;
    private String moistureContent;
    private Integer yearOfHome;
    private String dateOfLoss;
    private String category;
    @SerializedName("class")
    private Integer issueClass;

    public Issue() {
    }

    public Issue(Address address, String issueSource, String moistureContent, Integer yearOfHome, String dateOfLoss, String category, Integer issueClass) {
        this.address = address;
        this.issueSource = issueSource;
        this.moistureContent = moistureContent;
        this.yearOfHome = yearOfHome;
        this.dateOfLoss = dateOfLoss;
        this.category = category;
        this.issueClass = issueClass;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setIssueSource(String issueSource) {
        this.issueSource = issueSource;
    }

    public void setMoistureContent(String moistureContent) {
        this.moistureContent = moistureContent;
    }

    public void setYearOfHome(Integer yearOfHome) {
        this.yearOfHome = yearOfHome;
    }

    public void setDateOfLoss(String dateOfLoss) {
        this.dateOfLoss = dateOfLoss;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setIssueClass(Integer issueClass) {
        this.issueClass = issueClass;
    }
}
