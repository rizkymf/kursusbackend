package org.binar.KursusBackend.service;

import org.binar.KursusBackend.model.Kelas;

public interface KelasService {

    void tambahKelas(Kelas kelas);
    void deleteKelas(String kodeKelas);

}
