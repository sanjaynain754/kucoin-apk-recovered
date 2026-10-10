package com.squareup.picasso;

import android.net.NetworkInfo;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.squareup.picasso.q */
/* JADX INFO: compiled from: PicassoExecutorService.java */
/* JADX INFO: loaded from: classes59.dex */
public class C27833q extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: com.squareup.picasso.q$a */
    /* JADX INFO: compiled from: PicassoExecutorService.java */
    public static final class a extends FutureTask<RunnableC27819c> implements Comparable<a> {

        /* JADX INFO: renamed from: b */
        public final RunnableC27819c f56798b;

        public a(RunnableC27819c runnableC27819c) {
            super(runnableC27819c, null);
            this.f56798b = runnableC27819c;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            Picasso.Priority priorityM68840r = this.f56798b.m68840r();
            Picasso.Priority priorityM68840r2 = aVar.f56798b.m68840r();
            return priorityM68840r == priorityM68840r2 ? this.f56798b.f56727b - aVar.f56798b.f56727b : priorityM68840r2.ordinal() - priorityM68840r.ordinal();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m68888a(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            m68889b(3);
            return;
        }
        int type = networkInfo.getType();
        if (type != 0) {
            if (type == 1 || type == 6 || type == 9) {
                m68889b(4);
                return;
            } else {
                m68889b(3);
                return;
            }
        }
        int subtype = networkInfo.getSubtype();
        switch (subtype) {
            case 1:
            case 2:
                m68889b(1);
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                break;
            default:
                switch (subtype) {
                    case 12:
                        break;
                    case 13:
                    case 14:
                    case 15:
                        m68889b(3);
                        break;
                    default:
                        m68889b(3);
                        break;
                }
                return;
        }
        m68889b(2);
    }

    public C27833q() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C27841y.c());
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        a aVar = new a((RunnableC27819c) runnable);
        execute(aVar);
        return aVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m68889b(int i11) {
        setCorePoolSize(i11);
        setMaximumPoolSize(i11);
    }
}
