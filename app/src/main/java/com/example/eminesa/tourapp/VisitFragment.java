package com.example.eminesa.tourapp;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.eminesa.tourapp.models.Visit;

import java.util.ArrayList;

public class VisitFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;


    public static VisitFragment newInstance(String param1, String param2) {
        VisitFragment fragment = new VisitFragment();
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
        View view = inflater.inflate(R.layout.fragment_visit, container, false);

        ArrayList arrayList = new ArrayList<>();

        Visit one = new Visit(R.drawable.ic_halfeti, R.string.visit);
        Visit two = new Visit(R.drawable.ic_halfeti, R.string.visit);

        arrayList.add(one);
        arrayList.add(two);

        ListView listView = view.findViewById(R.id.list_view);
        VisitAdapter adapter = new VisitAdapter(getContext(), arrayList);
        listView.setAdapter(adapter);

        return view;
    }


    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
