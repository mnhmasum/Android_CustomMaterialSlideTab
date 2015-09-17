package materialtab.msm.com.custommaterialslidetab;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;

/**
 * Created by Edwin on 15/02/2015.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    LayoutInflater inflater;
    Context mContext;
    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerAdapter(Context context, FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;
        this.mContext = context;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {

        if(position == 0) // if the position is 0 we are returning the First tab
        {
            Fragment1 tab1 = new Fragment1();
            return tab1;

        } else             // As we are having 2 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
            Fragment2 tab2 = new Fragment2();
            return tab2;
        }

    }


    @Override
    public CharSequence getPageTitle(int position) {
       return Titles[position];
        //return MainActivity.relativeSizeSpan(Titles[position], position, mContext);
    }

    // This method return the Number of tabs for the tabs Strip

    @Override
    public int getCount() {
        return NumbOfTabs;
    }


}