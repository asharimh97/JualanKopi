package id.asharimh.jualankopi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // TODO: 4/22/2017 Membuat Activity untuk pemesanan kopi secara sederhana 
    TextView jumlahKopi ;
    Button btnOrder ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        jumlahKopi = (TextView) findViewById(R.id.jumlahKopi);
        btnOrder = (Button) findViewById(R.id.btnOrder) ;

    }
    int kopi = 0 ;
    // buat juga variabel harga kopi berupa bilangan bulat
    public void submitOrder(View v){
        
        // Panggil fungsi untuk menampilkan harga, tapi cek dulu
        // apabila ada checkbox krimer dipilih, maka harga ditambah 1
    }

    // buat fungsi untuk mencetak harga kopi ke TextView dengan ID = totalKopi (atau bisa diganti sesukanya)  

    public void tampilKopi(int number){
        jumlahKopi.setText(number+"");
    }

    public void tambahKopi(View v){
        kopi = kopi + 1 ;
        tampilKopi(kopi);
    }

    public void kurangKopi(View v){
        if(kopi > 0)
            kopi = kopi -1 ;
        tampilKopi(kopi);
    }
}
