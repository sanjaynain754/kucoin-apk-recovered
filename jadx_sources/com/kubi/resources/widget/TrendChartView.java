package com.kubi.resources.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.kubi.utils.extensions.C27040e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TrendChartView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/resources/widget/TrendChartView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "linePaint", "Landroid/graphics/Paint;", "gradientPaint", "linePath", "Landroid/graphics/Path;", "gradientPath", "data", "", "", "lineColor", "gradientColor", "setChartData", "", "values", "fillColor", "onDraw", "canvas", "Landroid/graphics/Canvas;", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTrendChartView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrendChartView.kt\ncom/kubi/resources/widget/TrendChartView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,118:1\n1573#2:119\n1604#2,4:120\n*S KotlinDebug\n*F\n+ 1 TrendChartView.kt\ncom/kubi/resources/widget/TrendChartView\n*L\n76#1:119\n76#1:120,4\n*E\n"})
public final class TrendChartView extends View {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Paint f44190b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Paint f44191c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Path f44192d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Path f44193e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public List<Double> f44194f;

    /* JADX INFO: renamed from: g */
    public int f44195g;

    /* JADX INFO: renamed from: h */
    public int f44196h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TrendChartView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TrendChartView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: a */
    public final void m54911a(@NotNull List<Double> values, int i11, int i12) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.f44194f = values;
        this.f44195g = i11;
        this.f44196h = i12;
        int height = getHeight();
        if (height > 0) {
            this.f44191c.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, height, this.f44196h, 0, Shader.TileMode.CLAMP));
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f44194f.isEmpty()) {
            return;
        }
        Double dMinOrNull = CollectionsKt.minOrNull((Iterable<? extends Double>) this.f44194f);
        double dDoubleValue = dMinOrNull != null ? dMinOrNull.doubleValue() : 0.0d;
        Double dMaxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Double>) this.f44194f);
        double dDoubleValue2 = dMaxOrNull != null ? dMaxOrNull.doubleValue() : 0.0d;
        float height = getHeight() - C27040e.m66658b(2);
        float width = getWidth();
        this.f44192d.reset();
        this.f44193e.reset();
        float fMax = width / Math.max(1, this.f44194f.size() - 1);
        List<Double> list = this.f44194f;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i11 = 0;
        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new PointF(i11 * fMax, (((float) (1.0d - (dDoubleValue2 == dDoubleValue ? 0.5d : (((Number) next).doubleValue() - dDoubleValue) / (dDoubleValue2 - dDoubleValue)))) * height) + C27040e.m66658b(2)));
            i11 = i12;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f44192d.moveTo(((PointF) arrayList.get(0)).x, ((PointF) arrayList.get(0)).y);
        this.f44193e.moveTo(((PointF) arrayList.get(0)).x, height);
        this.f44193e.lineTo(((PointF) arrayList.get(0)).x, ((PointF) arrayList.get(0)).y);
        int size = arrayList.size();
        for (int i13 = 1; i13 < size; i13++) {
            PointF pointF = (PointF) arrayList.get(i13 - 1);
            PointF pointF2 = (PointF) arrayList.get(i13);
            float f11 = pointF.x;
            float f12 = pointF2.x;
            float f13 = (f11 + f12) / 2;
            Path path = this.f44192d;
            float f14 = pointF.y;
            float f15 = pointF2.y;
            path.cubicTo(f13, f14, f13, f15, f12, f15);
            Path path2 = this.f44193e;
            float f16 = pointF.y;
            float f17 = pointF2.y;
            path2.cubicTo(f13, f16, f13, f17, pointF2.x, f17);
        }
        this.f44193e.lineTo(width, height);
        this.f44193e.close();
        if (this.f44191c.getShader() == null) {
            this.f44191c.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), this.f44196h, 0, Shader.TileMode.CLAMP));
        }
        canvas.drawPath(this.f44193e, this.f44191c);
        this.f44190b.setColor(this.f44195g);
        canvas.drawPath(this.f44192d, this.f44190b);
    }

    public /* synthetic */ TrendChartView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TrendChartView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
        this.f44190b = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        this.f44191c = paint2;
        this.f44192d = new Path();
        this.f44193e = new Path();
        this.f44194f = CollectionsKt.emptyList();
        this.f44195g = -16711936;
        this.f44196h = -16711936;
    }
}
