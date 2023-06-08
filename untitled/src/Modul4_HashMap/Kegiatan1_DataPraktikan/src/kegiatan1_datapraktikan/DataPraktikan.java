package kegiatan1_datapraktikan;

import java.util.Collection;
import java.util.HashMap;

public class DataPraktikan {
    private final HashMap<String, String> tabelData; 

    public DataPraktikan() {
        tabelData = new HashMap<> ();
    }
   
    public boolean tambahData(String nimPraktikan, String namaAsisten){
        if(!nimPraktikan.startsWith("IF")){
            return false;
        }else if(tabelData.containsKey(nimPraktikan)){
            return false;
        }else{ 
            tabelData.put(nimPraktikan, namaAsisten);
            return true;
        }       
    }
    
    public void tampil(){
            for (String nimPraktikan : tabelData.keySet()) {
            String namaAsisten = tabelData.get(nimPraktikan);
            System.out.println(nimPraktikan + " - " + namaAsisten);
        }
    }
    
    public void listNimPraktikan(){
        System.out.println("List NIM Praktikan: ");
        for(String nim : tabelData.keySet()){
            System.out.println(nim);
        }
    }
    
    public void listNamaPraktikan(){
        Collection<String> values = tabelData.values();
        System.out.println("List Nama Praktikan: ");
        for(String namaAsisten : values){
            System.out.println(namaAsisten);
        }
    }
    
    public int TotalData(){       
        return tabelData.size();        
    }
    
    public boolean Hapusdata(String nimPraktikan, String namaAsisten){
        if(!tabelData.containsKey(nimPraktikan)){
            return false;
        }else if(!tabelData.get(nimPraktikan).equals(namaAsisten)){
            return false;
        }else{ 
            tabelData.remove(nimPraktikan, namaAsisten);
            return true;
        }               
    }
    
    public boolean EditData(String nimPraktikan, String namaAsisten){
         if(!tabelData.containsKey(nimPraktikan)){
                return false;
         }
       else{ 
            tabelData.put(nimPraktikan, namaAsisten);
            return true;
        }        
    }
}