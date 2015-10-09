package com.ms.square.android.etsyblurdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ParkingFragment extends Fragment{

//    public static PlaceholderFragment newInstance(int sectionNumber) {
//        PlaceholderFragment fragment = new PlaceholderFragment();
//        Bundle args = new Bundle();
//        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
    public static ParkingFragment newInstance() {
        ParkingFragment fragmentp = new ParkingFragment();
        return fragmentp;
    }

    public ParkingFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FetchParkingData parkingTask = new FetchParkingData();
        parkingTask.execute();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("MSG", "ParkingFragment!!!!!");
        return inflater.inflate(R.layout.fragment_parking, container, false);
    }

}
