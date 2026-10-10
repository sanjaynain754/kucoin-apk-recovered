package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public class WrapContentHeightViewPager extends CustomViewPager {
    public WrapContentHeightViewPager(Context context) {
        super(context);
    }

    @Override // com.kubi.resources.widget.rtlviewpager.RtlViewPager, androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i11, int i12) {
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            childAt.measure(i11, View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredHeight > i13) {
                i13 = measuredHeight;
            }
        }
        super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
    }

    public WrapContentHeightViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
