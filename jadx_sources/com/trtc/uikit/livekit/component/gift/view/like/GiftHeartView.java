package com.trtc.uikit.livekit.component.gift.view.like;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.trtc.uikit.livekit.R$drawable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GiftHeartView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\tJ\u001e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\tR\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/like/GiftHeartView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "heartResId", "heartBorderResId", "setDrawable", "", "bitmap", "Landroid/graphics/drawable/BitmapDrawable;", "setColor", "color", "setColorAndDrawables", "createHeart", "Landroid/graphics/Bitmap;", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class GiftHeartView extends AppCompatImageView {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f77851d = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Paint f77852e = new Paint(3);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Canvas f77853f = new Canvas();

    /* JADX INFO: renamed from: g */
    @Nullable
    public static Bitmap f77854g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public static Bitmap f77855h;

    /* JADX INFO: renamed from: b */
    public int f77856b;

    /* JADX INFO: renamed from: c */
    public int f77857c;

    /* JADX INFO: compiled from: GiftHeartView.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/like/GiftHeartView$Companion;", "", "<init>", "()V", "sPaint", "Landroid/graphics/Paint;", "sCanvas", "Landroid/graphics/Canvas;", "sHeart", "Landroid/graphics/Bitmap;", "sHeartBorder", "createBitmapSafely", "width", "", "height", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGiftHeartView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftHeartView.kt\ncom/trtc/uikit/livekit/component/gift/view/like/GiftHeartView$Companion\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,93:1\n95#2:94\n*S KotlinDebug\n*F\n+ 1 GiftHeartView.kt\ncom/trtc/uikit/livekit/component/gift/view/like/GiftHeartView$Companion\n*L\n86#1:94\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final Bitmap m79754a(int i11, int i12) {
            try {
                return Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
            } catch (OutOfMemoryError e11) {
                e11.printStackTrace();
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftHeartView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77856b = R$drawable.gift_heart0;
        this.f77857c = R$drawable.gift_heart1;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Bitmap m79753a(int i11) {
        if (f77854g == null) {
            f77854g = BitmapFactory.decodeResource(getResources(), this.f77856b);
        }
        if (f77855h == null) {
            f77855h = BitmapFactory.decodeResource(getResources(), this.f77857c);
        }
        Bitmap bitmap = f77855h;
        Companion companion = f77851d;
        Intrinsics.checkNotNull(bitmap);
        Bitmap bitmapM79754a = companion.m79754a(bitmap.getWidth(), bitmap.getHeight());
        if (bitmapM79754a == null) {
            return null;
        }
        Canvas canvas = f77853f;
        canvas.setBitmap(bitmapM79754a);
        Paint paint = f77852e;
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        paint.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_ATOP));
        Bitmap bitmap2 = f77854g;
        int width = bitmap.getWidth();
        Intrinsics.checkNotNull(bitmap2);
        canvas.drawBitmap(bitmap2, (width - bitmap2.getWidth()) / 2.0f, (bitmap.getHeight() - bitmap2.getHeight()) / 2.0f, paint);
        paint.setColorFilter(null);
        canvas.setBitmap(null);
        return bitmapM79754a;
    }

    public final void setColor(int color) {
        Bitmap bitmapM79753a = m79753a(color);
        if (bitmapM79753a != null) {
            setImageDrawable(new BitmapDrawable(getResources(), bitmapM79753a));
        }
    }

    public final void setDrawable(@Nullable BitmapDrawable bitmap) {
        setImageDrawable(bitmap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftHeartView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77856b = R$drawable.gift_heart0;
        this.f77857c = R$drawable.gift_heart1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftHeartView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77856b = R$drawable.gift_heart0;
        this.f77857c = R$drawable.gift_heart1;
    }
}
