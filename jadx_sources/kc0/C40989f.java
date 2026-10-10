package kc0;

import com.tencentcloudapi.cls.android.cls.Cls$Log;
import java.util.Date;

/* JADX INFO: renamed from: kc0.f */
/* JADX INFO: compiled from: LogItem.java */
/* JADX INFO: loaded from: classes2.dex */
public class C40989f {

    /* JADX INFO: renamed from: a */
    public Cls$Log.C35855a f91093a;

    public C40989f() {
        Cls$Log.C35855a c35855aNewBuilder = Cls$Log.newBuilder();
        this.f91093a = c35855aNewBuilder;
        c35855aNewBuilder.m79340c(new Date().getTime() / 1000);
    }

    /* JADX INFO: renamed from: a */
    public void m89785a(C40988e c40988e) {
        this.f91093a.m79338a(c40988e.f91092a);
    }

    public C40989f(long j11) {
        Cls$Log.C35855a c35855aNewBuilder = Cls$Log.newBuilder();
        this.f91093a = c35855aNewBuilder;
        c35855aNewBuilder.m79340c(j11);
    }
}
