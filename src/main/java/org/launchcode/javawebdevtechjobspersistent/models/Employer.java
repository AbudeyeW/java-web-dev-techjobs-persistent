package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    public Employer() {
    }

    @NotBlank(message = "To continue we need a location value")
    public String location;

    @OneToMany
    @JoinColumn
    private final List<Job> jobs = new ArrayList<>();

    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public Employer(String location){
        this.location = location;
    }

}
