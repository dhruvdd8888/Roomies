package com.orezebuc.roomies;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class viewPagerAdapter extends FragmentStatePagerAdapter {
    public String[][] userDatas = {
            {"Tom Parker", "21", "Rajkot", ""+R.drawable.tom2},
            {"Jerry Stark", "21", "Ahemdabad", ""+R.drawable.jerry},
            {"Tom Rogers", "22", "Surat", ""+R.drawable.tom4},
            {"Jerry Barton", "29", "Baroda", ""+R.drawable.jerry2},
            {"Tom Banner", "33", "Ahemdabad", ""+R.drawable.tom3},
    };

    public viewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        childFragment child = new childFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArray("userdata",userDatas[position]);
        child.setArguments(bundle);

        return child;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
