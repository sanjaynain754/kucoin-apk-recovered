package com.tencent.bugly.proguard;

import android.text.TextUtils;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ra */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33898ra {

    /* JADX INFO: renamed from: d */
    public static final String f71619d = "RMonitor_launch_landingPage";

    /* JADX INFO: renamed from: a */
    public boolean f71620a = false;

    /* JADX INFO: renamed from: b */
    public final Set<String> f71621b = new HashSet();

    /* JADX INFO: renamed from: c */
    public final Set<String> f71622c = new HashSet();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ra$a */
    /* JADX INFO: compiled from: BUGLY */
    public enum a {
        INVALID,
        HIT_LANDING_PAGE,
        WAIT_TO_HIT
    }

    /* JADX INFO: renamed from: a */
    public void m74803a(boolean z11) {
        this.f71620a = z11;
        Logger.INSTANCE.mo77134w(f71619d, "enableCheckActivityBeforeLanding, enable: ", String.valueOf(z11));
    }

    /* JADX INFO: renamed from: c */
    public a m74805c(String str) {
        a aVar = a.WAIT_TO_HIT;
        if (this.f71622c.isEmpty() || this.f71622c.contains(str)) {
            return a.HIT_LANDING_PAGE;
        }
        return (!this.f71620a || this.f71621b.contains(str)) ? aVar : a.INVALID;
    }

    /* JADX INFO: renamed from: a */
    public void m74802a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f71621b.add(str);
        }
        Logger.INSTANCE.mo77134w(f71619d, "addActivityNameBeforeLanding, activityName: ", str);
    }

    /* JADX INFO: renamed from: b */
    public void m74804b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f71622c.add(str);
        }
        Logger.INSTANCE.mo77134w(f71619d, "addLandingActivityName, activityName: ", str);
    }
}
