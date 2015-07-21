package jp.eno314.toolbarandtabdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by eno314 on 2015/07/21.
 */
public class SampleTabFragmentPagerAdapter extends FragmentPagerAdapter {

    private static final String[] TAB_LIST = {"TAB 1", "TAB 2", "TAB 3", "TAB 4", "TAB 5", "TAB 6"};

    public SampleTabFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return SampleScrollFragment.newInstance(TAB_LIST[position]);
    }

    @Override
    public int getCount() {
        return TAB_LIST.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TAB_LIST[position];
    }
}
