package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Objects;

@Entity
public class EventCategory extends AbstractEntity{

    @Size(min = 3, message = "Must have at least 3 characters")
    private String name;

    public EventCategory(String name) {
        this.name = name;
    }

    public @Size(min = 3, message = "Must have at least 3 characters") String getName() {
        return name;
    }

    public void setName(@Size(min = 3, message = "Must have at least 3 characters") String name) {
        this.name = name;
    }

    public EventCategory(){};
}

