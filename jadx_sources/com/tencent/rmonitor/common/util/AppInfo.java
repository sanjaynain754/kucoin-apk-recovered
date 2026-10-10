package com.tencent.rmonitor.common.util;

import android.content.Context;
import android.os.Debug;
import android.text.TextUtils;
import com.tencent.bugly.common.utils.ProcessUtil;
import com.tencent.rmonitor.common.logger.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, m90084d2 = {"Lcom/tencent/rmonitor/common/util/AppInfo;", "", "()V", "Companion", "PssInfo", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class AppInfo {
    private static final long PSS_INFO_VALIDATE_IN_MILLIS = 10000;

    @NotNull
    private static final String TAG = "RMonitor_common_AppInfo";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static PssInfo pssInfo = new PssInfo();

    @NotNull
    private static String appName = "";

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\b\u0010\r\u001a\u00020\u0004H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0007J\u0012\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/tencent/rmonitor/common/util/AppInfo$Companion;", "", "()V", "PSS_INFO_VALIDATE_IN_MILLIS", "", "TAG", "", "appName", "pssInfo", "Lcom/tencent/rmonitor/common/util/AppInfo$PssInfo;", "getAppName", "context", "Landroid/content/Context;", "getPssMemory", "isApkInDebug", "", "obtainProcessName", "ctx", "obtainProcessPackageName", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final boolean isApkInDebug(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                return (context.getApplicationInfo().flags & 2) != 0;
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(AppInfo.TAG, th2);
                return false;
            }
        }

        @JvmStatic
        @NotNull
        public final String obtainProcessName(@Nullable Context ctx) {
            return ProcessUtil.INSTANCE.getCurrentProcessName(ctx);
        }

        @JvmStatic
        @NotNull
        public final String obtainProcessPackageName(@Nullable Context ctx) {
            if (ctx == null) {
                return "";
            }
            String packageName = ctx.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "{\n                ctx.packageName\n            }");
            return packageName;
        }

        @JvmStatic
        @NotNull
        public final String getAppName(@Nullable Context context) {
            CharSequence applicationLabel;
            if (!TextUtils.isEmpty(AppInfo.appName)) {
                return AppInfo.appName;
            }
            if (context != null) {
                try {
                    applicationLabel = context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
                } catch (Throwable th2) {
                    Logger.INSTANCE.exception(AppInfo.TAG, th2);
                    applicationLabel = null;
                }
            } else {
                applicationLabel = null;
            }
            if (applicationLabel == null) {
                applicationLabel = "";
            }
            AppInfo.appName = String.valueOf(applicationLabel);
            Logger.INSTANCE.mo77130d(AppInfo.TAG, "getAppName, name: " + AppInfo.appName);
            return AppInfo.appName;
        }

        @JvmStatic
        public final long getPssMemory() {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - AppInfo.pssInfo.getTimeStamp() < 10000) {
                    return AppInfo.pssInfo.getPssSize() * ((long) 1024);
                }
                AppInfo.pssInfo.setTimeStamp(jCurrentTimeMillis);
                AppInfo.pssInfo.setPssSize(Debug.getPss());
                return AppInfo.pssInfo.getPssSize() * ((long) 1024);
            } catch (Exception e11) {
                Logger.INSTANCE.exception(AppInfo.TAG, e11);
                return 0L;
            }
        }
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, m90084d2 = {"Lcom/tencent/rmonitor/common/util/AppInfo$PssInfo;", "", "()V", "pssSize", "", "getPssSize", "()J", "setPssSize", "(J)V", "timeStamp", "getTimeStamp", "setTimeStamp", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class PssInfo {
        private long pssSize;
        private long timeStamp;

        public final long getPssSize() {
            return this.pssSize;
        }

        public final long getTimeStamp() {
            return this.timeStamp;
        }

        public final void setPssSize(long j11) {
            this.pssSize = j11;
        }

        public final void setTimeStamp(long j11) {
            this.timeStamp = j11;
        }
    }

    @JvmStatic
    @NotNull
    public static final String getAppName(@Nullable Context context) {
        return INSTANCE.getAppName(context);
    }

    @JvmStatic
    public static final long getPssMemory() {
        return INSTANCE.getPssMemory();
    }

    @JvmStatic
    public static final boolean isApkInDebug(@NotNull Context context) {
        return INSTANCE.isApkInDebug(context);
    }

    @JvmStatic
    @NotNull
    public static final String obtainProcessName(@Nullable Context context) {
        return INSTANCE.obtainProcessName(context);
    }

    @JvmStatic
    @NotNull
    public static final String obtainProcessPackageName(@Nullable Context context) {
        return INSTANCE.obtainProcessPackageName(context);
    }
}
