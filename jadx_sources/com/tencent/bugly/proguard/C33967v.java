package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.Process;
import android.os.SystemClock;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.common.logger.LogState;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.v */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33967v {

    /* JADX INFO: renamed from: a */
    public static final long f72281a = 500;

    /* JADX INFO: renamed from: b */
    public static final long f72282b = 5000;

    /* JADX INFO: renamed from: c */
    public static boolean f72283c;

    /* JADX INFO: renamed from: a */
    public static boolean m75219a() {
        try {
            if (!C33765l2.m73827s().m73838K()) {
                C34012x4.m75442d("isMainThreadForeBlocked, not foreground", new Object[0]);
                return false;
            }
            if (!C33830o4.m74401e(C33598d3.m72772c())) {
                C34012x4.m75442d("isMainThreadForeBlocked, not vivo", new Object[0]);
                return false;
            }
            if (AndroidVersion.isOverM()) {
                MessageQueue queue = Looper.getMainLooper().getQueue();
                Field declaredField = queue.getClass().getDeclaredField("mMessages");
                boolean z11 = true;
                declaredField.setAccessible(true);
                Message message = (Message) declaredField.get(queue);
                if (message != null) {
                    long when = message.getWhen();
                    if (when == 0) {
                        C34012x4.m75442d("isMainThreadForeBlocked, when == 0", new Object[0]);
                        return false;
                    }
                    if (SystemClock.uptimeMillis() - when <= 5000) {
                        z11 = false;
                    }
                    C34012x4.m75442d("isMainThreadForeBlocked = " + z11, new Object[0]);
                    return z11;
                }
            }
            C34012x4.m75442d("isMainThreadForeBlocked, return false", new Object[0]);
            return false;
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m75221b(ActivityManager activityManager) {
        C34012x4.m75442d("enableNewAnrScheme: " + f72283c, new Object[0]);
        if (f72283c) {
            return (!m75219a() && C34007x.m75407a(activityManager) && m75217a(activityManager, C33947u.f72142z) == null) ? false : true;
        }
        return (C34007x.m75407a(activityManager) || m75217a(activityManager, 0L) == null) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m75220a(Context context) {
        boolean z11 = C33830o4.m74399d(context) || C33830o4.m74401e(context);
        C34012x4.m75434a("isAnrCrashDevice:%s", Boolean.valueOf(z11));
        return z11;
    }

    /* JADX INFO: renamed from: a */
    public static ActivityManager.ProcessErrorStateInfo m75217a(ActivityManager activityManager, long j11) {
        if (activityManager == null) {
            C34012x4.m75434a("get anr state, ActivityManager is null", new Object[0]);
            return null;
        }
        C34012x4.m75434a("get anr state, timeout:%d", Long.valueOf(j11));
        long j12 = j11 / 500;
        int i11 = 0;
        while (true) {
            ActivityManager.ProcessErrorStateInfo processErrorStateInfoM75216a = m75216a(activityManager);
            if (processErrorStateInfoM75216a == null) {
                C34012x4.m75431a(LogState.DEBUG, "found proc state is null, wait for it", new Object[0]);
            } else {
                int i12 = processErrorStateInfoM75216a.condition;
                if (i12 == 1) {
                    C34012x4.m75431a(LogState.DEBUG, "found proc state is crashed!", new Object[0]);
                    return null;
                }
                if (i12 == 2) {
                    C34012x4.m75431a(LogState.DEBUG, "found proc state is anr! proc:%s", processErrorStateInfoM75216a.processName);
                    return processErrorStateInfoM75216a;
                }
            }
            int i13 = i11 + 1;
            if (i11 >= j12) {
                if (f72283c) {
                    return null;
                }
                return m75218a("Find process anr, but unable to get anr message.");
            }
            C34012x4.m75431a(LogState.DEBUG, "try the %s times:", Integer.valueOf(i13));
            C33571bi.m72615c(500L);
            i11 = i13;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ActivityManager.ProcessErrorStateInfo m75216a(ActivityManager activityManager) {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
        if (processesInErrorState != null && !processesInErrorState.isEmpty()) {
            int iMyPid = Process.myPid();
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                if (processErrorStateInfo.pid == iMyPid) {
                    C34012x4.m75434a("found current proc in the error state", new Object[0]);
                    return processErrorStateInfo;
                }
            }
            C34012x4.m75434a("current proc not in the error state", new Object[0]);
            return null;
        }
        C34012x4.m75434a("error state info list is null", new Object[0]);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static ActivityManager.ProcessErrorStateInfo m75218a(String str) {
        ActivityManager.ProcessErrorStateInfo processErrorStateInfo = new ActivityManager.ProcessErrorStateInfo();
        processErrorStateInfo.pid = Process.myPid();
        processErrorStateInfo.processName = C34007x.m75404a(Process.myPid());
        processErrorStateInfo.shortMsg = str;
        return processErrorStateInfo;
    }
}
