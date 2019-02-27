package com.example.akshay.fragmentdemo;




import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    Fragment frag ;
    CardView Computer,IT,Chemical,Electrical,Mechanical;

    //View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //openFragment(v);

    }

    public void openFragment(View v)
    {


        Computer = findViewById(R.id.card_computer);
        IT = findViewById(R.id.card_it);
        Chemical = findViewById(R.id.card_chemical);
        Electrical = findViewById(R.id.card_electrical);
        Mechanical = findViewById(R.id.card_mechanical);

        if(v == Computer)
        {
            frag = new ComputerFrag();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_id,frag);
            ft.commit();
        }

        if(v == IT)
        {
            frag = new IT();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_id,frag);
            ft.commit();
        }

        if(v == Chemical)
        {
            frag = new Chemical();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_id,frag);
            ft.commit();
        }

        if(v == Electrical)
        {
            frag = new Electrical();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_id,frag);
            ft.commit();
        }
        if(v == Mechanical)
        {
            frag = new Mechanical();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_id,frag);
            ft.commit();
        }



    }

}
