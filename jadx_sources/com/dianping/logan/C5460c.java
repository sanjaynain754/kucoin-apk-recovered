package com.dianping.logan;

import android.os.Looper;
import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: com.dianping.logan.c */
/* JADX INFO: compiled from: LoganControlCenter.java */
/* JADX INFO: loaded from: classes.dex */
public class C5460c {

    /* JADX INFO: renamed from: l */
    public static C5460c f7453l;

    /* JADX INFO: renamed from: b */
    public String f7455b;

    /* JADX INFO: renamed from: c */
    public String f7456c;

    /* JADX INFO: renamed from: d */
    public long f7457d;

    /* JADX INFO: renamed from: e */
    public long f7458e;

    /* JADX INFO: renamed from: f */
    public long f7459f;

    /* JADX INFO: renamed from: g */
    public long f7460g;

    /* JADX INFO: renamed from: h */
    public String f7461h;

    /* JADX INFO: renamed from: i */
    public String f7462i;

    /* JADX INFO: renamed from: j */
    public C5463f f7463j;

    /* JADX INFO: renamed from: a */
    public ConcurrentLinkedQueue<LoganModel> f7454a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: k */
    public SimpleDateFormat f7464k = new SimpleDateFormat("yyyy-MM-dd");

    /* JADX INFO: renamed from: d */
    public static C5460c m7521d(C5459b c5459b) {
        if (f7453l == null) {
            synchronized (C5460c.class) {
                try {
                    if (f7453l == null) {
                        f7453l = new C5460c(c5459b);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f7453l;
    }

    /* JADX INFO: renamed from: a */
    public void m7522a() {
        if (TextUtils.isEmpty(this.f7456c)) {
            return;
        }
        LoganModel loganModel = new LoganModel();
        loganModel.f7431a = LoganModel.Action.FLUSH;
        this.f7454a.add(loganModel);
        C5463f c5463f = this.f7463j;
        if (c5463f != null) {
            c5463f.m7541n();
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m7523b(String str) {
        try {
            return this.f7464k.parse(str).getTime();
        } catch (ParseException e11) {
            e11.printStackTrace();
            return 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7524c() {
        if (this.f7463j == null) {
            C5463f c5463f = new C5463f(this.f7454a, this.f7455b, this.f7456c, this.f7457d, this.f7458e, this.f7459f, this.f7461h, this.f7462i);
            this.f7463j = c5463f;
            c5463f.setName("logan-thread");
            this.f7463j.start();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m7525e(String[] strArr, AbstractRunnableC5466i abstractRunnableC5466i) {
        if (TextUtils.isEmpty(this.f7456c) || strArr == null || strArr.length == 0) {
            return;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                long jM7523b = m7523b(str);
                if (jM7523b > 0) {
                    LoganModel loganModel = new LoganModel();
                    C5465h c5465h = new C5465h();
                    loganModel.f7431a = LoganModel.Action.SEND;
                    c5465h.f7493b = String.valueOf(jM7523b);
                    c5465h.f7495d = abstractRunnableC5466i;
                    loganModel.f7433c = c5465h;
                    this.f7454a.add(loganModel);
                    C5463f c5463f = this.f7463j;
                    if (c5463f != null) {
                        c5463f.m7541n();
                    }
                }
            }
        }
    }

    public C5460c(C5459b c5459b) {
        if (c5459b.m7507h()) {
            this.f7456c = c5459b.f7439b;
            this.f7455b = c5459b.f7438a;
            this.f7457d = c5459b.f7441d;
            this.f7459f = c5459b.f7443f;
            this.f7458e = c5459b.f7440c;
            this.f7460g = c5459b.f7442e;
            this.f7461h = new String(c5459b.f7444g);
            this.f7462i = new String(c5459b.f7445h);
            m7524c();
            return;
        }
        throw new NullPointerException("config's param is invalid");
    }

    /* JADX INFO: renamed from: f */
    public void m7526f(String str, int i11) {
        boolean z11;
        if (!TextUtils.isEmpty(str)) {
            LoganModel loganModel = new LoganModel();
            loganModel.f7431a = LoganModel.Action.WRITE;
            C5468k c5468k = new C5468k();
            String name = Thread.currentThread().getName();
            long id2 = Thread.currentThread().getId();
            if (Looper.getMainLooper() == Looper.myLooper()) {
                z11 = true;
            } else {
                z11 = false;
            }
            c5468k.f7499a = str;
            c5468k.f7503e = System.currentTimeMillis();
            c5468k.f7504f = i11;
            c5468k.f7500b = z11;
            c5468k.f7501c = id2;
            c5468k.f7502d = name;
            loganModel.f7432b = c5468k;
            if (this.f7454a.size() < this.f7460g) {
                this.f7454a.add(loganModel);
                C5463f c5463f = this.f7463j;
                if (c5463f != null) {
                    c5463f.m7541n();
                }
            }
        }
    }
}
