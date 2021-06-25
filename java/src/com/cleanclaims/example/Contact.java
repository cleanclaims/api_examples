package com.cleanclaims.example;

public class Contact {
    private String integrationId;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String email;
    private String cell;
    private String phone;
    private String type;

    public Contact() {
    }

    public Contact(String integrationId, String firstName, String middleInitial, String lastName, String email, String cell, String phone, String type) {
        this.integrationId = integrationId;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.email = email;
        this.cell = cell;
        this.phone = phone;
        this.type = type;
    }

    public void setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setType(String type) {
        this.type = type;
    }
}
