package uz.runmate.RunMate.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "services")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Double cost;
    @ManyToOne
    @JoinColumn(name = "specialist_id")
    private Specialist specialist;
}
