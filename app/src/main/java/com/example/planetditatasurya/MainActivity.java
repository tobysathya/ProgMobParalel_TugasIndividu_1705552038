package com.example.planetditatasurya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mIsi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();

    }

    private void initImageBitmaps()  {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://blog.ruangguru.com/hs-fs/hubfs/ciri-ciri%20planet%20merkurius.jpg?width=600&name=ciri-ciri%20planet%20merkurius.jpg");
        mNames.add("MERKURIUS");
        mIsi.add("Planet yang pertama adalah Merkurius. Kamu tahu nggak kalau planet merkurius ini planet yang terkecil di tata surya kita? Ya, selain menjadi yang terkecil, merkurius juga planet yang paling dekat dengan matahari. Wah, nggak kebayang ya gimana panasnya kalo kita tinggal di planet ini? Planet Merkurius memiliki beberapa ciri-ciri yaitu: Merkurius merupakan planet yang memiliki predikat sebagai planet terkecil dan terdekat dari Matahari. Berwarna abu-abu. Memiliki jarak 57 juta km dari Matahari. Terdiri dari 70% logam dan 30% silikat. Berdiameter sekitar 4.879 km. Bersuhu 430° C untuk bagian planet yang menghadap Matahari dan -180° C untuk yang membelakangi Matahari.");

        mImageUrls.add("https://blog.ruangguru.com/hs-fs/hubfs/ciri-ciri%20planet%20venus.jpg?width=600&name=ciri-ciri%20planet%20venus.jpg");
        mNames.add("VENUS");
        mIsi.add("Lalu, planet selanjutnya adalah Venus. Planet Venus merupakan planet kedua yang terdekat dari Matahari lho!  Karena planet venus sering muncul pada pagi dan sore hari, planet venus ini juga dikenal sebagai bintang fajar atau bintang senja. Adapun ciri-cirinya sebagai berikut: Biasa dikenal sebagai “bintang fajar” atau “bintang senja”. Berwarna putih kekuningan. Memiliki jarak 108 juta km dari Matahari. Memiliki diameter 6.052 km. Berotasi melawan arah rotasi planet-planet lain.");

        mImageUrls.add("https://blog.ruangguru.com/hs-fs/hubfs/ciri-ciri%20planet%20bumi.jpg?width=600&name=ciri-ciri%20planet%20bumi.jpg");
        mNames.add("BUMI");
        mIsi.add("Selanjutnya adalah planet tempat kita tinggal, yaitu bumi. Bumi terdapat pada urutan planet ketiga yang terdekat dari Matahari. nah seperti yang kamu tau, bumi terdiri dari 70% air dan 30% daratan. ciri-ciri planet kesayangan kita ini adalah: Berwarna biru kehijauan. Memiliki jarak 149,6 juta km dengan Matahari. Memiliki diameter sebesar 12.742 km. Memiliki 1 buah satelit alami bernama bulan.");

        mImageUrls.add("https://blog.ruangguru.com/hs-fs/hubfs/ciri-ciri%20planet%20mars.jpg?width=600&name=ciri-ciri%20planet%20mars.jpg");
        mNames.add("MARS");
        mIsi.add("Planet mars merupakan planet yang berada pada urutan keempat dari matahari. tapi apa kamu tau bahwa planet ini memiliki atmosfer yang hampir menyerupai bumi? Iya, tapi itu dulu. Sekarang planet mars memiliki atmosfer yang sangat tipis, dengan sebagian besar terdiri dari karbon dioksida (95,3%), nitrogen (2,7%), argon (1,6%), oksigen (0,15%), dan air (0,03%). Sering disebut sebagai “planet merah” karena memiliki permukaan yang berwarna kemerah-merahan. Jarak antara mars dan Matahari adalah 227 juta km. Memiliki diameter sekitar 6.779 km. Memiliki 2 satelit, yaitu Phobos dan Demos.");

        mImageUrls.add("https://blog.ruangguru.com/hs-fs/hubfs/ciri-ciri%20planet%20jupiter.jpg?width=600&name=ciri-ciri%20planet%20jupiter.jpg");
        mNames.add("YUPITER");
        mIsi.add("Planet yupiter merupakan planet yang berada pada urutan kelima dari matahari. Tidak hanya itu, planet yupiter juga merupakan planet yang terbesar pada tata surya kita loh. Nah, ciri-ciri dari planet yupiter ini adalah: Merupakan planet terbesar pada tata surya. Memiliki warna yang tampak berlapis-lapis dengan kombinasi warna orange dan putih. Memiliki jarak sejauh 778,55 juta km dengan Matahari. Diameternya adalah sekitar 14.890 km. Merupakan planet yang memiliki satelit terbanyak pada tata surya, yaitu sebanyak 67 satelit.");

        mImageUrls.add("https://blog.ruangguru.com/hs-fs/hubfs/ciri-ciri%20planet%20saturnus.jpg?width=600&name=ciri-ciri%20planet%20saturnus.jpg");
        mNames.add("SATURNUS");
        mIsi.add("Selain menjadi planet yang berada pada urutan keenam dari matahari, saturnus juga terkenal dengan cincin yang mengelilinginya. Cincin yang mengelilingi saturnus ini merupakan gumpalan-gumpalan es yang melayang dan mengelilingi atmosfer planet. Nah, berikut adalah ciri-ciri planet saturnus: Berwarna kuning pucat. Memiliki cincin yang terbuat dari gumpalan-gumpalan es yang mengelilingi atmosfernya. Jarak planet saturnus dan Matahari adalah sejauh 1,4 milyar km. Berdiameter sebesar 116.463 km. Memiliki satelit sebanyak 56 satelit.");

        mImageUrls.add("https://blog.ruangguru.com/hs-fs/hubfs/ciri-ciri%20planet%20uranus.png?width=600&name=ciri-ciri%20planet%20uranus.png");
        mNames.add("URANUS");
        mIsi.add("Planet Uranus merupakan planet yang berada pada urutan ketujuh pada sistem tata surya kita. tapi tahu kah kamu, jika planet ini merupakan planet dengan suhu terdingin loh, yaitu sekitar -224° Celcius. Merupakan planet yang memiliki suhu terendah & terdingin yaitu sekitar -224° Celcius. Berwarna biru muda. Memiliki cincin unik yang melingkari planet secara vertical. Berdiameter 50.724 km. Memiliki satelit sebanyak 27 buah satelit.");

        mImageUrls.add("https://blog.ruangguru.com/hs-fs/hubfs/ciri-ciri%20planet%20neptunus.jpg?width=600&name=ciri-ciri%20planet%20neptunus.jpg");
        mNames.add("NEPTUNUS");
        mIsi.add("Planet neptunus merupakan planet dengan urutan terakhir dari sistem tata surya kita. Nah, tahu kah kamu seberapa jauh jarak antara planet neptunus dengan matahari? Yup, sekitar 4.450 juta km lho! Merupakan planet yang berwarna biru. Memiliki jarak sejauh 4,5 milyar km dari Matahari. Ber diameter 49.530 km. Dikelilingi oleh 8 buah satelit, di antaranya adalah Triton, Proteus, Nereid, dan Larissa.");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls, mIsi);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}





















