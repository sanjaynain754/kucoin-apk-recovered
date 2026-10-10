package p516ow;

import android.graphics.Typeface;
import androidx.core.view.ViewCompat;
import com.kubi.resources.widget.chart.data.AxisType;
import com.kubi.utils.extensions.C27040e;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p479nw.Label;
import p479nw.Paddings;
import p479nw.Scale;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ow.a */
/* JADX INFO: compiled from: ChartConfiguration.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R \u0010.\u001a\b\u0012\u0004\u0012\u0002000/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R \u00105\u001a\b\u0012\u0004\u0012\u0002000/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00102\"\u0004\b7\u00104R\u001a\u00108\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0007\"\u0004\b:\u0010\tR\u001a\u0010;\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001f\"\u0004\b=\u0010!R\u001c\u0010>\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010%\"\u0004\b@\u0010'R\u001a\u0010A\u001a\u00020BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010G\u001a\u00020HX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006M"}, m90084d2 = {"Lcom/kubi/resources/widget/chart/data/configuration/ChartConfiguration;", "", "<init>", "()V", "width", "", "getWidth", "()I", "setWidth", "(I)V", "height", "getHeight", "setHeight", "paddings", "Lcom/kubi/resources/widget/chart/data/Paddings;", "getPaddings", "()Lcom/kubi/resources/widget/chart/data/Paddings;", "setPaddings", "(Lcom/kubi/resources/widget/chart/data/Paddings;)V", "axis", "Lcom/kubi/resources/widget/chart/data/AxisType;", "getAxis", "()Lcom/kubi/resources/widget/chart/data/AxisType;", "setAxis", "(Lcom/kubi/resources/widget/chart/data/AxisType;)V", "labelsColor", "getLabelsColor", "setLabelsColor", "labelsSize", "", "getLabelsSize", "()F", "setLabelsSize", "(F)V", "labelsFont", "Landroid/graphics/Typeface;", "getLabelsFont", "()Landroid/graphics/Typeface;", "setLabelsFont", "(Landroid/graphics/Typeface;)V", "scale", "Lcom/kubi/resources/widget/chart/data/Scale;", "getScale", "()Lcom/kubi/resources/widget/chart/data/Scale;", "setScale", "(Lcom/kubi/resources/widget/chart/data/Scale;)V", "xLabels", "", "Lcom/kubi/resources/widget/chart/data/Label;", "getXLabels", "()Ljava/util/List;", "setXLabels", "(Ljava/util/List;)V", "yLabels", "getYLabels", "setYLabels", "tipColor", "getTipColor", "setTipColor", "tipSize", "getTipSize", "setTipSize", "tipTypeface", "getTipTypeface", "setTipTypeface", "animationDuration", "", "getAnimationDuration", "()J", "setAnimationDuration", "(J)V", "enableTouch", "", "getEnableTouch", "()Z", "setEnableTouch", "(Z)V", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class C43333a {

    /* JADX INFO: renamed from: a */
    public int f95650a;

    /* JADX INFO: renamed from: b */
    public int f95651b;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Typeface f95656g;

    /* JADX INFO: renamed from: m */
    @Nullable
    public Typeface f95662m;

    /* JADX INFO: renamed from: c */
    @NotNull
    public Paddings f95652c = new Paddings(0.0f, 0.0f, 0.0f, 0.0f, 15, null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public AxisType f95653d = AxisType.X;

    /* JADX INFO: renamed from: e */
    public int f95654e = ViewCompat.MEASURED_STATE_MASK;

    /* JADX INFO: renamed from: f */
    public float f95655f = 12.0f;

    /* JADX INFO: renamed from: h */
    @NotNull
    public Scale f95657h = new Scale(0.0d, 0.0d, 3, null);

    /* JADX INFO: renamed from: i */
    @NotNull
    public List<Label> f95658i = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: j */
    @NotNull
    public List<Label> f95659j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public int f95660k = ViewCompat.MEASURED_STATE_MASK;

    /* JADX INFO: renamed from: l */
    public float f95661l = C27040e.m66659c(12.0f);

    /* JADX INFO: renamed from: n */
    public long f95663n = 1500;

    /* JADX INFO: renamed from: o */
    public boolean f95664o = true;

    /* JADX INFO: renamed from: A */
    public final void m95372A(@Nullable Typeface typeface) {
        this.f95662m = typeface;
    }

    /* JADX INFO: renamed from: B */
    public final void m95373B(int i11) {
        this.f95650a = i11;
    }

    /* JADX INFO: renamed from: C */
    public final void m95374C(@NotNull List<Label> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f95658i = list;
    }

    /* JADX INFO: renamed from: D */
    public final void m95375D(@NotNull List<Label> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f95659j = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getF95663n() {
        return this.f95663n;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final AxisType getF95653d() {
        return this.f95653d;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getF95664o() {
        return this.f95664o;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF95651b() {
        return this.f95651b;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getF95654e() {
        return this.f95654e;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Typeface getF95656g() {
        return this.f95656g;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getF95655f() {
        return this.f95655f;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Paddings getF95652c() {
        return this.f95652c;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final Scale getF95657h() {
        return this.f95657h;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getF95660k() {
        return this.f95660k;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getF95661l() {
        return this.f95661l;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final Typeface getF95662m() {
        return this.f95662m;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getF95650a() {
        return this.f95650a;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final List<Label> m95389n() {
        return this.f95658i;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final List<Label> m95390o() {
        return this.f95659j;
    }

    /* JADX INFO: renamed from: p */
    public final void m95391p(long j11) {
        this.f95663n = j11;
    }

    /* JADX INFO: renamed from: q */
    public final void m95392q(@NotNull AxisType axisType) {
        Intrinsics.checkNotNullParameter(axisType, "<set-?>");
        this.f95653d = axisType;
    }

    /* JADX INFO: renamed from: r */
    public final void m95393r(boolean z11) {
        this.f95664o = z11;
    }

    /* JADX INFO: renamed from: s */
    public final void m95394s(int i11) {
        this.f95651b = i11;
    }

    /* JADX INFO: renamed from: t */
    public final void m95395t(int i11) {
        this.f95654e = i11;
    }

    /* JADX INFO: renamed from: u */
    public final void m95396u(@Nullable Typeface typeface) {
        this.f95656g = typeface;
    }

    /* JADX INFO: renamed from: v */
    public final void m95397v(float f11) {
        this.f95655f = f11;
    }

    /* JADX INFO: renamed from: w */
    public final void m95398w(@NotNull Paddings paddings) {
        Intrinsics.checkNotNullParameter(paddings, "<set-?>");
        this.f95652c = paddings;
    }

    /* JADX INFO: renamed from: x */
    public final void m95399x(@NotNull Scale scale) {
        Intrinsics.checkNotNullParameter(scale, "<set-?>");
        this.f95657h = scale;
    }

    /* JADX INFO: renamed from: y */
    public final void m95400y(int i11) {
        this.f95660k = i11;
    }

    /* JADX INFO: renamed from: z */
    public final void m95401z(float f11) {
        this.f95661l = f11;
    }
}
