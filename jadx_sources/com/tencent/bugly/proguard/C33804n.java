package com.tencent.bugly.proguard;

import android.app.AlarmManager;
import android.app.PendingIntent;
import com.tencent.rmonitor.common.logger.Logger;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.n */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33804n extends AbstractC33988w0 {

    /* JADX INFO: renamed from: o */
    public static final String f71005o = "AlarmInfo";

    /* JADX INFO: renamed from: j */
    public int f71006j;

    /* JADX INFO: renamed from: k */
    public long f71007k;

    /* JADX INFO: renamed from: l */
    public boolean f71008l = false;

    /* JADX INFO: renamed from: m */
    public PendingIntent f71009m;

    /* JADX INFO: renamed from: n */
    public AlarmManager.OnAlarmListener f71010n;

    @Override // com.tencent.bugly.proguard.AbstractC33988w0
    /* JADX INFO: renamed from: b */
    public JSONObject mo73209b(long j11) {
        JSONObject jSONObjectMo73209b = super.mo73209b(j11);
        try {
            jSONObjectMo73209b.put("alarm_type", this.f71006j);
            return jSONObjectMo73209b;
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f71005o, th2);
            return jSONObjectMo73209b;
        }
    }
}
