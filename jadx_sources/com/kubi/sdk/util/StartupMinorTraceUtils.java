package com.kubi.sdk.util;

import android.os.SystemClock;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.sdk.startup.StartupDispatcher;
import com.tencent.bugly.proguard.C33820nf;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.sdk.util.i1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: StartupMinorTraceUtils.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0005J\u0006\u0010\u001d\u001a\u00020\u001aJ\u0016\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005J\u0006\u0010!\u001a\u00020\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R*\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0010j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, m90084d2 = {"Lcom/kubi/sdk/util/StartupMinorTraceUtils;", "", "<init>", "()V", "TAG", "", "STEP_MINOR_APP_ONCREATE_END", "STEP_MINOR_SPLASH_START_ONCREATE", "STEP_MINOR_AGREE_PROTOCOL", "STEP_MINOR_SITE_AWAIT", "STEP_MINOR_TASK_AWAIT", "STEP_MINOR_TASK_DONE", "STEP_MINOR_SENSOR_AB", "STEP_MINOR_NAVIGATION_START", "STEP_MINOR_NAVIGATION_END", "reportMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "costMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "curTime", "uuid", "getUuid", "()Ljava/lang/String;", "reset", "", "addMinorTrace", "key", "report", "logi", "tag", "msg", "reportTask", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStartupMinorTraceUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartupMinorTraceUtils.kt\ncom/kubi/sdk/util/StartupMinorTraceUtils\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n216#2,2:112\n15#3,2:114\n1869#4,2:116\n*S KotlinDebug\n*F\n+ 1 StartupMinorTraceUtils.kt\ncom/kubi/sdk/util/StartupMinorTraceUtils\n*L\n65#1:112,2\n87#1:114,2\n88#1:116,2\n*E\n"})
public final class StartupMinorTraceUtils {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final StartupMinorTraceUtils f48182a = new StartupMinorTraceUtils();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final HashMap<String, String> f48183b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final ConcurrentHashMap<String, Long> f48184c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final String f48185d;

    /* JADX INFO: renamed from: e */
    public final void m58422e() throws JSONException {
        ConcurrentHashMap<String, Long> concurrentHashMap = f48184c;
        if (concurrentHashMap.size() != 9) {
            m58421d("StartupMinorTraceUtils", "costMap size not 9, task size =" + StartupDispatcher.taskSize());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("category", "startup_minor");
        jSONObject.put("path", f48185d);
        jSONObject.put("name", StartupDispatcher.taskSize());
        for (Map.Entry<String, Long> entry : concurrentHashMap.entrySet()) {
            HashMap<String, String> map = f48183b;
            if (map.containsKey(entry.getKey())) {
                String key = map.get(entry.getKey());
                if (key == null) {
                    key = entry.getKey();
                }
                jSONObject.put(key, entry.getValue().longValue());
            }
        }
        m58421d("StartupMinorTraceUtils", "minor report:" + jSONObject);
        C43852m.m96605q("duration_event", jSONObject);
        m58423f();
        m58424h();
        C44128b.m97270n("StartupMinorTraceUtils", "MinorTrace report success!");
    }

    static {
        HashMap<String, String> map = new HashMap<>();
        map.put("app_oncreate_end", "duration1");
        map.put("splash_start_oncreate", "duration2");
        map.put("agree_protocol", "duration3");
        map.put("site_await", "duration4");
        map.put("task_await", "duration5");
        map.put("task_done", "duration6");
        map.put("sensor_ab", "duration7");
        map.put("navigation_start", "duration8");
        map.put("navigation_end", "duration9");
        f48183b = map;
        f48184c = new ConcurrentHashMap<>();
        f48185d = StartupTrace.f48194a.m58453m();
    }

    /* JADX INFO: renamed from: b */
    public final void m58419b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        StartupTrace startupTrace = StartupTrace.f48194a;
        if (startupTrace.m58454n() == 0) {
            m58421d("StartupMinorTraceUtils", "Startup Not cold start or not MainProcess, Step=" + key);
            return;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = f48184c;
        if (concurrentHashMap.containsKey(key)) {
            return;
        }
        long jM58420c = m58420c() - startupTrace.m58454n();
        concurrentHashMap.put(key, Long.valueOf(jM58420c));
        m58421d("StartupMinorTraceUtils", "addTrace: key:" + key + " cost=" + jM58420c);
    }

    /* JADX INFO: renamed from: d */
    public final void m58421d(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Log.i(tag, msg);
    }

    /* JADX INFO: renamed from: h */
    public final void m58424h() {
        f48184c.clear();
    }

    /* JADX INFO: renamed from: g */
    public static final void m58418g(List list) throws JSONException {
        long jLongValue;
        boolean zBooleanValue;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StartupDispatcher.TaskExecutionInfo taskExecutionInfo = (StartupDispatcher.TaskExecutionInfo) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("category", "startup_task");
            jSONObject.put("path", f48185d);
            jSONObject.put(AppsFlyerProperties.CHANNEL, taskExecutionInfo.getPackName());
            jSONObject.put("name", taskExecutionInfo.getTaskName());
            String lowerCase = taskExecutionInfo.getThreadType().name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            jSONObject.put(C33820nf.f71150f, lowerCase);
            Long durationMs = taskExecutionInfo.getDurationMs();
            if (durationMs != null) {
                jLongValue = durationMs.longValue();
            } else {
                jLongValue = 0;
            }
            jSONObject.put("$event_duration", jLongValue);
            Boolean success = taskExecutionInfo.getSuccess();
            if (success != null) {
                zBooleanValue = success.booleanValue();
            } else {
                zBooleanValue = true;
            }
            jSONObject.put("success", zBooleanValue);
            if (taskExecutionInfo.getDurationMs() == null) {
                f48182a.m58421d("StartupMinorTraceUtils", taskExecutionInfo.getTaskName() + " durationMs is null, not report");
            } else {
                f48182a.m58421d("StartupMinorTraceUtils", "reportTask report:" + jSONObject);
                C43852m.m96605q("duration_event", jSONObject);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m58420c() {
        return SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: f */
    public final void m58423f() {
        final List<StartupDispatcher.TaskExecutionInfo> listTaskExecutionInfo = StartupDispatcher.taskExecutionInfo();
        C42917g.m94137c().execute(new Runnable() { // from class: com.kubi.sdk.util.h1
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                StartupMinorTraceUtils.m58418g(listTaskExecutionInfo);
            }
        });
    }
}
