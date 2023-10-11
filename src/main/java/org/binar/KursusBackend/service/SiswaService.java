package org.binar.KursusBackend.service;

import org.binar.KursusBackend.model.Siswa;

import java.util.List;

public interface SiswaService {

    void tambahSiswa(Siswa siswa);
    Boolean cekKetersediaanSiswa(Siswa siswa);
    void deleteSiswa(Long nomorInduk);
    void updateSiswa(Siswa siswa);

    List<Siswa> siswaTerdaftar();

    List<Siswa> siswaKelas(String kodeKelas);

}
