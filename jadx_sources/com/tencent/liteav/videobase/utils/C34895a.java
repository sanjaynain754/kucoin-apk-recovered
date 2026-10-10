package com.tencent.liteav.videobase.utils;

import java.util.LinkedList;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.utils.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C34895a {

    /* JADX INFO: renamed from: a */
    public final LinkedList<Runnable> f74289a = new LinkedList<>();

    /* JADX INFO: renamed from: a */
    public final void m76554a() {
        LinkedList linkedList;
        synchronized (this.f74289a) {
            try {
                if (this.f74289a.isEmpty()) {
                    linkedList = null;
                } else {
                    linkedList = new LinkedList(this.f74289a);
                    this.f74289a.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        while (linkedList != null && !linkedList.isEmpty()) {
            ((Runnable) linkedList.removeFirst()).run();
        }
    }
}
