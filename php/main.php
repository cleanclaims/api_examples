<?php
require 'vendor/autoload.php';
use Firebase\JWT\JWT;

// The signing key provided to you by Clean Claims
$signingKey = "example_abcdefghijklmnopqrstuvwxyz12345678910";

// The identifier provided to you by Clean Claims
$key = "example_integration_abcdefg987654321";

// Create and set any fields available
$issue = array();
$issue["address"] = array(
  "street_address" => "1234 N 5678 W",
  "city" => "Vineyard",
  "state" => "Utah",
  "zip" => "84059",
);
$issue["date_of_loss"] = "2021-06-23";
$issue["category"] = "category_1";
$issue["issue_source"] = "Roof leak";
$issue["class"] = 1;

$insurance = array();
$insurance["claim_number"] = "abcdefgh1234";

$contact1 = array();
$contact1["first_name"] = "John";
$contact1["last_name"] = "Doe";
$contact1["email"] = "example@example.com";

$project = array(
  "integration_id" => "1",
);

$project["issue"] = $issue;
$project["insurance"] = $insurance;
$project["contacts"] = [$contact1];

$payload = array(
  "key" => $key,
  "project" => $project,
);

// Create jwt
$jwt = JWT::encode($payload, $signingKey, "HS256");

echo json_encode($jwt);

// Use your preferred method of POSTing the jws value to your Clean Claims provided endpoint and parse the JSON response.
?>
