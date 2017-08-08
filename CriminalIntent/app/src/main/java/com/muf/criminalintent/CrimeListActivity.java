package com.muf.criminalintent;


import android.support.v4.app.Fragment;

/**
 * Created by 15997028 on 23/05/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
