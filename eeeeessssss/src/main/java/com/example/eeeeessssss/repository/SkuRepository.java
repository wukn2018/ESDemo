package com.example.eeeeessssss.repository;

import com.example.eeeeessssss.entity.Sku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *
 * @Author : Wukn
 * @Date : 2018/2/5
 */
public interface SkuRepository extends JpaRepository<Sku, Long>, JpaSpecificationExecutor<Sku> {

}
