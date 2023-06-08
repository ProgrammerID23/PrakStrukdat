import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<String>();
        hewan.add("Angsa");
        hewan.add("Bebek");
        hewan.add("Cicak");
        hewan.add("Domba");
        hewan.add("Elang");
        hewan.add("Gajah");

        hewan.add("Badak");
        hewan.add("Bebek");

        int jumlahbebek = 0;

        System.out.println("Hewan: " +hewan);

        for (int i=0; i < hewan.size(); i++){
            if(hewan.get(i).equals("Bebek")) {
                jumlahbebek++;
                System.out.println("Bebek ada di index ke-"+i);
            }
        }

        hewan.remove("Bebek");

        System.out.println("Hewan: " +hewan);

        System.out.println("Hewan index ke-0 "+hewan.get(0));
        System.out.println("Hewan index ke-1 "+hewan.get(2));
        hewan.remove(0);
        System.out.println("Hewan: " +hewan);

        hewan.set(0, "Ular");
        hewan.add(2, "Itik");
        System.out.println("Hewan: " +hewan);

        hewan.subList(2, 5).clear();
        System.out.println("Hewan: " +hewan);

        System.out.println(hewan.get(0));
        System.out.println(hewan.get(hewan.size()-1));

        System.out.println("Menampilkan elemen hewan: "+hewan.size());
        System.out.println("Badak berada pada index ke-"+hewan.indexOf("Badak"));

    }
}