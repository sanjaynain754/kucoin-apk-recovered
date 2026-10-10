package com.tencent.liteav.videobase.frame;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.frame.AbstractC34891j;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.frame.h */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC34889h<T extends AbstractC34891j> {

    /* JADX INFO: renamed from: a */
    public final Deque<T> f74258a = new LinkedList();

    /* JADX INFO: renamed from: c */
    public volatile boolean f74260c = false;

    /* JADX INFO: renamed from: d */
    private final InterfaceC34888g<T> f74261d = (InterfaceC34888g<T>) new InterfaceC34888g<T>() { // from class: com.tencent.liteav.videobase.frame.h.1
        @Override // com.tencent.liteav.videobase.frame.InterfaceC34888g
        /* JADX INFO: renamed from: a */
        public final void mo76520a(T t11) {
            AbstractC34889h.this.f74259b.release();
            synchronized (AbstractC34889h.this) {
                try {
                    if (AbstractC34889h.this.f74260c) {
                        return;
                    }
                    AbstractC34889h.this.f74258a.addFirst(t11);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };

    /* JADX INFO: renamed from: b */
    final Semaphore f74259b = new Semaphore(1);

    /* JADX INFO: renamed from: a */
    public final T m76535a() throws InterruptedException {
        T tRemoveFirst;
        this.f74259b.acquire();
        synchronized (this) {
            try {
                tRemoveFirst = !this.f74258a.isEmpty() ? this.f74258a.removeFirst() : (T) mo76536a(this.f74261d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (tRemoveFirst.retain() != 1) {
            LiteavLog.m76085e("LimitedFramePool", "invalid reference count for %s", tRemoveFirst);
        }
        return tRemoveFirst;
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo76536a(InterfaceC34888g<T> interfaceC34888g);
}
