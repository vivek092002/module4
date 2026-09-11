package org.vivek.module4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.vivek.module4.entites.PostEntity;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {

}
