package p681v2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.contrarywind.view.WheelView;

/* JADX INFO: renamed from: v2.a */
/* JADX INFO: compiled from: LoopViewGestureListener.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C45363a extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: b */
    public final WheelView f101986b;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
        this.f101986b.m6994p(f12);
        return true;
    }

    public C45363a(WheelView wheelView) {
        this.f101986b = wheelView;
    }
}
