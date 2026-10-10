package p223e6;

import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p422l5.C42054a;
import p747x3.C45999a;
import p749x5.C46075i;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: e6.a */
/* JADX INFO: compiled from: DownsampleUtil.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m90084d2 = {"Le6/a;", "", "<init>", "()V", "Lcom/facebook/imagepipeline/common/RotationOptions;", "rotationOptions", "Lcom/facebook/imagepipeline/common/ResizeOptions;", "resizeOptions", "Lx5/i;", "encodedImage", "", "maxBitmapDimension", "b", "(Lcom/facebook/imagepipeline/common/RotationOptions;Lcom/facebook/imagepipeline/common/ResizeOptions;Lx5/i;I)I", "pixelSize", "maxBitmapSizeInBytes", "c", "(Lx5/i;II)I", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/imagepipeline/common/RotationOptions;Lcom/facebook/imagepipeline/common/ResizeOptions;Lx5/i;)F", "ratio", "e", "(F)I", "f", "d", "(Lcom/facebook/imagepipeline/common/RotationOptions;Lx5/i;)I", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C37076a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37076a f82338a = new C37076a();

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final int m82985c(@NotNull C46075i encodedImage, int pixelSize, int maxBitmapSizeInBytes) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        int iM101581p = encodedImage.m101581p();
        while ((((encodedImage.getWidth() * encodedImage.getHeight()) * pixelSize) / iM101581p) / iM101581p > maxBitmapSizeInBytes) {
            iM101581p *= 2;
        }
        return iM101581p;
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static final float m82983a(@NotNull RotationOptions rotationOptions, @Nullable ResizeOptions resizeOptions, @NotNull C46075i encodedImage) {
        boolean z11;
        int width;
        int height;
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (C46075i.m101557z(encodedImage)) {
            if (resizeOptions != null && resizeOptions.height > 0 && resizeOptions.width > 0 && encodedImage.getWidth() != 0 && encodedImage.getHeight() != 0) {
                int iM82988d = f82338a.m82988d(rotationOptions, encodedImage);
                if (iM82988d != 90 && iM82988d != 270) {
                    z11 = false;
                } else {
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
                float f11 = resizeOptions.width / width;
                float f12 = resizeOptions.height / height;
                float fCoerceAtLeast = RangesKt.coerceAtLeast(f11, f12);
                C45999a.m101483D("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(resizeOptions.width), Integer.valueOf(resizeOptions.height), Integer.valueOf(width), Integer.valueOf(height), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(fCoerceAtLeast));
                return fCoerceAtLeast;
            }
            return 1.0f;
        }
        throw new IllegalStateException("Check failed.");
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final int m82984b(@NotNull RotationOptions rotationOptions, @Nullable ResizeOptions resizeOptions, @NotNull C46075i encodedImage, int maxBitmapDimension) {
        int iM82986e;
        float f11;
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!C46075i.m101557z(encodedImage)) {
            return 1;
        }
        float fM82983a = m82983a(rotationOptions, resizeOptions, encodedImage);
        if (encodedImage.m101578m() == C42054a.com.jumio.core.constants.ConstantsKt.FILE_TYPE_JPEG java.lang.String) {
            iM82986e = m82987f(fM82983a);
        } else {
            iM82986e = m82986e(fM82983a);
        }
        int iMax = Math.max(encodedImage.getHeight(), encodedImage.getWidth());
        if (resizeOptions != null) {
            f11 = resizeOptions.maxBitmapDimension;
        } else {
            f11 = maxBitmapDimension;
        }
        while (iMax / iM82986e > f11) {
            if (encodedImage.m101578m() == C42054a.com.jumio.core.constants.ConstantsKt.FILE_TYPE_JPEG java.lang.String) {
                iM82986e *= 2;
            } else {
                iM82986e++;
            }
        }
        return iM82986e;
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public static final int m82986e(float ratio) {
        if (ratio > 0.6666667f) {
            return 1;
        }
        int i11 = 2;
        while (true) {
            double d11 = i11;
            if ((1.0d / d11) + ((1.0d / (Math.pow(d11, 2.0d) - d11)) * ((double) 0.33333334f)) <= ratio) {
                return i11 - 1;
            }
            i11++;
        }
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public static final int m82987f(float ratio) {
        if (ratio > 0.6666667f) {
            return 1;
        }
        int i11 = 2;
        while (true) {
            int i12 = i11 * 2;
            double d11 = 1.0d / ((double) i12);
            if (d11 + (((double) 0.33333334f) * d11) <= ratio) {
                return i11;
            }
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m82988d(RotationOptions rotationOptions, C46075i encodedImage) {
        if (!rotationOptions.m9196j()) {
            return 0;
        }
        int iM101559F = encodedImage.m101559F();
        if (iM101559F != 0 && iM101559F != 90 && iM101559F != 180 && iM101559F != 270) {
            throw new IllegalStateException("Check failed.");
        }
        return iM101559F;
    }
}
