/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.exam.exam.repository;

import com.exam.exam.entity.Escuela;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Noodlexz.CD
 */
@Repository
public interface EscuelaRepository extends JpaRepository<Escuela, Integer>{
    
}
