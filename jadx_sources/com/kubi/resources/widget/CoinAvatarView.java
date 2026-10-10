package com.kubi.resources.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.AppCompatImageView;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$drawable;
import com.kubi.utils.extensions.C27025c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoinAvatarView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\r2\b\b\u0001\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/resources/widget/CoinAvatarView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "paint", "Landroid/graphics/Paint;", "radius", "", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "setStrokeColor", "color", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CoinAvatarView extends AppCompatImageView {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Paint f43759b;

    /* JADX INFO: renamed from: c */
    public float f43760c;

    public /* synthetic */ CoinAvatarView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinAvatarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.f43759b = paint;
        this.f43760c = C5275i0.m6236a(1.0f);
        setBackgroundResource(R$drawable.shape_oval_overlay);
        paint.setAntiAlias(true);
        paint.setColor(getResources().getColor(R$color.emphasis8));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f43760c);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (getTag() != null) {
            Object tag = getTag();
            if (!C27025c.m66566d(tag instanceof Boolean ? (Boolean) tag : null)) {
                return;
            }
        }
        float width = getWidth() / 2.0f;
        canvas.drawCircle(width, width, width - (this.f43760c / 2.0f), this.f43759b);
    }

    public final void setStrokeColor(@ColorInt int color) {
        this.f43759b.setColor(color);
        invalidate();
    }
}
