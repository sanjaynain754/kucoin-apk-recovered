package p745x1;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p523p2.C43363j;

/* JADX INFO: renamed from: x1.c */
/* JADX INFO: compiled from: DiskCacheWriteLocker.java */
/* JADX INFO: loaded from: classes.dex */
public final class C45983c {

    /* JADX INFO: renamed from: a */
    public final Map<String, a> f103436a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final b f103437b = new b();

    /* JADX INFO: renamed from: x1.c$a */
    /* JADX INFO: compiled from: DiskCacheWriteLocker.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Lock f103438a = new ReentrantLock();

        /* JADX INFO: renamed from: b */
        public int f103439b;
    }

    /* JADX INFO: renamed from: x1.c$b */
    /* JADX INFO: compiled from: DiskCacheWriteLocker.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final Queue<a> f103440a = new ArrayDeque();

        /* JADX INFO: renamed from: a */
        public a m101442a() {
            a aVarPoll;
            synchronized (this.f103440a) {
                aVarPoll = this.f103440a.poll();
            }
            return aVarPoll == null ? new a() : aVarPoll;
        }

        /* JADX INFO: renamed from: b */
        public void m101443b(a aVar) {
            synchronized (this.f103440a) {
                try {
                    if (this.f103440a.size() < 10) {
                        this.f103440a.offer(aVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m101440a(String str) {
        a aVarM101442a;
        synchronized (this) {
            try {
                aVarM101442a = this.f103436a.get(str);
                if (aVarM101442a == null) {
                    aVarM101442a = this.f103437b.m101442a();
                    this.f103436a.put(str, aVarM101442a);
                }
                aVarM101442a.f103439b++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVarM101442a.f103438a.lock();
    }

    /* JADX INFO: renamed from: b */
    public void m101441b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) C43363j.m95506d(this.f103436a.get(str));
                int i11 = aVar.f103439b;
                if (i11 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f103439b);
                }
                int i12 = i11 - 1;
                aVar.f103439b = i12;
                if (i12 == 0) {
                    a aVarRemove = this.f103436a.remove(str);
                    if (!aVarRemove.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVarRemove + ", safeKey: " + str);
                    }
                    this.f103437b.m101443b(aVarRemove);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVar.f103438a.unlock();
    }
}
