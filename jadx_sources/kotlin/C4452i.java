package kotlin;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.StatFs;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.bugly.proguard.C33557b4;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: b1.i */
/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes34.dex */
@p852kotlin.Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m90084d2 = {"Lb1/i;", "", "<init>", "()V", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "config", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(IILandroid/graphics/Bitmap$Config;)I", "Landroid/content/Context;", "context", "Ljava/io/File;", "g", "(Landroid/content/Context;)Ljava/io/File;", "cacheDirectory", "", "c", "(Ljava/io/File;)J", "", "percentage", "b", "(Landroid/content/Context;D)J", "e", "(Landroid/content/Context;)D", "f", "()D", "d", "()Landroid/graphics/Bitmap$Config;", "DEFAULT_BITMAP_CONFIG", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class C4452i {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4452i f3855a = new C4452i();

    /* JADX INFO: renamed from: a */
    public final int m4242a(@Px int width, @Px int height, @Nullable Bitmap.Config config) {
        return width * height * C4444a.m4232b(config);
    }

    /* JADX INFO: renamed from: b */
    public final long m4243b(@NotNull Context context, double percentage) {
        int largeMemoryClass;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            if (systemService != null) {
                ActivityManager activityManager = (ActivityManager) systemService;
                largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                double d11 = 1024;
                return (long) (percentage * ((double) largeMemoryClass) * d11 * d11);
            }
            throw new IllegalStateException(("System service of type " + ActivityManager.class + " was not found.").toString());
        } catch (Exception unused) {
            largeMemoryClass = 256;
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m4244c(@NotNull File cacheDirectory) {
        Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
        try {
            StatFs statFs = new StatFs(cacheDirectory.getAbsolutePath());
            return RangesKt.coerceIn((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), C33557b4.f69134v, 262144000L);
        } catch (Exception unused) {
            return C33557b4.f69134v;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Bitmap.Config m4245d() {
        return Build.VERSION.SDK_INT >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    /* JADX INFO: renamed from: e */
    public final double m4246e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            if (systemService != null) {
                return ((ActivityManager) systemService).isLowRamDevice() ? 0.15d : 0.2d;
            }
            throw new IllegalStateException(("System service of type " + ActivityManager.class + " was not found.").toString());
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    /* JADX INFO: renamed from: f */
    public final double m4247f() {
        return 0.0d;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final File m4248g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(context.getCacheDir(), "image_cache");
        file.mkdirs();
        return file;
    }
}
