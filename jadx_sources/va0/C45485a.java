package va0;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: va0.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C45485a extends Drawable {

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final a f102512k = new a(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final CharSequence f102513a;

    /* JADX INFO: renamed from: b */
    public final int f102514b;

    /* JADX INFO: renamed from: c */
    public final float f102515c;

    /* JADX INFO: renamed from: d */
    public final int f102516d;

    /* JADX INFO: renamed from: e */
    public boolean f102517e;

    /* JADX INFO: renamed from: f */
    public int f102518f;

    /* JADX INFO: renamed from: g */
    public int f102519g;

    /* JADX INFO: renamed from: h */
    public int f102520h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final TextPaint f102521i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Paint f102522j;

    /* JADX INFO: renamed from: va0.a$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m100446c(C45485a c45485a, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = -1;
        }
        c45485a.m100448b(i11, i12);
    }

    /* JADX INFO: renamed from: a */
    public final void m100447a(@ColorInt int i11) {
        this.f102520h = i11;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: b */
    public final void m100448b(@ColorInt int i11, @Dimension(unit = 1) int i12) {
        this.f102518f = i12;
        this.f102519g = i11;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: d */
    public final void m100449d(boolean z11) {
        this.f102517e = z11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int iMin = Math.min(getBounds().height(), getBounds().width());
        this.f102522j.setStyle(Paint.Style.FILL);
        this.f102522j.setColor(this.f102520h);
        float f11 = iMin;
        float f12 = f11 / 2.0f;
        canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), f12, this.f102522j);
        this.f102521i.setTextSize(((1.0f * f11) / this.f102516d) * this.f102515c);
        if (this.f102513a.length() > 0) {
            float fDescent = (this.f102521i.descent() + this.f102521i.ascent()) / 2;
            CharSequence charSequence = this.f102513a;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), getBounds().exactCenterX(), getBounds().exactCenterY() - fDescent, this.f102521i);
        } else {
            canvas2 = canvas;
        }
        if (this.f102519g == 0 || this.f102518f == 0) {
            return;
        }
        Paint paint = this.f102522j;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.f102519g);
        int i11 = this.f102518f;
        paint.setStrokeWidth(i11 > 0 ? i11 : f11 * 0.05f);
        canvas2.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), f12 - (this.f102522j.getStrokeWidth() / 2.0f), this.f102522j);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f102516d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f102516d;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f102521i.setAlpha(i11);
        this.f102522j.setAlpha(i11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f102521i.setColorFilter(colorFilter);
        this.f102522j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C45485a(@NotNull CharSequence text, int i11, float f11, int i12) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f102513a = text;
        this.f102514b = i11;
        this.f102515c = f11;
        this.f102516d = i12;
        this.f102518f = -1;
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setColor(i11);
        textPaint.setFakeBoldText(this.f102517e);
        this.f102521i = textPaint;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.f102522j = paint;
    }
}
