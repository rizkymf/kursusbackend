package org.binar.KursusBackend.service;

import org.binar.KursusBackend.model.Siswa;
import org.binar.KursusBackend.repository.SiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SiswaServiceImpl implements SiswaService {

    @Autowired
    private SiswaRepository siswaRepository;

    @Override
    public void tambahSiswa(Siswa siswa) {
        siswaRepository.save(siswa);
    }

    @Override
    public Boolean cekKetersediaanSiswa(Siswa siswa) {
        return null;
    }

    @Override
    public void deleteSiswa(Long nomorInduk) {

    }

    @Override
    public void updateSiswa(Siswa siswa) {

    }

    @Override
    public List<Siswa> siswaTerdaftar() {
        return null;
    }

    @Override
    public List<Siswa> siswaKelas(String kodeKelas) {
        return null;
    }
}
