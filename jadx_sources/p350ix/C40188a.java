package p350ix;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.kubi.resources.widget.wheel.view.WheelView;

/* JADX INFO: renamed from: ix.a */
/* JADX INFO: compiled from: LoopViewGestureListener.java */
/* JADX INFO: loaded from: classes13.dex */
public final class C40188a extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: b */
    public final WheelView f89320b;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
        this.f89320b.m55617p(f12);
        return true;
    }

    public C40188a(WheelView wheelView) {
        this.f89320b = wheelView;
    }
}
