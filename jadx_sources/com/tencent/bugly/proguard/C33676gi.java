package com.tencent.bugly.proguard;

import android.os.IBinder;
import com.tencent.rmonitor.common.logger.Logger;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.gi */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33676gi extends AbstractC33988w0 {

    /* JADX INFO: renamed from: m */
    public static final String f70021m = "WakeLockInfo";

    /* JADX INFO: renamed from: j */
    public int f70022j;

    /* JADX INFO: renamed from: k */
    public String f70023k;

    /* JADX INFO: renamed from: l */
    public IBinder f70024l;

    @Override // com.tencent.bugly.proguard.AbstractC33988w0
    /* JADX INFO: renamed from: b */
    public JSONObject mo73209b(long j11) {
        JSONObject jSONObjectMo73209b = super.mo73209b(j11);
        try {
            jSONObjectMo73209b.put("flags", this.f70022j);
            return jSONObjectMo73209b;
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f70021m, th2);
            return jSONObjectMo73209b;
        }
    }
}
