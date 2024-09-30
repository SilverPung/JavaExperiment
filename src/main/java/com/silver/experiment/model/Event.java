package com.silver.experiment.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




import java.util.Date;


@Data
@Entity
@Table(name = "core_event")
@AllArgsConstructor
@NoArgsConstructor
public class Event {


    @Id
    private Long id;

    private String title;

    private String description;

    private Date date;

}
