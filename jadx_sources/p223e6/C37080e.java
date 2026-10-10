package p223e6;

import android.graphics.Matrix;
import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.common.internal.ImmutableList;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p749x5.C46075i;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: e6.e */
/* JADX INFO: compiled from: JpegTranscoderUtils.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ1\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0015J)\u0010\u001a\u001a\u00020\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040+8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010,¨\u0006."}, m90084d2 = {"Le6/e;", "", "<init>", "()V", "", "degrees", "", "j", "(I)Z", "exifOrientation", "i", "Lcom/facebook/imagepipeline/common/RotationOptions;", "rotationOptions", "Lcom/facebook/imagepipeline/common/ResizeOptions;", "resizeOptions", "Lx5/i;", "encodedImage", "resizingEnabled", "f", "(Lcom/facebook/imagepipeline/common/RotationOptions;Lcom/facebook/imagepipeline/common/ResizeOptions;Lx5/i;Z)I", "e", "(Lcom/facebook/imagepipeline/common/RotationOptions;Lx5/i;)I", "d", "width", "height", "", "b", "(Lcom/facebook/imagepipeline/common/ResizeOptions;II)F", "maxRatio", "roundUpFraction", "k", "(FF)I", "downsampleRatio", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)I", "Landroid/graphics/Matrix;", "g", "(Lx5/i;Lcom/facebook/imagepipeline/common/RotationOptions;)Landroid/graphics/Matrix;", "orientation", CmcdData.Factory.STREAMING_FORMAT_HLS, "(I)Landroid/graphics/Matrix;", "c", "(Lx5/i;)I", "Lcom/facebook/common/internal/ImmutableList;", "Lcom/facebook/common/internal/ImmutableList;", "INVERTED_EXIF_ORIENTATIONS", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJpegTranscoderUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JpegTranscoderUtils.kt\ncom/facebook/imagepipeline/transcoder/JpegTranscoderUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n1#2:234\n*E\n"})
public final class C37080e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37080e f82340a = new C37080e();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final ImmutableList<Integer> INVERTED_EXIF_ORIENTATIONS;

    static {
        ImmutableList<Integer> immutableListM8531of = ImmutableList.m8531of((Object[]) new Integer[]{2, 7, 4, 5});
        Intrinsics.checkNotNullExpressionValue(immutableListM8531of, "of(...)");
        INVERTED_EXIF_ORIENTATIONS = immutableListM8531of;
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static final int m82990a(int downsampleRatio) {
        return Math.max(1, 8 / downsampleRatio);
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public static final float m82991b(@Nullable ResizeOptions resizeOptions, int width, int height) {
        if (resizeOptions == null) {
            return 1.0f;
        }
        float f11 = width;
        float f12 = height;
        float fMax = Math.max(resizeOptions.width / f11, resizeOptions.height / f12);
        float f13 = f11 * fMax;
        float f14 = resizeOptions.maxBitmapDimension;
        if (f13 > f14) {
            fMax = f14 / f11;
        }
        return f12 * fMax > f14 ? f14 / f12 : fMax;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: g */
    public static final Matrix m82995g(@NotNull C46075i encodedImage, @NotNull RotationOptions rotationOptions) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        if (INVERTED_EXIF_ORIENTATIONS.contains(Integer.valueOf(encodedImage.m101583t()))) {
            return f82340a.m83000h(m82992d(rotationOptions, encodedImage));
        }
        int iM82993e = m82993e(rotationOptions, encodedImage);
        if (iM82993e == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(iM82993e);
        return matrix;
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final boolean m82997j(int degrees) {
        return degrees >= 0 && degrees <= 270 && degrees % 90 == 0;
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: k */
    public static final int m82998k(float maxRatio, float roundUpFraction) {
        return (int) (roundUpFraction + (maxRatio * 8));
    }

    /* JADX INFO: renamed from: h */
    public final Matrix m83000h(int orientation) {
        Matrix matrix = new Matrix();
        if (orientation == 2) {
            matrix.setScale(-1.0f, 1.0f);
            return matrix;
        }
        if (orientation == 7) {
            matrix.setRotate(-90.0f);
            matrix.postScale(-1.0f, 1.0f);
            return matrix;
        }
        if (orientation == 4) {
            matrix.setRotate(180.0f);
            matrix.postScale(-1.0f, 1.0f);
            return matrix;
        }
        if (orientation != 5) {
            return null;
        }
        matrix.setRotate(90.0f);
        matrix.postScale(-1.0f, 1.0f);
        return matrix;
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final int m82992d(@NotNull RotationOptions rotationOptions, @NotNull C46075i encodedImage) {
        int iM9194h;
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        int iM101583t = encodedImage.m101583t();
        ImmutableList<Integer> immutableList = INVERTED_EXIF_ORIENTATIONS;
        int iIndexOf = immutableList.indexOf(Integer.valueOf(iM101583t));
        if (iIndexOf >= 0) {
            if (!rotationOptions.m9196j()) {
                iM9194h = rotationOptions.m9194h();
            } else {
                iM9194h = 0;
            }
            Integer num = immutableList.get((iIndexOf + (iM9194h / 90)) % immutableList.size());
            Intrinsics.checkNotNullExpressionValue(num, "get(...)");
            return num.intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations");
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final int m82993e(@NotNull RotationOptions rotationOptions, @NotNull C46075i encodedImage) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!rotationOptions.m9195i()) {
            return 0;
        }
        int iM82999c = f82340a.m82999c(encodedImage);
        if (rotationOptions.m9196j()) {
            return iM82999c;
        }
        return (iM82999c + rotationOptions.m9194h()) % TXVodDownloadDataSource.QUALITY_360P;
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final int m82994f(@NotNull RotationOptions rotationOptions, @Nullable ResizeOptions resizeOptions, @NotNull C46075i encodedImage, boolean resizingEnabled) {
        int iM82992d;
        int width;
        int height;
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!resizingEnabled || resizeOptions == null) {
            return 8;
        }
        int iM82993e = m82993e(rotationOptions, encodedImage);
        boolean z11 = false;
        if (INVERTED_EXIF_ORIENTATIONS.contains(Integer.valueOf(encodedImage.m101583t()))) {
            iM82992d = m82992d(rotationOptions, encodedImage);
        } else {
            iM82992d = 0;
        }
        if (iM82993e == 90 || iM82993e == 270 || iM82992d == 5 || iM82992d == 7) {
            z11 = true;
        }
        if (z11) {
            width = encodedImage.getHeight();
        } else {
            width = encodedImage.getWidth();
        }
        if (z11) {
            height = encodedImage.getWidth();
        } else {
            height = encodedImage.getHeight();
        }
        int iM82998k = m82998k(m82991b(resizeOptions, width, height), resizeOptions.roundUpFraction);
        if (iM82998k > 8) {
            return 8;
        }
        if (iM82998k < 1) {
            return 1;
        }
        return iM82998k;
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final boolean m82996i(int exifOrientation) {
        switch (exifOrientation) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m82999c(C46075i encodedImage) {
        int iM101559F = encodedImage.m101559F();
        if (iM101559F != 90 && iM101559F != 180 && iM101559F != 270) {
            return 0;
        }
        return encodedImage.m101559F();
    }
}
