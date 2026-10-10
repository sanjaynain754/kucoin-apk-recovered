package com.facebook.cache.disk;

import androidx.annotation.VisibleForTesting;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.common.statfs.StatFsHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p050c4.C4822d;
import p050c4.InterfaceC4819a;
import p486o3.InterfaceC42952a;
import p547q3.C43596b;
import p547q3.InterfaceC43595a;
import p547q3.InterfaceC43600f;
import p583r3.C43913f;
import p583r3.InterfaceC43911d;
import p583r3.InterfaceC43912e;
import p630t3.InterfaceC44678a;
import p630t3.InterfaceC44679b;
import p712w3.C45708h;
import p747x3.C45999a;

/* JADX INFO: renamed from: com.facebook.cache.disk.c */
/* JADX INFO: compiled from: DiskStorageCache.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5562c implements InterfaceC43912e, InterfaceC44678a {

    /* JADX INFO: renamed from: r */
    public static final Class<?> f8115r = C5562c.class;

    /* JADX INFO: renamed from: s */
    public static final long f8116s = TimeUnit.HOURS.toMillis(2);

    /* JADX INFO: renamed from: t */
    public static final long f8117t = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a */
    public final long f8118a;

    /* JADX INFO: renamed from: b */
    public final long f8119b;

    /* JADX INFO: renamed from: c */
    public final CountDownLatch f8120c;

    /* JADX INFO: renamed from: d */
    public long f8121d;

    /* JADX INFO: renamed from: e */
    public final CacheEventListener f8122e;

    /* JADX INFO: renamed from: f */
    @VisibleForTesting
    public final Set<String> f8123f;

    /* JADX INFO: renamed from: g */
    public long f8124g;

    /* JADX INFO: renamed from: h */
    public final long f8125h;

    /* JADX INFO: renamed from: i */
    public final StatFsHelper f8126i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC5561b f8127j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC43911d f8128k;

    /* JADX INFO: renamed from: l */
    public final CacheErrorLogger f8129l;

    /* JADX INFO: renamed from: m */
    public final boolean f8130m;

    /* JADX INFO: renamed from: n */
    public final b f8131n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC4819a f8132o;

    /* JADX INFO: renamed from: p */
    public final Object f8133p = new Object();

    /* JADX INFO: renamed from: q */
    public boolean f8134q;

    /* JADX INFO: renamed from: com.facebook.cache.disk.c$a */
    /* JADX INFO: compiled from: DiskStorageCache.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C5562c.this.f8133p) {
                C5562c.this.m8512p();
            }
            C5562c.this.f8134q = true;
            C5562c.this.f8120c.countDown();
        }
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.c$b */
    /* JADX INFO: compiled from: DiskStorageCache.java */
    @VisibleForTesting
    public static class b {

        /* JADX INFO: renamed from: a */
        public boolean f8136a = false;

        /* JADX INFO: renamed from: b */
        public long f8137b = -1;

        /* JADX INFO: renamed from: c */
        public long f8138c = -1;

        /* JADX INFO: renamed from: a */
        public synchronized long m8516a() {
            return this.f8138c;
        }

        /* JADX INFO: renamed from: b */
        public synchronized long m8517b() {
            return this.f8137b;
        }

        /* JADX INFO: renamed from: c */
        public synchronized void m8518c(long j11, long j12) {
            if (this.f8136a) {
                this.f8137b += j11;
                this.f8138c += j12;
            }
        }

        /* JADX INFO: renamed from: d */
        public synchronized boolean m8519d() {
            return this.f8136a;
        }

        /* JADX INFO: renamed from: e */
        public synchronized void m8520e() {
            this.f8136a = false;
            this.f8138c = -1L;
            this.f8137b = -1L;
        }

        /* JADX INFO: renamed from: f */
        public synchronized void m8521f(long j11, long j12) {
            this.f8138c = j12;
            this.f8137b = j11;
            this.f8136a = true;
        }
    }

    @Override // p583r3.InterfaceC43912e
    /* JADX INFO: renamed from: b */
    public boolean mo8502b(InterfaceC43595a interfaceC43595a) throws Throwable {
        String str;
        IOException e11;
        String str2 = null;
        try {
            try {
                synchronized (this.f8133p) {
                    try {
                        List<String> listM95951b = C43596b.m95951b(interfaceC43595a);
                        int i11 = 0;
                        while (i11 < listM95951b.size()) {
                            String str3 = listM95951b.get(i11);
                            if (this.f8127j.mo8472f(str3, interfaceC43595a)) {
                                this.f8123f.add(str3);
                                return true;
                            }
                            i11++;
                            str2 = str3;
                        }
                        return false;
                    } catch (Throwable th2) {
                        str = str2;
                        th = th2;
                        try {
                            throw th;
                        } catch (IOException e12) {
                            e11 = e12;
                            C43913f c43913fM96755h = C43913f.m96748a().m96751d(interfaceC43595a).m96757j(str).m96755h(e11);
                            CacheEventListener cacheEventListener = this.f8122e;
                            if (cacheEventListener != null) {
                                cacheEventListener.mo8447a(c43913fM96755h);
                            }
                            c43913fM96755h.m96749b();
                            return false;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e13) {
            str = null;
            e11 = e13;
        }
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.c$c */
    /* JADX INFO: compiled from: DiskStorageCache.java */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final long f8139a;

        /* JADX INFO: renamed from: b */
        public final long f8140b;

        /* JADX INFO: renamed from: c */
        public final long f8141c;

        public c(long j11, long j12, long j13) {
            this.f8139a = j11;
            this.f8140b = j12;
            this.f8141c = j13;
        }
    }

    @Override // p583r3.InterfaceC43912e
    /* JADX INFO: renamed from: a */
    public void mo8501a() {
        synchronized (this.f8133p) {
            try {
                this.f8127j.mo8467a();
                this.f8123f.clear();
                CacheEventListener cacheEventListener = this.f8122e;
                if (cacheEventListener != null) {
                    cacheEventListener.mo8450d();
                }
            } catch (IOException | NullPointerException e11) {
                this.f8129l.mo8446a(CacheErrorLogger.CacheErrorCategory.EVICTION, f8115r, "clearAll: " + e11.getMessage(), e11);
            }
            this.f8131n.m8520e();
        }
    }

    @Override // p583r3.InterfaceC43912e
    /* JADX INFO: renamed from: d */
    public void mo8504d(InterfaceC43595a interfaceC43595a) {
        synchronized (this.f8133p) {
            try {
                List<String> listM95951b = C43596b.m95951b(interfaceC43595a);
                for (int i11 = 0; i11 < listM95951b.size(); i11++) {
                    String str = listM95951b.get(i11);
                    this.f8127j.remove(str);
                    this.f8123f.remove(str);
                }
            } catch (IOException e11) {
                this.f8129l.mo8446a(CacheErrorLogger.CacheErrorCategory.DELETE_FILE, f8115r, "delete: " + e11.getMessage(), e11);
            }
        }
    }

    @Override // p583r3.InterfaceC43912e
    /* JADX INFO: renamed from: f */
    public boolean mo8506f(InterfaceC43595a interfaceC43595a) {
        synchronized (this.f8133p) {
            if (mo8507g(interfaceC43595a)) {
                return true;
            }
            try {
                List<String> listM95951b = C43596b.m95951b(interfaceC43595a);
                for (int i11 = 0; i11 < listM95951b.size(); i11++) {
                    String str = listM95951b.get(i11);
                    if (this.f8127j.mo8470d(str, interfaceC43595a)) {
                        this.f8123f.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // p583r3.InterfaceC43912e
    /* JADX INFO: renamed from: g */
    public boolean mo8507g(InterfaceC43595a interfaceC43595a) {
        synchronized (this.f8133p) {
            try {
                List<String> listM95951b = C43596b.m95951b(interfaceC43595a);
                for (int i11 = 0; i11 < listM95951b.size(); i11++) {
                    if (this.f8123f.contains(listM95951b.get(i11))) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC42952a m8508l(InterfaceC5561b.b bVar, InterfaceC43595a interfaceC43595a, String str) throws IOException {
        InterfaceC42952a interfaceC42952aMo8491a;
        synchronized (this.f8133p) {
            interfaceC42952aMo8491a = bVar.mo8491a(interfaceC43595a);
            this.f8123f.add(str);
            this.f8131n.m8518c(interfaceC42952aMo8491a.size(), 1L);
        }
        return interfaceC42952aMo8491a;
    }

    /* JADX INFO: renamed from: m */
    public final void m8509m(long j11, CacheEventListener.EvictionReason evictionReason) throws IOException {
        try {
            Collection<InterfaceC5561b.a> collectionM8510n = m8510n(this.f8127j.getEntries());
            long jM8517b = this.f8131n.m8517b();
            long j12 = jM8517b - j11;
            int i11 = 0;
            long j13 = 0;
            for (InterfaceC5561b.a aVar : collectionM8510n) {
                if (j13 > j12) {
                    break;
                }
                long jMo8468b = this.f8127j.mo8468b(aVar);
                this.f8123f.remove(aVar.getId());
                if (jMo8468b > 0) {
                    i11++;
                    j13 += jMo8468b;
                    C43913f c43913fM96752e = C43913f.m96748a().m96757j(aVar.getId()).m96754g(evictionReason).m96756i(jMo8468b).m96753f(jM8517b - j13).m96752e(j11);
                    CacheEventListener cacheEventListener = this.f8122e;
                    if (cacheEventListener != null) {
                        cacheEventListener.mo8449c(c43913fM96752e);
                    }
                    c43913fM96752e.m96749b();
                }
            }
            this.f8131n.m8518c(-j13, -i11);
            this.f8127j.mo8471e();
        } catch (IOException e11) {
            this.f8129l.mo8446a(CacheErrorLogger.CacheErrorCategory.EVICTION, f8115r, "evictAboveSize: " + e11.getMessage(), e11);
            throw e11;
        }
    }

    /* JADX INFO: renamed from: n */
    public final Collection<InterfaceC5561b.a> m8510n(Collection<InterfaceC5561b.a> collection) {
        long jNow = this.f8132o.now() + f8116s;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (InterfaceC5561b.a aVar : collection) {
            if (aVar.getTimestamp() > jNow) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.f8128k.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public final void m8511o() throws IOException {
        synchronized (this.f8133p) {
            try {
                boolean zM8512p = m8512p();
                m8515s();
                long jM8517b = this.f8131n.m8517b();
                if (jM8517b > this.f8121d && !zM8512p) {
                    this.f8131n.m8520e();
                    m8512p();
                }
                long j11 = this.f8121d;
                if (jM8517b > j11) {
                    m8509m((j11 * 9) / 10, CacheEventListener.EvictionReason.CACHE_FULL);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m8512p() {
        long jNow = this.f8132o.now();
        if (this.f8131n.m8519d()) {
            long j11 = this.f8124g;
            if (j11 != -1 && jNow - j11 <= f8117t) {
                return false;
            }
        }
        return m8513q();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m8513q() {
        boolean z11;
        long j11;
        long jNow = this.f8132o.now();
        long j12 = f8116s + jNow;
        Set<String> hashSet = (this.f8130m && this.f8123f.isEmpty()) ? this.f8123f : this.f8130m ? new HashSet<>() : null;
        try {
            long size = 0;
            long jMax = -1;
            int size2 = 0;
            boolean z12 = false;
            int i11 = 0;
            int i12 = 0;
            z11 = false;
            for (InterfaceC5561b.a aVar : this.f8127j.getEntries()) {
                try {
                    i11++;
                    size += aVar.getSize();
                    if (aVar.getTimestamp() > j12) {
                        i12++;
                        size2 = (int) (((long) size2) + aVar.getSize());
                        j11 = j12;
                        jMax = Math.max(aVar.getTimestamp() - jNow, jMax);
                        z12 = true;
                    } else {
                        j11 = j12;
                        if (this.f8130m) {
                            C45708h.m100896g(hashSet);
                            hashSet.add(aVar.getId());
                        }
                    }
                    j12 = j11;
                } catch (IOException e11) {
                    e = e11;
                    this.f8129l.mo8446a(CacheErrorLogger.CacheErrorCategory.GENERIC_IO, f8115r, "calcFileCacheSize: " + e.getMessage(), e);
                    return z11;
                }
            }
            if (z12) {
                this.f8129l.mo8446a(CacheErrorLogger.CacheErrorCategory.READ_INVALID_ENTRY, f8115r, "Future timestamp found in " + i12 + " files , with a total size of " + size2 + " bytes, and a maximum time delta of " + jMax + "ms", null);
            }
            long j13 = i11;
            if (this.f8131n.m8516a() != j13 || this.f8131n.m8517b() != size) {
                if (this.f8130m && this.f8123f != hashSet) {
                    C45708h.m100896g(hashSet);
                    this.f8123f.clear();
                    this.f8123f.addAll(hashSet);
                }
                this.f8131n.m8521f(size, j13);
            }
            this.f8124g = jNow;
            return true;
        } catch (IOException e12) {
            e = e12;
            z11 = false;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m8515s() {
        if (this.f8126i.m8554f(this.f8127j.isExternal() ? StatFsHelper.StorageType.EXTERNAL : StatFsHelper.StorageType.INTERNAL, this.f8119b - this.f8131n.m8517b())) {
            this.f8121d = this.f8118a;
        } else {
            this.f8121d = this.f8119b;
        }
    }

    public C5562c(InterfaceC5561b interfaceC5561b, InterfaceC43911d interfaceC43911d, c cVar, CacheEventListener cacheEventListener, CacheErrorLogger cacheErrorLogger, InterfaceC44679b interfaceC44679b, Executor executor, boolean z11) {
        this.f8118a = cVar.f8140b;
        long j11 = cVar.f8141c;
        this.f8119b = j11;
        this.f8121d = j11;
        this.f8126i = StatFsHelper.m8550d();
        this.f8127j = interfaceC5561b;
        this.f8128k = interfaceC43911d;
        this.f8124g = -1L;
        this.f8122e = cacheEventListener;
        this.f8125h = cVar.f8139a;
        this.f8129l = cacheErrorLogger;
        this.f8131n = new b();
        this.f8132o = C4822d.m4916a();
        this.f8130m = z11;
        this.f8123f = new HashSet();
        if (interfaceC44679b != null) {
            interfaceC44679b.mo98832a(this);
        }
        if (z11) {
            this.f8120c = new CountDownLatch(1);
            executor.execute(new a());
        } else {
            this.f8120c = new CountDownLatch(0);
        }
    }

    @Override // p583r3.InterfaceC43912e
    /* JADX INFO: renamed from: c */
    public InterfaceC42952a mo8503c(InterfaceC43595a interfaceC43595a, InterfaceC43600f interfaceC43600f) throws IOException {
        String strM95950a;
        C43913f c43913fM96751d = C43913f.m96748a().m96751d(interfaceC43595a);
        CacheEventListener cacheEventListener = this.f8122e;
        if (cacheEventListener != null) {
            cacheEventListener.mo8448b(c43913fM96751d);
        }
        synchronized (this.f8133p) {
            strM95950a = C43596b.m95950a(interfaceC43595a);
        }
        c43913fM96751d.m96757j(strM95950a);
        try {
            try {
                InterfaceC5561b.b bVarM8514r = m8514r(strM95950a, interfaceC43595a);
                try {
                    bVarM8514r.mo8492b(interfaceC43600f, interfaceC43595a);
                    InterfaceC42952a interfaceC42952aM8508l = m8508l(bVarM8514r, interfaceC43595a, strM95950a);
                    c43913fM96751d.m96756i(interfaceC42952aM8508l.size()).m96753f(this.f8131n.m8517b());
                    CacheEventListener cacheEventListener2 = this.f8122e;
                    if (cacheEventListener2 != null) {
                        cacheEventListener2.mo8452f(c43913fM96751d);
                    }
                    if (!bVarM8514r.cleanUp()) {
                        C45999a.m101503i(f8115r, "Failed to delete temp file");
                    }
                    c43913fM96751d.m96749b();
                    return interfaceC42952aM8508l;
                } catch (Throwable th2) {
                    if (!bVarM8514r.cleanUp()) {
                        C45999a.m101503i(f8115r, "Failed to delete temp file");
                    }
                    throw th2;
                }
            } catch (IOException e11) {
                c43913fM96751d.m96755h(e11);
                CacheEventListener cacheEventListener3 = this.f8122e;
                if (cacheEventListener3 != null) {
                    cacheEventListener3.mo8453g(c43913fM96751d);
                }
                C45999a.m101504j(f8115r, "Failed inserting a file into the cache", e11);
                throw e11;
            }
        } catch (Throwable th3) {
            c43913fM96751d.m96749b();
            throw th3;
        }
    }

    @Override // p583r3.InterfaceC43912e
    /* JADX INFO: renamed from: e */
    public InterfaceC42952a mo8505e(InterfaceC43595a interfaceC43595a) {
        InterfaceC42952a interfaceC42952aMo8473g;
        C43913f c43913fM96751d = C43913f.m96748a().m96751d(interfaceC43595a);
        try {
            try {
                synchronized (this.f8133p) {
                    try {
                        List<String> listM95951b = C43596b.m95951b(interfaceC43595a);
                        String str = null;
                        interfaceC42952aMo8473g = null;
                        for (int i11 = 0; i11 < listM95951b.size(); i11++) {
                            str = listM95951b.get(i11);
                            c43913fM96751d.m96757j(str);
                            interfaceC42952aMo8473g = this.f8127j.mo8473g(str, interfaceC43595a);
                            if (interfaceC42952aMo8473g != null) {
                                break;
                            }
                        }
                        if (interfaceC42952aMo8473g == null) {
                            CacheEventListener cacheEventListener = this.f8122e;
                            if (cacheEventListener != null) {
                                cacheEventListener.mo8451e(c43913fM96751d);
                            }
                            this.f8123f.remove(str);
                        } else {
                            C45708h.m100896g(str);
                            CacheEventListener cacheEventListener2 = this.f8122e;
                            if (cacheEventListener2 != null) {
                                cacheEventListener2.mo8454h(c43913fM96751d);
                            }
                            this.f8123f.add(str);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                c43913fM96751d.m96749b();
                return interfaceC42952aMo8473g;
            } catch (IOException e11) {
                this.f8129l.mo8446a(CacheErrorLogger.CacheErrorCategory.GENERIC_IO, f8115r, "getResource", e11);
                c43913fM96751d.m96755h(e11);
                CacheEventListener cacheEventListener3 = this.f8122e;
                if (cacheEventListener3 != null) {
                    cacheEventListener3.mo8447a(c43913fM96751d);
                }
                c43913fM96751d.m96749b();
                return null;
            }
        } catch (Throwable th3) {
            c43913fM96751d.m96749b();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC5561b.b m8514r(String str, InterfaceC43595a interfaceC43595a) throws IOException {
        m8511o();
        return this.f8127j.mo8469c(str, interfaceC43595a);
    }
}
