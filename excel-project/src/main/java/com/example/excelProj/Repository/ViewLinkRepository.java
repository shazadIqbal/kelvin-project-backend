package com.example.excelProj.Repository;

import com.example.excelProj.Model.ViewLink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewLinkRepository extends JpaRepository<ViewLink,Long> {

    public ViewLink findByToken(String token);
}
