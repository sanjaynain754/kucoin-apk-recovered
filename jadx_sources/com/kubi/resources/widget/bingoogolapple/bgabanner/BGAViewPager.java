package com.kubi.resources.widget.bingoogolapple.bgabanner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.core.view.VelocityTrackerCompat;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.ViewPager;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import ro.C44128b;

/* JADX INFO: loaded from: classes13.dex */
public class BGAViewPager extends RtlViewPager {

    /* JADX INFO: renamed from: f */
    public boolean f44248f;

    /* JADX INFO: renamed from: g */
    public InterfaceC22984a f44249g;

    /* JADX INFO: renamed from: com.kubi.resources.widget.bingoogolapple.bgabanner.BGAViewPager$a */
    public interface InterfaceC22984a {
        void handleAutoPlayActionUpOrCancel(float f11);
    }

    public BGAViewPager(Context context) {
        super(context);
        this.f44248f = true;
    }

    private float getXVelocity() {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mVelocityTracker");
            declaredField.setAccessible(true);
            VelocityTracker velocityTracker = (VelocityTracker) declaredField.get(this);
            Field declaredField2 = ViewPager.class.getDeclaredField("mActivePointerId");
            declaredField2.setAccessible(true);
            Field declaredField3 = ViewPager.class.getDeclaredField("mMaximumVelocity");
            declaredField3.setAccessible(true);
            velocityTracker.computeCurrentVelocity(1000, declaredField3.getInt(this));
            return VelocityTrackerCompat.getXVelocity(velocityTracker, declaredField2.getInt(this));
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m54949g(int i11, boolean z11) {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Method declaredMethod = ViewPager.class.getDeclaredMethod("setCurrentItemInternal", cls, cls2, cls2);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this, Integer.valueOf(i11), Boolean.valueOf(z11), Boolean.TRUE);
            ViewCompat.postInvalidateOnAnimation(this);
        } catch (Exception e11) {
            C44128b.m97264h(e11);
        }
    }

    @Override // com.kubi.resources.widget.rtlviewpager.RtlViewPager, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f44248f || getAdapter() == null || getAdapter().getCount() <= 0) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f44248f || getAdapter() == null || getAdapter().getCount() <= 0) {
            return false;
        }
        if (this.f44249g == null || !(motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            return super.onTouchEvent(motionEvent);
        }
        this.f44249g.handleAutoPlayActionUpOrCancel(getXVelocity());
        return false;
    }

    public void setAllowUserScrollable(boolean z11) {
        this.f44248f = z11;
    }

    public void setAutoPlayDelegate(InterfaceC22984a interfaceC22984a) {
        this.f44249g = interfaceC22984a;
    }

    public void setPageChangeDuration(int i11) {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this, new C22985a(getContext(), i11));
        } catch (Exception e11) {
            C44128b.m97264h(e11);
        }
    }

    public BGAViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44248f = true;
    }
}
