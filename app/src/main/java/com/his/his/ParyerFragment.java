package com.his.his;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ParyerFragment extends Fragment {


    public ParyerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate( R.layout.fragment_paryer, container, false );
    }

    public void onResume(){
        super.onResume();

        // Set title bar
        ((FoodActivity) getActivity())
                .setActionBarTitle("Prayers Information");

    }

    public void prayer_times(View view) {

    }

    public void prayer_places(View view) {

    }

    public void prayer_direction(View view) {

    }
}
