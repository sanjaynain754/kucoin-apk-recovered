package com.tencent.bugly.proguard;

import android.text.TextUtils;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.g0 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33658g0 {

    /* JADX INFO: renamed from: c */
    public static final String f69922c = "RMonitor_launch_Span";

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArrayList<C33612dh> f69923a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b */
    public final String f69924b;

    /* JADX INFO: renamed from: a */
    public void m73113a(String str, String str2) {
        if (m73115a(str)) {
            return;
        }
        this.f69923a.add(new C33612dh(this.f69924b, str, m73117b(str2)));
    }

    /* JADX INFO: renamed from: b */
    public long m73116b() {
        long jM72857a = Long.MAX_VALUE;
        for (C33612dh c33612dh : this.f69923a) {
            if (c33612dh.m72857a() < jM72857a) {
                jM72857a = c33612dh.m72857a();
            }
        }
        return jM72857a;
    }

    /* JADX INFO: renamed from: c */
    public void m73119c(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.INSTANCE.mo77132i(f69922c, "spanEnd, spanName is empty.");
            return;
        }
        C33612dh c33612dhM73117b = m73117b(str);
        if (c33612dhM73117b == null) {
            Logger.INSTANCE.mo77132i(f69922c, "spanEnd, span[", str, "] not exist.");
        } else {
            c33612dhM73117b.m72861c();
        }
    }

    public C33658g0(String str) {
        this.f69924b = str;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m73115a(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.INSTANCE.mo77132i(f69922c, "spanStart, spanName is empty.");
            return true;
        }
        if (m73117b(str) == null) {
            return false;
        }
        Logger.INSTANCE.mo77132i(f69922c, "spanStart, span[", str, "] has appended before.");
        return true;
    }

    /* JADX INFO: renamed from: b */
    public C33612dh m73117b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (C33612dh c33612dh : this.f69923a) {
            if (c33612dh != null && TextUtils.equals(c33612dh.f69621c, str)) {
                return c33612dh;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public ArrayList<C33612dh> m73118c() {
        ArrayList<C33612dh> arrayList = new ArrayList<>();
        for (C33612dh c33612dh : this.f69923a) {
            if (c33612dh.m72860b()) {
                arrayList.add(c33612dh);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public void m73114a(String str, String str2, long j11, long j12) {
        if (m73115a(str)) {
            return;
        }
        this.f69923a.add(new C33612dh(this.f69924b, str, m73117b(str2), j11, j12));
    }

    /* JADX INFO: renamed from: a */
    public void m73112a() {
        this.f69923a.clear();
    }
}
