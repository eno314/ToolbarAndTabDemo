package jp.eno314.toolbarandtabdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SampleScrollFragment extends Fragment {

    public static SampleScrollFragment newInstance() {
        final SampleScrollFragment fragment = new SampleScrollFragment();

        final Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final RecyclerView recycler = (RecyclerView)
                inflater.inflate(R.layout.fragment_sample_scroll, container, false);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        recycler.setAdapter(new SampleScrollAdapter());

        return recycler;
    }
}
