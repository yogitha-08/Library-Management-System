/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.libraryapp.library_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.libraryapp.library_management.Issue;

public interface IssueRepository extends JpaRepository<Issue, Integer> { }

