package org.binar.KursusBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

@Data
@Builder
@Entity
public class Kelas {

    @Id
    private String kodeKelas;

    private String pengajar;
    private String ruangKelas;
    private Date waktu;

    @OneToMany(mappedBy = "kelas")
    private List<Siswa> siswa;

}
