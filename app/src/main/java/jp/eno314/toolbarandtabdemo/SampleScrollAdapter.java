package jp.eno314.toolbarandtabdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by eno314 on 2015/07/21.
 */
public class SampleScrollAdapter extends RecyclerView.Adapter<SampleScrollAdapter.ViewHolder> {

    private final String mTabName;

    public SampleScrollAdapter(String tabName) {
        mTabName = tabName;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        final View view = inflater.inflate(R.layout.layout_sample_scroll_cell, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.textView.setText(mTabName + " - " + position);
    }

    @Override
    public int getItemCount() {
        return 100;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;

        public ViewHolder(View rootView) {
            super(rootView);
            textView = (TextView) rootView.findViewById(R.id.sample_scroll_cell_text);
        }
    }
}
