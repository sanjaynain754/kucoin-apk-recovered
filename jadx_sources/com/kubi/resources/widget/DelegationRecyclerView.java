package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class DelegationRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: b */
    public int f43784b;

    /* JADX INFO: renamed from: c */
    public int f43785c;

    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z11 = false;
        int top = getChildAt(0).getTop();
        int x11 = (int) motionEvent.getX();
        int y11 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                if (Math.abs(x11 - this.f43784b) < Math.abs(y11 - this.f43785c) && top != 0) {
                    z11 = true;
                }
            }
        } else if (top != 0) {
            z11 = true;
        }
        this.f43784b = x11;
        this.f43785c = y11;
        getParent().requestDisallowInterceptTouchEvent(z11);
        return super.dispatchTouchEvent(motionEvent);
    }

    public DelegationRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setNestedScrollingEnabled(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        super.requestDisallowInterceptTouchEvent(z11);
    }
}
