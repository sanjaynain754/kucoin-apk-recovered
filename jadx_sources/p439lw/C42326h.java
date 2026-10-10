package p439lw;

import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import androidx.core.view.ViewCompat;
import androidx.media3.extractor.text.ttml.TtmlNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: lw.h */
/* JADX INFO: compiled from: Painter.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fJ\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fJF\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/resources/widget/chart/Painter;", "", "paint", "Landroid/graphics/Paint;", "labelsFont", "Landroid/graphics/Typeface;", "<init>", "(Landroid/graphics/Paint;Landroid/graphics/Typeface;)V", "getPaint", "()Landroid/graphics/Paint;", "getLabelsFont", "()Landroid/graphics/Typeface;", "setLabelsFont", "(Landroid/graphics/Typeface;)V", "measureLabelWidth", "", "text", "", "textSize", "measureLabelHeight", "measureLabelAscent", "measureLabelDescent", "prepare", "color", "", TtmlNode.TAG_STYLE, "Landroid/graphics/Paint$Style;", "strokeWidth", "shader", "Landroid/graphics/Shader;", "font", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42326h {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Paint f93838a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Typeface f93839b;

    public C42326h(@NotNull Paint paint, @Nullable Typeface typeface) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f93838a = paint;
        this.f93839b = typeface;
        paint.setTextAlign(Paint.Align.CENTER);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Paint m92868f(C42326h c42326h, float f11, int i11, Paint.Style style, float f12, Shader shader, Typeface typeface, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            f11 = 15.0f;
        }
        if ((i12 & 2) != 0) {
            i11 = ViewCompat.MEASURED_STATE_MASK;
        }
        if ((i12 & 4) != 0) {
            style = Paint.Style.FILL;
        }
        if ((i12 & 8) != 0) {
            f12 = 4.0f;
        }
        if ((i12 & 16) != 0) {
            shader = null;
        }
        return c42326h.m92873e(f11, i11, style, f12, shader, (i12 & 32) != 0 ? null : typeface);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Paint getF93838a() {
        return this.f93838a;
    }

    /* JADX INFO: renamed from: b */
    public final float m92870b(float f11) {
        this.f93838a.setTextSize(f11);
        return this.f93838a.ascent();
    }

    /* JADX INFO: renamed from: c */
    public final float m92871c(float f11) {
        this.f93838a.setTextSize(f11);
        return this.f93838a.descent() - this.f93838a.ascent();
    }

    /* JADX INFO: renamed from: d */
    public final float m92872d(@NotNull String text, float f11) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f93838a.setTypeface(this.f93839b);
        this.f93838a.setTextSize(f11);
        return this.f93838a.measureText(text);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Paint m92873e(float f11, int i11, @NotNull Paint.Style style, float f12, @Nullable Shader shader, @Nullable Typeface typeface) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f93838a.setTextSize(f11);
        this.f93838a.setColor(i11);
        this.f93838a.setStyle(style);
        this.f93838a.setStrokeWidth(f12);
        this.f93838a.setShader(shader);
        this.f93838a.setTypeface(typeface);
        return this.f93838a;
    }

    /* JADX INFO: renamed from: g */
    public final void m92874g(@Nullable Typeface typeface) {
        this.f93839b = typeface;
    }

    public /* synthetic */ C42326h(Paint paint, Typeface typeface, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new Paint() : paint, (i11 & 2) != 0 ? null : typeface);
    }
}
