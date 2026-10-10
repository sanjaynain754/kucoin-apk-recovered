package rw;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import androidx.core.view.ViewCompat;
import com.kubi.resources.widget.chart.plugin.GridEffect;
import com.kubi.resources.widget.chart.plugin.GridType;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p439lw.InterfaceC42322d;
import p479nw.Frame;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: rw.b */
/* JADX INFO: compiled from: AxisGrid.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00170)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00170)H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006+"}, m90084d2 = {"Lcom/kubi/resources/widget/chart/plugin/AxisGrid;", "Lcom/kubi/resources/widget/chart/Grid;", "<init>", "()V", "gridType", "Lcom/kubi/resources/widget/chart/plugin/GridType;", "getGridType", "()Lcom/kubi/resources/widget/chart/plugin/GridType;", "setGridType", "(Lcom/kubi/resources/widget/chart/plugin/GridType;)V", "gridEffect", "Lcom/kubi/resources/widget/chart/plugin/GridEffect;", "getGridEffect", "()Lcom/kubi/resources/widget/chart/plugin/GridEffect;", "setGridEffect", "(Lcom/kubi/resources/widget/chart/plugin/GridEffect;)V", "color", "", "getColor", "()I", "setColor", "(I)V", "strokeWidth", "", "getStrokeWidth", "()F", "setStrokeWidth", "(F)V", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "paint$delegate", "Lkotlin/Lazy;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "innerFrame", "Lcom/kubi/resources/widget/chart/data/Frame;", "xLabelsPositions", "", "yLabelsPositions", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAxisGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AxisGrid.kt\ncom/kubi/resources/widget/chart/plugin/AxisGrid\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n1869#2,2:71\n1869#2,2:73\n*S KotlinDebug\n*F\n+ 1 AxisGrid.kt\ncom/kubi/resources/widget/chart/plugin/AxisGrid\n*L\n46#1:71,2\n52#1:73,2\n*E\n"})
public final class C44185b implements InterfaceC42322d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public GridType f97529a = GridType.FULL;

    /* JADX INFO: renamed from: b */
    @NotNull
    public GridEffect f97530b = GridEffect.SOLID;

    /* JADX INFO: renamed from: c */
    public int f97531c = ViewCompat.MEASURED_STATE_MASK;

    /* JADX INFO: renamed from: d */
    public float f97532d = 5.0f;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f97533e = LazyKt.lazy(new Function0() { // from class: rw.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C44185b.m97412f(this.f97528b);
        }
    });

    /* JADX INFO: renamed from: f */
    public static final Paint m97412f(C44185b c44185b) {
        Paint paint = new Paint();
        paint.setColor(c44185b.f97531c);
        paint.setStrokeWidth(c44185b.f97532d);
        GridEffect gridEffect = c44185b.f97530b;
        if (gridEffect != GridEffect.SOLID) {
            float f11 = gridEffect == GridEffect.DASHED ? 10.0f : 5.0f;
            paint.setPathEffect(new DashPathEffect(new float[]{f11, f11}, 0.0f));
        }
        return paint;
    }

    @Override // p439lw.InterfaceC42322d
    /* JADX INFO: renamed from: a */
    public void mo92866a(@Nullable Canvas canvas, @NotNull Frame innerFrame, @NotNull List<Float> xLabelsPositions, @NotNull List<Float> yLabelsPositions) {
        Intrinsics.checkNotNullParameter(innerFrame, "innerFrame");
        Intrinsics.checkNotNullParameter(xLabelsPositions, "xLabelsPositions");
        Intrinsics.checkNotNullParameter(yLabelsPositions, "yLabelsPositions");
        GridType gridType = this.f97529a;
        if (gridType == GridType.FULL || gridType == GridType.VERTICAL) {
            Iterator<T> it = xLabelsPositions.iterator();
            while (it.hasNext()) {
                float fFloatValue = ((Number) it.next()).floatValue();
                if (canvas != null) {
                    canvas.drawLine(fFloatValue, innerFrame.getBottom(), fFloatValue, innerFrame.getTop(), m97414d());
                }
            }
        }
        GridType gridType2 = this.f97529a;
        if (gridType2 == GridType.FULL || gridType2 == GridType.HORIZONTAL) {
            Iterator<T> it2 = yLabelsPositions.iterator();
            while (it2.hasNext()) {
                float fFloatValue2 = ((Number) it2.next()).floatValue();
                if (canvas != null) {
                    canvas.drawLine(innerFrame.getLeft(), fFloatValue2, innerFrame.getRight(), fFloatValue2, m97414d());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF97531c() {
        return this.f97531c;
    }

    /* JADX INFO: renamed from: d */
    public final Paint m97414d() {
        return (Paint) this.f97533e.getValue();
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getF97532d() {
        return this.f97532d;
    }

    /* JADX INFO: renamed from: g */
    public final void m97416g(int i11) {
        this.f97531c = i11;
    }

    /* JADX INFO: renamed from: h */
    public final void m97417h(@NotNull GridEffect gridEffect) {
        Intrinsics.checkNotNullParameter(gridEffect, "<set-?>");
        this.f97530b = gridEffect;
    }

    /* JADX INFO: renamed from: i */
    public final void m97418i(@NotNull GridType gridType) {
        Intrinsics.checkNotNullParameter(gridType, "<set-?>");
        this.f97529a = gridType;
    }

    /* JADX INFO: renamed from: j */
    public final void m97419j(float f11) {
        this.f97532d = f11;
    }
}
