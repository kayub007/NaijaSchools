package com.example.naijaschools;



import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private CategoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.viewpager);
        adapter = new CategoryAdapter(getSupportFragmentManager());

        //add fragment here
        adapter.AddFragment(new UniversityFragment(), getString(R.string.university_fragment));
        adapter.AddFragment(new PolytechnicFragment(), getString(R.string.polytechnic_fragment));
        adapter.AddFragment(new CollegeFragment(), getString(R.string.college_fragment));
        adapter.AddFragment(new MilitaryFragment(), getString(R.string.military_fragment));

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


    }
}
