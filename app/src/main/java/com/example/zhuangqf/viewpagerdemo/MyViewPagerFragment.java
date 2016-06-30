package com.example.zhuangqf.viewpagerdemo;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class MyViewPagerFragment extends Fragment {

    int fragVal;

    static MyViewPagerFragment init(int val) {
        MyViewPagerFragment myViewPagerFragment = new MyViewPagerFragment();
        Bundle args = new Bundle();
        args.putInt("val", val);
        myViewPagerFragment.setArguments(args);
        return myViewPagerFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragVal = getArguments() != null ? getArguments().getInt("val") : 1;
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View layoutView = inflater.inflate(R.layout.fragment_my_view_pager, container,
                false);
        ImageView flagView = (ImageView)layoutView.findViewById(R.id.flag);
        flagView.setImageBitmap(
                BitmapFactory.decodeResource(this.getContext().getResources(),
                        MyApplication.flag[fragVal]));
        flagView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(v.getContext(),Main2Activity.class);
                intent.putExtra("position",fragVal);
                startActivity(intent);
            }
        });
        return layoutView;
    }
}
