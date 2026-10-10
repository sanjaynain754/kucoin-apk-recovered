package p476ns;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: ns.d */
/* JADX INFO: compiled from: ViewTouchWrapper.java */
/* JADX INFO: loaded from: classes30.dex */
public final class ViewOnTouchListenerC42866d implements View.OnTouchListener {

    /* JADX INFO: renamed from: b */
    public final RunnableC42867e f94928b;

    /* JADX INFO: renamed from: c */
    public final RunnableC42867e.c f94929c;

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        RunnableC42867e.c cVar = this.f94929c;
        if (cVar == null) {
            return false;
        }
        return cVar.mo92829a(this.f94928b, view, motionEvent);
    }

    public ViewOnTouchListenerC42866d(RunnableC42867e runnableC42867e, RunnableC42867e.c cVar) {
        this.f94928b = runnableC42867e;
        this.f94929c = cVar;
    }
}
