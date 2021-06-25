package com.cleanclaims.example;

public class Insurance {
    private String company;
    private String agentName;
    private String agentPhone;
    private String adjusterName;
    private String adjusterPhone;
    private String adjusterEmail;
    private String adjusterFax;
    private String policyNumber;
    private String claimNumber;

    public Insurance() {
    }

    public Insurance(String company, String agentName, String agentPhone, String adjusterName, String adjusterPhone, String adjusterEmail, String adjusterFax, String policyNumber, String claimNumber) {
        this.company = company;
        this.agentName = agentName;
        this.agentPhone = agentPhone;
        this.adjusterName = adjusterName;
        this.adjusterPhone = adjusterPhone;
        this.adjusterEmail = adjusterEmail;
        this.adjusterFax = adjusterFax;
        this.policyNumber = policyNumber;
        this.claimNumber = claimNumber;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public void setAgentPhone(String agentPhone) {
        this.agentPhone = agentPhone;
    }

    public void setAdjusterName(String adjusterName) {
        this.adjusterName = adjusterName;
    }

    public void setAdjusterPhone(String adjusterPhone) {
        this.adjusterPhone = adjusterPhone;
    }

    public void setAdjusterEmail(String adjusterEmail) {
        this.adjusterEmail = adjusterEmail;
    }

    public void setAdjusterFax(String adjusterFax) {
        this.adjusterFax = adjusterFax;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public void setClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
    }
}
