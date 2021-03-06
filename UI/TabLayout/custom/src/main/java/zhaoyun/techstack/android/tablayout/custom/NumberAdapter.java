package zhaoyun.techstack.android.tablayout.custom;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

/**
 * @author zhaoyun
 * @version 2020/5/21
 */
public class NumberAdapter extends FragmentStatePagerAdapter {

    private int mCount;

    NumberAdapter(@NonNull FragmentManager fm, int count) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        mCount = count;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return NumberFragment.createInstance(position);
    }

    @Override
    public int getCount() {
        return mCount;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return String.valueOf(position);
    }
}
