package org.binar.KursusBackend.service;

import lombok.extern.slf4j.Slf4j;
import org.binar.KursusBackend.model.Kelas;
import org.binar.KursusBackend.repository.KelasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KelasServiceImpl implements KelasService {

    @Autowired
    KelasRepository kelasRepository;

    @Override
    public void tambahKelas(Kelas kelas) {
        kelasRepository.save(kelas);
    }

    @Override
    public void deleteKelas(String kodeKelas) {

    }
}
