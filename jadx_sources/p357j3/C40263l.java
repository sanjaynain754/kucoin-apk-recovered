package p357j3;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.work.PeriodicWorkRequest;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.appevents.internal.SessionInfo;
import com.facebook.appevents.internal.SourceApplicationInfo;
import com.facebook.internal.Logger;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.tencent.bugly.proguard.C33536a4;
import com.tencent.bugly.proguard.C33733jc;
import com.tencent.bugly.proguard.C33918sa;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464n6.C42757a;
import p550q6.C43635a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: j3.l */
/* JADX INFO: compiled from: SessionLogger.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\n \u001a*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001e¨\u0006 "}, m90084d2 = {"Lj3/l;", "", "<init>", "()V", "", "activityName", "Lcom/facebook/appevents/internal/SourceApplicationInfo;", "sourceApplicationInfo", RemoteConfigConstants.RequestFieldKey.APP_ID, "Landroid/content/Context;", "context", "", "c", "(Ljava/lang/String;Lcom/facebook/appevents/internal/SourceApplicationInfo;Ljava/lang/String;Landroid/content/Context;)V", "Lcom/facebook/appevents/internal/SessionInfo;", "sessionInfo", "e", "(Ljava/lang/String;Lcom/facebook/appevents/internal/SessionInfo;Ljava/lang/String;)V", "", "timeBetweenSessions", "", "b", "(J)I", "d", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;)Ljava/lang/String;", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "", "[J", "INACTIVE_SECONDS_QUANTA", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C40263l {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C40263l f89499a = new C40263l();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final String TAG = C40263l.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final long[] INACTIVE_SECONDS_QUANTA = {300000, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS, C33536a4.f68797g, FundingRateEntity.MILLIS_PER_HOUR, C33918sa.f71848h, C33733jc.f70371c, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final int m88636b(long timeBetweenSessions) {
        if (C42757a.m93689d(C40263l.class)) {
            return 0;
        }
        int i11 = 0;
        while (true) {
            try {
                long[] jArr = INACTIVE_SECONDS_QUANTA;
                if (i11 >= jArr.length || jArr[i11] >= timeBetweenSessions) {
                    break;
                }
                i11++;
            } catch (Throwable th2) {
                C42757a.m93687b(th2, C40263l.class);
                return 0;
            }
        }
        return i11;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m88637c(@NotNull String activityName, @Nullable SourceApplicationInfo sourceApplicationInfo, @Nullable String appId, @NotNull Context context) {
        String string;
        if (C42757a.m93689d(C40263l.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(context, "context");
            if (sourceApplicationInfo == null || (string = sourceApplicationInfo.toString()) == null) {
                string = "Unclassified";
            }
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", string);
            bundle.putString("fb_mobile_pckg_fp", f89499a.m88639a(context));
            bundle.putString("fb_mobile_app_cert_hash", C43635a.m96031a(context));
            InternalAppEventsLogger.Companion companion = InternalAppEventsLogger.INSTANCE;
            InternalAppEventsLogger internalAppEventsLoggerCreateInstance = companion.createInstance(activityName, appId, null);
            internalAppEventsLoggerCreateInstance.m7882d("fb_mobile_activate_app", bundle);
            if (companion.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                internalAppEventsLoggerCreateInstance.m7879a();
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C40263l.class);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m88638e(@NotNull String activityName, @Nullable SessionInfo sessionInfo, @Nullable String appId) {
        long jLongValue;
        String string;
        if (C42757a.m93689d(C40263l.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            if (sessionInfo == null) {
                return;
            }
            Long lM8243b = sessionInfo.m8243b();
            if (lM8243b != null) {
                jLongValue = lM8243b.longValue();
            } else {
                Long sessionLastEventTime = sessionInfo.getSessionLastEventTime();
                jLongValue = 0 - (sessionLastEventTime != null ? sessionLastEventTime.longValue() : 0L);
            }
            if (jLongValue < 0) {
                f89499a.m88640d();
                jLongValue = 0;
            }
            long jM8247f = sessionInfo.m8247f();
            if (jM8247f < 0) {
                f89499a.m88640d();
                jM8247f = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", sessionInfo.getInterruptionCount());
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(m88636b(jLongValue))}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
            bundle.putString("fb_mobile_time_between_sessions", str);
            SourceApplicationInfo sourceApplicationInfo = sessionInfo.getSourceApplicationInfo();
            if (sourceApplicationInfo == null || (string = sourceApplicationInfo.toString()) == null) {
                string = "Unclassified";
            }
            bundle.putString("fb_mobile_launch_source", string);
            Long sessionLastEventTime2 = sessionInfo.getSessionLastEventTime();
            bundle.putLong("_logTime", (sessionLastEventTime2 != null ? sessionLastEventTime2.longValue() : 0L) / ((long) 1000));
            InternalAppEventsLogger.INSTANCE.createInstance(activityName, appId, null).m7881c("fb_mobile_deactivate_app", jM8247f / 1000, bundle);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C40263l.class);
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m88639a(Context context) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String str = "PCKGCHKSUM;" + packageManager.getPackageInfo(context.getPackageName(), 0).versionName;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(str, null);
            if (string != null && string.length() == 32) {
                return string;
            }
            String strM88634c = C40262k.m88634c(context, null);
            if (strM88634c == null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "pm.getApplicationInfo(context.packageName, 0)");
                strM88634c = C40262k.m88633b(applicationInfo.sourceDir);
            }
            sharedPreferences.edit().putString(str, strM88634c).apply();
            return strM88634c;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m88640d() {
        if (C42757a.m93689d(this)) {
            return;
        }
        try {
            Logger.Companion companion = Logger.INSTANCE;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = TAG;
            Intrinsics.checkNotNull(str);
            companion.log(loggingBehavior, str, "Clock skew detected");
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
        }
    }
}
