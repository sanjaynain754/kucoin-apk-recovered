package com.tencent.bugly.common.utils;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.bugly.proguard.C33799mf;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.FileReader;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"Lcom/tencent/bugly/common/utils/ProcessUtil;", "", "()V", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class ProcessUtil {

    @NotNull
    public static final String TAG = "Bugly_ProcessUtil";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static String currProcessName = "";

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\b\u0010\t\u001a\u00020\u0004H\u0003J\b\u0010\n\u001a\u00020\u0004H\u0003J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/tencent/bugly/common/utils/ProcessUtil$Companion;", "", "()V", "TAG", "", "currProcessName", "getCurrentProcessName", "context", "Landroid/content/Context;", "getCurrentProcessNameByActivityThread", "getCurrentProcessNameByApplication", "getProcessNameByCmdLine", C33556b3.f69038e2, "", "getProcessNameByCmdLineInner", "is64BitProcess", "", "isMainProcess", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @SuppressLint({"DiscouragedPrivateApi", "PrivateApi"})
        private final String getCurrentProcessNameByActivityThread() {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, new Object[0]);
                String str = objInvoke instanceof String ? (String) objInvoke : null;
                return str == null ? "" : str;
            } catch (Throwable th2) {
                Logger.INSTANCE.mo77131e(ProcessUtil.TAG, C33799mf.m74131a("getCurrentProcessNameByActivityThread ", th2));
                return "";
            }
        }

        @SuppressLint({"NewApi"})
        private final String getCurrentProcessNameByApplication() {
            if (!AndroidVersion.INSTANCE.isOverP()) {
                return "";
            }
            String processName = Application.getProcessName();
            Intrinsics.checkNotNullExpressionValue(processName, "{\n                Applic…ocessName()\n            }");
            return processName;
        }

        @JvmStatic
        @Nullable
        public final String getProcessNameByCmdLineInner(int pid) {
            FileReader fileReader;
            try {
                fileReader = new FileReader("/proc/" + pid + "/cmdline");
                try {
                    char[] cArr = new char[512];
                    int i11 = fileReader.read(cArr);
                    Logger.INSTANCE.mo77130d(ProcessUtil.TAG, "getProcessNameByCmdLineInner, ret: " + i11);
                    int i12 = 0;
                    while (i12 < 512 && cArr[i12] != 0) {
                        i12++;
                    }
                    String strSubstring = new String(cArr).substring(0, i12);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    try {
                        fileReader.close();
                        return strSubstring;
                    } catch (Throwable unused) {
                        return strSubstring;
                    }
                } catch (Throwable unused2) {
                    if (fileReader == null) {
                        return null;
                    }
                    try {
                        fileReader.close();
                        return null;
                    } catch (Throwable unused3) {
                        return null;
                    }
                }
            } catch (Throwable unused4) {
                fileReader = null;
            }
        }

        @JvmStatic
        @SuppressLint({"NewApi"})
        public final boolean is64BitProcess(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AndroidVersion.Companion companion = AndroidVersion.INSTANCE;
            if (companion.isOverM()) {
                return Process.is64Bit();
            }
            if (companion.isOverIceScreamSandwich()) {
                try {
                    ClassLoader classLoader = context.getClassLoader();
                    Object objInvoke = classLoader.getClass().getMethod("findLibrary", String.class).invoke(classLoader, "skia");
                    if (objInvoke != null) {
                        return StringsKt.contains$default((CharSequence) objInvoke, (CharSequence) "lib64", false, 2, (Object) null);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                } catch (Throwable th2) {
                    Logger.INSTANCE.exception(ProcessUtil.TAG, th2);
                }
            }
            return false;
        }

        @JvmStatic
        public final boolean isMainProcess(@Nullable Context context) {
            return context != null && Intrinsics.areEqual(context.getPackageName(), getCurrentProcessName(context));
        }

        @JvmStatic
        @NotNull
        public final String getCurrentProcessName(@Nullable Context context) {
            if (!TextUtils.isEmpty(ProcessUtil.currProcessName)) {
                return ProcessUtil.currProcessName;
            }
            ProcessUtil.currProcessName = getCurrentProcessNameByApplication();
            if (TextUtils.isEmpty(ProcessUtil.currProcessName)) {
                ProcessUtil.currProcessName = getCurrentProcessNameByActivityThread();
                if (!TextUtils.isEmpty(ProcessUtil.currProcessName)) {
                    Logger.INSTANCE.mo77132i(ProcessUtil.TAG, "getCurrentProcessNameByActivityThread, " + ProcessUtil.currProcessName);
                    return ProcessUtil.currProcessName;
                }
                int iMyPid = Process.myPid();
                ProcessUtil.currProcessName = getProcessNameByCmdLine(iMyPid);
                if (TextUtils.isEmpty(ProcessUtil.currProcessName)) {
                    ProcessUtil.currProcessName = String.valueOf(iMyPid);
                    Logger.INSTANCE.mo77132i(ProcessUtil.TAG, "getProcessNameByPid, " + ProcessUtil.currProcessName);
                    return ProcessUtil.currProcessName;
                }
                Logger.INSTANCE.mo77132i(ProcessUtil.TAG, "getProcessNameByCmdLine, " + ProcessUtil.currProcessName);
                return ProcessUtil.currProcessName;
            }
            Logger.INSTANCE.mo77132i(ProcessUtil.TAG, "getCurrentProcessNameByApplication, " + ProcessUtil.currProcessName);
            return ProcessUtil.currProcessName;
        }

        @JvmStatic
        @NotNull
        public final String getProcessNameByCmdLine(int pid) {
            String processNameByCmdLineInner = getProcessNameByCmdLineInner(pid);
            if (processNameByCmdLineInner != null && processNameByCmdLineInner.length() != 0) {
                return processNameByCmdLineInner;
            }
            return String.valueOf(pid);
        }
    }

    @JvmStatic
    @NotNull
    public static final String getCurrentProcessName(@Nullable Context context) {
        return INSTANCE.getCurrentProcessName(context);
    }

    @JvmStatic
    @NotNull
    public static final String getProcessNameByCmdLine(int i11) {
        return INSTANCE.getProcessNameByCmdLine(i11);
    }

    @JvmStatic
    @Nullable
    public static final String getProcessNameByCmdLineInner(int i11) {
        return INSTANCE.getProcessNameByCmdLineInner(i11);
    }

    @JvmStatic
    @SuppressLint({"NewApi"})
    public static final boolean is64BitProcess(@NotNull Context context) {
        return INSTANCE.is64BitProcess(context);
    }

    @JvmStatic
    public static final boolean isMainProcess(@Nullable Context context) {
        return INSTANCE.isMainProcess(context);
    }
}
