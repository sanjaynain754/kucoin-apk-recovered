package com.kubi.resources.widget.bingoogolapple.bgabanner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import ro.C44128b;

/* JADX INFO: loaded from: classes13.dex */
public class BGAGuideLinkageLayout extends FrameLayout {
    public BGAGuideLinkageLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            try {
                getChildAt(i11).dispatchTouchEvent(motionEvent);
            } catch (Exception e11) {
                C44128b.m97264h(e11);
            }
        }
        return true;
    }

    public BGAGuideLinkageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BGAGuideLinkageLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
