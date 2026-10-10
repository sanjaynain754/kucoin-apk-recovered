package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.feedback.eup.CrashReport;
import com.tencent.rmonitor.common.logger.Logger;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.cf */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33589cf {

    /* JADX INFO: renamed from: e */
    public static final String f69425e = "RMonitorFeatureHelper";

    /* JADX INFO: renamed from: f */
    public static final long f69426f = 10000;

    /* JADX INFO: renamed from: g */
    public static C33589cf f69427g;

    /* JADX INFO: renamed from: a */
    public final Set<C33631ef> f69428a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b */
    public final Set<String> f69429b = new HashSet();

    /* JADX INFO: renamed from: c */
    public a f69430c = null;

    /* JADX INFO: renamed from: d */
    public Looper f69431d = ThreadManager.getMonitorThreadLooper();

    /* JADX INFO: renamed from: a */
    public static C33589cf m72692a() {
        if (f69427g == null) {
            synchronized (C33589cf.class) {
                try {
                    if (f69427g == null) {
                        f69427g = new C33589cf();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f69427g;
    }

    /* JADX INFO: renamed from: b */
    public void m72696b(C33631ef c33631ef) {
        if (c33631ef == null) {
            return;
        }
        this.f69428a.add(c33631ef);
        if (this.f69429b.contains(c33631ef.m72963c())) {
            m72698c();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.cf$a */
    /* JADX INFO: compiled from: BUGLY */
    public static class a extends Handler {

        /* JADX INFO: renamed from: a */
        public static final int f69432a = 1;

        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    Logger.INSTANCE.mo77132i(C33589cf.f69425e, "triggerUserInfoUpload");
                    Method declaredMethod = CrashReport.class.getDeclaredMethod("triggerUserInfoUpload", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(null, new Object[0]);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m72698c() {
        if (this.f69430c == null) {
            this.f69430c = new a(this.f69431d);
        }
        if (this.f69430c.hasMessages(1)) {
            return;
        }
        this.f69430c.sendEmptyMessageDelayed(1, 10000L);
    }

    /* JADX INFO: renamed from: b */
    public JSONArray m72695b() {
        JSONArray jSONArray = new JSONArray();
        for (C33631ef c33631ef : this.f69428a) {
            if (c33631ef != null) {
                jSONArray.put(c33631ef.m72962b());
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public void m72694a(String str) {
        this.f69429b.add(str);
    }

    /* JADX INFO: renamed from: b */
    public boolean m72697b(String str) {
        for (C33631ef c33631ef : this.f69428a) {
            if (c33631ef != null && str.equals(c33631ef.m72963c())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m72693a(C33631ef c33631ef) {
        this.f69428a.remove(c33631ef);
    }
}
