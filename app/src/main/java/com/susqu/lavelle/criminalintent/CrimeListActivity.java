package com.susqu.lavelle.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Shannon on 2/5/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
