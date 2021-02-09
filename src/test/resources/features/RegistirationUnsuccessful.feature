@RegistrationUnsuccessfull
  Feature: Kullanici kayit islemi baslatir
    Background: Kullanici kayit icin ana sayfaya gider
      Given kullanici ana sayfaya gider
      And kullanici profil logolu dropdowndan register linkine tiklar

      Scenario: kullanici kayit icin bilgilerini girer
        Given kullanici ssn numarasini girer


