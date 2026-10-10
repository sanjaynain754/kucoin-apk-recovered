package com.tencent.bugly.proguard;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import shark.Hprof;
import shark.InterfaceC44456i;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.c6 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33580c6 implements Closeable {

    /* JADX INFO: renamed from: b */
    public final Hprof f69390b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC44456i f69391c;

    /* JADX INFO: renamed from: d */
    public final Map<String, Set<Long>> f69392d = new HashMap();

    /* JADX INFO: renamed from: a */
    public InterfaceC44456i m72650a() {
        return this.f69391c;
    }

    /* JADX INFO: renamed from: a */
    public Set<Long> m72649a(String str) {
        return this.f69392d.get(str);
    }

    /* JADX INFO: renamed from: b */
    public Set<Long> m72652b() {
        HashSet hashSet = new HashSet();
        Iterator<Set<Long>> it = this.f69392d.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next());
        }
        return hashSet;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Hprof hprof = this.f69390b;
        if (hprof != null) {
            hprof.close();
        }
    }

    public C33580c6(Hprof hprof, InterfaceC44456i interfaceC44456i) {
        this.f69390b = hprof;
        this.f69391c = interfaceC44456i;
    }

    /* JADX INFO: renamed from: a */
    public void m72651a(String str, Set<Long> set) {
        this.f69392d.put(str, set);
    }
}
