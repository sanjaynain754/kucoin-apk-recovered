package com.tencent.bugly.proguard;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import com.tencent.rmonitor.common.logger.Logger;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.w0 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33988w0 {

    /* JADX INFO: renamed from: i */
    public static final String f72393i = "BaseBatteryInfo";

    /* JADX INFO: renamed from: a */
    public StackTraceElement[] f72394a = Thread.currentThread().getStackTrace();

    /* JADX INFO: renamed from: b */
    public long f72395b = System.currentTimeMillis();

    /* JADX INFO: renamed from: c */
    public long f72396c = 0;

    /* JADX INFO: renamed from: d */
    public String f72397d = Thread.currentThread().getName();

    /* JADX INFO: renamed from: e */
    public String f72398e = C33657g.m73094e();

    /* JADX INFO: renamed from: f */
    public boolean f72399f = false;

    /* JADX INFO: renamed from: g */
    public boolean f72400g = false;

    /* JADX INFO: renamed from: h */
    public boolean f72401h = false;

    /* JADX INFO: renamed from: a */
    public final String m75328a() {
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTraceElementArr = this.f72394a;
        if (stackTraceElementArr != null) {
            boolean z11 = false;
            boolean z12 = false;
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                boolean z13 = (z11 && z12) ? false : true;
                if (stackTraceElement.toString().startsWith("java.lang.reflect.Proxy.invoke")) {
                    z12 = true;
                }
                if (stackTraceElement.toString().startsWith("$Proxy")) {
                    z11 = true;
                }
                if (!z13) {
                    sb2.append(stackTraceElement);
                    sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                }
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public JSONObject mo73209b(long j11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(DropFrameTable.COLUMN_SCENE, this.f72398e);
            jSONObject.put("timestamp", this.f72395b);
            jSONObject.put("call_stack", m75328a());
            jSONObject.put("duration_in_ms", m75327a(j11));
            jSONObject.put("thread_name", this.f72397d);
            return jSONObject;
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f72393i, th2);
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: a */
    public long m75327a(long j11) {
        long j12 = this.f72396c;
        if (j12 > 0) {
            return j12 - this.f72395b;
        }
        return j11 - this.f72395b;
    }
}
