package UAS.soal04;

/*
 *
 * @author
 * NAMA         : Raihan Giffari
 * KELAS        : IF-1
 * NIM          : 10119008
 *
 */

public class Wisatawan {

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the kewarganegaraan
     */
    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    /**
     * @param kewarganegaraan the kewarganegaraan to set
     */
    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    /**
     * @return the tujuanWisata
     */
    public String getTujuanWisata() {
        return tujuanWisata;
    }

    /**
     * @param tujuanWisata the tujuanWisata to set
     */
    public void setTujuanWisata(String tujuanWisata) {
        this.tujuanWisata = tujuanWisata;
    }
    private String nama;
    private String kewarganegaraan;
    private String tujuanWisata;
}
