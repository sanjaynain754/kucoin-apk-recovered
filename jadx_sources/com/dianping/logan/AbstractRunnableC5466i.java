package com.dianping.logan;

import android.text.TextUtils;
import java.io.File;

/* JADX INFO: renamed from: com.dianping.logan.i */
/* JADX INFO: compiled from: SendLogRunnable.java */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractRunnableC5466i implements Runnable {

    /* JADX INFO: renamed from: b */
    public C5465h f7496b;

    /* JADX INFO: renamed from: c */
    public a f7497c;

    /* JADX INFO: renamed from: com.dianping.logan.i$a */
    /* JADX INFO: compiled from: SendLogRunnable.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo7544a(int i11);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo7547b(File file);

    /* JADX INFO: renamed from: a */
    public void m7546a() {
        a aVar = this.f7497c;
        if (aVar != null) {
            aVar.mo7544a(10002);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m7548c(C5465h c5465h) {
        this.f7496b = c5465h;
    }

    @Override // java.lang.Runnable
    public void run() {
        C5465h c5465h = this.f7496b;
        if (c5465h == null || TextUtils.isEmpty(c5465h.f7493b)) {
            m7546a();
        } else if (TextUtils.isEmpty(this.f7496b.f7494c)) {
            m7546a();
        } else {
            mo7547b(new File(this.f7496b.f7494c));
        }
    }

    public void setCallBackListener(a aVar) {
        this.f7497c = aVar;
    }
}
