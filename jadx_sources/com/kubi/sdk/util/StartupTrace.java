package com.kubi.sdk.util;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.media3.common.MimeTypes;
import com.facebook.react.bridge.ReadableMap;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.sdk.util.j1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: StartupTrace.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r*\u0001\u0019\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u00102\u001a\u0002002\u0006\u00103\u001a\u00020\u0005J\u0010\u00105\u001a\u0002002\b\u00106\u001a\u0004\u0018\u000107J\n\u00108\u001a\u0004\u0018\u000109H\u0002J\u0006\u0010:\u001a\u000200J\u0006\u0010;\u001a\u00020\u0007J\u0006\u0010<\u001a\u000200J\b\u0010=\u001a\u000200H\u0002J\u0006\u0010>\u001a\u00020\u0005J\b\u0010?\u001a\u000200H\u0002J\b\u0010@\u001a\u000200H\u0002J\u0013\u0010A\u001a\u00020\t*\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010BJ\u0018\u0010C\u001a\u0002002\u0006\u0010D\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R*\u0010,\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070-j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007`.X\u0082\u0004¢\u0006\u0002\n\u0000R.\u00104\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010-j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001`.X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006F"}, m90084d2 = {"Lcom/kubi/sdk/util/StartupTrace;", "", "<init>", "()V", "TAG", "", "startTime", "", "isShowAd", "", "()Z", "setShowAd", "(Z)V", "KEY_REMOTE_START_UP_DURATION", "needReport", "currentUUID", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "startedActivityCount", "", "mainHandler", "Landroid/os/Handler;", "backgroundCheck", "Ljava/lang/Runnable;", "startupLifecycleCallbacks", "com/kubi/sdk/util/StartupTrace$startupLifecycleCallbacks$1", "Lcom/kubi/sdk/util/StartupTrace$startupLifecycleCallbacks$1;", "MANUAL_KILL_TIME", "duration1", "duration2", "duration3", "duration4", "duration5", "duration6", "duration7", "duration8", "duration9", "duration10", "duration11", "duration12", "duration13", "duration14", "duration15", "event_duration", "resultMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "startTrace", "", "isMainProcess", "endTrace", "step", "homeRNParamsMap", "onHomeRnFinish", "properties", "Lcom/facebook/react/bridge/ReadableMap;", "generateJson", "Lorg/json/JSONObject;", "report", "getStartTime", "reset", "unregisterStartupLifecycleCallbacks", "getCurrentUUID", "clearCurrentUUID", "generateUUID", "check", "(Ljava/lang/Long;)Z", "logd", "tag", "msg", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStartupTrace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartupTrace.kt\ncom/kubi/sdk/util/StartupTrace\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 5 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,244:1\n1#2:245\n126#3:246\n153#3,3:247\n126#3:250\n153#3,3:251\n35#4,4:254\n39#4:260\n44#5,2:258\n*S KotlinDebug\n*F\n+ 1 StartupTrace.kt\ncom/kubi/sdk/util/StartupTrace\n*L\n149#1:246\n149#1:247,3\n152#1:250\n152#1:251,3\n163#1:254,4\n163#1:260\n163#1:258,2\n*E\n"})
public final class StartupTrace {

    /* JADX INFO: renamed from: b */
    public static volatile long f48195b;

    /* JADX INFO: renamed from: c */
    public static boolean f48196c;

    /* JADX INFO: renamed from: f */
    @Nullable
    public static Application f48199f;

    /* JADX INFO: renamed from: g */
    public static int f48200g;

    /* JADX INFO: renamed from: i */
    @Nullable
    public static Runnable f48202i;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final StartupTrace f48194a = new StartupTrace();

    /* JADX INFO: renamed from: d */
    public static volatile boolean f48197d = true;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static String f48198e = "";

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Handler f48201h = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final b f48203j = new b();

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final HashMap<String, Long> f48204k = new HashMap<>();

    /* JADX INFO: renamed from: l */
    @NotNull
    public static HashMap<String, Object> f48205l = new HashMap<>();

    /* JADX INFO: renamed from: com.kubi.sdk.util.j1$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.sdk.util.j1$b */
    /* JADX INFO: compiled from: StartupTrace.kt */
    /* JADX INFO: loaded from: classes43.dex */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, m90084d2 = {"com/kubi/sdk/util/StartupTrace$startupLifecycleCallbacks$1", "Landroid/app/Application$ActivityLifecycleCallbacks;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState", "outState", "onActivityDestroyed", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nStartupTrace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartupTrace.kt\ncom/kubi/sdk/util/StartupTrace$startupLifecycleCallbacks$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,244:1\n1#2:245\n*E\n"})
    public static final class b implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            StartupTrace.f48200g++;
            Runnable runnable = StartupTrace.f48202i;
            if (runnable != null) {
                StartupTrace.f48201h.removeCallbacks(runnable);
            }
            StartupTrace.f48202i = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            StartupTrace.f48194a.m58455o("StartupTrace", "Startup interrupted activity=" + activity.getComponentName());
            StartupTrace.f48200g = RangesKt.coerceAtLeast(StartupTrace.f48200g + (-1), 0);
            if (activity.isChangingConfigurations() || StartupTrace.f48200g > 0) {
                return;
            }
            Runnable runnable = new Runnable() { // from class: com.kubi.sdk.util.k1
                @Override // java.lang.Runnable
                public final void run() {
                    StartupTrace.b.m58463b();
                }
            };
            StartupTrace.f48201h.postDelayed(runnable, 700L);
            StartupTrace.f48202i = runnable;
        }

