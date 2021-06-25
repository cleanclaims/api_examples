package com.cleanclaims.example;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String integrationId;
    private String name;
    private String customer;
    private Issue issue;
    private List<Contact> contacts;
    private Insurance insurance;

    public Project(String integrationID) {
        this.integrationId = integrationID;
        this.contacts = new ArrayList<Contact>();
    }

    public Project(String integrationID, String name, String customer, Issue issue, List<Contact> contacts, Insurance insurance) {
        this.integrationId = integrationID;
        this.name = name;
        this.customer = customer;
        this.issue = issue;
        this.contacts = contacts;
        this.insurance = insurance;
    }

    public void setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
}
