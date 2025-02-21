package uz.pdp.delivery_service_project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer price;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Category category;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Attachment attachment;


}
