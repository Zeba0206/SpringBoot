package com.stackroute.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data //Using lombok to handle the getter setters
@NoArgsConstructor //Creates a zero argument constructor
@AllArgsConstructor //Creates an all argument constructor
@Builder
public class Track {
    @Id
    private int trackID;

    private String trackName;

    private String comments;
}
