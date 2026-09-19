package org.vivek.module4.entites;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PostEntity extends AuditableEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String title;
    private String description;


    @PrePersist
    void beforeSave(){

    }

    @PreUpdate
    void befoeUpdate(){

    }

    @PreRemove
    void beforeDelete(){

    }
//    @CreatedDate
//    //yo enforce that it can't be updates
//    @Column(nullable = false, updatable = false)
//    private LocalDateTime createdDate;
//
//    @LastModifiedDate
//    private LocalDateTime updatedDate;
//
//    @CreatedBy
//    private String createdBy;
//
//    @LastModifiedBy
//    private String updatedBy;
}
