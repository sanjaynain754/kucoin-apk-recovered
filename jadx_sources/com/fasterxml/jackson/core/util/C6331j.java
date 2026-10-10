package com.fasterxml.jackson.core.util;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.util.j */
/* JADX INFO: compiled from: ThreadLocalBufferManager.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6331j {

    /* JADX INFO: renamed from: a */
    public final Object f10178a = new Object();

    /* JADX INFO: renamed from: b */
    public final Map<SoftReference<C6322a>, Boolean> f10179b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public final ReferenceQueue<C6322a> f10180c = new ReferenceQueue<>();

    /* JADX INFO: renamed from: com.fasterxml.jackson.core.util.j$a */
    /* JADX INFO: compiled from: ThreadLocalBufferManager.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C6331j f10181a = new C6331j();
    }

    /* JADX INFO: renamed from: a */
    public static C6331j m11120a() {
        return a.f10181a;
    }

    /* JADX INFO: renamed from: b */
    public final void m11121b() {
        while (true) {
            SoftReference softReference = (SoftReference) this.f10180c.poll();
            if (softReference == null) {
                return;
            } else {
                this.f10179b.remove(softReference);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public SoftReference<C6322a> m11122c(C6322a c6322a) {
        SoftReference<C6322a> softReference = new SoftReference<>(c6322a, this.f10180c);
        this.f10179b.put(softReference, Boolean.TRUE);
        m11121b();
        return softReference;
    }
}
