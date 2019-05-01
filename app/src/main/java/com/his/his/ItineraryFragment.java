package com.his.his;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ItineraryFragment extends Fragment {


    public ItineraryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate( R.layout.fragment_itinerary, container, false );
    }

    public void onResume(){
        super.onResume();

        // Set title bar
        ((FoodActivity) getActivity())
                .setActionBarTitle("Itineraries");

    }

    public void five(View view) {

    }

    public void seven(View view) {

    }

    public void ten(View view) {

    }
}
