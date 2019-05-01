package com.his.his;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate( R.layout.fragment_food, container, false );
    }

    public void onResume(){
        super.onResume();

        // Set title bar
        ((FoodActivity) getActivity())
                .setActionBarTitle("Food & Restaurants");

    }

    public void main_food(View view) {

    }

    public void fast_food(View view) {

    }

    public void street_food(View view) {

    }


}
