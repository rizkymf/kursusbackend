package org.binar.KursusBackend.service;

import org.binar.KursusBackend.model.Siswa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SiswaServiceImplTest {

    @Autowired
    SiswaService siswaService;

    @Test
    void testInsertSiswa() {
        siswaService.tambahSiswa(Siswa.builder()
                        .nama("Test")
                        .level(7)
                        .active(true)
                        .alamat("Di hatimu")
                        .email("test@dihatimu.com")
                .build());

        Assertions.assertFalse(siswaService.siswaTerdaftar().isEmpty());
    }

    @Test
    void testSiswaAktif() {

    }
}
