package com.sumsub.sns.internal.core.common;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.Size;
import androidx.camera.core.ImageProxy;
import com.sumsub.sns.internal.log.AbstractC33293d;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.LoggerType;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.nio.ByteBuffer;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.H */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28396H {
    /* JADX INFO: renamed from: a */
    public static final Object m69280a(final ImageProxy imageProxy, final Function2 function2) {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.core.common.f1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC28396H.m69283b(imageProxy, function2);
            }
        };
        try {
            Result.Companion companion = Result.INSTANCE;
            return Result.m103844constructorimpl(function0.invoke());
        } catch (OutOfMemoryError e11) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a("ImageExtensions", "Caught OutOfMemoryError while converting ImageProxy to Bitmap", null);
            Runtime.getRuntime().gc();
            try {
                Thread.sleep(100L);
                System.runFinalization();
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m103844constructorimpl(ResultKt.createFailure(e11));
            } catch (InterruptedException unused) {
                throw new AssertionError();
            }
        } catch (Throwable th2) {
            C33272c c33272c2 = C33272c.f67812a;
            AbstractC33293d.m71623a("ImageExtensions", "Caught unexpected exception while converting ImageProxy to Bitmap", null);
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Bitmap m69283b(ImageProxy imageProxy, Function2 function2) {
        int rowStride = imageProxy.getPlanes()[0].getRowStride() / 4;
        try {
            Bitmap bitmap = (Bitmap) function2.invoke(Integer.valueOf(rowStride), Integer.valueOf(imageProxy.getHeight()));
            ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
            buffer.rewind();
            bitmap.copyPixelsFromBuffer(buffer);
            return m69282b(bitmap, imageProxy.getImageInfo().getRotationDegrees(), (rowStride <= imageProxy.getWidth() || C33048a.f67450M.m71434a()) ? null : new Size(imageProxy.getWidth(), imageProxy.getHeight()));
        } catch (Throwable th2) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a("ImageExtensions", "Failed to copyPixelsFromBuffer. Reported width: " + imageProxy.getWidth() + ", real width: " + rowStride, null);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Bitmap m69279a(Bitmap bitmap, int i11, Size size) {
        int width;
        Exception exc;
        Bitmap bitmap2;
        Matrix matrix = new Matrix();
        switch (i11) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
        if (size != null) {
            try {
                width = size.getWidth();
            } catch (Exception e11) {
                exc = e11;
                bitmap2 = bitmap;
                C33272c.f67814c.mo68956e("ImageExtensions", "Rotate bitmap", exc);
                return bitmap2;
            }
        } else {
            try {
                width = bitmap.getWidth();
            } catch (Exception e12) {
                e = e12;
                bitmap2 = bitmap;
                exc = e;
                C33272c.f67814c.mo68956e("ImageExtensions", "Rotate bitmap", exc);
                return bitmap2;
            }
        }
        bitmap2 = bitmap;
        try {
            return Bitmap.createBitmap(bitmap2, 0, 0, width, size != null ? size.getHeight() : bitmap.getHeight(), matrix, true);
        } catch (Exception e13) {
            e = e13;
            exc = e;
            C33272c.f67814c.mo68956e("ImageExtensions", "Rotate bitmap", exc);
            return bitmap2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Bitmap m69282b(Bitmap bitmap, int i11, Size size) {
        Bitmap bitmap2;
        Bitmap bitmapM69279a;
        if (i11 == 90) {
            bitmap2 = bitmap;
            bitmapM69279a = m69279a(bitmap2, 6, size);
        } else if (i11 == 180) {
            bitmap2 = bitmap;
            bitmapM69279a = m69279a(bitmap2, 3, size);
        } else if (i11 == 270) {
            bitmap2 = bitmap;
            bitmapM69279a = m69279a(bitmap2, 8, size);
        } else if (size != null) {
            bitmap2 = bitmap;
            bitmapM69279a = Bitmap.createBitmap(bitmap2, 0, 0, size.getWidth(), size.getHeight(), (Matrix) null, true);
        } else {
            bitmap2 = bitmap;
            bitmapM69279a = bitmap2.copy(Bitmap.Config.ARGB_8888, bitmap2.isMutable());
        }
        if (bitmapM69279a != bitmap2) {
            return bitmapM69279a;
        }
        C33272c c33272c = C33272c.f67812a;
        C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})).mo68959w("ImageExtensions", "creating an image copy. Rotated image is same as original", new Exception("creating an image copy. Rotated image is same as original"));
        return bitmapM69279a.copy(Bitmap.Config.ARGB_8888, bitmap2.isMutable());
    }

    /* JADX INFO: renamed from: a */
    public static final void m69281a(Matrix matrix, int i11, int i12, int i13, int i14) {
        matrix.reset();
        boolean z11 = (Math.abs(0) + 90) % 180 == 0;
        int i15 = z11 ? i12 : i11;
        if (!z11) {
            i11 = i12;
        }
        if (i15 == i13 && i11 == i14) {
            return;
        }
        float f11 = i13;
        float f12 = i15;
        float fMax = Math.max(f11 / f12, i14 / i11);
        matrix.postScale(fMax, fMax);
        float f13 = f12 * fMax;
        if (f13 > f11) {
            matrix.postTranslate(((f13 - f11) / 2.0f) * (-1.0f), 0.0f);
        }
    }
}
