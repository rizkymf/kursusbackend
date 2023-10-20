package org.binar.KursusBackend.controller;

import org.binar.KursusBackend.model.Kelas;
import org.binar.KursusBackend.service.KelasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KelasController {

    @Autowired
    KelasService kelasService;

    @PostMapping(value = "tambah-kelas")
    public ResponseEntity tambahKelas(@RequestBody Kelas kelas) {
        kelasService.tambahKelas(kelas);
        return ResponseEntity.ok("Tambah kelas berhasil");
    }
}
