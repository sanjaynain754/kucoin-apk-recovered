package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.ReplaceWith;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes23.dex */
public final class BitmapCompat {

    @RequiresApi(27)
    public static class Api27Impl {
        public static boolean isAlreadyF16AndLinear(Bitmap bitmap) {
            return bitmap.getConfig() == Bitmap.Config.RGBA_F16 && bitmap.getColorSpace().equals(ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB));
        }

        private Api27Impl() {
        }

        public static Bitmap copyBitmapIfHardware(Bitmap bitmap) {
            if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                Bitmap.Config hardwareBitmapConfig = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    hardwareBitmapConfig = Api31Impl.getHardwareBitmapConfig(bitmap);
                }
                return bitmap.copy(hardwareBitmapConfig, true);
            }
            return bitmap;
        }

        public static Bitmap createBitmapWithSourceColorspace(int i11, int i12, Bitmap bitmap, boolean z11) {
            Bitmap.Config config = bitmap.getConfig();
            ColorSpace colorSpace = bitmap.getColorSpace();
            ColorSpace colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (z11 && !bitmap.getColorSpace().equals(colorSpace2)) {
                config = Bitmap.Config.RGBA_F16;
                colorSpace = colorSpace2;
            } else if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = Api31Impl.getHardwareBitmapConfig(bitmap);
                }
            }
            return Bitmap.createBitmap(i11, i12, config, bitmap.hasAlpha(), colorSpace);
        }
    }

    @RequiresApi(29)
    public static class Api29Impl {
        public static void setPaintBlendMode(Paint paint) {
            paint.setBlendMode(BlendMode.SRC);
        }

        private Api29Impl() {
        }
    }

    @NonNull
    public static Bitmap createScaledBitmap(@NonNull Bitmap bitmap, int i11, int i12, @Nullable Rect rect, boolean z11) {
        Bitmap bitmapCreateBitmap;
        int i13;
        int i14;
        boolean z12;
        char c11;
        if (i11 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException("dstW and dstH must be > 0!");
        }
        if (rect != null && (rect.isEmpty() || rect.left < 0 || rect.right > bitmap.getWidth() || rect.top < 0 || rect.bottom > bitmap.getHeight())) {
            throw new IllegalArgumentException("srcRect must be contained by srcBm!");
        }
        int i15 = Build.VERSION.SDK_INT;
        Bitmap bitmapCopyBitmapIfHardware = i15 >= 27 ? Api27Impl.copyBitmapIfHardware(bitmap) : bitmap;
        int iWidth = rect != null ? rect.width() : bitmap.getWidth();
        int iHeight = rect != null ? rect.height() : bitmap.getHeight();
        float f11 = i11 / iWidth;
        float f12 = i12 / iHeight;
        int i16 = rect != null ? rect.left : 0;
        int i17 = rect != null ? rect.top : 0;
        if (i16 == 0 && i17 == 0 && i11 == bitmap.getWidth() && i12 == bitmap.getHeight()) {
            return (bitmap.isMutable() && bitmap == bitmapCopyBitmapIfHardware) ? bitmap.copy(bitmap.getConfig(), true) : bitmapCopyBitmapIfHardware;
        }
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        if (i15 >= 29) {
            Api29Impl.setPaintBlendMode(paint);
        } else {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        }
        if (iWidth == i11 && iHeight == i12) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i11, i12, bitmapCopyBitmapIfHardware.getConfig());
            new Canvas(bitmapCreateBitmap2).drawBitmap(bitmapCopyBitmapIfHardware, -i16, -i17, paint);
            return bitmapCreateBitmap2;
        }
        double dLog = Math.log(2.0d);
        int iCeil = (int) (f11 > 1.0f ? Math.ceil(Math.log(f11) / dLog) : Math.floor(Math.log(f11) / dLog));
        int iCeil2 = (int) (f12 > 1065353216 ? Math.ceil(Math.log(f12) / dLog) : Math.floor(Math.log(f12) / dLog));
        if (!z11 || i15 < 27 || Api27Impl.isAlreadyF16AndLinear(bitmap)) {
            bitmapCreateBitmap = null;
            i13 = i16;
            i14 = 0;
        } else {
            Bitmap bitmapCreateBitmapWithSourceColorspace = Api27Impl.createBitmapWithSourceColorspace(iCeil > 0 ? sizeAtStep(iWidth, i11, 1, iCeil) : iWidth, iCeil2 > 0 ? sizeAtStep(iHeight, i12, 1, iCeil2) : iHeight, bitmap, true);
            new Canvas(bitmapCreateBitmapWithSourceColorspace).drawBitmap(bitmapCopyBitmapIfHardware, -i16, -i17, paint);
            Bitmap bitmap2 = bitmapCopyBitmapIfHardware;
            bitmapCopyBitmapIfHardware = bitmapCreateBitmapWithSourceColorspace;
            bitmapCreateBitmap = bitmap2;
            i14 = 1;
            i17 = 0;
            i13 = 0;
        }
        Rect rect2 = new Rect(i13, i17, iWidth, iHeight);
        Rect rect3 = new Rect();
        int i18 = iCeil;
        int i19 = iCeil2;
        while (true) {
            if (i18 == 0 && i19 == 0) {
                break;
            }
            if (i18 < 0) {
                i18++;
            } else if (i18 > 0) {
                i18--;
            }
            if (i19 < 0) {
                i19++;
            } else if (i19 > 0) {
                i19--;
            }
            int i21 = i19;
            int i22 = i14;
            int i23 = i18;
            rect3.set(0, 0, sizeAtStep(iWidth, i11, i18, iCeil), sizeAtStep(iHeight, i12, i21, iCeil2));
            boolean z13 = i23 == 0 && i21 == 0;
            boolean z14 = bitmapCreateBitmap != null && bitmapCreateBitmap.getWidth() == i11 && bitmapCreateBitmap.getHeight() == i12;
            if (bitmapCreateBitmap == null || bitmapCreateBitmap == bitmap) {
                z12 = z13;
            } else {
                if (z11) {
                    z12 = z13;
                    if (Build.VERSION.SDK_INT < 27 || Api27Impl.isAlreadyF16AndLinear(bitmapCreateBitmap)) {
                    }
                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapCopyBitmapIfHardware, rect2, rect3, paint);
                    rect2.set(rect3);
                    Bitmap bitmap3 = bitmapCopyBitmapIfHardware;
                    bitmapCopyBitmapIfHardware = bitmapCreateBitmap;
                    bitmapCreateBitmap = bitmap3;
                    i19 = i21;
                    i14 = i22;
                    i18 = i23;
                } else {
                    z12 = z13;
                }
                if (!z12 || (z14 && i22 == 0)) {
                    c11 = 27;
                }
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapCopyBitmapIfHardware, rect2, rect3, paint);
                rect2.set(rect3);
                Bitmap bitmap4 = bitmapCopyBitmapIfHardware;
                bitmapCopyBitmapIfHardware = bitmapCreateBitmap;
                bitmapCreateBitmap = bitmap4;
                i19 = i21;
                i14 = i22;
                i18 = i23;
            }
            if (bitmapCreateBitmap != bitmap && bitmapCreateBitmap != null) {
                bitmapCreateBitmap.recycle();
            }
            int iSizeAtStep = sizeAtStep(iWidth, i11, i23 > 0 ? i22 : i23, iCeil);
            int iSizeAtStep2 = sizeAtStep(iHeight, i12, i21 > 0 ? i22 : i21, iCeil2);
            c11 = 27;
            if (Build.VERSION.SDK_INT >= 27) {
                bitmapCreateBitmap = Api27Impl.createBitmapWithSourceColorspace(iSizeAtStep, iSizeAtStep2, bitmap, z11 && !z12);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(iSizeAtStep, iSizeAtStep2, bitmapCopyBitmapIfHardware.getConfig());
            }
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapCopyBitmapIfHardware, rect2, rect3, paint);
            rect2.set(rect3);
            Bitmap bitmap5 = bitmapCopyBitmapIfHardware;
            bitmapCopyBitmapIfHardware = bitmapCreateBitmap;
            bitmapCreateBitmap = bitmap5;
            i19 = i21;
            i14 = i22;
            i18 = i23;
        }
        if (bitmapCreateBitmap != bitmap && bitmapCreateBitmap != null) {
            bitmapCreateBitmap.recycle();
        }
        return bitmapCopyBitmapIfHardware;
    }

    @RequiresApi(31)
    public static class Api31Impl {
        private Api31Impl() {
        }

        public static Bitmap.Config getHardwareBitmapConfig(Bitmap bitmap) {
            if (bitmap.getHardwareBuffer().getFormat() == 22) {
                return Bitmap.Config.RGBA_F16;
            }
            return Bitmap.Config.ARGB_8888;
        }
    }

    @VisibleForTesting
    public static int sizeAtStep(int i11, int i12, int i13, int i14) {
        if (i13 == 0) {
            return i12;
        }
        return i13 > 0 ? i11 * (1 << (i14 - i13)) : i12 << ((-i13) - 1);
    }

    private BitmapCompat() {
    }

    @ReplaceWith(expression = "bitmap.getAllocationByteCount()")
    @Deprecated
    public static int getAllocationByteCount(@NonNull Bitmap bitmap) {
        return bitmap.getAllocationByteCount();
    }

    @ReplaceWith(expression = "bitmap.hasMipMap()")
    @Deprecated
    public static boolean hasMipMap(@NonNull Bitmap bitmap) {
        return bitmap.hasMipMap();
    }

    @ReplaceWith(expression = "bitmap.setHasMipMap(hasMipMap)")
    @Deprecated
    public static void setHasMipMap(@NonNull Bitmap bitmap, boolean z11) {
        bitmap.setHasMipMap(z11);
    }
}
