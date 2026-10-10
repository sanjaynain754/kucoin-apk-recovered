package com.tencent.bugly.proguard;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.tencent.rmonitor.base.config.C35101b;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.c5 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33579c5 {

    /* JADX INFO: renamed from: i */
    public static final String f69371i = "RMonitor_report_entrance";

    /* JADX INFO: renamed from: j */
    public static final String f69372j = "limit_code";

    /* JADX INFO: renamed from: k */
    public static final String f69373k = "limit_expiration_time";

    /* JADX INFO: renamed from: l */
    public static final String f69374l = "config_latest_update_time";

    /* JADX INFO: renamed from: m */
    public static final int f69375m = 0;

    /* JADX INFO: renamed from: n */
    public static final int f69376n = 100020;

    /* JADX INFO: renamed from: o */
    public static final int f69377o = 100030;

    /* JADX INFO: renamed from: p */
    public static final int f69378p = 100040;

    /* JADX INFO: renamed from: q */
    public static final int f69379q = 100011;

    /* JADX INFO: renamed from: r */
    public static final long f69380r = 60000;

    /* JADX INFO: renamed from: s */
    public static C33579c5 f69381s;

    /* JADX INFO: renamed from: a */
    public int f69382a = 0;

    /* JADX INFO: renamed from: b */
    public long f69383b = 0;

    /* JADX INFO: renamed from: c */
    public long f69384c = 0;

    /* JADX INFO: renamed from: d */
    public boolean f69385d = false;

    /* JADX INFO: renamed from: e */
    public long f69386e = 0;

    /* JADX INFO: renamed from: f */
    public long f69387f = 0;

    /* JADX INFO: renamed from: g */
    public final ArrayList<String> f69388g;

    /* JADX INFO: renamed from: h */
    public final ArrayList<String> f69389h;

    /* JADX INFO: renamed from: a */
    public static void m72639a(String str, String str2, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || jSONObject == null) {
            if (Logger.verbos) {
                Logger.INSTANCE.mo77133v(f69371i, "update by [" + str + C33978va.f72339h + str2 + "] fail for " + jSONObject);
                return;
            }
            return;
        }
        if (!jSONObject.has(f69372j) && !jSONObject.has(f69373k) && !jSONObject.has("config_latest_update_time")) {
            if (Logger.verbos) {
                Logger.INSTANCE.mo77133v(f69371i, "update by [" + str + C33978va.f72339h + str2 + "] fail for " + jSONObject);
                return;
            }
            return;
        }
        try {
            m72640b().m72643a(jSONObject);
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77131e(f69371i, "update by [" + str + C33978va.f72339h + str2 + "] fail for " + th2.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static C33579c5 m72640b() {
        if (f69381s == null) {
            f69381s = new C33579c5();
        }
        return f69381s;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m72641c(String str, String str2) {
        if (C33791m7.m74059g()) {
            Logger.INSTANCE.mo77134w(f69371i, String.format("block report %s.%s for app in standalone mode.", str, str2));
            return true;
        }
        try {
            boolean zM72645b = m72640b().m72645b(str, str2);
            if (zM72645b) {
                Logger.INSTANCE.mo77132i(f69371i, "check block report of [" + str + C33978va.f72339h + str2 + "], block: " + zM72645b);
                return zM72645b;
            }
            if (Logger.verbos) {
                Logger.INSTANCE.mo77133v(f69371i, "check block report of [" + str + C33978va.f72339h + str2 + "], block: " + zM72645b);
            }
            return zM72645b;
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77131e(f69371i, "check block report of [" + str + C33978va.f72339h + str2 + "] fail for " + th2.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m72648e() {
        long j11 = this.f69384c;
        if (j11 == 0 || j11 == this.f69387f) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j12 = this.f69386e;
        if (j12 != 0 && Math.abs(jElapsedRealtime - j12) < 60000) {
            return false;
        }
        this.f69386e = jElapsedRealtime;
        return this.f69384c > m72642a();
    }

    public C33579c5() {
        ArrayList<String> arrayList = new ArrayList<>(3);
        this.f69388g = arrayList;
        ArrayList<String> arrayList2 = new ArrayList<>(4);
        this.f69389h = arrayList2;
        arrayList.add("crash");
        arrayList.add("anr");
        arrayList2.addAll(arrayList);
        arrayList2.add(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
    }

    /* JADX INFO: renamed from: d */
    public final void m72647d() {
        SharedPreferences.Editor editorM72964a = C33632eg.m72964a();
        if (editorM72964a != null) {
            editorM72964a.putInt(InterfaceC33611dg.f69607p, this.f69382a);
            editorM72964a.putLong(InterfaceC33611dg.f69608q, this.f69383b);
            editorM72964a.putLong(InterfaceC33611dg.f69609r, this.f69384c);
            editorM72964a.apply();
            Logger.INSTANCE.mo77130d(f69371i, "save to cache, code: " + this.f69382a + ", code_expiration_time_in_sec: " + this.f69383b + ", config_latest_update_time_in_sec: " + this.f69384c);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m72645b(String str, String str2) {
        if ("union_dau".equals(str2) && InterfaceC33617e1.f69654c.equals(str)) {
            return false;
        }
        if (!this.f69385d) {
            m72646c();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        long j11 = this.f69383b;
        if (j11 == 0 || jCurrentTimeMillis <= j11) {
            return m72644a(str, str2);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72644a(String str, String str2) {
        boolean zContains;
        int i11 = this.f69382a;
        if (i11 == 0) {
            return false;
        }
        if (i11 == 100011) {
            return true;
        }
        if (i11 == 100040 || i11 == 100030) {
            zContains = this.f69388g.contains(str);
        } else {
            if (i11 != 100020) {
                return false;
            }
            zContains = this.f69389h.contains(str);
        }
        return !zContains;
    }

    /* JADX INFO: renamed from: c */
    public final void m72646c() {
        SharedPreferences sharedPreferencesM72965b = C33632eg.m72965b();
        if (sharedPreferencesM72965b != null) {
            this.f69382a = sharedPreferencesM72965b.getInt(InterfaceC33611dg.f69607p, 0);
            this.f69383b = sharedPreferencesM72965b.getLong(InterfaceC33611dg.f69608q, 0L);
            this.f69384c = sharedPreferencesM72965b.getLong(InterfaceC33611dg.f69609r, 0L);
            this.f69385d = true;
            Logger.INSTANCE.mo77130d(f69371i, "load from cache, code: " + this.f69382a + ", code_expiration_time_in_sec: " + this.f69383b + ", config_latest_update_time_in_sec: " + this.f69384c);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m72643a(@NotNull JSONObject jSONObject) {
        if (!this.f69385d) {
            m72646c();
        }
        int iOptInt = jSONObject.optInt(f69372j);
        long jOptLong = jSONObject.optLong(f69373k);
        long jOptLong2 = jSONObject.optLong("config_latest_update_time");
        if (this.f69382a != iOptInt || this.f69383b != jOptLong || this.f69384c != jOptLong2) {
            Logger.INSTANCE.mo77130d(f69371i, "update, response: " + jSONObject);
            this.f69382a = iOptInt;
            this.f69383b = jOptLong;
            this.f69384c = jOptLong2;
            m72647d();
        }
        if (m72648e()) {
            C35101b.c.f75199a.m77085a();
        }
        if (iOptInt != 0) {
            Logger.INSTANCE.mo77130d(f69371i, "upload data is limited by bugly's server, please wait " + this.f69383b + " second or call to bugly");
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m72642a() {
        SharedPreferences sharedPreferencesM72965b = C33632eg.m72965b();
        if (sharedPreferencesM72965b != null) {
            this.f69387f = sharedPreferencesM72965b.getLong(InterfaceC33611dg.f69601j, 0L);
            Logger.INSTANCE.mo77130d(f69371i, "load from cache, config_update_time_from_apply_in_sec: " + this.f69387f);
        }
        return this.f69387f;
    }
}
