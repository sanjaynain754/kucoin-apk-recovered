package com.tencent.rmonitor.common.util;

import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.common.logger.Logger;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0002¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\tH\u0002J\u001f\u0010\u000e\u001a\u00020\t2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004¢\u0006\u0002\u0010\fJ\u0006\u0010\u000f\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/tencent/rmonitor/common/util/FreeReflection;", "", "()V", "TAG", "", "setHiddenApiExemptions", "Ljava/lang/reflect/Method;", "vmRuntime", "exempt", "", "methods", "", "([Ljava/lang/String;)Z", "exemptAll", "unseal", "unsealAll", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class FreeReflection {

    @NotNull
    public static final FreeReflection INSTANCE = new FreeReflection();

    @NotNull
    private static final String TAG = "RMonitor_common_FreeReflection";

    @Nullable
    private static Method setHiddenApiExemptions;

    @Nullable
    private static Object vmRuntime;

    static {
        if (AndroidVersion.INSTANCE.isOverP()) {
            try {
                Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
                Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                Object objInvoke = declaredMethod.invoke(null, "dalvik.system.VMRuntime");
                Class cls = objInvoke instanceof Class ? (Class) objInvoke : null;
                Object objInvoke2 = declaredMethod2.invoke(cls, "getRuntime", null);
                Method method = objInvoke2 instanceof Method ? (Method) objInvoke2 : null;
                vmRuntime = method != null ? method.invoke(null, new Object[0]) : null;
                Object objInvoke3 = declaredMethod2.invoke(cls, "setHiddenApiExemptions", new Class[]{String[].class});
                setHiddenApiExemptions = objInvoke3 instanceof Method ? (Method) objInvoke3 : null;
            } catch (Throwable th2) {
                Logger.INSTANCE.mo77131e(TAG, "reflect bootstrap failed:", th2.toString());
            }
        }
    }

    private final boolean exempt(String... methods) {
        Object obj = vmRuntime;
        if (obj == null) {
            return false;
        }
        try {
            Method method = setHiddenApiExemptions;
            if (method == null) {
                return false;
            }
            method.invoke(obj, Arrays.copyOf(methods, methods.length));
            return true;
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77134w(TAG, th2.toString());
            return false;
        }
    }

    private final boolean exemptAll() {
        return exempt("L");
    }

    public final boolean unseal(@NotNull String... methods) {
        Intrinsics.checkNotNullParameter(methods, "methods");
        if (AndroidVersion.INSTANCE.isOverP()) {
            return exempt((String[]) Arrays.copyOf(methods, methods.length));
        }
        return true;
    }

    public final boolean unsealAll() {
        if (AndroidVersion.INSTANCE.isOverP()) {
            return exemptAll();
        }
        return true;
    }

    private FreeReflection() {
    }
}
