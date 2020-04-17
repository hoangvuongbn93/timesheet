package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserEntity;

@Repository
public interface LoginRepository extends JpaRepository<UserEntity,Long> {
	@Query("SELECT u FROM UserEntity u WHERE u.username = :username AND u.password = :password")
	List<UserEntity> checkLogin(@Param("username") String username, @Param("password") String password);


}
