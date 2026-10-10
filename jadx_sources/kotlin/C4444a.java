package kotlin;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: b1.a */
/* JADX INFO: compiled from: Bitmaps.kt */
/* JADX INFO: loaded from: classes34.dex */
@p852kotlin.Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\" \u0010\u0006\u001a\u00020\u0001*\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\n\u001a\u00020\u0001*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m90084d2 = {"Landroid/graphics/Bitmap$Config;", "", "b", "(Landroid/graphics/Bitmap$Config;)I", "getBytesPerPixel$annotations", "(Landroid/graphics/Bitmap$Config;)V", "bytesPerPixel", "Landroid/graphics/Bitmap;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/graphics/Bitmap;)I", "allocationByteCountCompat", "coil-base_release"}, m90085k = 2, m90086mv = {1, 5, 1}, m90088xi = 48)
@JvmName(name = "-Bitmaps")
public final class C4444a {
    /* JADX INFO: renamed from: a */
    public static final int m4231a(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                return C4452i.f3855a.m4242a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    /* JADX INFO: renamed from: b */
    public static final int m4232b(@Nullable Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
            return 2;
        }
        return (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8;
    }
}
