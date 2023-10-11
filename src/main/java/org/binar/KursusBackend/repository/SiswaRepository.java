package org.binar.KursusBackend.repository;

import org.binar.KursusBackend.model.Siswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiswaRepository extends JpaRepository<Siswa, Long> {
}
