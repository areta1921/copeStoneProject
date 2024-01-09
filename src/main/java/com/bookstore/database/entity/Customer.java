package com.bookstore.database.entity;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    @NotBlank(message = "{billing.name.notBlank}")
    @Size(max = 50, message = "{billing.name.maxSize}")
    private String name;

    @Column(name = "surname", nullable = false)
    @NotBlank(message = "{billing.surname.notBlank}")
    @Size(max = 50, message = "{billing.surname.maxSize}")
    private String surname;

    @Column(name = "country_region", nullable = false)
    @NotBlank(message = "{billing.countryRegion.notBlank}")
    @Size(max = 55, message = "{billing.countryRegion.maxSize}")
    private String countryRegion;

    @Column(name = "street_and_house_number", nullable = false)
    @NotBlank(message = "{billing.streetAndHouseNumber.notBlank}")
    @Size(max = 100, message = "{billing.streetAndHouseNumber.maxSize}")
    private String streetAndHouseNumber;

    @Column(name = "city", nullable = false)
    @NotBlank(message = "{billing.city.notBlank}")
    @Size(max = 60, message = "{billing.city.maxSize}")
    private String city;

    @Column(name = "postal_code", nullable = false)
    @NotBlank(message = "{billing.postalCode.notBlank}")
    @Size(max = 18, message = "{billing.postalCode.maxSize}")
    private String postalCode;

    @Column(name = "phone_number", nullable = false)
    @NotBlank(message = "{billing.phoneNumber.notBlank}")
    @Size(max = 15, message = "{billing.phoneNumber.maxSize}")
    private String phoneNumber;

    @Column(name = "email", nullable = false)
    @NotBlank(message = "{billing.email.notBlank}")
    @Size(max = 254, message = "{billing.email.maxSize}")
    @Email
    private String email;


    public Customer(long l, String ognjen, String andjelic, String serbia, String s, String belgrade, String number, String number1, String mail) {
    }

    public Customer() {

    }
}
