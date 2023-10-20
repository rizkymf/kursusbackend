package org.binar.KursusBackend.service;

import lombok.extern.slf4j.Slf4j;
import org.binar.KursusBackend.model.Siswa;
import org.binar.KursusBackend.repository.SiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class SiswaServiceImpl implements SiswaService {

    @Autowired
    private SiswaRepository siswaRepository;

    @Override
    public void tambahSiswa(Siswa siswa) {
        log.info("Menambah siswa a.n " + siswa.getNama());
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
        return siswaRepository.findAll();
    }

    @Override
    public List<Siswa> siswaAktif(Boolean active) {
        List<Siswa> siswaList = siswaRepository.getAllSiswaByActive(active).stream()
                .filter(siswa -> siswa.getLevel() >= 5)
                .collect(Collectors.toList());
        return siswaList;
    }

    @Override
    public List<Siswa> siswaKelas(String kodeKelas) {
        return null;
    }
}
