package com.cleanclaims.example;

import com.google.gson.annotations.SerializedName;

public class Issue {
    private Address address;
    private String sourceOrReasonOfLoss;
    private String affectedAreas;
    private Integer yearOfStructure;
    private String dateOfLoss;
    private String category;
    @SerializedName("class")
    private Integer issueClass;

    public Issue() {
    }

    public Issue(Address address, String sourceOrReasonOfLoss, String affectedAreas, Integer yearOfHome, String dateOfLoss, String category, Integer issueClass) {
        this.address = address;
        this.sourceOrReasonOfLoss = sourceOrReasonOfLoss;
        this.affectedAreas = affectedAreas;
        this.yearOfHome = yearOfHome;
        this.dateOfLoss = dateOfLoss;
        this.category = category;
        this.issueClass = issueClass;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setSourceOrReasonOfLoss(String sourceOrReasonOfLoss) {
        this.sourceOrReasonOfLoss = sourceOrReasonOfLoss;
    }

    public void setAffectedAreas(String affectedAreas) {
        this.affectedAreas = affectedAreas;
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
