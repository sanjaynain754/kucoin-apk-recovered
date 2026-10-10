package com.kubi.utils;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ImageUtils.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"com/kubi/utils/ImageUtils$Companion", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "", "sizeLimit", "", "compressBitmap", "(Landroid/graphics/Bitmap;J)[B", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class ImageUtils$Companion {
    public /* synthetic */ ImageUtils$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public ImageUtils$Companion() {
    }

    @JvmStatic
    @NotNull
    public final byte[] compressBitmap(@NotNull Bitmap bitmap, long sizeLimit) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i11 = 100;
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        while (byteArrayOutputStream.toByteArray().length / 1024 > sizeLimit) {
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
}
