package com.kubi.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.C5290q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.utils.f */
/* JADX INFO: compiled from: BitmapUtils.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJE\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/utils/f;", "", "<init>", "()V", "", "image", "degrees", "tint", "width", "height", "Landroid/graphics/Bitmap;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "b", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Landroid/graphics/drawable/Drawable;", "input", "", "recycle", "c", "(Landroid/graphics/Bitmap;IZ)Landroid/graphics/Bitmap;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C27047f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C27047f f54334a = new C27047f();

    /* JADX INFO: renamed from: com.kubi.utils.f$a */
    /* JADX INFO: compiled from: BitmapUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m90084d2 = {"com/kubi/utils/f$a", "Landroid/graphics/drawable/BitmapDrawable;", "", "getIntrinsicWidth", "()I", "getIntrinsicHeight", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a extends BitmapDrawable {
        public a(Bitmap bitmap) {
            super(bitmap);
        }

        @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return getBitmap().getHeight();
        }

        @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return getBitmap().getWidth();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Drawable m66713b(int image, @Nullable Integer degrees, @Nullable Integer tint, @Nullable Integer width, @Nullable Integer height) {
        return new a(f54334a.m66712a(image, degrees, tint, width, height));
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Bitmap m66714c(@NotNull Bitmap input, int tint, boolean recycle) {
        Intrinsics.checkNotNullParameter(input, "input");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(input.getWidth(), input.getHeight(), input.getConfig());
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(input.width…put.height, input.config)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(C27059l.f54343a.m66757a().getResources().getColor(tint), PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(input, 0.0f, 0.0f, paint);
        if (recycle && !input.isRecycled() && !Intrinsics.areEqual(bitmapCreateBitmap, input)) {
            input.recycle();
        }
        return bitmapCreateBitmap;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Bitmap m66712a(int image, @Nullable Integer degrees, @Nullable Integer tint, @Nullable Integer width, @Nullable Integer height) {
        Bitmap it = C5290q.m6354e(image);
        if (degrees != null) {
            it = C5290q.m6357h(it, degrees.intValue(), it.getWidth() / 2.0f, it.getHeight() / 2.0f, true);
        }
        if (tint != null) {
            C27047f c27047f = f54334a;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            it = c27047f.m66714c(it, tint.intValue(), true);
        }
        if (width != null && height != null) {
            it = C5290q.m6361l(it, C5275i0.m6236a(width.intValue()), C5275i0.m6236a(height.intValue()), true);
        }
        Intrinsics.checkNotNullExpressionValue(it, "getBitmap(image).let {\n …t\n            }\n        }");
        return it;
    }
}
