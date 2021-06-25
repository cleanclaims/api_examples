package com.cleanclaims.example;


import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import java.nio.charset.StandardCharsets;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // The signing key provided to you by clean claims
        String signingKey = "example_abcdefghijklmnopqrstuvwxyz12345678910";

        // The identifier provided to you by Clean Claims
        String key = "example_integration_abcdefg987654321";

       Issue issue = new Issue();
        issue.setAddress(new Address("1234 N 5678 W", "Vineyard", "Utah", "84059"));
        issue.setDateOfLoss("2021-06-23");
        issue.setCategory("category_1");
        issue.setIssueSource("Roof leak");
        issue.setIssueClass(1);

        Insurance insurance = new Insurance();
        insurance.setClaimNumber("abcdefgh1234");

        Contact contact1 = new Contact();
        contact1.setFirstName("John");
        contact1.setLastName("Doe");
        contact1.setEmail("example@example.com");

        Project project = new Project("1");

        project.setIssue((issue));
        project.setInsurance(insurance);
        project.addContact(contact1);

        Payload payload = new Payload(key);
        payload.setProject(project);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
        Map map = gson.fromJson(gson.toJson(payload), Map.class);

        String jws = Jwts.builder()
                .setClaims(map)
                .signWith(Keys.hmacShaKeyFor(signingKey.getBytes(StandardCharsets.UTF_8)))
                .compact();

        System.out.println(jws);

        // Use your preferred method of POSTing the jws value to your Clean Claims provided endpoint and parse the JSON response.
    }
}
