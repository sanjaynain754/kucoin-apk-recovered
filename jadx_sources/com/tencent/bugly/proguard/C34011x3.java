package com.tencent.bugly.proguard;

import android.text.TextUtils;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.rmonitor.base.plugin.listener.ICustomDataCollector;
import com.tencent.rmonitor.base.plugin.listener.ICustomDataCollectorForIssue;
import com.tencent.rmonitor.base.plugin.listener.ListenerManager;
import com.tencent.rmonitor.base.plugin.listener.MonitorListenerMng;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.custom.C35153a;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.x3 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34011x3 {

    /* JADX INFO: renamed from: a */
    public static final String f72490a = "RMonitor_custom";

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.x3$a */
    /* JADX INFO: compiled from: BUGLY */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C34011x3 f72491a = new C34011x3();
    }

    /* JADX INFO: renamed from: b */
    public static C34011x3 m75420b() {
        return a.f72491a;
    }

    /* JADX INFO: renamed from: a */
    public C35153a m75421a() {
        return C33991w3.m75338a();
    }

    /* JADX INFO: renamed from: a */
    public void m75423a(ReportData reportData) {
        if (reportData == null) {
            return;
        }
        try {
            m75424a(m75429b(reportData));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final C35153a m75428b(String str, String str2) {
        MonitorListenerMng<ICustomDataCollector> monitorListenerMng = ListenerManager.customDataCollector;
        C35153a c35153aClone = null;
        ArrayList listenerList = !monitorListenerMng.isEmpty() ? monitorListenerMng.getListenerList() : null;
        if (listenerList != null && !listenerList.isEmpty()) {
            try {
                c35153aClone = m75421a().clone();
                Iterator it = listenerList.iterator();
                while (it.hasNext()) {
                    ((ICustomDataCollector) it.next()).collectCustomData(str, str2, c35153aClone);
                }
                return c35153aClone;
            } catch (Throwable th2) {
                Logger.INSTANCE.mo77130d(f72490a, "collectCustomDataForMetricInner, msg: " + th2.getMessage());
            }
        }
        return c35153aClone;
    }

    /* JADX INFO: renamed from: a */
    public void m75424a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            jSONObject.put(C33820nf.f71127F, LifecycleCallback.INSTANCE.getOperationLog());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m75425a(boolean z11, ReportData reportData) {
        if (reportData == null) {
            return;
        }
        String pluginName = reportData.getPluginName();
        if (TextUtils.isEmpty(pluginName)) {
            return;
        }
        try {
            m75426a(z11, pluginName, C33657g.m73094e(), m75429b(reportData));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m75427a(boolean z11, String str, JSONObject jSONObject) {
        m75426a(z11, str, C33657g.m73094e(), jSONObject);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final JSONObject m75429b(ReportData reportData) throws JSONException {
        JSONObject params = reportData.getParams();
        JSONObject jSONObjectOptJSONObject = params.optJSONObject(C33820nf.f71160p);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        JSONObject jSONObjectM74302a = C33820nf.m74302a();
        params.put(C33820nf.f71160p, jSONObjectM74302a);
        return jSONObjectM74302a;
    }

    /* JADX INFO: renamed from: a */
    public void m75426a(boolean z11, String str, String str2, JSONObject jSONObject) {
        C35153a c35153aM75422a;
        if (TextUtils.isEmpty(str) || jSONObject == null) {
            return;
        }
        if (Logger.verbos) {
            Logger.INSTANCE.mo77133v(f72490a, "collectCustomData, pluginName: " + str + ", scene: " + str2);
        }
        if (z11) {
            c35153aM75422a = m75428b(str, str2);
        } else {
            c35153aM75422a = m75422a(str, str2);
        }
        if (c35153aM75422a == null) {
            c35153aM75422a = m75421a();
        }
        if (c35153aM75422a.m77160h()) {
            return;
        }
        try {
            JSONObject jSONObjectM77159g = c35153aM75422a.m77159g();
            if (jSONObjectM77159g != null) {
                jSONObject.put("user_custom", jSONObjectM77159g);
            }
            JSONObject jSONObjectM77152c = c35153aM75422a.m77152c();
            if (jSONObjectM77152c != null) {
                jSONObject.put(C33820nf.f71130I, jSONObjectM77152c);
            }
        } catch (JSONException e11) {
            Logger.INSTANCE.mo77130d(f72490a, "collectCustomData, msg: " + e11.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public final C35153a m75422a(String str, String str2) {
        MonitorListenerMng<ICustomDataCollectorForIssue> monitorListenerMng = ListenerManager.customDataCollectorForIssue;
        C35153a c35153aClone = null;
        ArrayList listenerList = !monitorListenerMng.isEmpty() ? monitorListenerMng.getListenerList() : null;
        if (listenerList != null && !listenerList.isEmpty()) {
            try {
                c35153aClone = m75421a().clone();
                Iterator it = listenerList.iterator();
                while (it.hasNext()) {
                    ((ICustomDataCollectorForIssue) it.next()).collectCustomData(str, str2, c35153aClone);
                }
                return c35153aClone;
            } catch (Throwable th2) {
                Logger.INSTANCE.mo77130d(f72490a, "collectCustomDataForIssueInner, msg: " + th2.getMessage());
            }
        }
        return c35153aClone;
    }
}
