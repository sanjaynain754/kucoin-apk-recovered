package com.kubi.resources.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.core.content.res.ResourcesCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.sdk.res.R$font;
import com.kubi.sdk.res.R$styleable;
import com.kubi.utils.extensions.C27024b;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.math.MathKt;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BuySellRatioView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0010\u0013\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 U2\u00020\u0001:\u0001UB\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001aH\u0014J\u0010\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0014J(\u0010*\u001a\u00020$2\u0006\u0010(\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020.H\u0002J(\u0010/\u001a\u00020$2\u0006\u0010(\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020.H\u0002J:\u00100\u001a\u00020$2\u0006\u0010(\u001a\u00020)2\u0006\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u00172\b\b\u0001\u00105\u001a\u00020\u001aH\u0002J\u001f\u00106\u001a\u00020$2\b\u00107\u001a\u0004\u0018\u00010\u00172\b\u00108\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u00109J&\u0010:\u001a\u00020$2\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010<2\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010<J\u0016\u0010?\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u0010\u0010@\u001a\u00020$2\b\u0010A\u001a\u0004\u0018\u00010BJ\u000e\u0010C\u001a\u00020$2\u0006\u0010D\u001a\u00020\u0017J\u001a\u0010E\u001a\u00020$2\b\b\u0001\u0010F\u001a\u00020\u001a2\b\b\u0001\u0010G\u001a\u00020\u001aJ\u001a\u0010H\u001a\u00020$2\b\b\u0001\u0010F\u001a\u00020\u001a2\b\b\u0001\u0010G\u001a\u00020\u001aJ\u000e\u0010I\u001a\u00020$2\u0006\u0010J\u001a\u00020\u0017J%\u0010K\u001a\u00020$2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0002\u00109J\u0010\u0010N\u001a\u00020\u00122\u0006\u0010O\u001a\u00020\u001aH\u0002J\u001a\u0010P\u001a\u00020\u001a2\b\b\u0001\u0010Q\u001a\u00020\u001a2\u0006\u0010R\u001a\u00020\u0017H\u0002J\u0010\u0010S\u001a\u00020\u00172\u0006\u0010O\u001a\u00020\u0017H\u0002J\u0010\u0010T\u001a\u00020\u00172\u0006\u0010O\u001a\u00020\u0017H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006V"}, m90084d2 = {"Lcom/kubi/resources/widget/BuySellRatioView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "buyPath", "Landroid/graphics/Path;", "sellPath", "labelRect", "Landroid/graphics/RectF;", "textPaint", "Landroid/graphics/Paint;", "progressPaint", "borderPaint", "buyLabel", "", "sellLabel", "buyPercentText", "sellPercentText", "buyRate", "", "sellRate", "buyTextColor", "", "sellTextColor", "buyProgressColor", "sellProgressColor", "cornerRadius", "labelGap", "labelCornerRadius", ViewProps.BORDER_WIDTH, "junctionGap", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawProgressBars", "w", CmcdData.Factory.STREAMING_FORMAT_HLS, "isRtl", "", "drawLabelsAndText", "drawLabelBox", "left", ViewProps.TOP, "right", ViewProps.BOTTOM, "textColor", "setRate", "buyPercent", "sellPercent", "(Ljava/lang/Float;Ljava/lang/Float;)V", "setOrderBookData", "bids", "", "", "asks", "setLabels", "setTypeface", "typeface", "Landroid/graphics/Typeface;", "setTextSizePx", "textSizePx", "setTextColors", "buyColor", "sellColor", "setProgressColors", "setCornerRadius", "radiusPx", "updateText", "rawBuyPercent", "rawSellPercent", "formatPercent", "value", "colorWithAlpha", "color", "alphaFactor", "dp", "sp", "Companion", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuySellRatioView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuySellRatioView.kt\ncom/kubi/resources/widget/BuySellRatioView\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n+ 3 Context.kt\nandroidx/core/content/ContextKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,413:1\n470#2:414\n470#2:415\n470#2:416\n470#2:417\n52#3,8:418\n60#3:427\n1#4:426\n30#5,7:428\n*S KotlinDebug\n*F\n+ 1 BuySellRatioView.kt\ncom/kubi/resources/widget/BuySellRatioView\n*L\n59#1:414\n62#1:415\n65#1:416\n68#1:417\n77#1:418,8\n77#1:427\n134#1:428,7\n*E\n"})
public final class BuySellRatioView extends View {

    /* JADX INFO: renamed from: w */
    @NotNull
    public static final Companion f43717w = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Path f43718b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Path f43719c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final RectF f43720d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Paint f43721e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Paint f43722f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Paint f43723g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public String f43724h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public String f43725i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public String f43726j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public String f43727k;

    /* JADX INFO: renamed from: l */
    public float f43728l;

    /* JADX INFO: renamed from: m */
    public float f43729m;

    /* JADX INFO: renamed from: n */
    @ColorInt
    public int f43730n;

    /* JADX INFO: renamed from: o */
    @ColorInt
    public int f43731o;

    /* JADX INFO: renamed from: p */
    @ColorInt
    public int f43732p;

    /* JADX INFO: renamed from: q */
    @ColorInt
    public int f43733q;

    /* JADX INFO: renamed from: r */
    public float f43734r;

    /* JADX INFO: renamed from: s */
    public final float f43735s;

    /* JADX INFO: renamed from: t */
    public final float f43736t;

    /* JADX INFO: renamed from: u */
    public final float f43737u;

    /* JADX INFO: renamed from: v */
    public final float f43738v;

    /* JADX INFO: compiled from: BuySellRatioView.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/resources/widget/BuySellRatioView$Companion;", "", "<init>", "()V", "RATE_CHANGE_THRESHOLD", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public BuySellRatioView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setCornerRadius(float radiusPx) {
        this.f43734r = Math.max(0.0f, radiusPx);
        invalidate();
    }

    public /* synthetic */ BuySellRatioView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: c */
    public final void m54450c(Canvas canvas, float f11, float f12, float f13, float f14, @ColorInt int i11) {
        this.f43720d.set(f11, f12, f13, f14);
        this.f43723g.setColor(m54448a(i11, 0.4f));
        RectF rectF = this.f43720d;
        float f15 = this.f43736t;
        canvas.drawRoundRect(rectF, f15, f15, this.f43723g);
    }

    /* JADX INFO: renamed from: d */
    public final void m54451d(Canvas canvas, float f11, float f12, boolean z11) {
        float f13 = f12 / 2.0f;
        float f14 = f13 - ((this.f43721e.getFontMetrics().ascent + this.f43721e.getFontMetrics().descent) / 2.0f);
        float f15 = this.f43737u / 2.0f;
        if (z11) {
            float f16 = f11 - f12;
            float f17 = f12 - f15;
            m54450c(canvas, f16 + f15, f15, f11 - f15, f17, this.f43730n);
            this.f43721e.setColor(this.f43730n);
            Paint paint = this.f43721e;
            Paint.Align align = Paint.Align.CENTER;
            paint.setTextAlign(align);
            canvas.drawText(this.f43724h, f11 - f13, f14, this.f43721e);
            this.f43721e.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText(this.f43726j, f16 - this.f43735s, f14, this.f43721e);
            m54450c(canvas, f15, f15, f17, f17, this.f43731o);
            this.f43721e.setColor(this.f43731o);
            this.f43721e.setTextAlign(align);
            canvas.drawText(this.f43725i, f13, f14, this.f43721e);
            this.f43721e.setTextAlign(Paint.Align.LEFT);
            canvas.drawText(this.f43727k, f12 + this.f43735s, f14, this.f43721e);
            return;
        }
        float f18 = f12 - f15;
        m54450c(canvas, f15, f15, f18, f18, this.f43730n);
        this.f43721e.setColor(this.f43730n);
        Paint paint2 = this.f43721e;
        Paint.Align align2 = Paint.Align.CENTER;
        paint2.setTextAlign(align2);
        canvas.drawText(this.f43724h, f13, f14, this.f43721e);
        this.f43721e.setTextAlign(Paint.Align.LEFT);
        canvas.drawText(this.f43726j, this.f43735s + f12, f14, this.f43721e);
        float f19 = f11 - f12;
        m54450c(canvas, f19 + f15, f15, f11 - f15, f18, this.f43731o);
        this.f43721e.setColor(this.f43731o);
        this.f43721e.setTextAlign(align2);
        canvas.drawText(this.f43725i, f11 - f13, f14, this.f43721e);
        this.f43721e.setTextAlign(Paint.Align.RIGHT);
        canvas.drawText(this.f43727k, f19 - this.f43735s, f14, this.f43721e);
    }

    /* JADX INFO: renamed from: e */
    public final void m54452e(Canvas canvas, float f11, float f12, boolean z11) {
        float fCoerceAtLeast = ((RangesKt.coerceAtLeast(f11 - (2 * f12), 0.0f) * this.f43728l) / 100.0f) + f12;
        float fCoerceAtMost = RangesKt.coerceAtMost(this.f43734r, f12 / 2.0f);
        float f13 = this.f43728l;
        boolean z12 = f13 >= 100.0f || f13 <= 0.0f;
        float f14 = z12 ? 0.0f : 0.7f * f12;
        float f15 = z12 ? 0.0f : this.f43738v / 2.0f;
        int iSave = canvas.save();
        if (z11) {
            try {
                canvas.scale(-1.0f, 1.0f, f11 / 2.0f, 0.0f);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
        float f16 = f14 / 2.0f;
        float f17 = fCoerceAtLeast + f16;
        float fCoerceIn = RangesKt.coerceIn(f17 - f15, 0.0f, f11);
        float f18 = fCoerceAtLeast - f16;
        float fCoerceIn2 = RangesKt.coerceIn(f18 - f15, 0.0f, f11);
        float fCoerceIn3 = RangesKt.coerceIn(f17 + f15, 0.0f, f11);
        float fCoerceIn4 = RangesKt.coerceIn(f18 + f15, 0.0f, f11);
        float f19 = fCoerceIn2 - fCoerceIn;
        float fSqrt = (float) Math.sqrt((f19 * f19) + (f12 * f12));
        float fCoerceAtMost2 = fSqrt > 0.0f ? RangesKt.coerceAtMost(fCoerceAtMost, fSqrt / 3.0f) : 0.0f;
        float f21 = fSqrt > 0.0f ? f19 / fSqrt : 0.0f;
        float f22 = fSqrt > 0.0f ? f12 / fSqrt : 1.0f;
        this.f43718b.reset();
        this.f43718b.moveTo(0.0f, fCoerceAtMost);
        this.f43718b.quadTo(0.0f, 0.0f, fCoerceAtMost, 0.0f);
        this.f43718b.lineTo(RangesKt.coerceAtLeast(fCoerceIn - fCoerceAtMost2, fCoerceAtMost), 0.0f);
        float f23 = f21 * fCoerceAtMost2;
        float f24 = f22 * fCoerceAtMost2;
        this.f43718b.quadTo(fCoerceIn, 0.0f, fCoerceIn + f23, f24);
        this.f43718b.lineTo(fCoerceIn2 - f23, f12 - f24);
        this.f43718b.quadTo(fCoerceIn2, f12, RangesKt.coerceAtLeast(fCoerceIn2 - fCoerceAtMost2, 0.0f), f12);
        this.f43718b.lineTo(fCoerceAtMost, f12);
        float f25 = f12 - fCoerceAtMost;
        this.f43718b.quadTo(0.0f, f12, 0.0f, f25);
        this.f43718b.close();
        this.f43722f.setColor(this.f43732p);
        canvas.drawPath(this.f43718b, this.f43722f);
        float f26 = fCoerceIn3 - fCoerceIn4;
        float f27 = -f12;
        float fSqrt2 = (float) Math.sqrt((f26 * f26) + (f27 * f27));
        float fCoerceAtMost3 = fSqrt2 > 0.0f ? RangesKt.coerceAtMost(fCoerceAtMost, fSqrt2 / 3.0f) : 0.0f;
        float f28 = fSqrt2 > 0.0f ? f26 / fSqrt2 : 0.0f;
        float f29 = fSqrt2 > 0.0f ? f27 / fSqrt2 : -1.0f;
        this.f43719c.reset();
        float f31 = f28 * fCoerceAtMost3;
        float f32 = fCoerceIn3 - f31;
        float f33 = (-f29) * fCoerceAtMost3;
        this.f43719c.moveTo(f32, f33);
        float f34 = f11 - fCoerceAtMost;
        this.f43719c.quadTo(fCoerceIn3, 0.0f, RangesKt.coerceAtMost(fCoerceIn3 + fCoerceAtMost3, f34), 0.0f);
        this.f43719c.lineTo(f34, 0.0f);
        this.f43719c.quadTo(f11, 0.0f, f11, fCoerceAtMost);
        this.f43719c.lineTo(f11, f25);
        this.f43719c.quadTo(f11, f12, f34, f12);
        this.f43719c.lineTo(RangesKt.coerceAtMost(fCoerceIn4 + fCoerceAtMost3, f34), f12);
        this.f43719c.quadTo(fCoerceIn4, f12, fCoerceIn4 + f31, f12 + (f29 * fCoerceAtMost3));
        this.f43719c.lineTo(f32, f33);
        this.f43719c.close();
        this.f43722f.setColor(this.f43733q);
        canvas.drawPath(this.f43719c, this.f43722f);
    }

    /* JADX INFO: renamed from: g */
    public final void m54454g(@Nullable List<double[]> list, @Nullable List<double[]> list2) {
        Pair pairM55413b = BuySellRatioMath.m55413b(BuySellRatioMath.f44987a, C27024b.m66559b(list), C27024b.m66559b(list2), 0, 4, null);
        float fFloatValue = ((Number) pairM55413b.component1()).floatValue();
        float fFloatValue2 = ((Number) pairM55413b.component2()).floatValue();
        this.f43728l = fFloatValue;
        this.f43729m = fFloatValue2;
        m54457j(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2));
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: h */
    public final void m54455h(@Nullable Float f11, @Nullable Float f12) {
        Pair<Float, Float> pairM55415c = BuySellRatioMath.f44987a.m55415c(f11, f12);
        float fFloatValue = pairM55415c.component1().floatValue();
        float fFloatValue2 = pairM55415c.component2().floatValue();
        if (Math.abs(fFloatValue - this.f43728l) >= 0.05f || Math.abs(fFloatValue2 - this.f43729m) >= 0.05f) {
            this.f43728l = fFloatValue;
            this.f43729m = fFloatValue2;
            m54457j(f11, f12);
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m54457j(Float f11, Float f12) {
        if (f11 == null && f12 == null) {
            return;
        }
        int iRoundToInt = f11 != null ? MathKt.roundToInt(f11.floatValue()) : 0;
        this.f43726j = m54453f(iRoundToInt);
        this.f43727k = m54453f(100 - iRoundToInt);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        boolean z11 = getLayoutDirection() == 1;
        m54452e(canvas, width, height, z11);
        m54451d(canvas, width, height, z11);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.resolveSize(getSuggestedMinimumWidth(), widthMeasureSpec), View.resolveSize((int) m54449b(14.0f), heightMeasureSpec));
    }

    public final void setTextSizePx(float textSizePx) {
        this.f43721e.setTextSize(Math.max(0.0f, textSizePx));
        invalidate();
    }

    public final void setTypeface(@Nullable Typeface typeface) {
        if (typeface != null) {
            this.f43721e.setTypeface(typeface);
            invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BuySellRatioView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43718b = new Path();
        this.f43719c = new Path();
        this.f43720d = new RectF();
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setTypeface(ResourcesCompat.getFont(context, R$font.regular));
        this.f43721e = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        this.f43722f = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.STROKE);
        this.f43723g = paint3;
        this.f43724h = "B";
        String str = ExifInterface.LATITUDE_SOUTH;
        this.f43725i = ExifInterface.LATITUDE_SOUTH;
        this.f43726j = "--";
        this.f43727k = "--";
        Float fValueOf = Float.valueOf(50.0f);
        this.f43728l = 50.0f;
        this.f43729m = 50.0f;
        this.f43730n = Color.parseColor("#00B47D");
        this.f43731o = Color.parseColor("#F65454");
        this.f43732p = Color.parseColor("#1F00B47D");
        this.f43733q = Color.parseColor("#1FF65454");
        this.f43734r = m54449b(4.0f);
        this.f43735s = m54449b(2.0f);
        this.f43736t = m54449b(4.0f);
        float fM54449b = m54449b(0.5f);
        this.f43737u = fM54449b;
        this.f43738v = m54449b(2.0f);
        int[] BuySellRatioView = R$styleable.BuySellRatioView;
        Intrinsics.checkNotNullExpressionValue(BuySellRatioView, "BuySellRatioView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, BuySellRatioView, 0, 0);
        this.f43730n = typedArrayObtainStyledAttributes.getColor(R$styleable.BuySellRatioView_buyRatioTextColor, this.f43730n);
        this.f43731o = typedArrayObtainStyledAttributes.getColor(R$styleable.BuySellRatioView_sellRatioTextColor, this.f43731o);
        this.f43732p = typedArrayObtainStyledAttributes.getColor(R$styleable.BuySellRatioView_buyRatioProgressColor, this.f43732p);
        this.f43733q = typedArrayObtainStyledAttributes.getColor(R$styleable.BuySellRatioView_sellRatioProgressColor, this.f43733q);
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.BuySellRatioView_buyRatioLabel);
        string = string == null ? "" : string;
        this.f43724h = StringsKt.isBlank(string) ? "B" : string;
        String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.BuySellRatioView_sellRatioLabel);
        String str2 = string2 != null ? string2 : "";
        this.f43725i = StringsKt.isBlank(str2) ? str : str2;
        paint.setTextSize(typedArrayObtainStyledAttributes.getDimension(R$styleable.BuySellRatioView_buySellRatioTextSize, m54456i(10.0f)));
        this.f43734r = typedArrayObtainStyledAttributes.getDimension(R$styleable.BuySellRatioView_buySellRatioCornerRadius, this.f43734r);
        typedArrayObtainStyledAttributes.recycle();
        paint3.setStrokeWidth(fM54449b);
        m54457j(fValueOf, fValueOf);
    }

    /* JADX INFO: renamed from: a */
    public final int m54448a(@ColorInt int i11, float f11) {
        return (i11 & 16777215) | (RangesKt.coerceIn((int) (Color.alpha(i11) * f11), 0, 255) << 24);
    }

    /* JADX INFO: renamed from: b */
    public final float m54449b(float f11) {
        return TypedValue.applyDimension(1, f11, getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: f */
    public final String m54453f(int i11) {
        StringBuilder sb2;
        if (getLayoutDirection() == 1) {
            sb2 = new StringBuilder();
            sb2.append('%');
            sb2.append(i11);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append('%');
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: i */
    public final float m54456i(float f11) {
        return TypedValue.applyDimension(2, f11, getResources().getDisplayMetrics());
    }
}
