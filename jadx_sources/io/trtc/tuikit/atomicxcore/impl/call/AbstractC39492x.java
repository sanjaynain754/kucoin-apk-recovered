package io.trtc.tuikit.atomicxcore.impl.call;

import android.content.Context;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import com.tencent.trtc.TRTCCloud;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.call.x */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC39492x {
    /* JADX INFO: renamed from: a */
    public static void m88243a(int i11, String str) {
        String fileName;
        int lineNumber;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            ContextUtils.initContextFromNative("liteav");
            applicationContext = ContextUtils.getApplicationContext();
        }
        if (applicationContext != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(FirebaseAnalytics.Param.LEVEL, i11);
                jSONObject.put("message", str);
                jSONObject.put("module", "call_state");
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                if (stackTrace.length < 6 || (fileName = stackTrace[5].getFileName()) == null) {
                    fileName = "";
                }
                jSONObject.put("file", fileName);
                StackTraceElement[] stackTrace2 = Thread.currentThread().getStackTrace();
                if (stackTrace2.length < 6) {
                    lineNumber = 0;
                } else {
                    lineNumber = stackTrace2[5].getLineNumber();
                }
                jSONObject.put("line", lineNumber);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("api", "TuikitLog");
                jSONObject2.put(ReportDataTable.COLUMN_PARAMS, jSONObject);
                TRTCCloud.sharedInstance(applicationContext).callExperimentalAPI(jSONObject2.toString());
            } catch (JSONException e11) {
                Log.e("Logger", e11.toString());
            }
        }
    }
}
