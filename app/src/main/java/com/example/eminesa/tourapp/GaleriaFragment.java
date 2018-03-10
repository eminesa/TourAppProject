package com.example.eminesa.tourapp;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.eminesa.tourapp.models.Galeria;

import java.util.ArrayList;


public class GaleriaFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;


    public static GaleriaFragment newInstance(String param1, String param2) {
        GaleriaFragment fragment = new GaleriaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_galeria, container, false);


        ArrayList<Galeria> arrayList = new ArrayList<>();

        Galeria one = new Galeria(R.drawable.ic_balikligol, R.string.galeria1);
        Galeria two = new Galeria(R.drawable.ic_harran1, R.string.galeria2);

        arrayList.add(one);
        arrayList.add(two);

        ListView listView = view.findViewById(R.id.list_view);
        GaleriaAdapter adapter = new GaleriaAdapter(getContext(), arrayList);
        listView.setAdapter(adapter);

        return view;
    }


    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }
}
