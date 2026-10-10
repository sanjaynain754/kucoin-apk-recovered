package com.tencent.bugly.proguard;

import android.app.Activity;
import android.content.SharedPreferences;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.rmonitor.common.lifecycle.IActivityStateCallback;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.hg */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33695hg implements IActivityStateCallback {

    /* JADX INFO: renamed from: i */
    public static final String f70128i = "SessionPrefs";

    /* JADX INFO: renamed from: j */
    public static final String f70129j = "last_pause_time";

    /* JADX INFO: renamed from: k */
    public static final String f70130k = "last_pause_activity_name";

    /* JADX INFO: renamed from: l */
    public static final String f70131l = "cur_session_id";

    /* JADX INFO: renamed from: m */
    public static final long f70132m = 86400000;

    /* JADX INFO: renamed from: n */
    public static final long f70133n = 30000;

    /* JADX INFO: renamed from: o */
    public static final String f70134o = "bugly_session_id";

    /* JADX INFO: renamed from: p */
    public static volatile C33695hg f70135p = null;

    /* JADX INFO: renamed from: q */
    public static final String f70136q = "RMonitor_SessionManager";

    /* JADX INFO: renamed from: b */
    public long f70137b = 30000;

    /* JADX INFO: renamed from: d */
    public List<c> f70139d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f70140e = false;

    /* JADX INFO: renamed from: f */
    public boolean f70141f = false;

    /* JADX INFO: renamed from: g */
    public String f70142g = "";

    /* JADX INFO: renamed from: h */
    public d f70143h = new d(this, null);

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f70138c = C33716ig.m73433a().getSharedPreferences(C33598d3.m72772c(), f70128i, true);

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.hg$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long j11 = C33695hg.this.f70138c.getLong(C33695hg.f70129j, 0L);
            String string = C33695hg.this.f70138c.getString(C33695hg.f70130k, "");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (j11 >= 0) {
                long j12 = jCurrentTimeMillis - j11;
                C33695hg c33695hg = C33695hg.this;
                if (j12 > c33695hg.f70137b) {
                    String strM73288e = c33695hg.m73288e();
                    C33695hg.this.m73284a(strM73288e, true);
                    Logger.INSTANCE.mo77132i(C33695hg.f70136q, "new session, session_id: " + strM73288e + ", threshold: " + C33695hg.this.f70137b + ", currentTime: " + jCurrentTimeMillis + ", lastPauseTime: " + j11 + ", lastPauseActName: " + string);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.hg$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f70145b;

        public b(String str) {
            this.f70145b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SharedPreferences.Editor editorEdit = C33695hg.this.f70138c.edit();
            editorEdit.putLong(C33695hg.f70129j, System.currentTimeMillis());
            editorEdit.putString(C33695hg.f70130k, this.f70145b);
            editorEdit.apply();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.hg$c */
    /* JADX INFO: compiled from: BUGLY */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo73289a(String str, boolean z11);
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.hg$d */
    /* JADX INFO: compiled from: BUGLY */
    public class d implements Runnable {
        public d() {
        }

        public /* synthetic */ d(C33695hg c33695hg, a aVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            String strM73286b = C33695hg.this.m73286b();
            if (!C33695hg.this.f70142g.equals(strM73286b)) {
                C33695hg.this.m73284a(strM73286b, false);
                C33695hg.this.f70142g = strM73286b;
            }
            ThreadManager.runInMonitorThread(this, C33695hg.this.f70137b);
        }
    }

    /* JADX INFO: renamed from: c */
    public static C33695hg m73279c() {
        if (f70135p == null) {
            synchronized (C33695hg.class) {
                try {
                    if (f70135p == null) {
                        f70135p = new C33695hg();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f70135p;
    }

    /* JADX INFO: renamed from: b */
    public String m73286b() {
        return this.f70138c.getString(f70131l, "default_session_id");
    }

    /* JADX INFO: renamed from: d */
    public boolean m73287d() {
        return this.f70140e;
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onResume(Activity activity) {
        ThreadManager.runInMonitorThread(new a(), 0L);
    }

    public C33695hg() {
        Logger.INSTANCE.mo77132i(f70136q, "create new session manager object");
    }

    /* JADX INFO: renamed from: e */
    public final String m73288e() {
        String strM72739a = C33591ch.m72739a();
        this.f70138c.edit().putString(f70131l, strM72739a).apply();
        return strM72739a;
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onPause(Activity activity) {
        ThreadManager.runInMonitorThread(new b(activity.getClass().getName()), 0L);
    }

    /* JADX INFO: renamed from: a */
    public final void m73284a(String str, boolean z11) {
        Iterator<c> it = this.f70139d.iterator();
        while (it.hasNext()) {
            it.next().mo73289a(str, z11);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73283a(c cVar) {
        if (this.f70139d.contains(cVar)) {
            return;
        }
        this.f70139d.add(cVar);
    }

    /* JADX INFO: renamed from: a */
    public void m73285a(boolean z11) {
        this.f70140e = z11;
        if (z11) {
            LifecycleCallback.register(this);
            String strM73286b = m73286b();
            this.f70142g = strM73286b;
            m73284a(strM73286b, false);
            ThreadManager.runInMonitorThread(this.f70143h, this.f70137b);
            return;
        }
        LifecycleCallback.unRegister(this);
        ThreadManager.cancelFromMonitorThread(this.f70143h);
    }

    /* JADX INFO: renamed from: a */
    public void m73281a() {
        if (!this.f70140e || this.f70141f) {
            return;
        }
        this.f70141f = true;
        long j11 = this.f70138c.getLong(f70129j, 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j11 < 0 || jCurrentTimeMillis - j11 <= this.f70137b) {
            return;
        }
        String strM73288e = m73288e();
        m73284a(strM73288e, false);
        SharedPreferences.Editor editorEdit = this.f70138c.edit();
        editorEdit.putLong(f70129j, jCurrentTimeMillis);
        editorEdit.putString(f70130k, "cold_start");
        editorEdit.apply();
        Logger.INSTANCE.mo77132i(f70136q, "cold_start, new session, session_id: " + strM73288e + ", threshold: " + this.f70137b + ", currentTime: " + jCurrentTimeMillis + ", lastPauseTime: " + j11 + ", lastPauseActName: cold_start");
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onBackground() {
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onForeground() {
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onCreate(Activity activity) {
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onDestroy(Activity activity) {
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onPostCreate(Activity activity) {
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onStart(Activity activity) {
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onStop(Activity activity) {
    }

    /* JADX INFO: renamed from: a */
    public void m73282a(long j11) {
        if (j11 <= 0 || j11 >= 86400000) {
            return;
        }
        this.f70137b = j11;
    }
}
