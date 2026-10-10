package com.kubi.home.pagergridlayoutmanager;

import android.util.Log;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.kubi.home.pagergridlayoutmanager.a */
/* JADX INFO: compiled from: PagerGridItemTouchListener.java */
/* JADX INFO: loaded from: classes15.dex */
public class C14750a extends RecyclerView.SimpleOnItemTouchListener {

    /* JADX INFO: renamed from: a */
    public final PagerGridLayoutManager f25981a;

    /* JADX INFO: renamed from: b */
    public final RecyclerView f25982b;

    /* JADX INFO: renamed from: c */
    public int f25983c;

    /* JADX INFO: renamed from: d */
    public int f25984d;

    /* JADX INFO: renamed from: e */
    public int f25985e;

    public C14750a(PagerGridLayoutManager pagerGridLayoutManager, RecyclerView recyclerView) {
        this.f25981a = pagerGridLayoutManager;
        this.f25982b = recyclerView;
    }

    /* JADX INFO: renamed from: a */
    public final void m29807a(MotionEvent motionEvent) {
        int i11;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f25983c) {
            if (actionIndex == 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            this.f25983c = motionEvent.getPointerId(i11);
            this.f25984d = (int) (motionEvent.getX(i11) + 0.5f);
            this.f25985e = (int) (motionEvent.getY(i11) + 0.5f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0089  */
    @Override // androidx.recyclerview.widget.RecyclerView.SimpleOnItemTouchListener, androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (PagerGridLayoutManager.f25941B) {
            Log.i("ItemTouchListener", "onInterceptTouchEvent-actionMasked: " + actionMasked + ", actionIndex: " + actionIndex);
        }
        if (actionMasked != 0) {
            if (actionMasked != 2) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        m29807a(motionEvent);
                    }
                } else {
                    this.f25983c = motionEvent.getPointerId(actionIndex);
                    this.f25984d = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f25985e = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f25982b.getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f25983c);
                if (iFindPointerIndex < 0) {
                    return false;
                }
                int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int i11 = x11 - this.f25984d;
                int i12 = y11 - this.f25985e;
                if (this.f25981a.canScrollHorizontally()) {
                    this.f25982b.getParent().requestDisallowInterceptTouchEvent(this.f25982b.canScrollHorizontally(-i11));
                }
                if (this.f25981a.canScrollVertically()) {
                    this.f25982b.getParent().requestDisallowInterceptTouchEvent(this.f25982b.canScrollVertically(-i12));
                }
            }
        } else {
            this.f25983c = motionEvent.getPointerId(actionIndex);
            this.f25984d = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f25985e = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f25982b.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }
}
