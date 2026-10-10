package p658ub;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.ByteArrayOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ub.b */
/* JADX INFO: compiled from: CommonEx.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"", "d", "(Ljava/lang/String;)Ljava/lang/String;", "", "b", "(Ljava/lang/Boolean;)Z", "", "c", "(Ljava/lang/Long;)J", "Landroid/graphics/Bitmap;", "sizeLimit", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/graphics/Bitmap;Ljava/lang/Long;)[B", "ImSDK_release"}, m90085k = 2, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C45148b {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final byte[] m99791a(@NotNull Bitmap bitmap, @Nullable Long l11) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i11 = 100;
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        while (l11 != null && byteArrayOutputStream.toByteArray().length / 1024 > l11.longValue()) {
            byteArrayOutputStream.reset();
            i11 -= 10;
            if (i11 < 0) {
                i11 = 0;
            }
            bitmap.compress(Bitmap.CompressFormat.JPEG, i11, byteArrayOutputStream);
            if (i11 == 0) {
                break;
            }
        }
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
            System.gc();
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "baos.toByteArray()");
        return byteArray;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m99792b(@Nullable Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public static final long m99793c(@Nullable Long l11) {
        if (l11 == null) {
            return 0L;
        }
        return l11.longValue();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m99794d(@Nullable String str) {
        return str == null ? "" : str;
    }
}
