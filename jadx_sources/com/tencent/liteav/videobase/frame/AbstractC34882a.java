package com.tencent.liteav.videobase.frame;

import android.os.SystemClock;
import com.tencent.liteav.base.p130b.C34691a;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.frame.AbstractC34891j;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.frame.a */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC34882a<T extends AbstractC34891j> {

    /* JADX INFO: renamed from: a */
    private static final long f74238a = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: c */
    private final Map<a, Deque<T>> f74240c = new HashMap();

    /* JADX INFO: renamed from: d */
    private volatile boolean f74241d = false;

    /* JADX INFO: renamed from: e */
    private final C34691a f74242e = new C34691a(f74238a);

    /* JADX INFO: renamed from: f */
    private final InterfaceC34888g<T> f74243f = new InterfaceC34888g(this) { // from class: com.tencent.liteav.videobase.frame.b

        /* JADX INFO: renamed from: a */
        private final AbstractC34882a f74244a;

        @Override // com.tencent.liteav.videobase.frame.InterfaceC34888g
        /* JADX INFO: renamed from: a */
        public final void mo76520a(AbstractC34891j abstractC34891j) {
            AbstractC34882a.m76511a(this.f74244a, abstractC34891j);
        }

        {
            this.f74244a = this;
        }
    };

    /* JADX INFO: renamed from: b */
    private final String f74239b = null;

    /* JADX INFO: renamed from: com.tencent.liteav.videobase.frame.a$a */
    public interface a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76511a(AbstractC34882a abstractC34882a, AbstractC34891j abstractC34891j) {
        if (abstractC34891j == 0) {
            return;
        }
        synchronized (abstractC34882a.f74240c) {
            try {
                if (abstractC34882a.f74241d) {
                    abstractC34882a.mo76517a(abstractC34891j);
                    return;
                }
                Deque<T> dequeM76512b = abstractC34882a.m76512b(abstractC34882a.mo76518b(abstractC34891j));
                abstractC34891j.updateLastUsedTimestamp(SystemClock.elapsedRealtime());
                dequeM76512b.addFirst(abstractC34891j);
                abstractC34882a.m76513c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo76515a(InterfaceC34888g<T> interfaceC34888g, a aVar);

    /* JADX INFO: renamed from: a */
    public abstract void mo76517a(T t11);

    /* JADX INFO: renamed from: b */
    public abstract a mo76518b(T t11);

    /* JADX INFO: renamed from: b */
    public void mo76519b() {
        this.f74241d = true;
        mo76516a();
    }

    /* JADX INFO: renamed from: c */
    private void m76513c() {
        T tPeekLast;
        if (this.f74242e.m76041a()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ArrayList arrayList = new ArrayList();
            synchronized (this.f74240c) {
                try {
                    for (Deque<T> deque : this.f74240c.values()) {
                        while (!deque.isEmpty() && ((tPeekLast = deque.peekLast()) == null || jElapsedRealtime - tPeekLast.getLastUsedTimestamp() >= f74238a)) {
                            deque.pollLast();
                            arrayList.add(tPeekLast);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                mo76517a((AbstractC34891j) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private Deque<T> m76512b(a aVar) {
        Deque<T> deque = this.f74240c.get(aVar);
        if (deque != null) {
            return deque;
        }
        LinkedList linkedList = new LinkedList();
        this.f74240c.put(aVar, linkedList);
        return linkedList;
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (!this.f74241d) {
            LiteavLog.m76085e("FramePool", "%s must call destroy() before finalize()!\n%s", getClass().getName(), this.f74239b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final T m76514a(a aVar) {
        T tRemoveFirst;
        synchronized (this.f74240c) {
            try {
                Deque<T> dequeM76512b = m76512b(aVar);
                tRemoveFirst = !dequeM76512b.isEmpty() ? dequeM76512b.removeFirst() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m76513c();
        if (tRemoveFirst == null) {
            tRemoveFirst = (T) mo76515a(this.f74243f, aVar);
        }
        if (tRemoveFirst.retain() != 1) {
            LiteavLog.m76085e("FramePool", "invalid reference count for %s", tRemoveFirst);
        }
        return tRemoveFirst;
    }

    /* JADX INFO: renamed from: a */
    public void mo76516a() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f74240c) {
            try {
                Iterator<Deque<T>> it = this.f74240c.values().iterator();
                while (it.hasNext()) {
                    arrayList.addAll(it.next());
                }
                this.f74240c.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            mo76517a((AbstractC34891j) it2.next());
        }
    }
}
