package bd0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import com.facebook.react.uimanager.ViewProps;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: bd0.a */
/* JADX INFO: compiled from: AnchorTagSpan.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016JP\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/barrage/view/AnchorTagSpan;", "Landroid/text/style/ReplacementSpan;", "text", "", "textColor", "", "textSize", "", "background", "Landroid/graphics/drawable/Drawable;", "tagWidth", "tagHeight", ViewProps.MARGIN, "isRtl", "", "<init>", "(Ljava/lang/String;IFLandroid/graphics/drawable/Drawable;IIIZ)V", "getSize", "paint", "Landroid/graphics/Paint;", "", "start", "end", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "x", ViewProps.TOP, "y", ViewProps.BOTTOM, "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4561a extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f4021b;

    /* JADX INFO: renamed from: c */
    public final int f4022c;

    /* JADX INFO: renamed from: d */
    public final float f4023d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Drawable f4024e;

    /* JADX INFO: renamed from: f */
    public final int f4025f;

    /* JADX INFO: renamed from: g */
    public final int f4026g;

    /* JADX INFO: renamed from: h */
    public final int f4027h;

    /* JADX INFO: renamed from: i */
    public final boolean f4028i;

    public C4561a(@NotNull String text, int i11, float f11, @NotNull Drawable background, int i12, int i13, int i14, boolean z11) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f4021b = text;
        this.f4022c = i11;
        this.f4023d = f11;
        this.f4024e = background;
        this.f4025f = i12;
        this.f4026g = i13;
        this.f4027h = i14;
        this.f4028i = z11;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @NotNull CharSequence text, int start, int end, float x11, int top, int y11, int bottom, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i11 = y11 + ((fontMetricsInt.descent + fontMetricsInt.ascent) / 2);
        int i12 = this.f4026g;
        int i13 = i11 - (i12 / 2);
        if (this.f4028i) {
            x11 += this.f4027h;
        }
        int i14 = (int) x11;
        this.f4024e.setBounds(i14, i13, this.f4025f + i14, i12 + i13);
        this.f4024e.draw(canvas);
        float textSize = paint.getTextSize();
        int color = paint.getColor();
        paint.setTextSize(this.f4023d);
        paint.setColor(this.f4022c);
        paint.setFakeBoldText(true);
        String str = this.f4021b;
        Locale locale = Locale.ROOT;
        String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        float fMeasureText = this.f4025f - paint.measureText(upperCase);
        float f11 = 2;
        float f12 = x11 + (fMeasureText / f11);
        float fDescent = (i13 + (this.f4026g / 2)) - ((paint.descent() + paint.ascent()) / f11);
        String upperCase2 = this.f4021b.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
        canvas.drawText(upperCase2, f12, fDescent, paint);
        paint.setTextSize(textSize);
        paint.setColor(color);
        paint.setFakeBoldText(false);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull Paint paint, @NotNull CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm2) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        if (fm2 != null) {
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int i11 = this.f4026g;
            int i12 = fontMetricsInt.descent;
            int i13 = fontMetricsInt.ascent;
            int i14 = (i11 - (i12 - i13)) / 2;
            fm2.ascent = i13 - i14;
            fm2.top = fontMetricsInt.top - i14;
            fm2.bottom = i12 + i14;
            fm2.descent = i12 + i14;
        }
        return this.f4025f + this.f4027h;
    }
}
