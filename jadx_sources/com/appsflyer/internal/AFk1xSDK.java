package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, m90084d2 = {"Lcom/appsflyer/internal/AFk1xSDK;", "", "<init>", "()V", "", "", "p0", "getRevenue", "(Ljava/util/Map;)Ljava/util/Map;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/lang/Runnable;", "p1", "", "p2", "Ljava/util/concurrent/TimeUnit;", "p3", "", "getMonetizationNetwork", "(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)V"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class AFk1xSDK {

    @NotNull
    public static final AFk1xSDK INSTANCE = new AFk1xSDK();

    @JvmStatic
    public static final void getMonetizationNetwork(@NotNull ScheduledExecutorService p11, @NotNull Runnable p12, long p13, @NotNull TimeUnit p14) {
        Intrinsics.checkNotNullParameter(p11, "");
        Intrinsics.checkNotNullParameter(p12, "");
        Intrinsics.checkNotNullParameter(p14, "");
        try {
            p11.schedule(p12, p13, p14);
        } catch (RejectedExecutionException e11) {
            AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e11);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("scheduleJob failed with Exception", th2);
        }
    }

    @JvmStatic
    @NotNull
    public static final Map<String, Object> getRevenue(@NotNull Map<String, Object> p11) {
        Intrinsics.checkNotNullParameter(p11, "");
        Object obj = p11.get("meta");
        Map<String, Object> map = TypeIntrinsics.isMutableMap(obj) ? (Map) obj : null;
        if (map != null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        p11.put("meta", linkedHashMap);
        return linkedHashMap;
    }

    private AFk1xSDK() {
    }
}
