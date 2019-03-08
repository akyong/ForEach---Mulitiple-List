/*
 * Project ini dibuat sebagai contoh dan hanya untuk memudahkan para pembaca dan 
 * hanya sebagai bahan belajar. 
 * Dalam project ini penulis akan membantu para pembaca untuk mengenal ForEach pada Java 8
 * ForEach dibuat untuk lamda.
 * ForEach dengan multiple List
 */
package foreachwithmultiplelist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author Akyong
 */
public class ForEachWithMultipleList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> namaMahasiswa = new ArrayList<>();
        namaMahasiswa.add("Akyong");
        namaMahasiswa.add("Bobby");
        namaMahasiswa.add("Jeni");
        namaMahasiswa.add("Johan");
        
        List<Integer> usiaMahasiswa = new ArrayList<>();
        usiaMahasiswa.add(20);
        usiaMahasiswa.add(22);
        usiaMahasiswa.add(27);
        usiaMahasiswa.add(30);
        
        //Cara Pertama
        for(int a=0;a<namaMahasiswa.size();a++){
            System.out.println("Nama Mahasiswa: "+namaMahasiswa.get(a)+", Usia:"+usiaMahasiswa.get(a));
        }
        
        //Cara Kedua
        int index = 0;
        for(String nama: namaMahasiswa){
            System.out.println("Nama Mahasiswa: "+nama+", Usia: "+usiaMahasiswa.get(index));
            index++;
        }
        
        //Cara Ketiga
        IntStream.range(0, namaMahasiswa.size()).forEach(idx->{
            System.out.println("Nama Mahasiswa: "+namaMahasiswa.get(idx)+", Usia: "+usiaMahasiswa.get(idx));
        });
        
      
    }
    
}
