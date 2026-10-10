package com.tencent.bugly.proguard;

import com.tencent.bugly.callback.Callback;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.g2 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33660g2 {

    /* JADX INFO: renamed from: d */
    public static volatile C33660g2 f69947d;

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap<String, Callback> f69948a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    public final LinkedBlockingQueue<JSONObject> f69949b = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: c */
    public final Thread f69950c;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.g2$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C33660g2.this.m73129b();
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m73126c(String str) {
        if (f69947d != null && str != null) {
            f69947d.f69948a.remove(str);
            if (f69947d.f69948a.isEmpty()) {
                f69947d.f69950c.interrupt();
                f69947d = null;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m73127d() {
        if (f69947d != null) {
            f69947d.f69950c.interrupt();
            f69947d = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m73130b(String str, Callback callback) {
        this.f69948a.put(str, callback);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m73123a(String str, Callback callback) {
        if (str == null || callback == null) {
            return;
        }
        try {
            if (f69947d == null) {
                f69947d = new C33660g2();
            }
            f69947d.f69948a.put(str, callback);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m73132b(String str) {
        return this.f69948a.containsKey(str);
    }

    public C33660g2() {
        Thread thread = new Thread(new a(), "Bugly-CBM");
        this.f69950c = thread;
        thread.setDaemon(true);
        thread.start();
    }

    /* JADX INFO: renamed from: b */
    public final void m73129b() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                m73131b(this.f69949b.take());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m73134d(String str) {
        this.f69948a.remove(str);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m73125a(String str) {
        C33660g2 c33660g2 = f69947d;
        if (c33660g2 != null && str != null) {
            try {
                return c33660g2.f69948a.containsKey(str);
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m73131b(JSONObject jSONObject) {
        Callback callback;
        String strOptString = jSONObject.optString("name", null);
        if (strOptString == null || (callback = this.f69948a.get(strOptString)) == null) {
            return;
        }
        try {
            callback.onCallback(jSONObject);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73124a(JSONObject jSONObject) {
        C33660g2 c33660g2 = f69947d;
        if (c33660g2 == null || jSONObject == null) {
            return;
        }
        try {
            c33660g2.f69949b.offer(jSONObject);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m73128a() {
        this.f69950c.interrupt();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m73133c() {
        return this.f69948a.isEmpty();
    }
}
