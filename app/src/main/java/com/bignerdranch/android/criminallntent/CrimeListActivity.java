package com.bignerdranch.android.criminallntent;

import android.support.v4.app.Fragment;

/**
 * Created by Leo on 2017/7/13.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
