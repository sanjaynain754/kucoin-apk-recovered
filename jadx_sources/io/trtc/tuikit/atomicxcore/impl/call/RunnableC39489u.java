package io.trtc.tuikit.atomicxcore.impl.call;

import android.os.Handler;
import io.trtc.tuikit.atomicxcore.api.call.CallInfo;
import kotlinx.coroutines.flow.InterfaceC41669n;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.call.u */
/* JADX INFO: loaded from: classes61.dex */
public final class RunnableC39489u implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39491w f87664a;

    public RunnableC39489u(C39491w c39491w) {
        this.f87664a = c39491w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object value;
        CallInfo callInfo;
        InterfaceC41669n interfaceC41669n = this.f87664a.f87671d;
        do {
            value = interfaceC41669n.getValue();
            callInfo = (CallInfo) value;
        } while (!interfaceC41669n.compareAndSet(value, CallInfo.copy$default(callInfo, null, null, null, null, null, null, null, 0L, callInfo.getDuration() + 1, 255, null)));
        Handler handler = this.f87664a.f87670c;
        if (handler != null) {
            handler.postDelayed(this, 1000L);
        }
    }
}
