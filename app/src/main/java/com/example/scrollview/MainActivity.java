package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //01. Daftarkan Widget
    TextView tvDeskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //02. daftarkan ID widget
        tvDeskripsi = (TextView) findViewById(R.id.textView3);

        //03. Coding Fungsi
        tvDeskripsi.setText("Komputer pertama kali ditemukan pada 1822 oleh seorang ahli matematika asal Inggris, Charles Babbage. Mulanya, Babbage bermaksud untuk menciptakan sebuah mesin hitung bertenaga uap yang dapat menghitung tabel angka.\n" +
                "Mesin tersebut kemudian ia beri nama \"Difference Engine 0\" dan digadang-gadang sebagai komputer pertama di dunia. Bentuk Difference Engine 0 sendiri sangat jauh berbeda dari kebanyakan model komputer modern saat ini.\n" +
                "Meski demikian, prinsip kerja yang dimiliki mesin tersebut sama seperti komputer modern, yakni mampu melakukan penghitungan angka alias komputasi.\n" +
                "Hingga pada 1890, seorang penemu bernama Herman Hollerith merancang sebuah sistem kartu yang mampu menghitung hasil sensus AS yang dilakukan pada 1880.\n" +
                "Berkat inovasi tersebut, Hollerith berhasil menghemat anggaran pemerintah sebanyak 5 juta dollar AS." +
                "Selanjutnya, Hollerith terus mengembangkan potensinya di ranah teknologi hingga" +
                "akhirnya sukses mendirikan perusahaan komputer IBM."+
                "\n\n"+
                "Cikal bakal komputer digital pertama dikembangkan pada 1930. Adalah Alan Turing yang pertama kali mengembangkan mesin tersebut.\n" +
                "Ia merupakan peneliti matematika yang sukses mengembangkan mesin yang dapat menjalankan sekumpulan perintah.\n" +
                "Berkat kontribusinya, mesin tersebut kemudian diberi nama mesin Turing (Turing Machine), termasuk sebuah simulasi gagasannya yang bernama uji Turing.\n" +
                "Komputer digital pertama dikembangkan oleh Konrad Zuse, seorang insinyur mesin asal Jerman. Sebelum perang dunia kedua pecah, Zuse membangun komputer digital pertama bernama Z1 yang dapat diprogram.\n" +
                "Pada 1936 di ruang tamu orang tuanya di Berlin, ia merakit pelat logam, pin, dan menciptakan sebuah mesin yang dapat melakukan perhitungan tambah dan kurang.\n" +
                "Meskipun model awal komputer tersebut dihancurkan saat Perang Dunia II, Zuse digadang sebagai pencipta komputer digital pertama.\n" +
                "Selama perang dunia kedua berlangsung tepatnya pada 1943, John Mauchly berhasil menciptakan mesin bernama Electronic Numerical Integrator and Calculator (ENIAC).\n" +
                "Awal mula diciptakannya ENIAC adalah untuk membantu Angkatan Darat dalam memprediksi serangan.\n" +
                "ENIAC sendiri dibekali dengan kemampuan analisa yang dapat menghitung ribuan masalah dalam hitungan detik. ENIAC memiliki berat hingga 30 ton dan membutuhkan ruang seluas 457 meter persegi untuk menempatkan mesin komputer tersebut.\n" +
                "Hal ini disebabkan oleh banyaknya komponen pendukung yang dimiliki ENIAC, seperti 40 lemari kabinet, 6.000 sakelar, serta 18.000 tabung hampa.");

    }
}