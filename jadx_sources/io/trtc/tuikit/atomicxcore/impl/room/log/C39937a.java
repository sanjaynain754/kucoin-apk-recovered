package io.trtc.tuikit.atomicxcore.impl.room.log;

import android.content.Context;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import com.tencent.trtc.TRTCCloud;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.log.a */
/* JADX INFO: loaded from: classes61.dex */
public final class C39937a {

    /* JADX INFO: renamed from: a */
    public final String f88804a;

    /* JADX INFO: renamed from: a */
    public final void m88357a(int i11, String str) {
        String str2 = this.f88804a;
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
            jSONObject.put("module", "AtomicXCore");
            jSONObject.put("file", str2);
            jSONObject.put("line", 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("api", "TuikitLog");
            jSONObject2.put(ReportDataTable.COLUMN_PARAMS, jSONObject);
            TRTCCloud.sharedInstance(applicationContext).callExperimentalAPI(jSONObject2.toString());
        } catch (JSONException e11) {
            Log.e("Logger", e11.toString());
        }
    }

    public C39937a(String str) {
        this.f88804a = str;
    }
}
