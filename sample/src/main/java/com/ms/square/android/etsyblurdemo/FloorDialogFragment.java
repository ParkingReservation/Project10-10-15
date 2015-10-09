package com.ms.square.android.etsyblurdemo;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.ms.square.android.etsyblur.BlurDialogFragmentHelper;

/**
 * Created by meimei on 10/2/15.
 */
public class FloorDialogFragment extends BlurDialogFragment {

        private BlurDialogFragmentHelper mHelper;
        private FloorDialogFragment self;

        public static FloorDialogFragment newInstance() {
            FloorDialogFragment fragment = new FloorDialogFragment();
            return fragment;
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            mHelper = new BlurDialogFragmentHelper(this);
            mHelper.onCreate();

            self = this;
        }


        @Override
        public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.fragment_dialog_demo, container, false);

            final ListView listView = (ListView) v.findViewById(R.id.dialog_content);
            listView.setAdapter(new ArrayAdapter<>(
                    getActivity(),
                    android.R.layout.simple_list_item_1,
                    android.R.id.text1,
                    new String[]{
                            "A1",
                            "A2",
                            "A3",
                            "A4"
                    }

            ));
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {

                    self.dismiss();
                    if (position == 0) {
                        Log.d("MSG", "A1 is clicked!!!!!!!!!");

                        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction()
                                .replace(R.id.container, ParkingFragment.newInstance())
                                .commit();
                    }
                    if (position == 1) {
                        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction()
                                .replace(R.id.container, ParkingFragment.newInstance())
                                .commit();
                    }
                    if (position == 2) {
                        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction()
                                .replace(R.id.container, ParkingFragment.newInstance())
                                .commit();
                    }
                    if (position == 3) {
                        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction()
                                .replace(R.id.container, ParkingFragment.newInstance())
                                .commit();
                    }
                }
            });
            return v;


        }



        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            mHelper.onActivityCreated();
        }

        @Override
        public void onStart() {
            super.onStart();
            mHelper.onStart();
        }

        @Override
        public void onDismiss(DialogInterface dialog) {
            mHelper.onDismiss();
            super.onDismiss(dialog);
        }
}
