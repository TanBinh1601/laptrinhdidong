package datnguyen.ute.profileproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class AdapterTabItem extends FragmentStatePagerAdapter {
    private String listTab[] = {"POST", "PHOTOS"};
    private FirstFragment mFirstFragment;
    private SecondFragment mSecondFragment;

    public AdapterTabItem(@NonNull FragmentManager fm) {
        super(fm);
        mFirstFragment = new FirstFragment();
        mSecondFragment = new SecondFragment();
    }

    public AdapterTabItem(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return mFirstFragment;
        else if (position == 1)
            return mSecondFragment;
        return null;
    }

    @Override
    public int getCount() {
        return listTab.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listTab[position];
    }
}
