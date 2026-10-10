package com.kubi.resources.widget.chart.data.configuration;

import android.graphics.Color;
import androidx.core.view.ViewCompat;
import com.kubi.sdk.res.R$drawable;
import com.kubi.utils.extensions.C27040e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p479nw.Frame;
import p479nw.LinearGradientData;
import p516ow.C43333a;
import p575qw.C43881b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LineChartConfiguration.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b \u0018\u0000 _2\u00020\u0001:\u0001_B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\u001a\u0010.\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R\u001a\u00101\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010(\"\u0004\b3\u0010*R\u001a\u00104\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010(\"\u0004\b6\u0010*R\u001a\u00107\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010(\"\u0004\b9\u0010*R\u001a\u0010:\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010(\"\u0004\b<\u0010*R.\u0010=\u001a\u0016\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020@\u0018\u00010>X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0013\"\u0004\bG\u0010\u0015R\u001a\u0010H\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0007\"\u0004\bJ\u0010\tR\u001a\u0010K\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0007\"\u0004\bM\u0010\tR\u001a\u0010N\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0007\"\u0004\bP\u0010\tR\u001a\u0010Q\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0007\"\u0004\bS\u0010\tR\u001a\u0010T\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0013\"\u0004\bV\u0010\u0015R\u001a\u0010W\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0013\"\u0004\bY\u0010\u0015R\u001a\u0010Z\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010(\"\u0004\b[\u0010*R\u001a\u0010\\\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u0013\"\u0004\b^\u0010\u0015¨\u0006`"}, m90084d2 = {"Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;", "Lcom/kubi/resources/widget/chart/data/configuration/ChartConfiguration;", "<init>", "()V", "lineThickness", "", "getLineThickness", "()F", "setLineThickness", "(F)V", "lineBackgroundColorData", "Lcom/kubi/resources/widget/chart/data/LinearGradientData;", "getLineBackgroundColorData", "()Lcom/kubi/resources/widget/chart/data/LinearGradientData;", "setLineBackgroundColorData", "(Lcom/kubi/resources/widget/chart/data/LinearGradientData;)V", "clickableRadius", "", "getClickableRadius", "()I", "setClickableRadius", "(I)V", "lineColor", "getLineColor", "setLineColor", "lineGradientColors", "", "getLineGradientColors", "()[I", "setLineGradientColors", "([I)V", "backgroundImg", "getBackgroundImg", "()Ljava/lang/Integer;", "setBackgroundImg", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "showBackgroundImage", "", "getShowBackgroundImage", "()Z", "setShowBackgroundImage", "(Z)V", "useGradient", "getUseGradient", "setUseGradient", "smooth", "getSmooth", "setSmooth", "showPoint", "getShowPoint", "setShowPoint", "showLineBackground", "getShowLineBackground", "setShowLineBackground", "animate", "getAnimate", "setAnimate", "animateLineEnable", "getAnimateLineEnable", "setAnimateLineEnable", "frameChangeListener", "Lkotlin/Function2;", "Lcom/kubi/resources/widget/chart/data/Frame;", "", "getFrameChangeListener", "()Lkotlin/jvm/functions/Function2;", "setFrameChangeListener", "(Lkotlin/jvm/functions/Function2;)V", "selectLineColor", "getSelectLineColor", "setSelectLineColor", "intervalWidth", "getIntervalWidth", "setIntervalWidth", "selectLineStrokeWidth", "getSelectLineStrokeWidth", "setSelectLineStrokeWidth", "selectBigCircleRadius", "getSelectBigCircleRadius", "setSelectBigCircleRadius", "selectSmallCircleRadius", "getSelectSmallCircleRadius", "setSelectSmallCircleRadius", "selectBigCircleColor", "getSelectBigCircleColor", "setSelectBigCircleColor", "selectSmallCircleColor", "getSelectSmallCircleColor", "setSelectSmallCircleColor", "isShowInOutPoint", "setShowInOutPoint", "offsetPaddings", "getOffsetPaddings", "setOffsetPaddings", "Companion", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLineChartConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LineChartConfiguration.kt\ncom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,92:1\n470#2:93\n470#2:94\n*S KotlinDebug\n*F\n+ 1 LineChartConfiguration.kt\ncom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration\n*L\n53#1:93\n56#1:94\n*E\n"})
public final class LineChartConfiguration extends C43333a {

    /* JADX INFO: renamed from: M */
    @NotNull
    public static final Companion f44451M = new Companion(null);

    /* JADX INFO: renamed from: N */
    @NotNull
    public static int[] f44452N = {Color.parseColor("#019F6D"), Color.parseColor("#20BC99"), Color.parseColor("#09F8CF")};

    /* JADX INFO: renamed from: O */
    @NotNull
    public static int[] f44453O = {Color.parseColor("#F65454"), Color.parseColor("#F67754")};

    /* JADX INFO: renamed from: A */
    public boolean f44454A;

    /* JADX INFO: renamed from: C */
    @Nullable
    public Function2<? super Frame, ? super Frame, Unit> f44456C;

    /* JADX INFO: renamed from: K */
    public boolean f44464K;

    /* JADX INFO: renamed from: L */
    public int f44465L;

    /* JADX INFO: renamed from: t */
    @Nullable
    public int[] f44470t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public Integer f44471u;

    /* JADX INFO: renamed from: v */
    public boolean f44472v;

    /* JADX INFO: renamed from: x */
    public boolean f44474x;

    /* JADX INFO: renamed from: y */
    public boolean f44475y;

    /* JADX INFO: renamed from: z */
    public boolean f44476z;

    /* JADX INFO: renamed from: p */
    public float f44466p = 4.0f;

    /* JADX INFO: renamed from: q */
    @NotNull
    public LinearGradientData f44467q = new LinearGradientData(false, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: r */
    public int f44468r = C43881b.m96650a(24);

    /* JADX INFO: renamed from: s */
    public int f44469s = ViewCompat.MEASURED_STATE_MASK;

    /* JADX INFO: renamed from: w */
    public boolean f44473w = true;

    /* JADX INFO: renamed from: B */
    public boolean f44455B = true;

    /* JADX INFO: renamed from: D */
    public int f44457D = ViewCompat.MEASURED_STATE_MASK;

    /* JADX INFO: renamed from: E */
    public float f44458E = 10.0f;

    /* JADX INFO: renamed from: F */
    public float f44459F = C27040e.m66657a(1.0f);

    /* JADX INFO: renamed from: G */
    public float f44460G = C27040e.m66658b(4);

    /* JADX INFO: renamed from: H */
    public float f44461H = C27040e.m66658b(3);

    /* JADX INFO: renamed from: I */
    public int f44462I = ViewCompat.MEASURED_STATE_MASK;

    /* JADX INFO: renamed from: J */
    public int f44463J = -1;

    /* JADX INFO: compiled from: LineChartConfiguration.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007J\u0016\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration$Companion;", "", "<init>", "()V", "defaultSmoothFactor", "", "defaultSmooth", "", "defaultLineThickness", "defaultFillColor", "", "defaultLineColor", "defaultPointsDrawableRes", "defaultClickableArea", "defaultPointsDrawableHeight", "DEFAULT_STROKE_WIDTH", "lineGradientColorsUp", "", "getLineGradientColorsUp", "()[I", "setLineGradientColorsUp", "([I)V", "lineGradientColorsDown", "getLineGradientColorsDown", "setLineGradientColorsDown", "getBackground", "isUp", "upGreen", "getGradientColors", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final int getBackground(boolean isUp, boolean upGreen) {
            if (upGreen) {
                return isUp ? R$drawable.asset_line_chat_up_bg : R$drawable.asset_line_chat_down_bg;
            }
            return isUp ? R$drawable.asset_line_chat_down_bg : R$drawable.asset_line_chat_up_bg;
        }

        @NotNull
        public final int[] getGradientColors(boolean isUp, boolean upGreen) {
            if (upGreen) {
                return isUp ? getLineGradientColorsUp() : getLineGradientColorsDown();
            }
            return isUp ? getLineGradientColorsDown() : getLineGradientColorsUp();
        }

        public final void setLineGradientColorsDown(@NotNull int[] iArr) {
            Intrinsics.checkNotNullParameter(iArr, "<set-?>");
            LineChartConfiguration.f44453O = iArr;
        }

        public final void setLineGradientColorsUp(@NotNull int[] iArr) {
            Intrinsics.checkNotNullParameter(iArr, "<set-?>");
            LineChartConfiguration.f44452N = iArr;
        }

        @NotNull
        public final int[] getLineGradientColorsDown() {
            return LineChartConfiguration.f44453O;
        }

        @NotNull
        public final int[] getLineGradientColorsUp() {
            return LineChartConfiguration.f44452N;
        }
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final boolean getF44454A() {
        return this.f44454A;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final boolean getF44455B() {
        return this.f44455B;
    }

    @Nullable
    /* JADX INFO: renamed from: K, reason: from getter */
    public final Integer getF44471u() {
        return this.f44471u;
    }

    @Nullable
    /* JADX INFO: renamed from: L */
    public final Function2<Frame, Frame, Unit> m55068L() {
        return this.f44456C;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final float getF44458E() {
        return this.f44458E;
    }

    @NotNull
    /* JADX INFO: renamed from: N, reason: from getter */
    public final LinearGradientData getF44467q() {
        return this.f44467q;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final int getF44469s() {
        return this.f44469s;
    }

    @Nullable
    /* JADX INFO: renamed from: P, reason: from getter */
    public final int[] getF44470t() {
        return this.f44470t;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final float getF44466p() {
        return this.f44466p;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final int getF44465L() {
        return this.f44465L;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final int getF44462I() {
        return this.f44462I;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final float getF44460G() {
        return this.f44460G;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final float getF44459F() {
        return this.f44459F;
    }

    /* JADX INFO: renamed from: V, reason: from getter */
    public final float getF44461H() {
        return this.f44461H;
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final boolean getF44472v() {
        return this.f44472v;
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final boolean getF44476z() {
        return this.f44476z;
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public final boolean getF44475y() {
        return this.f44475y;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final boolean getF44474x() {
        return this.f44474x;
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public final boolean getF44473w() {
        return this.f44473w;
    }

    /* JADX INFO: renamed from: b0, reason: from getter */
    public final boolean getF44464K() {
        return this.f44464K;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m55085c0(boolean z11) {
        this.f44454A = z11;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m55086d0(boolean z11) {
        this.f44455B = z11;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m55087e0(@Nullable Integer num) {
        this.f44471u = num;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m55088f0(@NotNull LinearGradientData linearGradientData) {
        Intrinsics.checkNotNullParameter(linearGradientData, "<set-?>");
        this.f44467q = linearGradientData;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m55089g0(int i11) {
        this.f44469s = i11;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m55090h0(@Nullable int[] iArr) {
        this.f44470t = iArr;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m55091i0(float f11) {
        this.f44466p = f11;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m55092j0(int i11) {
        this.f44465L = i11;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m55093k0(int i11) {
        this.f44462I = i11;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m55094l0(float f11) {
        this.f44460G = f11;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m55095m0(int i11) {
        this.f44457D = i11;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m55096n0(int i11) {
        this.f44463J = i11;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m55097o0(float f11) {
        this.f44461H = f11;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m55098p0(boolean z11) {
        this.f44472v = z11;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m55099q0(boolean z11) {
        this.f44464K = z11;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m55100r0(boolean z11) {
        this.f44476z = z11;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m55101s0(boolean z11) {
        this.f44475y = z11;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m55102t0(boolean z11) {
        this.f44474x = z11;
    }
}
