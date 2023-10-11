package org.binar.KursusBackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Builder
@Entity
public class Siswa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long nomorInduk;

    @Column(name = "nama")
    private String nama;
    private String alamat;
    private String noHp;
    private String email;
    private String jenisKelamin;
    private String level;

    @ManyToOne
    @JoinColumn(name = "kode_kelas")
    private Kelas kelas;

}
