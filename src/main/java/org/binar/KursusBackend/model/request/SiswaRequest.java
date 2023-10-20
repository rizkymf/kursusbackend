package org.binar.KursusBackend.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SiswaRequest {

    private String namaSiswa;
    private String alamat;
    private String contact;
    private String jenisKelamin;
}
