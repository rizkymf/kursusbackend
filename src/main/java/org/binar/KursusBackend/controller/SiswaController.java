package org.binar.KursusBackend.controller;

import lombok.extern.slf4j.Slf4j;
import org.binar.KursusBackend.model.Siswa;
import org.binar.KursusBackend.model.request.SiswaRequest;
import org.binar.KursusBackend.service.SiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SiswaController {

    @Autowired
    SiswaService siswaService;

    @PostMapping(value = "tambah-siswa")
    public ResponseEntity tambahSiswa(@RequestBody SiswaRequest siswa) {
        // TODO: 1. generate id siswa dan email siswa nya
        // TODO: 2. kasih level
        // TODO: 3. Mapping kan dengan entity class
        siswaService.tambahSiswa(Siswa.builder()
                        .nama(siswa.getNamaSiswa())
                        .email("Generate Email by system")
                .build());
        return ResponseEntity.ok("Siswa berhasil ditambahkan!");
    }

}
