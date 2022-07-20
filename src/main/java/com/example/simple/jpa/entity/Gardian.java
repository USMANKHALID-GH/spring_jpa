package com.example.simple.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@AttributeOverrides({
        @AttributeOverride(name = "name", column = @Column(name = "gardian_name")),
        @AttributeOverride(name = "email", column = @Column(name = "gardian_email")),
        @AttributeOverride(name = "number", column = @Column(name = "gardian_number"))
})
public class Gardian {

    private String name;
    private String email;
    private  String number;

}
