package com.kubi.resources.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.resources.C22890g;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$styleable;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: CoinUpdownCompareIndicator.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002'(B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\u0018\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0007H\u0002J\u0018\u0010!\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u0011H\u0002J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0007H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/kubi/resources/widget/CoinUpdownCompareIndicator;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", ViewProps.LINE_HEIGHT, "", "dividerMarginHorizontal", "upCount", "unchangeCount", "downCount", "upPaint", "Landroid/graphics/Paint;", "downPaint", "unchangePaint", "upPath", "Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$IndicatorPath;", "downPath", "updateView", "", "up", "unchange", "down", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawAllLine", "totalCount", "drawSingleLine", "paint", "drawUpLine", "drawDownLine", "dp2px", "size", "IndicatorPath", "Pos", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CoinUpdownCompareIndicator extends View {

    /* JADX INFO: renamed from: b */
    public float f43761b;

    /* JADX INFO: renamed from: c */
    public float f43762c;

    /* JADX INFO: renamed from: d */
    public int f43763d;

    /* JADX INFO: renamed from: e */
    public int f43764e;

    /* JADX INFO: renamed from: f */
    public int f43765f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Paint f43766g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Paint f43767h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Paint f43768i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final IndicatorPath f43769j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final IndicatorPath f43770k;

    /* JADX INFO: renamed from: com.kubi.resources.widget.CoinUpdownCompareIndicator$a, reason: from toString */
    /* JADX INFO: compiled from: CoinUpdownCompareIndicator.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$IndicatorPath;", "", "startTop", "Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$Pos;", "startBottom", "endTop", "endBottom", "<init>", "(Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$Pos;Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$Pos;Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$Pos;Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$Pos;)V", "getStartTop", "()Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$Pos;", "getStartBottom", "getEndTop", "getEndBottom", "reset", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class IndicatorPath {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final Pos startTop;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final Pos startBottom;

        /* JADX INFO: renamed from: c, reason: from toString */
        @NotNull
        public final Pos endTop;

        /* JADX INFO: renamed from: d, reason: from toString */
        @NotNull
        public final Pos endBottom;

        public IndicatorPath() {
            this(null, null, null, null, 15, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IndicatorPath)) {
                return false;
            }
            IndicatorPath indicatorPath = (IndicatorPath) other;
            return Intrinsics.areEqual(this.startTop, indicatorPath.startTop) && Intrinsics.areEqual(this.startBottom, indicatorPath.startBottom) && Intrinsics.areEqual(this.endTop, indicatorPath.endTop) && Intrinsics.areEqual(this.endBottom, indicatorPath.endBottom);
        }

        public IndicatorPath(@NotNull Pos startTop, @NotNull Pos startBottom, @NotNull Pos endTop, @NotNull Pos endBottom) {
            Intrinsics.checkNotNullParameter(startTop, "startTop");
            Intrinsics.checkNotNullParameter(startBottom, "startBottom");
            Intrinsics.checkNotNullParameter(endTop, "endTop");
            Intrinsics.checkNotNullParameter(endBottom, "endBottom");
            this.startTop = startTop;
            this.startBottom = startBottom;
            this.endTop = endTop;
            this.endBottom = endBottom;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Pos getEndBottom() {
            return this.endBottom;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Pos getEndTop() {
            return this.endTop;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Pos getStartBottom() {
            return this.startBottom;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Pos getStartTop() {
            return this.startTop;
        }

        /* JADX INFO: renamed from: e */
        public final void m54491e() {
            this.startTop.m54494c(0.0f);
            this.startTop.m54495d(0.0f);
            this.startBottom.m54494c(0.0f);
            this.startBottom.m54495d(0.0f);
            this.endTop.m54494c(0.0f);
            this.endTop.m54495d(0.0f);
            this.endBottom.m54494c(0.0f);
            this.endBottom.m54495d(0.0f);
        }

        public int hashCode() {
            return (((((this.startTop.hashCode() * 31) + this.startBottom.hashCode()) * 31) + this.endTop.hashCode()) * 31) + this.endBottom.hashCode();
        }

        @NotNull
        public String toString() {
            return "IndicatorPath(startTop=" + this.startTop + ", startBottom=" + this.startBottom + ", endTop=" + this.endTop + ", endBottom=" + this.endBottom + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IndicatorPath(Pos pos, Pos pos2, Pos pos3, Pos pos4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            int i12 = 3;
            float f11 = 0.0f;
            this((i11 & 1) != 0 ? new Pos(f11, f11, i12, defaultConstructorMarker2) : pos, (i11 & 2) != 0 ? new Pos(f11, f11, i12, defaultConstructorMarker2) : pos2, (i11 & 4) != 0 ? new Pos(f11, f11, i12, defaultConstructorMarker2) : pos3, (i11 & 8) != 0 ? new Pos(f11, f11, i12, defaultConstructorMarker2) : pos4);
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.CoinUpdownCompareIndicator$b, reason: from toString */
    /* JADX INFO: compiled from: CoinUpdownCompareIndicator.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/resources/widget/CoinUpdownCompareIndicator$Pos;", "", "x", "", "y", "<init>", "(FF)V", "getX", "()F", "setX", "(F)V", "getY", "setY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Pos {

        /* JADX INFO: renamed from: a, reason: from toString */
        public float x;

        /* JADX INFO: renamed from: b, reason: from toString */
        public float y;

        /* JADX WARN: Illegal instructions before constructor call */
        public Pos() {
            float f11 = 0.0f;
            this(f11, f11, 3, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pos)) {
                return false;
            }
            Pos pos = (Pos) other;
            return Float.compare(this.x, pos.x) == 0 && Float.compare(this.y, pos.y) == 0;
        }

        public Pos(float f11, float f12) {
            this.x = f11;
            this.y = f12;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getY() {
            return this.y;
        }

        /* JADX INFO: renamed from: c */
        public final void m54494c(float f11) {
            this.x = f11;
        }

        /* JADX INFO: renamed from: d */
        public final void m54495d(float f11) {
            this.y = f11;
        }

        public int hashCode() {
            return (Float.hashCode(this.x) * 31) + Float.hashCode(this.y);
        }

        @NotNull
        public String toString() {
            return "Pos(x=" + this.x + ", y=" + this.y + ')';
        }

        public /* synthetic */ Pos(float f11, float f12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0.0f : f11, (i11 & 2) != 0 ? 0.0f : f12);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CoinUpdownCompareIndicator(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: f */
    public final void m54486f(int i11, int i12, int i13) {
        this.f43763d = RangesKt.coerceAtLeast(i11, 0);
        this.f43764e = RangesKt.coerceAtLeast(i12, 0);
        this.f43765f = RangesKt.coerceAtLeast(i13, 0);
        postInvalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CoinUpdownCompareIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: b */
    public final void m54482b(Canvas canvas, int i11) {
        Canvas canvas2;
        float width = getWidth() - ((this.f43763d <= 0 || this.f43764e <= 0 || this.f43765f <= 0) ? this.f43762c : 2 * this.f43762c);
        float f11 = i11;
        float f12 = (this.f43763d * width) / f11;
        float f13 = (this.f43764e * width) / f11;
        float f14 = (width * this.f43765f) / f11;
        if (f12 > 0.0f) {
            float f15 = this.f43761b / 2.0f;
            this.f43769j.getStartTop().m54494c(f15);
            this.f43769j.getStartTop().m54495d(0.0f);
            this.f43769j.getStartBottom().m54494c(f15);
            this.f43769j.getStartBottom().m54495d(this.f43761b);
            float f16 = f15 + f12;
            this.f43769j.getEndTop().m54494c(f16);
            this.f43769j.getEndTop().m54495d(0.0f);
            this.f43769j.getEndBottom().m54494c(f16);
            this.f43769j.getEndBottom().m54495d(this.f43761b);
            m54485e(canvas);
        }
        float x11 = this.f43769j.getEndTop().getX() + (f12 > 0.0f ? this.f43762c : 0.0f);
        if (f13 > 0.0f) {
            canvas2 = canvas;
            canvas2.drawRect(x11, 0.0f, x11 + f13, this.f43761b, this.f43768i);
        } else {
            canvas2 = canvas;
        }
        if (f14 > 0.0f) {
            float f17 = x11 + f13 + this.f43762c;
            this.f43770k.getStartTop().m54494c(f17);
            this.f43770k.getStartTop().m54495d(0.0f);
            this.f43770k.getStartBottom().m54494c(f17);
            this.f43770k.getStartBottom().m54495d(this.f43761b);
            this.f43770k.getEndTop().m54494c(getWidth() - (this.f43761b / 2.0f));
            this.f43770k.getEndTop().m54495d(0.0f);
            this.f43770k.getEndBottom().m54494c(getWidth() - (this.f43761b / 2.0f));
            this.f43770k.getEndBottom().m54495d(this.f43761b);
            m54483c(canvas2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m54483c(Canvas canvas) {
        Path path = new Path();
        path.moveTo(this.f43770k.getEndTop().getX(), this.f43770k.getEndTop().getY());
        path.lineTo(this.f43770k.getStartTop().getX(), this.f43770k.getStartTop().getY());
        path.lineTo(this.f43770k.getStartBottom().getX(), this.f43770k.getStartBottom().getY());
        path.lineTo(this.f43770k.getEndBottom().getX(), this.f43770k.getEndBottom().getY());
        path.arcTo(getWidth() - this.f43761b, 0.0f, getWidth(), this.f43761b, -90.0f, 180.0f, true);
        path.close();
        this.f43767h.setStyle(Paint.Style.FILL);
        path.setFillType(Path.FillType.WINDING);
        canvas.drawPath(path, this.f43767h);
    }

    /* JADX INFO: renamed from: d */
    public final void m54484d(Canvas canvas, Paint paint) {
        float f11 = this.f43761b / 2.0f;
        canvas.drawRoundRect(0.0f, 0.0f, getWidth(), this.f43761b, f11, f11, paint);
    }

    /* JADX INFO: renamed from: e */
    public final void m54485e(Canvas canvas) {
        Path path = new Path();
        path.moveTo(this.f43769j.getStartTop().getX(), this.f43769j.getStartTop().getY());
        path.lineTo(this.f43769j.getEndTop().getX(), this.f43769j.getEndTop().getY());
        path.lineTo(this.f43769j.getEndBottom().getX(), this.f43769j.getEndBottom().getY());
        path.lineTo(this.f43769j.getStartBottom().getX(), this.f43769j.getStartBottom().getY());
        float f11 = this.f43761b;
        path.arcTo(0.0f, 0.0f, f11, f11, -270.0f, 180.0f, true);
        path.close();
        this.f43766g.setStyle(Paint.Style.FILL);
        path.setFillType(Path.FillType.WINDING);
        canvas.drawPath(path, this.f43766g);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.f43769j.m54491e();
        this.f43770k.m54491e();
        int i11 = this.f43763d;
        int i12 = this.f43764e;
        int i13 = this.f43765f;
        int i14 = i11 + i12 + i13;
        if (i14 <= 0) {
            m54484d(canvas, this.f43768i);
            return;
        }
        if (i11 > 0 && i12 == 0 && i13 == 0) {
            m54484d(canvas, this.f43766g);
            return;
        }
        if (i11 == 0 && i12 > 0 && i13 == 0) {
            m54484d(canvas, this.f43768i);
        } else if (i11 == 0 && i12 == 0 && i13 > 0) {
            m54484d(canvas, this.f43767h);
        } else {
            m54482b(canvas, i14);
        }
    }

    public /* synthetic */ CoinUpdownCompareIndicator(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: a */
    public final float m54481a(int i11) {
        return (i11 * getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CoinUpdownCompareIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.f43766g = paint;
        Paint paint2 = new Paint();
        this.f43767h = paint2;
        Paint paint3 = new Paint();
        this.f43768i = paint3;
        Pos pos = null;
        Pos pos2 = null;
        Pos pos3 = null;
        this.f43769j = new IndicatorPath(null, pos, pos2, pos3, 15, null);
        this.f43770k = new IndicatorPath(pos, pos2, pos3, null, 15, null);
        setLayerType(1, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CoinUpdownCompareIndicator);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.CoinUpdownCompareIndicator_cuci_upColor, -1);
        if (color == -1) {
            int iM54291p = C22890g.m54291p(context);
            color = Color.argb(102, Color.red(iM54291p), Color.green(iM54291p), Color.blue(iM54291p));
        }
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.CoinUpdownCompareIndicator_cuci_unchangeColor, C27046k.m66699n(context, R$color.c_cover8));
        int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.CoinUpdownCompareIndicator_cuci_downColor, -1);
        if (color3 == -1) {
            int iM54289n = C22890g.m54289n(context);
            color3 = Color.argb(102, Color.red(iM54289n), Color.green(iM54289n), Color.blue(iM54289n));
        }
        this.f43761b = typedArrayObtainStyledAttributes.getDimension(R$styleable.CoinUpdownCompareIndicator_cuci_lineHeight, m54481a(3));
        this.f43762c = typedArrayObtainStyledAttributes.getDimension(R$styleable.CoinUpdownCompareIndicator_cuci_dividerMarginHorizontal, m54481a(2));
        typedArrayObtainStyledAttributes.recycle();
        paint.setColor(color);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(this.f43761b);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint3.setAntiAlias(true);
        paint3.setColor(color2);
        paint3.setStrokeWidth(this.f43761b);
        paint3.setStrokeCap(Paint.Cap.SQUARE);
        paint2.setColor(color3);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(this.f43761b);
        paint2.setStrokeCap(cap);
    }
}
