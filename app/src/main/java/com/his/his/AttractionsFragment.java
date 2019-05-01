package com.his.his;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate( R.layout.fragment_attractions, container, false );
    }

    public void onResume(){
        super.onResume();

        // Set title bar
        ((FoodActivity) getActivity())
                .setActionBarTitle("Main Attractions");

    }

    public void famous_place(View view) {

    }

    public void shopping(View view) {

    }

    public void adventures(View view) {

    }
}
