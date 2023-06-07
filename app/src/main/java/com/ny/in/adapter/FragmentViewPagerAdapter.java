package com.ny.in.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.ny.in.fragments.FilesLibraryFragment;
import com.ny.in.fragments.MovieLibraryFragment;
import com.ny.in.fragments.TvShowsLibraryFragment;

public class FragmentViewPagerAdapter extends FragmentStateAdapter {


    public FragmentViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position==0){
                return new MovieLibraryFragment();
        }else if(position==1){
                return new TvShowsLibraryFragment();
        }else {
                return new FilesLibraryFragment();
        }
    }



    @Override
    public int getItemCount() {
        return 3;
    }


}
