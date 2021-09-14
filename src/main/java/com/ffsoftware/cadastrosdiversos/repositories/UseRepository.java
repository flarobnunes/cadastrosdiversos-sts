package com.ffsoftware.cadastrosdiversos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ffsoftware.cadastrosdiversos.entities.User;

public interface UseRepository extends JpaRepository<User, Long>{

}
