package com.example.apitest2;

import com.example.apitest2.ApiEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiRepository extends JpaRepository<ApiEntity,Long> {
}
