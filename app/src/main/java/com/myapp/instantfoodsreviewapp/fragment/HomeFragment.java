package com.myapp.instantfoodsreviewapp.fragment;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.myapp.instantfoodsreviewapp.R;


public class HomeFragment extends Fragment implements CardView.OnClickListener {
    private ImageView image_coldNoodles;
    private ImageView image_ddokbokki;
    private ImageView image_dumpling;
    private ImageView image_friedRice;
    private ImageView image_pizza;
    private ImageView image_stew;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        init(rootView);
        onClick(rootView);
        return rootView;
    }

    private void init(View view) {
        image_coldNoodles = view.findViewById(R.id.image_coldNoodle);
        image_ddokbokki = view.findViewById(R.id.image_ddokbokki);
        image_dumpling = view.findViewById(R.id.image_dumpling);
        image_friedRice = view.findViewById(R.id.image_friedRice);
        image_pizza = view.findViewById(R.id.image_pizza);
        image_stew = view.findViewById(R.id.image_stew);

        image_coldNoodles.setOnClickListener(this);
        image_ddokbokki.setOnClickListener(this);
        image_dumpling.setOnClickListener(this);
        image_friedRice.setOnClickListener(this);
        image_pizza.setOnClickListener(this);
        image_stew.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.image_coldNoodle:
                FragmentTransaction fragmentTransactionNoodle = getFragmentManager().beginTransaction();
                fragmentTransactionNoodle.replace(R.id.fragment_container, new NoodleFragment());
                fragmentTransactionNoodle.addToBackStack(null);
                fragmentTransactionNoodle.commit();
                break;

            case R.id.image_ddokbokki:
                FragmentTransaction fragmentTransactionddok = getFragmentManager().beginTransaction();
                fragmentTransactionddok.replace(R.id.fragment_container, new DdokbokkiFragment());
                fragmentTransactionddok.addToBackStack(null);
                fragmentTransactionddok.commit();
                break;

            case R.id.image_dumpling:
                FragmentTransaction fragmentTransactionDumpling = getFragmentManager().beginTransaction();
                fragmentTransactionDumpling.replace(R.id.fragment_container, new DumplingFragment());
                fragmentTransactionDumpling.addToBackStack(null);
                fragmentTransactionDumpling.commit();
                break;

            case R.id.image_friedRice:
                FragmentTransaction fragmentTransactionFriedRice = getFragmentManager().beginTransaction();
                fragmentTransactionFriedRice.replace(R.id.fragment_container, new FriedRiceFragment());
                fragmentTransactionFriedRice.addToBackStack(null);
                fragmentTransactionFriedRice.commit();
                break;

            case R.id.image_pizza:
                FragmentTransaction fragmentTransactionPizza = getFragmentManager().beginTransaction();
                fragmentTransactionPizza.replace(R.id.fragment_container, new PizzaFragment());
                fragmentTransactionPizza.addToBackStack(null);
                fragmentTransactionPizza.commit();
                break;

            case R.id.image_stew:
                FragmentTransaction fragmentTransactionStew = getFragmentManager().beginTransaction();
                fragmentTransactionStew.replace(R.id.fragment_container, new StewFragment());
                fragmentTransactionStew.addToBackStack(null);
                fragmentTransactionStew.commit();
                break;

        }
    }


}
