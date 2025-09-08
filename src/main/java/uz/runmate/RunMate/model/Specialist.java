package uz.runmate.RunMate.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "specialists")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Specialist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String city;
    private String experience;
    private String description;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
