package com.kubi.resources.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.kubi.resources.C22890g;
import com.kubi.utils.extensions.core.C27029c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: QuoteCompareIndicator.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003*+,B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ*\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u0007J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!H\u0014J\u0012\u0010\"\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J*\u0010#\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u0007H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006-"}, m90084d2 = {"Lcom/kubi/resources/widget/QuoteCompareIndicator;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "downPaint", "Landroid/graphics/Paint;", "upPaint", "upCount", "downCount", "lineWidth", "attachWidth", "spanWidth", "roundSize", "indicator", "Lcom/kubi/resources/widget/QuoteCompareIndicator$Indicator;", "getIndicator", "()Lcom/kubi/resources/widget/QuoteCompareIndicator$Indicator;", "indicator$delegate", "Lkotlin/Lazy;", "updateView", "", "up", "down", "downColor", "upColor", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawIndicator", "drawLine", "indicatorPath", "Lcom/kubi/resources/widget/QuoteCompareIndicator$IndicatorPath;", "paint", "", "getPath", "downWidth", "Indicator", "IndicatorPath", "Pos", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class QuoteCompareIndicator extends View {

    /* JADX INFO: renamed from: b */
    @NotNull
    public Paint f43999b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public Paint f44000c;

    /* JADX INFO: renamed from: d */
    public int f44001d;

    /* JADX INFO: renamed from: e */
    public int f44002e;

    /* JADX INFO: renamed from: f */
    public int f44003f;

    /* JADX INFO: renamed from: g */
    public int f44004g;

    /* JADX INFO: renamed from: h */
    public int f44005h;

    /* JADX INFO: renamed from: i */
    public int f44006i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Lazy f44007j;

    /* JADX INFO: renamed from: com.kubi.resources.widget.QuoteCompareIndicator$a, reason: from toString */
    /* JADX INFO: compiled from: QuoteCompareIndicator.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/resources/widget/QuoteCompareIndicator$Indicator;", "", "upPath", "Lcom/kubi/resources/widget/QuoteCompareIndicator$IndicatorPath;", "downPath", "<init>", "(Lcom/kubi/resources/widget/QuoteCompareIndicator$IndicatorPath;Lcom/kubi/resources/widget/QuoteCompareIndicator$IndicatorPath;)V", "getUpPath", "()Lcom/kubi/resources/widget/QuoteCompareIndicator$IndicatorPath;", "setUpPath", "(Lcom/kubi/resources/widget/QuoteCompareIndicator$IndicatorPath;)V", "getDownPath", "setDownPath", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Indicator {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public IndicatorPath upPath;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public IndicatorPath downPath;

        /* JADX WARN: Multi-variable type inference failed */
        public Indicator() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Indicator)) {
                return false;
            }
            Indicator indicator = (Indicator) other;
            return Intrinsics.areEqual(this.upPath, indicator.upPath) && Intrinsics.areEqual(this.downPath, indicator.downPath);
        }

        public Indicator(@NotNull IndicatorPath upPath, @NotNull IndicatorPath downPath) {
            Intrinsics.checkNotNullParameter(upPath, "upPath");
            Intrinsics.checkNotNullParameter(downPath, "downPath");
            this.upPath = upPath;
            this.downPath = downPath;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final IndicatorPath getDownPath() {
            return this.downPath;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final IndicatorPath getUpPath() {
            return this.upPath;
        }

        public int hashCode() {
            return (this.upPath.hashCode() * 31) + this.downPath.hashCode();
        }

        @NotNull
        public String toString() {
            return "Indicator(upPath=" + this.upPath + ", downPath=" + this.downPath + ')';
        }

        public /* synthetic */ Indicator(IndicatorPath indicatorPath, IndicatorPath indicatorPath2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i11 & 1) != 0) {
                indicatorPath = new IndicatorPath(null, null, null, null, 15, null);
            }
            if ((i11 & 2) != 0) {
                indicatorPath2 = new IndicatorPath(null, null, null, null, 15, null);
            }
            this(indicatorPath, indicatorPath2);
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.QuoteCompareIndicator$b, reason: from toString */
    /* JADX INFO: compiled from: QuoteCompareIndicator.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/resources/widget/QuoteCompareIndicator$IndicatorPath;", "", "startTop", "Lcom/kubi/resources/widget/QuoteCompareIndicator$Pos;", "startBottom", "endTop", "endBottom", "<init>", "(Lcom/kubi/resources/widget/QuoteCompareIndicator$Pos;Lcom/kubi/resources/widget/QuoteCompareIndicator$Pos;Lcom/kubi/resources/widget/QuoteCompareIndicator$Pos;Lcom/kubi/resources/widget/QuoteCompareIndicator$Pos;)V", "getStartTop", "()Lcom/kubi/resources/widget/QuoteCompareIndicator$Pos;", "setStartTop", "(Lcom/kubi/resources/widget/QuoteCompareIndicator$Pos;)V", "getStartBottom", "setStartBottom", "getEndTop", "setEndTop", "getEndBottom", "setEndBottom", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class IndicatorPath {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public Pos startTop;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public Pos startBottom;

        /* JADX INFO: renamed from: c, reason: from toString */
        @NotNull
        public Pos endTop;

        /* JADX INFO: renamed from: d, reason: from toString */
        @NotNull
        public Pos endBottom;

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

    /* JADX INFO: renamed from: com.kubi.resources.widget.QuoteCompareIndicator$c, reason: from toString */
    /* JADX INFO: compiled from: QuoteCompareIndicator.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/resources/widget/QuoteCompareIndicator$Pos;", "", "x", "", "y", "<init>", "(FF)V", "getX", "()F", "setX", "(F)V", "getY", "setY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
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
        public final void m54735c(float f11) {
            this.x = f11;
        }

        /* JADX INFO: renamed from: d */
        public final void m54736d(float f11) {
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
    public QuoteCompareIndicator(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuoteCompareIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final Indicator m54721e() {
        return new Indicator(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m54722g(QuoteCompareIndicator quoteCompareIndicator, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            Context context = quoteCompareIndicator.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            i13 = C22890g.m54281f(context, false);
        }
        if ((i15 & 8) != 0) {
            Context context2 = quoteCompareIndicator.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            i14 = C22890g.m54281f(context2, true);
        }
        quoteCompareIndicator.m54726f(i11, i12, i13, i14);
    }

    private final Indicator getIndicator() {
        return (Indicator) this.f44007j.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m54723b(Canvas canvas) {
        this.f43999b.setStrokeWidth(1.0f);
        this.f44000c.setStrokeWidth(1.0f);
        Paint paint = this.f43999b;
        Paint.Cap cap = Paint.Cap.BUTT;
        paint.setStrokeCap(cap);
        this.f44000c.setStrokeCap(cap);
        m54724c(canvas, getIndicator().getDownPath(), this.f43999b, true);
        m54724c(canvas, getIndicator().getUpPath(), this.f44000c, false);
    }

    /* JADX INFO: renamed from: c */
    public final void m54724c(Canvas canvas, IndicatorPath indicatorPath, Paint paint, boolean z11) {
        Path path = new Path();
        if (z11) {
            path.moveTo(indicatorPath.getStartTop().getX(), indicatorPath.getStartTop().getY());
            path.lineTo(indicatorPath.getEndTop().getX(), indicatorPath.getEndTop().getY());
            path.lineTo(indicatorPath.getEndBottom().getX(), indicatorPath.getEndBottom().getY());
            path.lineTo(indicatorPath.getStartBottom().getX(), indicatorPath.getStartBottom().getY());
            path.quadTo(indicatorPath.getStartBottom().getX() - this.f44006i, indicatorPath.getStartBottom().getY() - (this.f44003f / 2), indicatorPath.getStartTop().getX(), indicatorPath.getStartTop().getY());
        } else {
            path.moveTo(indicatorPath.getEndTop().getX(), indicatorPath.getEndTop().getY());
            path.lineTo(indicatorPath.getStartTop().getX(), indicatorPath.getStartTop().getY());
            path.lineTo(indicatorPath.getStartBottom().getX(), indicatorPath.getStartBottom().getY());
            path.lineTo(indicatorPath.getEndBottom().getX(), indicatorPath.getEndBottom().getY());
            path.quadTo(indicatorPath.getEndBottom().getX() + this.f44006i, indicatorPath.getEndBottom().getY() - (this.f44003f / 2), indicatorPath.getEndTop().getX(), indicatorPath.getEndTop().getY());
        }
        path.close();
        paint.setStrokeWidth(1.0f);
        paint.setStyle(Paint.Style.FILL);
        path.setFillType(Path.FillType.WINDING);
        if (canvas != null) {
            canvas.drawPath(path, paint);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m54726f(int i11, int i12, int i13, int i14) {
        this.f44001d = i11;
        this.f44002e = i12;
        this.f43999b.setColor(i13);
        this.f44000c.setColor(i14);
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int i11 = this.f44001d;
        if (i11 != 0 && this.f44002e != 0) {
            int width = getWidth() / (this.f44002e + this.f44001d);
            int width2 = getWidth();
            int i12 = this.f44002e;
            m54725d((width2 / (this.f44001d + i12)) * i12);
            m54723b(canvas);
            return;
        }
        if (i11 != 0 && this.f44002e == 0) {
            int width3 = getWidth();
            this.f44000c.setStrokeWidth(this.f44003f);
            this.f44000c.setStrokeCap(Paint.Cap.ROUND);
            canvas.drawLine(getPaddingStart() + this.f44006i, getPaddingTop() + this.f44006i, (width3 - getPaddingEnd()) - this.f44006i, getPaddingTop() + this.f44006i, this.f44000c);
            return;
        }
        if (i11 != 0 || this.f44002e == 0) {
            getWidth();
            m54725d(getWidth() / 2);
            m54723b(canvas);
        } else {
            int width4 = getWidth();
            this.f43999b.setStrokeWidth(this.f44003f);
            this.f43999b.setStrokeCap(Paint.Cap.ROUND);
            canvas.drawLine(getPaddingStart() + this.f44006i, getPaddingTop() + this.f44006i, (width4 - getPaddingEnd()) - this.f44006i, getPaddingTop() + this.f44006i, this.f43999b);
        }
    }

    public /* synthetic */ QuoteCompareIndicator(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: d */
    public final void m54725d(int i11) {
        int paddingStart = getPaddingStart() + this.f44006i;
        float f11 = paddingStart;
        getIndicator().getDownPath().getStartTop().m54735c(f11);
        getIndicator().getDownPath().getStartTop().m54736d(getPaddingTop());
        getIndicator().getDownPath().getStartBottom().m54735c(f11);
        getIndicator().getDownPath().getStartBottom().m54736d(getPaddingTop() + this.f44003f);
        int i12 = paddingStart + i11;
        getIndicator().getDownPath().getEndTop().m54735c((this.f44004g + i12) - this.f44005h);
        getIndicator().getDownPath().getEndTop().m54736d(getPaddingTop());
        getIndicator().getDownPath().getEndBottom().m54735c(i12 - this.f44005h);
        getIndicator().getDownPath().getEndBottom().m54736d(getPaddingTop() + this.f44003f);
        int paddingEnd = getPaddingEnd() + this.f44006i;
        getIndicator().getUpPath().getStartTop().m54735c(getIndicator().getDownPath().getEndTop().getX() + this.f44005h);
        getIndicator().getUpPath().getStartTop().m54736d(getPaddingTop());
        getIndicator().getUpPath().getStartBottom().m54735c(getIndicator().getDownPath().getEndBottom().getX() + this.f44005h);
        getIndicator().getUpPath().getStartBottom().m54736d(getPaddingTop() + this.f44003f);
        getIndicator().getUpPath().getEndTop().m54735c(getWidth() - paddingEnd);
        getIndicator().getUpPath().getEndTop().m54736d(getPaddingTop());
        getIndicator().getUpPath().getEndBottom().m54735c(getWidth() - paddingEnd);
        getIndicator().getUpPath().getEndBottom().m54736d(getPaddingTop() + this.f44003f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QuoteCompareIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43999b = new Paint();
        this.f44000c = new Paint();
        this.f44001d = 80;
        this.f44003f = C27029c.m66601d(this, 6);
        this.f44004g = C27029c.m66601d(this, 2);
        this.f44005h = C27029c.m66601d(this, 9);
        this.f44006i = this.f44003f - C27029c.m66601d(this, 2);
        this.f44007j = LazyKt.lazy(new Function0() { // from class: com.kubi.resources.widget.v1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuoteCompareIndicator.m54721e();
            }
        });
        setLayerType(1, null);
        this.f44000c = new Paint();
        this.f43999b = new Paint();
    }
}
