package kg.easy.orderservice.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data@Entity
@Table(name = "blockReasond")
public class BlockReason {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String reason;
    private boolean visible;
}
