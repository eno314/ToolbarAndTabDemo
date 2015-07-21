package jp.eno314.toolbarandtabdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SampleScrollFragment extends Fragment {

    private static final String ARGUMENT_TAB_NAME = "ARGUMENT_TAB_NAME ";

    private String mTabName = "hogehoge";

    public static SampleScrollFragment newInstance(String tabName) {
        final SampleScrollFragment fragment = new SampleScrollFragment();

        final Bundle args = new Bundle();
        args.putString(ARGUMENT_TAB_NAME, tabName);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mTabName = getArguments().getString(ARGUMENT_TAB_NAME);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final RecyclerView recycler = (RecyclerView)
                inflater.inflate(R.layout.fragment_sample_scroll, container, false);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        recycler.setAdapter(new SampleScrollAdapter(mTabName));

        return recycler;
    }
}
