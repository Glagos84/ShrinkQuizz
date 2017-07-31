package cl.mind.shrinkquizz;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class SectionsPagerAdapter extends FragmentPagerAdapter {


    //        constructor
    public SectionsPagerAdapter(FragmentManager fm) {

        super(fm);
    }

//        fin contructor

    @Override
    public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return PartyFragment.newInstance();
                case 1:
                    return MatchFragment.newInstance();
                case 2:
                    return LuckyFragment.newInstance();
                default:
                    return PartyFragment.newInstance();
            }
   }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Party";
            case 1:
                return "Match";
            case 2:
                return "Lucky";
        }
        return null;
    }
}
