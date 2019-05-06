package com.tasbehdhikrdua.syedarmashhussain.counter1;

import android.content.Context;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageAdapter extends PagerAdapter {
    private Context mContext;
    private int[] a= new int[]{R.drawable.da
    };



    ImageAdapter(Context context){
        mContext = context;
    }

    @Override
    public int getCount() {
        return a.length;
    }

    @Override
    public boolean isViewFromObject( View view,  Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView view = new ImageView(mContext);
        view.setScaleType(ImageView.ScaleType.CENTER_CROP);
        view.setImageResource(a[position]);
        container.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ImageView)object);
    }

}
