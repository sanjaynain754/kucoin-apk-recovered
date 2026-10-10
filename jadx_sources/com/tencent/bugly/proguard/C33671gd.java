package com.tencent.bugly.proguard;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.utils.ProcessUtil;
import com.tencent.rmonitor.base.meta.BaseInfo;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.gd */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33671gd {
    /* JADX INFO: renamed from: a */
    public static void m73177a(@NonNull C34055z7 c34055z7) {
        UserMeta userMeta = BaseInfo.userMeta;
        c34055z7.f72612b = userMeta.uin;
        c34055z7.f72619i = ProcessUtil.getCurrentProcessName(C33598d3.m72772c());
        c34055z7.f72621k = C33591ch.m72746d();
        c34055z7.f72620j = C33591ch.m72741a(C33598d3.m72772c());
        c34055z7.f72622l = C33657g.m73094e();
        c34055z7.f72614d = userMeta.appVersion;
        c34055z7.f72613c = userMeta.getAppVersionMode();
        c34055z7.f72616f = userMeta.buildNumber;
        c34055z7.f72617g = userMeta.sdkVersion;
        c34055z7.f72615e = C33955u7.m75163c().m75164a();
    }

    /* JADX INFO: renamed from: a */
    public static void m73178a(JSONObject jSONObject, String str, Exception exc) throws JSONException {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        jSONObject.put(C33675gh.f69999e, str);
        if (exc != null) {
            String strM73175a = m73175a(exc);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("call_stack", strM73175a);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("stacks", jSONArray);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m73175a(Throwable th2) {
        if (th2 == null) {
            return "null";
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m73176a() {
        return C33991w3.m75338a().m77159g();
    }
}
