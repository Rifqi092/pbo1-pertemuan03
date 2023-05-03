package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangDiDompet = 54000;
        if(uangDiDompet<totalBelanja){
            System.out.println("Uang Kurang, Kurangi belanja anda");
        } else if (uangDiDompet==totalBelanja) {
            System.out.println("Uang Pas tidak ada Kembalian");
        }else{
            System.out.println("Uang lebih ada kembalian sebesar "+(uangDiDompet-totalBelanja));
        }
    }
}
