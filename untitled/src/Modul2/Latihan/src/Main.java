import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Hewan> hewan = new ArrayList<>();
        hewan.add(new Hewan("Sapi", "Putih"));
        hewan.add(new Hewan("Kelinci", "Hitam"));
        hewan.add(new Hewan("Kambing", "Abu"));
        hewan.add(new Hewan("Unta", "Krem"));
        hewan.add(new Hewan("Domba", "Pink"));

        List<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("Hitam");
        deleteHewan.add("Abu");
        deleteHewan.add("Krem");

        System.out.println("Hewan yang tersisa sebelum penghapusan: ");
        for (Hewan h: hewan){
            System.out.println(h.getJenis()+ " " +h.getWarna());
        }

        System.out.println("Warna Hewan yang akan dihapus : ");
        for (String h: deleteHewan){
            System.out.println(h);
        }

        for (int i = hewan.size() - 1; i > 0; i--){
            Hewan h = hewan.get(i);
            if(deleteHewan.contains(h.getWarna())){
                hewan.remove(h);
            }
        }

        System.out.println("Hewan yang tersisa setelah penghapusan: ");
        for (Hewan h: hewan){
            System.out.println(h.getJenis()+ " " +h.getWarna());
        }
    }
}