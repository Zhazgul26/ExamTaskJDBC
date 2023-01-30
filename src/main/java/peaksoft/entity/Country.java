package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "countries")
@Setter
@Getter
@ToString
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String language;
    private double area;
    private int population;

@OneToOne(cascade = CascadeType.ALL)
private  President president;

    public Country(String language, double area, int population) {
        this.language = language;
        this.area = area;
        this.population = population;
    }

    public Country() {

    }
}
