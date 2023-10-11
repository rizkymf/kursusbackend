package org.binar.KursusBackend.repository;

import org.binar.KursusBackend.model.Kelas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KelasRepository extends JpaRepository<Kelas, String> {
}
