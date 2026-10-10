package io.trtc.tuikit.atomicxcore.impl.view.call;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Movie;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import java.io.File;
import java.io.FileInputStream;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.call.B */
/* JADX INFO: loaded from: classes61.dex */
public final class C39983B {

    /* JADX INFO: renamed from: a */
    public final C39510r f88921a;

    /* JADX INFO: renamed from: a */
    public final void m88383a(ImageView imageView, String imagePath) {
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        if (imageView == null) {
            C39510r c39510r = this.f88921a;
            Intrinsics.checkNotNullParameter("ImageView is null", "message");
            c39510r.m88251a(2, "ImageView is null");
            return;
        }
        try {
            if (!StringsKt.startsWith$default(imagePath, "/", false, 2, (Object) null)) {
                C39510r c39510r2 = this.f88921a;
                String message = "image path must be absolute path: " + imagePath;
                Intrinsics.checkNotNullParameter(message, "message");
                c39510r2.m88251a(2, message);
                return;
            }
            File file = new File(imagePath);
            if (file.exists() && file.isFile()) {
                if (!StringsKt.endsWith(imagePath, ".gif", true) && !StringsKt.endsWith(imagePath, ".GIF", true)) {
                    Bitmap bitmapM88381a = m88381a(file);
                    if (bitmapM88381a != null) {
                        imageView.setImageBitmap(bitmapM88381a);
                        return;
                    }
                    C39510r c39510r3 = this.f88921a;
                    String message2 = "Failed to decode bitmap from: " + file.getAbsolutePath();
                    Intrinsics.checkNotNullParameter(message2, "message");
                    c39510r3.m88251a(2, message2);
                    return;
                }
                m88382a(imageView, file);
                return;
            }
            C39510r c39510r4 = this.f88921a;
            String message3 = "image file not found: " + file.getAbsolutePath();
            Intrinsics.checkNotNullParameter(message3, "message");
            c39510r4.m88251a(2, message3);
        } catch (Exception e11) {
            C39510r c39510r5 = this.f88921a;
            String message4 = "Error loading image from: " + imagePath + " e=" + e11.getMessage();
            Intrinsics.checkNotNullParameter(message4, "message");
            c39510r5.m88251a(2, message4);
        }
    }

    public C39983B(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f88921a = AbstractC39398a.m88229a("ImageLoader", "file", "AtomicXCore-Call", "ImageLoader");
    }

