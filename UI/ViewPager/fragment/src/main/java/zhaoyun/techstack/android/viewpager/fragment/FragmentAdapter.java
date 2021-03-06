package zhaoyun.techstack.android.viewpager.fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * @author zhaoyun
 * @version 2020/5/19
 */
public class FragmentAdapter extends FragmentPagerAdapter {

    private static final int N = 10;

    FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return NumberFragment.createInstance(position);
    }

    @Override
    public int getCount() {
        return N;
    }
}
