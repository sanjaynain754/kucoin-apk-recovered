package io.trtc.tuikit.atomicxcore.impl.common;

import android.content.Context;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import com.tencent.trtc.TRTCCloud;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.common.r */
/* JADX INFO: loaded from: classes61.dex */
public final class C39510r {

    /* JADX INFO: renamed from: a */
    public final String f87706a;

    /* JADX INFO: renamed from: b */
    public final String f87707b;

    /* JADX INFO: renamed from: a */
    public final void m88252a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        m88251a(1, message);
    }

    /* JADX INFO: renamed from: a */
    public final void m88251a(int i11, String str) {
        String str2 = this.f87706a;
        String str3 = this.f87707b;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            ContextUtils.initContextFromNative("liteav");
            applicationContext = ContextUtils.getApplicationContext();
        }
        if (applicationContext == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FirebaseAnalytics.Param.LEVEL, i11);
            jSONObject.put("message", str);
            jSONObject.put("module", str2);
            jSONObject.put("file", str3);
            jSONObject.put("line", 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("api", "TuikitLog");
            jSONObject2.put(ReportDataTable.COLUMN_PARAMS, jSONObject);
            TRTCCloud.sharedInstance(applicationContext).callExperimentalAPI(jSONObject2.toString());
        } catch (JSONException e11) {
            Log.e("TuikitLog-log", e11.toString());
        }
    }

    public C39510r(String str, String str2) {
        this.f87706a = str;
        this.f87707b = str2;
    }
}
