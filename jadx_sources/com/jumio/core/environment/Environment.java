package com.jumio.core.environment;

import android.content.Context;
import android.os.Build;
import com.jumio.core.util.SplitUtil;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u0007J\u0018\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u0007J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m90084d2 = {"Lcom/jumio/core/environment/Environment;", "", "<init>", "()V", "DATA_DIRECTORY", "", "CPU_INFO_LIB_IS_LOADED", "", "ALE_LIB_IS_LOADED", "TENSORFLOW_LIB_IS_LOADED", "DA_CLIENT_LIB_IS_LOADED", "BUILD_VERSION", "BUILD_NUMBER", "ALE_VERSION", "androidSdkVersion", "", "getAndroidSdkVersion", "()I", "getDataDirectory", "Ljava/io/File;", "context", "Landroid/content/Context;", "loadCpuInfoLib", "loadAleLib", "loadTensorflow", "force", "loadDaClientLib", "safeLoadLibrary", "libname", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class Environment {

    @NotNull
    public static final String ALE_VERSION = "1.13.0";

    @NotNull
    public static final String BUILD_NUMBER = "0-1";

    @NotNull
    public static final String BUILD_VERSION = "4.17.0 (1)";

    @NotNull
    public static final Environment INSTANCE = new Environment();

    /* JADX INFO: renamed from: a */
    public static boolean f13835a;

    /* JADX INFO: renamed from: b */
    public static boolean f13836b;

    /* JADX INFO: renamed from: c */
    public static boolean f13837c;

    /* JADX INFO: renamed from: d */
    public static boolean f13838d;

    public final synchronized boolean loadAleLib(@NotNull Context context) {
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (!f13836b) {
                f13836b = m14528a(context, "aleInterface");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f13836b;
    }

    public final synchronized boolean loadCpuInfoLib(@NotNull Context context) {
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (!f13835a) {
                f13835a = m14528a(context, "cpuinfo");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f13835a;
    }

    public final synchronized boolean loadDaClientLib(@NotNull Context context, boolean force) {
        Intrinsics.checkNotNullParameter(context, "context");
        loadTensorflow(context, force);
        if (!f13838d || force) {
            f13838d = m14528a(context, "jumio_daclient");
        }
        return f13838d;
    }

    public final synchronized boolean loadTensorflow(@NotNull Context context, boolean force) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!f13837c || force) {
            f13837c = m14528a(context, "tensorflowlite_jni");
        }
        return f13837c;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m14528a(Context context, String str) {
        try {
            SplitUtil splitUtil = SplitUtil.INSTANCE;
            if (splitUtil.getHasSplitCompat()) {
                splitUtil.loadLibrary(context, str);
                return true;
            }
            System.loadLibrary(str);
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean loadDaClientLib$default(Environment environment, Context context, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return environment.loadDaClientLib(context, z11);
    }

    public static /* synthetic */ boolean loadTensorflow$default(Environment environment, Context context, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return environment.loadTensorflow(context, z11);
    }

    public final int getAndroidSdkVersion() {
        return Build.VERSION.SDK_INT;
    }

    @NotNull
    public final File getDataDirectory(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(context.getFilesDir(), "/jumio/");
        if (file.isDirectory()) {
            file.mkdirs();
        }
        return file;
    }
}
