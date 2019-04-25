package com.company.springboot.repository;

import com.company.springboot.entity.Text;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TextRepository extends JpaRepository<Text, Integer> {

}
