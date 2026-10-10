package io.trtc.tuikit.atomicxcore.impl.view.call;

import android.os.SystemClock;
import android.view.View;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.y */
/* JADX INFO: loaded from: classes61.dex */
public final class ViewOnAttachStateChangeListenerC40041y implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39982A f89084a;

    public ViewOnAttachStateChangeListenerC40041y(C39982A c39982a) {
        this.f89084a = c39982a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v11) {
        Intrinsics.checkNotNullParameter(v11, "v");
        C39982A c39982a = this.f89084a;
        boolean z11 = c39982a.f88919e;
        if (!z11 && !z11) {
            c39982a.f88919e = true;
            c39982a.f88917c = SystemClock.uptimeMillis();
            c39982a.f88918d.post(c39982a.f88920f);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v11) {
        Intrinsics.checkNotNullParameter(v11, "v");
        C39982A c39982a = this.f89084a;
        c39982a.f88919e = false;
        c39982a.f88918d.removeCallbacks(c39982a.f88920f);
        this.f89084a.f88916b.removeOnAttachStateChangeListener(this);
    }
}
