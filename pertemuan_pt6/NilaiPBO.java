package pertemuan_pt6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NilaiPBO extends NilaiMk {

    int uts, uas, tugas;

    public NilaiPBO(String nim, String nama) {
        super(nim, nama);
    }

    @Override
    public void getNilai() throws NumberFormatException, IOException {
        main.cetakSpasi(2);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukan nilai uts : ");
        uts = Integer.parseInt(br.readLine());
        System.out.print("Masukan nilai uas : ");
        uas = Integer.parseInt(br.readLine());
        System.out.print("Masukan nilai Tugas : ");
        tugas = Integer.parseInt(br.readLine());

        System.out.println("Nilai PBO : " + hitungNilai(uts, uas, tugas));
    }

    @Override
    public int hitungNilai(int uts, int uas, int tugas) {
        return ((uts * 25 / 100) + (uas * 25 / 100) + (tugas * 50 / 100));
    }
}
