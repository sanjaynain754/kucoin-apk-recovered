package io.trtc.tuikit.atomicxcore.impl.view.call.p851float;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.float.a */
/* JADX INFO: loaded from: classes61.dex */
public final class C39990a extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FrameLayout f88934a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40002m f88935b;

    public C39990a(FrameLayout frameLayout, C40002m c40002m) {
        this.f88934a = frameLayout;
        this.f88935b = c40002m;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e11, float f11, float f12) {
        float x11;
        float x12;
        Intrinsics.checkNotNullParameter(e11, "e2");
        if (this.f88935b.f88964g) {
            x11 = e11.getX();
            x12 = motionEvent != null ? motionEvent.getX() : 0.0f;
        } else {
            x11 = motionEvent != null ? motionEvent.getX() : 0.0f;
            x12 = e11.getX();
        }
        float f13 = x11 - x12;
        ViewGroup.LayoutParams layoutParams = this.f88934a.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        int marginEnd = (int) (layoutParams2.getMarginEnd() + f13);
        int y11 = (int) ((e11.getY() - (motionEvent != null ? motionEvent.getY() : 0.0f)) + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin);
        if (marginEnd < 0 || marginEnd > this.f88935b.getWidth() - this.f88934a.getWidth() || y11 < 0 || y11 > this.f88935b.getHeight() - this.f88934a.getHeight()) {
            return true;
        }
        layoutParams2.setMarginEnd(marginEnd);
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = y11;
        this.f88934a.setLayoutParams(layoutParams2);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        this.f88934a.performClick();
        return false;
    }
}
