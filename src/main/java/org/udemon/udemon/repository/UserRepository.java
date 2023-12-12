package org.udemon.udemon.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.udemon.udemon.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
