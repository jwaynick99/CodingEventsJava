package org.launchcode.codingevents.models;

import jakarta.validation.constraints.*;

import java.util.Objects;

/**
 * Created by Chris Bay
 */
public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank(message = "Name is required.")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters.")
    private String name;

    @Size(max = 500, message = "Description too long!")
    private String description;

    @NotBlank(message = "Email is required.")
    @Email(message = "Invalid email, try again.")
    private String contactEmail;

    private EventType type;

    @NotBlank(message = "Location is required")
    private String location;

    @AssertTrue(message = "Registration is required for all events.")
    private boolean registrationRequired;

    @Positive(message = "Number of attendees must be more than zero.")
    private int numberOfAttendees;

    public Event(){
        this.id = nextId;
        nextId++;
    }

    public Event(String name, String description, String contactEmail, EventType type) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.type = type;

    }

    public @Email String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(@Email String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public @NotBlank(message = "Location is required") String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank(message = "Location is required") String location) {
        this.location = location;
    }

    @AssertTrue
    public boolean isRegistrationRequired() {
        return registrationRequired;
    }

    public void setRegistrationRequired(@AssertTrue boolean registrationRequired) {
        this.registrationRequired = registrationRequired;
    }

    @Positive(message = "Number of attendees must be more than zero.")
    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(@Positive(message = "Number of attendees must be more than zero.") int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
