package com.sharktank.xharktank.repository;

import com.sharktank.xharktank.model.Entrepreneur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepreneurRepository extends JpaRepository<Entrepreneur,Long> {
}
