package com.tencent.rmonitor.common.lifecycle;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import androidx.media3.common.MimeTypes;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.proguard.C33549ah;
import com.tencent.bugly.proguard.C33602d7;
import com.tencent.bugly.proguard.C33657g;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010/\u001a\u000200H\u0007J\b\u00101\u001a\u000200H\u0002J\b\u00102\u001a\u000200H\u0002J\b\u00103\u001a\u000200H\u0007J\n\u00104\u001a\u0004\u0018\u000105H\u0002J\u0006\u00106\u001a\u000207J\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000e09J\u0010\u0010:\u001a\u0002002\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0018\u0010:\u001a\u0002002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010;\u001a\u00020<H\u0007J\u0010\u0010=\u001a\u0002002\u0006\u0010=\u001a\u00020\u000eH\u0007J\u0010\u0010>\u001a\u0002002\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0010\u0010?\u001a\u00020<2\b\u0010@\u001a\u0004\u0018\u00010AJ\u0006\u0010B\u001a\u00020<J\u0010\u0010C\u001a\u00020<2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001a\u0010D\u001a\u0002002\b\u0010E\u001a\u0004\u0018\u00010\"2\u0006\u0010F\u001a\u00020\u0005H\u0002J\"\u0010D\u001a\u0002002\b\u0010E\u001a\u0004\u0018\u00010\"2\u0006\u0010F\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u001cH\u0002J\u001a\u0010H\u001a\u0002002\u0006\u0010E\u001a\u00020\"2\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\u0010\u0010K\u001a\u0002002\u0006\u0010E\u001a\u00020\"H\u0016J\u0010\u0010L\u001a\u0002002\u0006\u0010E\u001a\u00020\"H\u0016J\u001a\u0010M\u001a\u0002002\u0006\u0010E\u001a\u00020\"2\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\u0010\u0010N\u001a\u0002002\u0006\u0010E\u001a\u00020\"H\u0016J\u0018\u0010O\u001a\u0002002\u0006\u0010E\u001a\u00020\"2\u0006\u0010P\u001a\u00020JH\u0016J\u0010\u0010Q\u001a\u0002002\u0006\u0010E\u001a\u00020\"H\u0016J\u0010\u0010R\u001a\u0002002\u0006\u0010E\u001a\u00020\"H\u0016J\u0010\u0010S\u001a\u0002002\u0006\u0010T\u001a\u00020UH\u0016J\b\u0010V\u001a\u000200H\u0016J\u0010\u0010W\u001a\u0002002\u0006\u0010X\u001a\u00020\u0005H\u0016J\u0018\u0010Y\u001a\u0002002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010Z\u001a\u0002002\u0006\u0010G\u001a\u00020\u001cH\u0007J\u0006\u0010[\u001a\u000200J\u0010\u0010\\\u001a\u0002002\u0006\u0010G\u001a\u00020\u001cH\u0007J\u0018\u0010]\u001a\u0002002\u0006\u0010^\u001a\u00020\u00052\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010_\u001a\u0002002\u0006\u0010`\u001a\u00020\u0005H\u0002J\u0018\u0010a\u001a\u0002002\u0006\u0010^\u001a\u00020\u00052\u0006\u0010;\u001a\u00020<H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\"\u0010*\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006b"}, m90084d2 = {"Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/content/ComponentCallbacks2;", "()V", "ACTIVITY_ON_CREATE", "", "ACTIVITY_ON_DESTROY", "ACTIVITY_ON_PAUSE", "ACTIVITY_ON_POST_CREATE", "ACTIVITY_ON_RESUME", "ACTIVITY_ON_START", "ACTIVITY_ON_STOP", "APP_LIFECYCLE_DES", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "APP_STATE_BACKGROUND", "APP_STATE_DESC", "APP_STATE_FOREGROUND", "APP_STATE_UNKNOWN", "BACKGROUND", "FOREGROUND", "INIT_HASH", "TAG", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "callbackSet", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;", "foregroundActivityList", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "lastAppState", "lastResumeActivityRef", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "getLastResumeActivityRef", "()Ljava/lang/ref/WeakReference;", "setLastResumeActivityRef", "(Ljava/lang/ref/WeakReference;)V", "lastStartActivityRef", "getLastStartActivityRef", "setLastStartActivityRef", "lastStopActivityRef", "getLastStopActivityRef", "setLastStopActivityRef", "operationLog", "Lcom/tencent/rmonitor/common/lifecycle/OperationLog;", "clear", "", "clearAllForegroundActivity", "clearForegroundActivityList", "enableFragmentLifecycleMonitor", "getHandler", "Landroid/os/Handler;", "getOperationLog", "Lorg/json/JSONArray;", "getOperationLogString", "", "init", JPushConstants.Message.KEY_FOREGROUND, "", "initAppState", "initOnApplicationOnCreate", "isCurrentAppOnForeground", "context", "Landroid/content/Context;", "isCurrentForeground", "isInitWithSameContextBefore", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_ENABLE_NOTIFICATION, "activity", "state", TUIConstants.TUIChat.CALL_BACK, "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityPostCreated", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onLowMemory", "onTrimMemory", FirebaseAnalytics.Param.LEVEL, "realInit", "register", "reset", "unRegister", "updateAppForegroundState", "activityHash", "updateAppState", "appState", "updateForegroundActivityList", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class LifecycleCallback implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    private static final int ACTIVITY_ON_CREATE = 1;
    private static final int ACTIVITY_ON_DESTROY = 6;
    private static final int ACTIVITY_ON_PAUSE = 4;
    private static final int ACTIVITY_ON_POST_CREATE = 9;
    private static final int ACTIVITY_ON_RESUME = 3;
    private static final int ACTIVITY_ON_START = 2;
    private static final int ACTIVITY_ON_STOP = 5;

    @NotNull
    private static final ArrayList<String> APP_LIFECYCLE_DES;
    private static final int APP_STATE_BACKGROUND = 2;

    @NotNull
    private static final ArrayList<String> APP_STATE_DESC;
    private static final int APP_STATE_FOREGROUND = 1;
    private static final int APP_STATE_UNKNOWN = 0;
    private static final int BACKGROUND = 8;
    private static final int FOREGROUND = 7;
    private static final int INIT_HASH = 0;

    @NotNull
    public static final LifecycleCallback INSTANCE = new LifecycleCallback();

    @NotNull
    private static final String TAG = "RMonitor_looper_lifecycle";

    @Nullable
    private static Application application;

    @NotNull
    private static final CopyOnWriteArraySet<IActivityStateCallback> callbackSet;

    @NotNull
    private static final ConcurrentLinkedQueue<Integer> foregroundActivityList;
    private static int lastAppState;

    @Nullable
    private static WeakReference<Activity> lastResumeActivityRef;

    @Nullable
    private static WeakReference<Activity> lastStartActivityRef;

    @Nullable
    private static WeakReference<Activity> lastStopActivityRef;

    @NotNull
    private static final OperationLog operationLog;

    @JvmStatic
    public static final void init(@NotNull final Application application2, final boolean isForeground) {
        Intrinsics.checkNotNullParameter(application2, "application");
        if (C33549ah.m72371a(Looper.getMainLooper())) {
            INSTANCE.realInit(application2, isForeground);
            return;
        }
        Handler handler = INSTANCE.getHandler();
        if (handler != null) {
            handler.post(new Runnable() { // from class: dc0.a
                @Override // java.lang.Runnable
                public final void run() {
                    LifecycleCallback.m103827init$lambda0(application2, isForeground);
                }
            });
        }
    }

    private final void notify(Activity activity, int state) {
        String name;
        String strValueOf;
        if (activity != null) {
            try {
                name = activity.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "activity.javaClass.name");
                strValueOf = String.valueOf(activity.hashCode());
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(TAG, TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_ENABLE_NOTIFICATION, th2);
                return;
            }
        } else {
            name = "";
            strValueOf = "";
        }
        OperationLog operationLog2 = operationLog;
        String str = APP_LIFECYCLE_DES.get(state);
        Intrinsics.checkNotNullExpressionValue(str, "APP_LIFECYCLE_DES[state]");
        operationLog2.onLifecycleChanged(name, strValueOf, str);
        for (IActivityStateCallback callback : callbackSet) {
            Intrinsics.checkNotNullExpressionValue(callback, "callback");
            notify(activity, state, callback);
        }
    }

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        APP_LIFECYCLE_DES = arrayList;
        arrayList.add("unknown");
        arrayList.add("created");
        arrayList.add("started");
        arrayList.add("resumed");
        arrayList.add("paused");
        arrayList.add("stopped");
        arrayList.add("destroyed");
        arrayList.add("foreground");
        arrayList.add("background");
        arrayList.add("postCreated");
        ArrayList<String> arrayList2 = new ArrayList<>();
        APP_STATE_DESC = arrayList2;
        arrayList2.add("unknown");
        arrayList2.add("foreground");
        arrayList2.add("background");
        callbackSet = new CopyOnWriteArraySet<>();
        foregroundActivityList = new ConcurrentLinkedQueue<>();
        operationLog = new OperationLog();
    }

    @JvmStatic
    public static final void clear() {
        try {
            callbackSet.clear();
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(TAG, "clear", th2);
        }
    }

    private final void clearForegroundActivityList() {
        try {
            foregroundActivityList.clear();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: enableFragmentLifecycleMonitor$lambda-1, reason: not valid java name */
    public static final void m103826enableFragmentLifecycleMonitor$lambda1() {
        C33602d7.c.f69516a.m72784a(operationLog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: init$lambda-0, reason: not valid java name */
    public static final void m103827init$lambda0(Application application2, boolean z11) {
        Intrinsics.checkNotNullParameter(application2, "$application");
        INSTANCE.realInit(application2, z11);
    }

    @JvmStatic
    public static final void initAppState(@NotNull String initAppState) {
        Intrinsics.checkNotNullParameter(initAppState, "initAppState");
        try {
            int iIndexOf = APP_STATE_DESC.indexOf(initAppState);
            if (iIndexOf >= 0) {
                lastAppState = iIndexOf;
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(TAG, "initAppState", th2);
        }
        Logger.INSTANCE.mo77134w(TAG, "initAppState, lastAppState: " + lastAppState + ", initAppState: " + initAppState);
    }

    @JvmStatic
    public static final void initOnApplicationOnCreate(@NotNull Application application2) {
        Intrinsics.checkNotNullParameter(application2, "application");
        init(application2, false);
    }

    private final boolean isInitWithSameContextBefore(Application application2) {
        return Intrinsics.areEqual(application2, application);
    }

    @JvmStatic
    public static final void register(@NotNull IActivityStateCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            callbackSet.add(callback);
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(TAG, "register", th2);
        }
    }

    @JvmStatic
    public static final void unRegister(@NotNull IActivityStateCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            callbackSet.remove(callback);
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(TAG, "unRegister", th2);
        }
    }

    private final void updateAppState(int appState) {
        int i11 = lastAppState;
        if (appState == i11) {
            return;
        }
        lastAppState = appState;
        if (appState == 1) {
            notify(null, 7);
        } else if (appState == 2) {
            notify(null, 8);
        }
        if (Logger.verbos) {
            Logger logger = Logger.INSTANCE;
            StringBuilder sb2 = new StringBuilder("updateAppState, ");
            ArrayList<String> arrayList = APP_STATE_DESC;
            sb2.append(arrayList.get(i11));
            sb2.append(" --> ");
            sb2.append(arrayList.get(lastAppState));
            sb2.append(", curForeCount: ");
            sb2.append(foregroundActivityList.size());
            logger.mo77133v(TAG, sb2.toString());
        }
    }

    private final void updateForegroundActivityList(int activityHash, boolean isForeground) {
        try {
            if (isForeground) {
                foregroundActivityList.add(Integer.valueOf(activityHash));
                return;
            }
            ConcurrentLinkedQueue<Integer> concurrentLinkedQueue = foregroundActivityList;
            concurrentLinkedQueue.remove(Integer.valueOf(activityHash));
            concurrentLinkedQueue.remove(0);
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public final WeakReference<Activity> getLastResumeActivityRef() {
        return lastResumeActivityRef;
    }

    @Nullable
    public final WeakReference<Activity> getLastStartActivityRef() {
        return lastStartActivityRef;
    }

    @Nullable
    public final WeakReference<Activity> getLastStopActivityRef() {
        return lastStopActivityRef;
    }

    @NotNull
    public final JSONArray getOperationLog() {
        return operationLog.getOperationLog();
    }

    @NotNull
    public final List<String> getOperationLogString() {
        return operationLog.getOperationLogString();
    }

    public final boolean isCurrentAppOnForeground(@Nullable Context context) {
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList;
        boolean z11;
        Logger.INSTANCE.mo77134w(TAG, "isCurrentAppOnForeground, lastAppState: " + lastAppState);
        int i11 = lastAppState;
        if (i11 == 1) {
            return true;
        }
        boolean z12 = false;
        if (i11 == 2) {
            return false;
        }
        if (context != null) {
            try {
                int iMyPid = Process.myPid();
                Object systemService = context.getSystemService("activity");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
                }
                List<ActivityManager.RunningAppProcessInfo> runningList = ((ActivityManager) systemService).getRunningAppProcesses();
                if (runningList != null) {
                    Intrinsics.checkNotNullExpressionValue(runningList, "runningList");
                    arrayList = new ArrayList();
                    for (Object obj : runningList) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
                        if (runningAppProcessInfo != null && runningAppProcessInfo.pid == iMyPid) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    loop1: while (true) {
                        z11 = false;
                        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 : arrayList) {
                            try {
                                if (runningAppProcessInfo2.importance == 100 && runningAppProcessInfo2.importanceReasonCode == 0) {
                                    z11 = true;
                                }
                            } catch (Throwable unused) {
                                z12 = z11;
                                Unit unit = Unit.INSTANCE;
                            }
                        }
                        break loop1;
                    }
                    Unit unit2 = Unit.INSTANCE;
                    z12 = z11;
                }
            } catch (Throwable unused2) {
            }
        }
        Logger.INSTANCE.mo77134w(TAG, "isCurrentAppOnForeground, ret: " + z12);
        return z12;
    }

    public final boolean isCurrentForeground() {
        return lastAppState == 1;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        notify(activity, 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        notify(activity, 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        notify(activity, 4);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        notify(activity, 9);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C33657g.m73095h().m73097a(activity);
        lastResumeActivityRef = new WeakReference<>(activity);
        notify(activity, 3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        lastStartActivityRef = new WeakReference<>(activity);
        updateAppForegroundState(activity.hashCode(), true);
        notify(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        lastStopActivityRef = new WeakReference<>(activity);
        updateAppForegroundState(activity.hashCode(), false);
        notify(activity, 5);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        int i11 = (level == 20 || level == 40) ? 2 : 0;
        if (i11 == 2) {
            if (Logger.verbos) {
                Logger.INSTANCE.mo77133v(TAG, "onTrimMemory, appState: " + APP_STATE_DESC.get(i11) + ", level: " + level);
            }
            clearAllForegroundActivity();
        }
    }

    public final void reset() {
        callbackSet.clear();
        lastAppState = 0;
        lastResumeActivityRef = null;
        lastStartActivityRef = null;
        lastStopActivityRef = null;
        operationLog.reset();
        application = null;
        clearForegroundActivityList();
    }

    public final void setLastResumeActivityRef(@Nullable WeakReference<Activity> weakReference) {
        lastResumeActivityRef = weakReference;
    }

    public final void setLastStartActivityRef(@Nullable WeakReference<Activity> weakReference) {
        lastStartActivityRef = weakReference;
    }

    public final void setLastStopActivityRef(@Nullable WeakReference<Activity> weakReference) {
        lastStopActivityRef = weakReference;
    }

    private LifecycleCallback() {
    }

    private final void clearAllForegroundActivity() {
        clearForegroundActivityList();
        updateAppState(2);
    }

    @JvmStatic
    public static final void enableFragmentLifecycleMonitor() {
        if (C33549ah.m72371a(Looper.getMainLooper())) {
            C33602d7.c.f69516a.m72784a(operationLog);
            return;
        }
        Handler handler = INSTANCE.getHandler();
        if (handler != null) {
            handler.post(new Runnable() { // from class: dc0.b
                @Override // java.lang.Runnable
                public final void run() {
                    LifecycleCallback.m103826enableFragmentLifecycleMonitor$lambda1();
                }
            });
        }
    }

    private final Handler getHandler() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new Handler(mainLooper);
        }
        return null;
    }

    private final void realInit(Application application2, boolean isForeground) {
        if (isInitWithSameContextBefore(application2)) {
            return;
        }
        Application application3 = application;
        application = application2;
        if (application3 != null) {
            LifecycleCallback lifecycleCallback = INSTANCE;
            application3.unregisterActivityLifecycleCallbacks(lifecycleCallback);
            application3.unregisterComponentCallbacks(lifecycleCallback);
        }
        updateAppForegroundState(0, isForeground);
        if (Logger.debug) {
            Logger.INSTANCE.mo77130d(TAG, "realInit, appState: " + APP_STATE_DESC.get(lastAppState) + ", isForeground: " + isForeground);
        }
        C33657g.m73095h().m73098a(operationLog);
        LifecycleCallback lifecycleCallback2 = INSTANCE;
        application2.registerActivityLifecycleCallbacks(lifecycleCallback2);
        application2.registerComponentCallbacks(lifecycleCallback2);
    }

    private final void updateAppForegroundState(int activityHash, boolean isForeground) {
        int i11;
        updateForegroundActivityList(activityHash, isForeground);
        if (foregroundActivityList.isEmpty()) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        updateAppState(i11);
    }

    @JvmStatic
    public static final void init(@NotNull Application application2) {
        Intrinsics.checkNotNullParameter(application2, "application");
        LifecycleCallback lifecycleCallback = INSTANCE;
        if (lifecycleCallback.isInitWithSameContextBefore(application2)) {
            return;
        }
        init(application2, lifecycleCallback.isCurrentAppOnForeground(application2));
    }

    private final void notify(Activity activity, int state, IActivityStateCallback callback) {
        try {
            if (activity == null) {
                if (state == 7) {
                    callback.onForeground();
                    return;
                } else {
                    if (state != 8) {
                        return;
                    }
                    callback.onBackground();
                    return;
                }
            }
            if (state != 9) {
                switch (state) {
                    case 1:
                        callback.onCreate(activity);
                        break;
                    case 2:
                        callback.onStart(activity);
                        break;
                    case 3:
                        callback.onResume(activity);
                        break;
                    case 4:
                        callback.onPause(activity);
                        break;
                    case 5:
                        callback.onStop(activity);
                        break;
                    case 6:
                        callback.onDestroy(activity);
                        break;
                }
                return;
            }
            callback.onPostCreate(activity);
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(TAG, TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_ENABLE_NOTIFICATION, th2);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }
}
