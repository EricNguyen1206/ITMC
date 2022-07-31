package com.blog.itmc.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Team {
    @Id
    private String name;
    private String icon;// icon url
    private String description;
    private String depart;// FK: depart name
    
    @OneToMany(mappedBy = "teamId", cascade = CascadeType.ALL)
    private Collection<MemTeam> memTeam;

    
}