        /* JADX INFO: renamed from: b */
        public static final void m58463b() {
            if (StartupTrace.f48200g == 0 && StartupTrace.f48195b != 0) {
                StartupTrace.f48194a.m58458r();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m58448h(Long l11) {
        if (l11 == null) {
            return false;
        }
        try {
            return l11.longValue() >= 0 && l11.longValue() < 30000;
        } catch (Exception e11) {
            C44128b.m97263g("StartupTrace", e11);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m58449i() {
        f48198e = "";
    }

    /* JADX INFO: renamed from: j */
    public final void m58450j(@NotNull String step) {
        Long l11;
        Intrinsics.checkNotNullParameter(step, "step");
        if (f48195b == 0) {
            m58455o("StartupTrace", "Startup Not cold start or not MainProcess, Step=" + step);
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - f48195b;
            if (Intrinsics.areEqual(step, "duration3") && (l11 = f48204k.get("duration2")) != null && jElapsedRealtime - l11.longValue() > 4000) {
                m58455o("StartupTrace", "manual_kill_app,no report");
                m58458r();
                return;
            }
            if (!m58448h(Long.valueOf(jElapsedRealtime))) {
                m58455o("StartupTrace", "cost error,no report");
                m58458r();
                return;
            }
            m58455o("StartupTrace", "success step=" + step + ",cost=" + jElapsedRealtime + " ms");
            f48204k.put(step, Long.valueOf(jElapsedRealtime));
        } catch (Exception e11) {
            C44128b.m97263g("StartupTrace", e11);
        }
    }

    /* JADX INFO: renamed from: k */
    public final JSONObject m58451k() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", f48196c ? "startAd" : "startAnim");
            jSONObject.put("category", "startup_duration");
            jSONObject.put("path", f48194a.m58453m());
            HashMap<String, Object> map = f48205l;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                arrayList.add(jSONObject.put(entry.getKey(), entry.getValue()));
            }
            HashMap<String, Long> map2 = f48204k;
            ArrayList arrayList2 = new ArrayList(map2.size());
            for (Map.Entry<String, Long> entry2 : map2.entrySet()) {
                arrayList2.add(jSONObject.put(entry2.getKey(), entry2.getValue().longValue()));
            }
            return jSONObject;
        } catch (Exception e11) {
            C44128b.m97263g("StartupTrace", e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m58452l() {
        if (f48198e.length() == 0) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            f48198e = string;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final String m58453m() {
        C44128b.m97265i("currentUUID=" + f48198e);
        return f48198e;
    }

    /* JADX INFO: renamed from: n */
    public final long m58454n() {
        return f48195b;
    }

    /* JADX INFO: renamed from: p */
    public final void m58456p(@Nullable ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        f48205l.clear();
        f48205l.putAll(readableMap.toHashMap());
    }

    /* JADX INFO: renamed from: q */
    public final void m58457q() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("startup_duration", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        if (Intrinsics.areEqual(objM20457a, Boolean.FALSE)) {
            C44128b.m97270n("StartupTrace", "KEY_REMOTE_START_UP_DURATION is false");
            return;
        }
        if (!f48197d) {
            C44128b.m97270n("StartupTrace", "needReport is false");
            return;
        }
        try {
            JSONObject jSONObjectM58451k = m58451k();
            m58455o("StartupTrace", "report:" + jSONObjectM58451k);
            if (jSONObjectM58451k == null || f48204k.isEmpty()) {
                C44128b.m97270n("StartupTrace", "resultMap = " + f48204k.size() + ", no report!");
            } else {
                C43852m.m96605q("duration_event", jSONObjectM58451k);
                C44128b.m97270n("StartupTrace", "report success!");
                StartupMinorTraceUtils.f48182a.m58422e();
                m58458r();
            }
        } catch (Exception e11) {
            C44128b.m97263g("StartupTrace", e11);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m58458r() {
        C44128b.m97266j("StartupTrace", "reset!");
        f48197d = false;
        f48204k.clear();
        f48205l.clear();
        f48195b = 0L;
        m58449i();
        m58461u();
        StartupMinorTraceUtils.f48182a.m58424h();
    }

    /* JADX INFO: renamed from: s */
    public final void m58459s(boolean z11) {
        f48196c = z11;
    }

    /* JADX INFO: renamed from: t */
    public final void m58460t(boolean z11, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (z11) {
            f48195b = SystemClock.elapsedRealtime();
            m58452l();
            f48197d = true;
            m58461u();
            f48199f = application;
            application.registerActivityLifecycleCallbacks(f48203j);
        } else {
            m58449i();
            f48197d = false;
        }
        m58455o("StartupTrace", "Startup Start: isMainProcess " + z11);
    }

    /* JADX INFO: renamed from: u */
    public final void m58461u() {
        Runnable runnable = f48202i;
        if (runnable != null) {
            f48201h.removeCallbacks(runnable);
        }
        f48202i = null;
        Application application = f48199f;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(f48203j);
        }
        f48199f = null;
        f48200g = 0;
    }

    /* JADX INFO: renamed from: o */
    public final void m58455o(String str, String str2) {
        Log.d(str, str2);
    }
}
