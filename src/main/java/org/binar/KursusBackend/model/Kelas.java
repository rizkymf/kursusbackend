package org.binar.KursusBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.Date;
import java.util.List;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Kelas {

    @Id
    private String kodeKelas;

    private String pengajar;
    private String ruangKelas;
    private Date waktu;

    @OneToMany(mappedBy = "kelas")
    @Cascade(CascadeType.ALL)
    private List<Siswa> siswa;

}
