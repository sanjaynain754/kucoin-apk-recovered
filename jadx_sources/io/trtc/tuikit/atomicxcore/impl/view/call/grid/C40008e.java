package io.trtc.tuikit.atomicxcore.impl.view.call.grid;

import android.view.GestureDetector;
import android.view.MotionEvent;
import io.trtc.tuikit.atomicxcore.impl.view.call.C40040x;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.grid.e */
/* JADX INFO: loaded from: classes61.dex */
public final class C40008e extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40007d f88989a;

    public C40008e(C40007d c40007d) {
        this.f88989a = c40007d;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e11, float f11, float f12) {
        Intrinsics.checkNotNullParameter(e11, "e2");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        C40040x c40040x = this.f88989a.f88988b;
        if (c40040x == null) {
            return false;
        }
        c40040x.performClick();
        return false;
    }
}
