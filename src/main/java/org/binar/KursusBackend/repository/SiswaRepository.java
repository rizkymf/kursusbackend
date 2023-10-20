package org.binar.KursusBackend.repository;

import org.binar.KursusBackend.model.Siswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SiswaRepository extends JpaRepository<Siswa, Long> {

    @Query(nativeQuery = true, value = "select * from siswa where active = :active")
    List<Siswa> getAllSiswaByActive(@Param("active") Boolean active);
}
