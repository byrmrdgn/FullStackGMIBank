$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/RegistirationUnsuccessful.feature");
formatter.feature({
  "name": "Kullanici kayit islemi baslatir",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@RegistrationUnsuccessfull"
    }
  ]
});
formatter.background({
  "name": "Kullanici kayit icin ana sayfaya gider",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "kullanici ana sayfaya gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.RegistrationUnsuccessful.kullanici_ana_sayfaya_gider()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici profil logolu dropdowndan register linkine tiklar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.RegistrationUnsuccessful.kullanici_profil_logolu_dropdowndan_register_linkine_tiklar()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "kullanici kayit icin bilgilerini girer",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RegistrationUnsuccessfull"
    }
  ]
});
formatter.step({
  "name": "kullanici ssn numarasini girer",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.RegistrationUnsuccessful.kullanici_ssn_numarasini_girer()"
});
formatter.result({
  "status": "passed"
});
});