package custom;

import javax.swing.SwingUtilities;

public class Launcher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // misal Anda punya variabel noRawat dari form registrasi / form rekam medis
            String noRawat = "2026/09/26/000074";

            DlgPilihPemeriksaanRalan dlg = new DlgPilihPemeriksaanRalan(null, noRawat);
            dlg.setVisible(true);

            PilihPemeriksaan pilih = dlg.getSelectedItem();
            if (pilih != null) {
                System.out.println("Tanggal: " + pilih.getTglPerawatan());
                System.out.println("Tensi  : " + pilih.getTensi());
                System.out.println("Keluhan: " + pilih.getKeluhan());
            }
        });
    }
}