    /* JADX INFO: renamed from: a */
    public final void m88382a(ImageView imageView, File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                Movie movieDecodeStream = Movie.decodeStream(fileInputStream);
                CloseableKt.closeFinally(fileInputStream, null);
                if (movieDecodeStream != null && movieDecodeStream.duration() > 0) {
                    imageView.setImageDrawable(new C39982A(movieDecodeStream, imageView));
                    return;
                }
                C39510r c39510r = this.f88921a;
                String message = "Failed to decode GIF or GIF has no duration: " + file.getAbsolutePath();
                Intrinsics.checkNotNullParameter(message, "message");
                c39510r.m88251a(2, message);
                Bitmap bitmapM88381a = m88381a(file);
                if (bitmapM88381a != null) {
                    imageView.setImageBitmap(bitmapM88381a);
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(fileInputStream, th2);
                    throw th3;
                }
            }
        } catch (Exception e11) {
            C39510r c39510r2 = this.f88921a;
            String message2 = "Error loading GIF from: " + file.getAbsolutePath() + " e=" + e11.getMessage();
            Intrinsics.checkNotNullParameter(message2, "message");
            c39510r2.m88251a(2, message2);
            Bitmap bitmapM88381a2 = m88381a(file);
            if (bitmapM88381a2 != null) {
                imageView.setImageBitmap(bitmapM88381a2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m88384a(ImageView imageView, String avatarPath, int i11) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(avatarPath, "avatarPath");
        Bitmap bitmapM88381a = null;
        try {
            if (!StringsKt.startsWith$default(avatarPath, "/", false, 2, (Object) null)) {
                C39510r c39510r = this.f88921a;
                String message = "Avatar path must be absolute path: " + avatarPath;
                Intrinsics.checkNotNullParameter(message, "message");
                c39510r.m88251a(2, message);
                imageView.setColorFilter(-2145245650);
                return;
            }
            if (StringsKt.startsWith$default(avatarPath, "/", false, 2, (Object) null)) {
                File file = new File(avatarPath);
                if (file.exists() && file.isFile()) {
                    bitmapM88381a = m88381a(file);
                }
            }
            if (bitmapM88381a != null) {
                imageView.setImageBitmap(m88380a(bitmapM88381a, i11));
                imageView.setColorFilter(-2145245650, PorterDuff.Mode.OVERLAY);
            } else {
                imageView.setColorFilter(-2145245650);
            }
        } catch (Exception e11) {
            C39510r c39510r2 = this.f88921a;
            String message2 = "Error loading background avatar from: " + avatarPath + " e=" + e11.getMessage();
            Intrinsics.checkNotNullParameter(message2, "message");
            c39510r2.m88251a(2, message2);
            imageView.setColorFilter(-2145245650);
        }
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m88381a(File file) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        } catch (Exception e11) {
            C39510r c39510r = this.f88921a;
            String message = "Error decoding bitmap: " + file.getAbsolutePath() + " e=" + e11.getMessage();
            Intrinsics.checkNotNullParameter(message, "message");
            c39510r.m88251a(2, message);
            return null;
        } catch (OutOfMemoryError unused) {
            C39510r c39510r2 = this.f88921a;
            String message2 = "OutOfMemoryError when decoding bitmap: " + file.getAbsolutePath();
            Intrinsics.checkNotNullParameter(message2, "message");
            c39510r2.m88251a(2, message2);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m88380a(Bitmap bitmap, int i11) {
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z13 = true;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, RangesKt.coerceAtLeast((int) (bitmap.getWidth() * 0.15f), 1), RangesKt.coerceAtLeast((int) (bitmap.getHeight() * 0.15f), 1), true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        int iCoerceAtMost = RangesKt.coerceAtMost(i11, 10);
        if (iCoerceAtMost <= 0) {
            z11 = true;
        } else {
            int width = bitmapCreateScaledBitmap.getWidth();
            int height = bitmapCreateScaledBitmap.getHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            int[] iArr = new int[width * height];
            bitmapCreateScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            for (int i17 = 0; i17 < height; i17++) {
                int i18 = 0;
                while (i18 < width) {
                    int i19 = -iCoerceAtMost;
                    if (i19 <= iCoerceAtMost) {
                        i13 = 0;
                        i14 = 0;
                        i15 = 0;
                        i16 = 0;
                        i12 = ViewCompat.MEASURED_STATE_MASK;
                        while (true) {
                            z12 = z13;
                            int i21 = iArr[(i17 * width) + RangesKt.coerceIn(i18 + i19, 0, width - 1)];
                            i15 += (i21 >> 16) & 255;
                            i14 += (i21 >> 8) & 255;
                            i13 += i21 & 255;
                            i16++;
                            if (i19 == iCoerceAtMost) {
                                break;
                            }
                            i19++;
                            z13 = z12;
                        }
                    } else {
                        z12 = z13;
                        i12 = ViewCompat.MEASURED_STATE_MASK;
                        i13 = 0;
                        i14 = 0;
                        i15 = 0;
                        i16 = 0;
                    }
                    if (i16 > 0) {
                        iArr[(i17 * width) + i18] = ((i15 / i16) << 16) | i12 | ((i14 / i16) << 8) | (i13 / i16);
                    }
                    i18++;
                    z13 = z12;
                }
            }
            z11 = z13;
            for (int i22 = 0; i22 < width; i22++) {
                for (int i23 = 0; i23 < height; i23++) {
                    int i24 = -iCoerceAtMost;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    if (i24 <= iCoerceAtMost) {
                        while (true) {
                            int i29 = iArr[(RangesKt.coerceIn(i23 + i24, 0, height - 1) * width) + i22];
                            i27 += (i29 >> 16) & 255;
                            i26 += (i29 >> 8) & 255;
                            i25 += i29 & 255;
                            i28++;
                            if (i24 == iCoerceAtMost) {
                                break;
                            }
                            i24++;
                        }
                    }
                    if (i28 > 0) {
                        bitmapCreateBitmap.setPixel(i22, i23, ((i27 / i28) << 16) | ViewCompat.MEASURED_STATE_MASK | ((i26 / i28) << 8) | (i25 / i28));
                    }
                }
            }
            bitmapCreateScaledBitmap = bitmapCreateBitmap;
        }
        Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, bitmap.getWidth(), bitmap.getHeight(), z11);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap2, "createScaledBitmap(...)");
        return bitmapCreateScaledBitmap2;
    }
}
