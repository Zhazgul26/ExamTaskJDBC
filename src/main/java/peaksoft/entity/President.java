package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;
import peaksoft.enams.Gender;

@Entity
@Table(name = "presidents")
@Setter
@Getter
@ToString
public class President {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(unique = true)
    private String email;
    private Gender gender;



    @OneToOne(cascade = CascadeType.REMOVE,fetch = FetchType.EAGER,
            mappedBy = "president")
    private Country country;

    public President(String firstName, String lastName, String email, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    public President() {
    }
}
