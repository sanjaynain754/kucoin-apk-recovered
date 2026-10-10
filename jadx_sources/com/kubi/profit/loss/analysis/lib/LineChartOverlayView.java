package com.kubi.profit.loss.analysis.lib;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.ColorUtils;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.profit.loss.analysis.api.AssetsProfitLossAnalysisManager;
import com.kubi.resources.widget.chart.data.DataPoint;
import com.kubi.resources.widget.chart.data.configuration.LineChartConfiguration;
import com.kubi.resources.widget.chart.view.LineChartView;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p439lw.InterfaceC42321c;
import p439lw.InterfaceC42327i;
import p575qw.C43882c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: LineChartOverlayView.kt */
/* JADX INFO: loaded from: classes35.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001bH\u0002J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0016J\u0018\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020(H\u0016J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u0013H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/lib/LineChartOverlayView;", "Landroid/view/View;", "Lcom/kubi/resources/widget/chart/Tooltip;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "paint", "Landroid/graphics/Paint;", "chartView", "Lcom/kubi/resources/widget/chart/view/LineChartView;", "getChartView", "()Lcom/kubi/resources/widget/chart/view/LineChartView;", "setChartView", "(Lcom/kubi/resources/widget/chart/view/LineChartView;)V", "dataList", "", "Lcom/kubi/resources/widget/chart/data/DataPoint;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "overlayStartX", "", "selectIndex", "", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "updateLineColor", "index", "onCreate", "parentView", "Landroid/view/ViewGroup;", "onSelect", "selectPoint", "render", "Lcom/kubi/resources/widget/chart/ChartContract$Renderer;", "onTouchUp", "renderer", "showOverlayView", "dataPoint", "ProfitLossAnalysisLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLineChartOverlayView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LineChartOverlayView.kt\ncom/kubi/profit/loss/analysis/lib/LineChartOverlayView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,120:1\n360#2,7:121\n*S KotlinDebug\n*F\n+ 1 LineChartOverlayView.kt\ncom/kubi/profit/loss/analysis/lib/LineChartOverlayView\n*L\n55#1:121,7\n*E\n"})
public final class LineChartOverlayView extends View implements InterfaceC42327i {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Paint f40634b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public LineChartView f40635c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public List<DataPoint> f40636d;

    /* JADX INFO: renamed from: e */
    public float f40637e;

    /* JADX INFO: renamed from: f */
    public int f40638f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineChartOverlayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        if (DayNightThemeManager.f28592a.m33187l()) {
            paint.setColor(C27046k.m66699n(context, R$color.c_white60));
        } else {
            paint.setColor(ColorUtils.setAlphaComponent(C27046k.m66699n(context, R$color.c_overlay), 200));
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f40634b = paint;
        this.f40636d = CollectionsKt.emptyList();
        this.f40637e = -1.0f;
        this.f40638f = -1;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m50052g(boolean z11, LineChartConfiguration updateConfig) {
        Intrinsics.checkNotNullParameter(updateConfig, "$this$updateConfig");
        LineChartConfiguration.Companion companion = LineChartConfiguration.f44451M;
        DayNightThemeManager dayNightThemeManager = DayNightThemeManager.f28592a;
        updateConfig.m55090h0(companion.getGradientColors(z11, dayNightThemeManager.m33189n()));
        updateConfig.m55087e0(Integer.valueOf(companion.getBackground(z11, dayNightThemeManager.m33189n())));
        return Unit.INSTANCE;
    }

    @Override // p439lw.InterfaceC42327i
    /* JADX INFO: renamed from: a */
    public void mo50053a(@NotNull DataPoint selectPoint, @NotNull InterfaceC42321c render) {
        Intrinsics.checkNotNullParameter(selectPoint, "selectPoint");
        Intrinsics.checkNotNullParameter(render, "render");
        if (selectPoint.getIndex() != this.f40638f) {
            this.f40638f = selectPoint.getIndex();
            m50056e(selectPoint);
            m50057f(this.f40638f);
            render.mo92857a(selectPoint);
            render.postInvalidate();
        }
        AssetsProfitLossAnalysisManager.f40608a.m49947i(selectPoint.getValue());
    }

    @Override // p439lw.InterfaceC42327i
    /* JADX INFO: renamed from: b */
    public void mo50054b(@NotNull InterfaceC42321c renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        ViewExtKt.m66577h(this);
        this.f40637e = -1.0f;
        invalidate();
        m50057f(C27039d.m66650j(Integer.valueOf(this.f40636d.size())) - 1);
        renderer.mo92863g();
        renderer.mo92858b();
        this.f40638f = -1;
        renderer.postInvalidate();
        AssetsProfitLossAnalysisManager.f40608a.m49946h();
    }

    @Override // p439lw.InterfaceC42327i
    /* JADX INFO: renamed from: c */
    public void mo50055c(@NotNull ViewGroup parentView) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        ViewExtKt.m66577h(this);
        parentView.addView(this);
    }

    /* JADX INFO: renamed from: f */
    public final void m50057f(int i11) {
        DataPoint dataPoint = (DataPoint) CollectionsKt.getOrNull(this.f40636d, i11);
        double dM66646f = C27039d.m66646f(dataPoint != null ? Double.valueOf(dataPoint.getValue()) : null);
        DataPoint dataPoint2 = (DataPoint) CollectionsKt.getOrNull(this.f40636d, 0);
        final boolean z11 = dM66646f >= C27039d.m66646f(dataPoint2 != null ? Double.valueOf(dataPoint2.getValue()) : null);
        LineChartView lineChartView = this.f40635c;
        if (lineChartView != null) {
            lineChartView.m55117m(new Function1() { // from class: com.kubi.profit.loss.analysis.lib.a0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LineChartOverlayView.m50052g(z11, (LineChartConfiguration) obj);
                }
            });
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getChartView, reason: from getter */
    public final LineChartView getF40635c() {
        return this.f40635c;
    }

    @NotNull
    public final List<DataPoint> getDataList() {
        return this.f40636d;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f40637e == -1.0f || this.f40635c == null || this.f40636d.isEmpty()) {
            return;
        }
        Iterator<DataPoint> it = this.f40636d.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next().getScreenPositionX() >= this.f40637e) {
                break;
            } else {
                i11++;
            }
        }
        int iCoerceAtMost = i11 >= 0 ? RangesKt.coerceAtMost(i11, this.f40636d.size() - 1) : 0;
        List<DataPoint> list = this.f40636d;
        List<DataPoint> listSubList = list.subList(iCoerceAtMost, list.size());
        if (listSubList.size() >= 2) {
            LineChartView lineChartView = this.f40635c;
            Path pathM96653c = (lineChartView == null || !lineChartView.m55134w()) ? C43882c.m96653c(listSubList) : C43882c.m96654d(listSubList, 0.2f);
            LineChartView lineChartView2 = this.f40635c;
            float fM55136y = lineChartView2 != null ? lineChartView2.m55136y() : 2.0f;
            Paint paint = new Paint(1);
            paint.setColor(this.f40634b.getColor());
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(fM55136y);
            canvas.drawPath(pathM96653c, paint);
        }
    }

    public final void setChartView(@Nullable LineChartView lineChartView) {
        this.f40635c = lineChartView;
    }

    public final void setDataList(@NotNull List<DataPoint> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f40636d = list;
    }

    /* JADX INFO: renamed from: e */
    public final void m50056e(DataPoint dataPoint) {
        ViewExtKt.m66594y(this);
        this.f40637e = dataPoint.getScreenPositionX();
        invalidate();
    }
}
