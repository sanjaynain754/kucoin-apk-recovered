package com.jumio.android.renderscript;

import android.graphics.Bitmap;
import com.tencent.bugly.proguard.C33978va;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Toolkit.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00004\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\u001a\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u001a\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a$\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0000\u001a,\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0000\u001a\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"externalName", "", "validateBitmap", "", "function", "inputBitmap", "Landroid/graphics/Bitmap;", "alphaAllowed", "", "createCompatibleBitmap", "validateHistogramDotCoefficients", "coefficients", "", "vectorSize", "", "validateRestriction", "tag", "bitmap", "restriction", "Lcom/jumio/android/renderscript/Range2d;", "sizeX", "sizeY", "paddedSize", "jumio-toolkit_release"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class ToolkitKt {

    @NotNull
    private static final String externalName = "RenderScript Toolkit";

    public static final int paddedSize(int i11) {
        if (i11 == 3) {
            return 4;
        }
        return i11;
    }

    public static final void validateRestriction(@NotNull String tag, @NotNull Bitmap bitmap, @Nullable Range2d range2d) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        validateRestriction(tag, bitmap.getWidth(), bitmap.getHeight(), range2d);
    }

    public static /* synthetic */ void validateRestriction$default(String str, Bitmap bitmap, Range2d range2d, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            range2d = null;
        }
        validateRestriction(str, bitmap, range2d);
    }

    /* JADX INFO: compiled from: Toolkit.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final Bitmap createCompatibleBitmap(@NotNull Bitmap inputBitmap) {
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        int width = inputBitmap.getWidth();
        int height = inputBitmap.getHeight();
        Bitmap.Config config = inputBitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    public static final void validateBitmap(@NotNull String function, @NotNull Bitmap inputBitmap, boolean z11) {
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(inputBitmap, "inputBitmap");
        if (z11) {
            if (inputBitmap.getConfig() != Bitmap.Config.ARGB_8888 && inputBitmap.getConfig() != Bitmap.Config.ALPHA_8) {
                throw new IllegalArgumentException(("RenderScript Toolkit. " + function + " supports only ARGB_8888 and ALPHA_8 bitmaps. " + inputBitmap.getConfig() + " provided.").toString());
            }
        } else if (inputBitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new IllegalArgumentException(("RenderScript Toolkit. " + function + " supports only ARGB_8888. " + inputBitmap.getConfig() + " provided.").toString());
        }
        if (inputBitmap.getWidth() * vectorSize(inputBitmap) == inputBitmap.getRowBytes()) {
            return;
        }
        throw new IllegalArgumentException(("RenderScript Toolkit " + function + ". Only bitmaps with rowSize equal to the width * vectorSize are currently supported. Provided were rowBytes=" + inputBitmap.getRowBytes() + ", width={" + inputBitmap.getWidth() + ", and vectorSize=" + vectorSize(inputBitmap) + C33978va.f72339h).toString());
    }

    public static /* synthetic */ void validateBitmap$default(String str, Bitmap bitmap, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        validateBitmap(str, bitmap, z11);
    }

    public static final void validateHistogramDotCoefficients(@Nullable float[] fArr, int i11) {
        if (fArr != null && fArr.length != i11) {
            throw new IllegalArgumentException(("RenderScript Toolkit histogramDot. The coefficients should be null or have " + i11 + " values.").toString());
        }
        if (fArr != null) {
            float f11 = 0.0f;
            for (int i12 = 0; i12 < i11; i12++) {
                float f12 = fArr[i12];
                if (f12 < 0.0f) {
                    throw new IllegalArgumentException(("RenderScript Toolkit histogramDot. Coefficients should not be negative. Coefficient " + i12 + " was " + f12 + C33978va.f72339h).toString());
                }
                f11 += f12;
            }
            if (f11 <= 1.0f) {
                return;
            }
            throw new IllegalArgumentException(("RenderScript Toolkit histogramDot. Coefficients should add to 1 or less. Their sum is " + f11 + C33978va.f72339h).toString());
        }
    }

    public static final void validateRestriction(@NotNull String tag, int i11, int i12, @Nullable Range2d range2d) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (range2d == null) {
            return;
        }
        if (range2d.getStartX() >= i11 || range2d.getEndX() > i11) {
            throw new IllegalArgumentException(("RenderScript Toolkit " + tag + ". sizeX should be greater than restriction.startX and greater or equal to restriction.endX. " + i11 + ", " + range2d.getStartX() + ", and " + range2d.getEndX() + " were provided respectively.").toString());
        }
        if (range2d.getStartY() >= i12 || range2d.getEndY() > i12) {
            throw new IllegalArgumentException(("RenderScript Toolkit " + tag + ". sizeY should be greater than restriction.startY and greater or equal to restriction.endY. " + i12 + ", " + range2d.getStartY() + ", and " + range2d.getEndY() + " were provided respectively.").toString());
        }
        if (range2d.getStartX() >= range2d.getEndX()) {
            throw new IllegalArgumentException(("RenderScript Toolkit " + tag + ". Restriction startX should be less than endX. " + range2d.getStartX() + " and " + range2d.getEndX() + " were provided respectively.").toString());
        }
        if (range2d.getStartY() < range2d.getEndY()) {
            return;
        }
        throw new IllegalArgumentException(("RenderScript Toolkit " + tag + ". Restriction startY should be less than endY. " + range2d.getStartY() + " and " + range2d.getEndY() + " were provided respectively.").toString());
    }

    public static /* synthetic */ void validateRestriction$default(String str, int i11, int i12, Range2d range2d, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            range2d = null;
        }
        validateRestriction(str, i11, i12, range2d);
    }

    public static final int vectorSize(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Bitmap.Config config = bitmap.getConfig();
        int i11 = config == null ? -1 : WhenMappings.$EnumSwitchMapping$0[config.ordinal()];
        if (i11 == 1) {
            return 4;
        }
        if (i11 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("RenderScript Toolkit. Only ARGB_8888 and ALPHA_8 Bitmap are supported.");
    }
}
