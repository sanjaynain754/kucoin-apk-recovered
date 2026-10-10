package com.tencent.bugly.proguard;

import android.os.Looper;
import com.tencent.bugly.callback.Callback;
import com.tencent.bugly.common.looper.ILooperDispatchListener;
import com.tencent.bugly.common.looper.LooperDispatchWatcher;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.tc */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33940tc implements ILooperDispatchListener, InterfaceC34037y9 {

    /* JADX INFO: renamed from: d */
    public static final String f72075d = "msg_lag";

    /* JADX INFO: renamed from: e */
    public static volatile C33940tc f72076e;

    /* JADX INFO: renamed from: b */
    public volatile long f72077b;

    /* JADX INFO: renamed from: c */
    public volatile String f72078c = "";

    /* JADX INFO: renamed from: a */
    public static synchronized void m75053a(long j11, Callback callback) {
        C33660g2.m73123a("msg_lag", callback);
        if (f72076e != null) {
            f72076e.f72077b = j11;
            return;
        }
        f72076e = new C33940tc(j11);
        LooperDispatchWatcher.INSTANCE.register(Looper.getMainLooper(), f72076e);
        C33657g.m73095h().m73099a(f72076e);
    }

    @Override // com.tencent.bugly.common.looper.ILooperDispatchListener
    public boolean isOpen() {
        return true;
    }

    @Override // com.tencent.bugly.common.looper.ILooperDispatchListener
    public void onDispatchEnd(@NotNull String str, long j11, long j12) {
        if (j12 < this.f72077b || !C33660g2.m73125a("msg_lag")) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", "msg_lag");
            jSONObject.put("timeStamp", System.currentTimeMillis());
            jSONObject.put(DropFrameTable.COLUMN_SCENE, this.f72078c);
            jSONObject.put("delay", j12);
            C33660g2.m73124a(jSONObject);
        } catch (Throwable unused) {
        }
    }

    public C33940tc(long j11) {
        this.f72077b = j11;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m75052a() {
        if (f72076e == null) {
            return;
        }
        LooperDispatchWatcher.INSTANCE.unregister(Looper.getMainLooper(), f72076e);
        C33657g.m73095h().m73103b(f72076e);
        f72076e = null;
        C33660g2.m73126c("msg_lag");
    }

    @Override // com.tencent.bugly.proguard.InterfaceC34037y9
    /* JADX INFO: renamed from: a */
    public void mo72960a(String str) {
        this.f72078c = str;
    }

    @Override // com.tencent.bugly.common.looper.ILooperDispatchListener
    public void onDispatchStart(@NotNull String str, long j11) {
    }
}
