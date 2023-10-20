package org.binar.KursusBackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
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
    private int level;
    private Boolean active;

    @ManyToOne
    @JoinColumn(name = "kode_kelas")
    @Cascade(CascadeType.ALL)
    private Kelas kelas;

}
