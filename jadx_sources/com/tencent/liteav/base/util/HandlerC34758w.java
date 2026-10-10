package com.tencent.liteav.base.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.tencent.liteav.base.util.w */
/* JADX INFO: loaded from: classes59.dex */
public final class HandlerC34758w extends Handler {

    /* JADX INFO: renamed from: a */
    private int f73568a;

    /* JADX INFO: renamed from: b */
    private boolean f73569b;

    /* JADX INFO: renamed from: c */
    private final a f73570c;

    /* JADX INFO: renamed from: com.tencent.liteav.base.util.w$a */
    public interface a {
        void onTimeout();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m76148a(int i11) {
        m76147a();
        this.f73568a = i11;
        this.f73569b = true;
        sendEmptyMessageDelayed(0, 0L);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        synchronized (this) {
            try {
                if (this.f73569b) {
                    removeMessages(0);
                    sendEmptyMessageDelayed(0, this.f73568a);
                    a aVar = this.f73570c;
                    if (aVar != null) {
                        aVar.onTimeout();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public HandlerC34758w(Looper looper, a aVar) {
        super(looper);
        this.f73569b = false;
        this.f73570c = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m76147a() {
        while (hasMessages(0)) {
            try {
                removeMessages(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f73569b = false;
    }
}
