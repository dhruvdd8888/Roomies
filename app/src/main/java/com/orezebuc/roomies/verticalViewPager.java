package com.orezebuc.roomies;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

public class verticalViewPager extends ViewPager {
    public verticalViewPager(@NonNull Context context) {
        super(context);
        initializer();
    }

    public verticalViewPager(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initializer();
    }

    public void initializer(){
        setPageTransformer(true, new ViewPagerTransform());
        setOverScrollMode(OVER_SCROLL_NEVER);
    }

    private MotionEvent swapper (MotionEvent motionEvent){
        float X = getWidth();
        float Y = getHeight();

        float newX = (motionEvent.getY() / Y) * Y;
        float newY = (motionEvent.getX() / X) * X;

        motionEvent.setLocation(newX, newY);
        return motionEvent;

    }

    public boolean onInterceptTouchEvent (MotionEvent motionEvent){
        boolean b = super.onInterceptTouchEvent(swapper(motionEvent));
        swapper(motionEvent);
        return b;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return super.onTouchEvent(swapper(ev));
    }

    public class ViewPagerTransform implements ViewPager.PageTransformer{

        private static final float MIN_SCALE = 0.65F;

        @Override
        public void transformPage(@NonNull View page, float position) {
            if (position < -1){
                page.setAlpha(0);
            } else if (position <=0 ){
                page.setAlpha(1);
                page.setTranslationX(page.getWidth() * -position);
                page.setTranslationY(page.getHeight() * position);

                page.setScaleX(1);
                page.setScaleY(1);
            } else if (position == 1){
                page.setAlpha(1 - position);
                page.setTranslationX(page.getWidth() * -position);
                page.setTranslationY(0);

                page.setScaleX(MIN_SCALE);
                page.setScaleY(MIN_SCALE);
            } else{
                page.setAlpha(0);
            }

        }
    }

}
