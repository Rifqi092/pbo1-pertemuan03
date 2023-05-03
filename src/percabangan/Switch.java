package percabangan;

public class Switch {
    public static void main(String[] args) {
        int jalanJalan=3;
        switch (jalanJalan){
            case 1:
                System.out.println("urang lapas");
                break;
            case 2:
                System.out.println("urang acayan");
                break;
            case 3:
                System.out.println("ubat nyamuk");
                break;
            case 4:
                System.out.println("dubil dit");
                break;
            default:
                System.out.println("mahluk halus");
                break;
        }
        char nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs : \"Terima kasih pak\"");
                System.out.println("Dosen : \"Selamat ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs : \"Kenapa ulun kada dapat Am pak?\"");
                System.out.println("Dosen : \"!@$%$!$\"");
                break;
            case 'C':
                System.out.println("Mhs : \"Ulun turun pul pak ai, tugas pul jua\"");
                System.out.println("Dosen : \"tapi bisa lah menjawab ujian\"");
                System.out.println("Mhs : \"Hihihi..\"");
                break;
            default:
                System.out.println("Mhs : \"Ulun turun pul pak ai, tugas pul jua\"");
                System.out.println("Dosen : \"bujur jua kh?\"");
                System.out.println("Dosen : \"*memeriksa berkas\"");
                System.out.println("Dosen : \"*menceleng\"");
                System.out.println("Mhs : \"*kabur\"");
                break;
        }
    }
}
