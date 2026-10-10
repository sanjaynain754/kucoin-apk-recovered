package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes13.dex */
public class ResetHeightViewPager extends CustomViewPager {
    public ResetHeightViewPager(Context context) {
        this(context, null);
    }

    public ResetHeightViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.kubi.resources.widget.rtlviewpager.RtlViewPager, androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i11, int i12) {
        int currentItem = getCurrentItem();
        if (getAdapter() != null) {
            View view = ((Fragment) getAdapter().instantiateItem((ViewGroup) this, currentItem)).getView();
            int iMax = 0;
            if (view != null) {
                view.measure(i11, View.MeasureSpec.makeMeasureSpec(0, 0));
                iMax = Math.max(view.getMeasuredHeight(), ((ViewGroup) getParent()).getMeasuredHeight());
            }
            super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(iMax, 1073741824));
            return;
        }
        throw new RuntimeException("set adapter first");
    }
}
