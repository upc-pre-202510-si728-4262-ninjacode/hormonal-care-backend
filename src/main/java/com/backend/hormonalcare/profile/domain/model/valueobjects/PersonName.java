package com.backend.hormonalcare.profile.domain.model.valueobjects;

import jakarta.persistence.Embeddable;

@Embeddable
public record PersonName(String firstName, String lastName) {
    public PersonName() {
        this(null, null);
    }

    public PersonName {
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("First name cannot be null or empty");
        }
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Last name cannot be null or empty");
        }
    }

    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }
}
