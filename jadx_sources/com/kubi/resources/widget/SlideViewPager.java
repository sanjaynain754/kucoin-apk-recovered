package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes13.dex */
public class SlideViewPager extends ViewPager {

    /* JADX INFO: renamed from: b */
    public int f44053b;

    /* JADX INFO: renamed from: c */
    public int f44054c;

    /* JADX INFO: renamed from: com.kubi.resources.widget.SlideViewPager$a */
    public interface InterfaceC22950a {
    }

    public SlideViewPager(Context context) {
        this(context, null);
    }

    public SlideViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44054c = 200;
    }

    public void setCriticalValue(int i11) {
        this.f44054c = i11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f44053b = (int) motionEvent.getX();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 2 && getAdapter() != null) {
            if (this.f44053b - motionEvent.getX() > this.f44054c) {
                getCurrentItem();
                getAdapter().getCount();
            }
            if (motionEvent.getX() - this.f44053b > this.f44054c) {
                getCurrentItem();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnSlideListener(InterfaceC22950a interfaceC22950a) {
    }
}
