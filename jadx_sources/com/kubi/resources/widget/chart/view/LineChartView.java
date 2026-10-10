package com.kubi.resources.widget.chart.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.jumio.core.extraction.ProcessingTimesRecorderKt;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.kubi.resources.widget.chart.data.DataPoint;
import com.kubi.resources.widget.chart.data.TipGravity;
import com.kubi.resources.widget.chart.data.configuration.LineChartConfiguration;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$drawable;
import com.kubi.sdk.res.R$mipmap;
import com.kubi.sdk.res.R$styleable;
import com.kubi.utils.C27063n;
import com.kubi.utils.extensions.C27040e;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p439lw.C42326h;
import p439lw.InterfaceC42320b;
import p439lw.InterfaceC42321c;
import p439lw.InterfaceC42322d;
import p479nw.C42890c;
import p479nw.Frame;
import p479nw.Label;
import p575qw.C43880a;
import p625sw.C44564b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: LineChartView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0014J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u001e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\u0006\u0010\u001c\u001a\u00020\u0015J\u001e\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0017J\u0010\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u001bH\u0016J.\u0010\"\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\tH\u0016J\u0016\u0010$\u001a\u00020\r2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u001aH\u0016J,\u0010'\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130\u001aH\u0016J\u001e\u0010*\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u000e\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u0015J\u000e\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0013J \u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020\u0013H\u0002J$\u00103\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001b2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u001e\u00106\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u001b2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u001e\u00107\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u001b2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J&\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00182\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0018\u00108\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u00109\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0016\u0010:\u001a\u00020\r2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00180\u001aH\u0016J\u0010\u0010<\u001a\u00020\r2\u0006\u0010=\u001a\u00020>H\u0002R\u0014\u0010?\u001a\u00020@X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010B¨\u0006C"}, m90084d2 = {"Lcom/kubi/resources/widget/chart/view/LineChartView;", "Lcom/kubi/resources/widget/chart/view/AxisChartView;", "Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;", "Lcom/kubi/resources/widget/chart/ChartContract$LineView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onSizeChanged", "", "w", CmcdData.Factory.STREAMING_FORMAT_HLS, "oldw", "oldh", "lineThickness", "", "isSmoothEnabled", "", "drawBackgroundImage", "innerFrame", "Lcom/kubi/resources/widget/chart/data/Frame;", "points", "", "Lcom/kubi/resources/widget/chart/data/DataPoint;", "isUpGreen", "drawLine", "path", "Landroid/graphics/Path;", "drawSelectLine", "dataPoint", "drawLineBackground", "alpha", "drawLabels", "xLabels", "Lcom/kubi/resources/widget/chart/data/Label;", "drawGrid", "xLabelsPositions", "yLabelsPositions", "drawPoints", "getCircleColor", "isUp", "getAnimatedLineColor", "animationProgress", "interpolateColor", "startColor", "endColor", "fraction", "drawSelectPoint", "first", "allPoints", "getPointColorByPosition", "getLastPointColor", "drawTextTip", "drawInOutPoint", "drawDebugFrame", ProcessingTimesRecorderKt.DEFAULT_RECORDS_LABEL, "handleAttributes", "typedArray", "Landroid/content/res/TypedArray;", "renderer", "Lcom/kubi/resources/widget/chart/ChartContract$Renderer;", "getRenderer", "()Lcom/kubi/resources/widget/chart/ChartContract$Renderer;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLineChartView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LineChartView.kt\ncom/kubi/resources/widget/chart/view/LineChartView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,522:1\n1869#2,2:523\n1761#2,3:525\n1869#2,2:529\n1#3:528\n*S KotlinDebug\n*F\n+ 1 LineChartView.kt\ncom/kubi/resources/widget/chart/view/LineChartView\n*L\n183#1:523,2\n264#1:525,3\n478#1:529,2\n*E\n"})
public final class LineChartView extends AxisChartView<LineChartConfiguration> implements InterfaceC42320b {

    /* JADX INFO: renamed from: n */
    @NotNull
    public final InterfaceC42321c f44523n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LineChartView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: o */
    public final void m55126o(DataPoint dataPoint, Frame frame, List<DataPoint> list) {
        if (dataPoint.getNeedShowSelectLine()) {
            DataPoint dataPoint2 = (DataPoint) CollectionsKt.getOrNull(list, 0);
            int iM55130s = m55130s(dataPoint.getValue() >= (dataPoint2 != null ? dataPoint2.getValue() : 0.0d));
            Canvas f44515h = getF44515h();
            if (f44515h != null) {
                float screenPositionX = dataPoint.getScreenPositionX();
                float bottom = frame.getBottom() + C27040e.m66658b(8);
                float screenPositionX2 = dataPoint.getScreenPositionX();
                float top = frame.getTop() - C27040e.m66658b(getMChartConfiguration().getF44465L());
                Paint paint = new Paint();
                paint.setColor(iM55130s);
                paint.setStrokeWidth(getMChartConfiguration().getF44459F());
                paint.setPathEffect(new DashPathEffect(new float[]{getMChartConfiguration().getF44458E(), getMChartConfiguration().getF44458E()}, 0.0f));
                Unit unit = Unit.INSTANCE;
                f44515h.drawLine(screenPositionX, bottom, screenPositionX2, top, paint);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m55135x() {
        return C27063n.m66765c(KCTurboSystemSettingsModuleImpl.KV_KEY_UP_DOWN, 0, 1, null) == 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LineChartView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // p439lw.InterfaceC42320b
    /* JADX INFO: renamed from: a */
    public void mo55118a(@NotNull List<DataPoint> points, @NotNull Frame innerFrame) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(innerFrame, "innerFrame");
        if (getMChartConfiguration().getF44475y()) {
            if (!points.isEmpty()) {
                ((DataPoint) CollectionsKt.last((List) points)).setNeedShowPoint(true);
                ((DataPoint) CollectionsKt.last((List) points)).setAnimatedSolidPoint(true);
            }
            for (DataPoint dataPoint : points) {
                m55127p(dataPoint, points.get(0), points);
                m55126o(dataPoint, innerFrame, points);
                m55128q(dataPoint, innerFrame);
                if (getMChartConfiguration().getF44464K()) {
                    m55125n(dataPoint, innerFrame);
                }
            }
        }
    }

    @Override // p439lw.InterfaceC42319a
    /* JADX INFO: renamed from: b */
    public void mo55119b(@NotNull List<Label> xLabels) {
        Intrinsics.checkNotNullParameter(xLabels, "xLabels");
        C42326h.m92868f(getF44516i(), getMChartConfiguration().getF95655f(), getMChartConfiguration().getF95654e(), null, 0.0f, null, getMChartConfiguration().getF95656g(), 28, null);
        getF44511d().mo92867a(getF44515h(), getF44516i().getF93838a(), xLabels);
    }

    @Override // p439lw.InterfaceC42320b
    /* JADX INFO: renamed from: c */
    public void mo55120c(@NotNull Frame innerFrame, @NotNull List<DataPoint> points) {
        Intrinsics.checkNotNullParameter(innerFrame, "innerFrame");
        Intrinsics.checkNotNullParameter(points, "points");
        if (getMChartConfiguration().getF44472v()) {
            Resources resources = getResources();
            Integer f44471u = getMChartConfiguration().getF44471u();
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, f44471u != null ? f44471u.intValue() : R$drawable.asset_line_chat_up_bg);
            if (bitmapDecodeResource != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmapDecodeResource, tileMode, tileMode);
                float right = (innerFrame.getRight() - innerFrame.getLeft()) / bitmapDecodeResource.getWidth();
                float bottom = (innerFrame.getBottom() - innerFrame.getTop()) / bitmapDecodeResource.getHeight();
                Matrix matrix = new Matrix();
                matrix.setScale(right, bottom);
                matrix.postTranslate(innerFrame.getLeft(), innerFrame.getTop());
                bitmapShader.setLocalMatrix(matrix);
                C42326h.m92868f(getF44516i(), 0.0f, 0, Paint.Style.FILL, 0.0f, bitmapShader, null, 43, null);
                Canvas f44515h = getF44515h();
                if (f44515h != null) {
                    f44515h.drawRect(innerFrame.getLeft(), innerFrame.getTop(), innerFrame.getRight(), innerFrame.getBottom(), getF44516i().getF93838a());
                }
                getF44516i().getF93838a().setShader(null);
            }
        }
    }

    @Override // p439lw.InterfaceC42319a
    /* JADX INFO: renamed from: d */
    public void mo55121d(@NotNull Frame innerFrame, @NotNull List<Float> xLabelsPositions, @NotNull List<Float> yLabelsPositions) {
        Intrinsics.checkNotNullParameter(innerFrame, "innerFrame");
        Intrinsics.checkNotNullParameter(xLabelsPositions, "xLabelsPositions");
        Intrinsics.checkNotNullParameter(yLabelsPositions, "yLabelsPositions");
        InterfaceC42322d f44512e = getF44512e();
        if (f44512e != null) {
            f44512e.mo92866a(getF44515h(), innerFrame, xLabelsPositions, yLabelsPositions);
        }
    }

    @Override // p439lw.InterfaceC42320b
    /* JADX INFO: renamed from: e */
    public void mo55122e(@NotNull Frame innerFrame, @NotNull List<DataPoint> points, @NotNull Path path, int i11) {
        Intrinsics.checkNotNullParameter(innerFrame, "innerFrame");
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(path, "path");
        if (getMChartConfiguration().getF44467q().getShowFill()) {
            C42326h.m92868f(getF44516i(), 0.0f, getMChartConfiguration().getF44467q().getFillColor(), Paint.Style.FILL, 0.0f, null, null, 57, null);
        } else {
            C42326h.m92868f(getF44516i(), 0.0f, 0, Paint.Style.FILL, 0.0f, C42890c.m94049b(innerFrame, getMChartConfiguration().getF44467q()), null, 43, null);
        }
        getF44516i().getF93838a().setAlpha(i11);
        Canvas f44515h = getF44515h();
        if (f44515h != null) {
            f44515h.drawPath(path, getF44516i().getF93838a());
        }
    }

    @Override // p439lw.InterfaceC42320b
    @RequiresApi(26)
    /* JADX INFO: renamed from: f */
    public void mo55123f(@NotNull Path path, @NotNull List<DataPoint> points) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(points, "points");
        if (!getMChartConfiguration().getF44473w() || getMChartConfiguration().getF44470t() == null) {
            C42326h.m92868f(getF44516i(), 0.0f, getMChartConfiguration().getF44469s(), Paint.Style.STROKE, getMChartConfiguration().getF44466p(), null, null, 49, null);
            Canvas f44515h = getF44515h();
            if (f44515h != null) {
                f44515h.drawPath(path, getF44516i().getF93838a());
                return;
            }
            return;
        }
        Frame f98845f = getF44523n().getF98845f();
        float left = f98845f.getLeft();
        float top = f98845f.getTop();
        float right = f98845f.getRight();
        float top2 = f98845f.getTop();
        int[] f44470t = getMChartConfiguration().getF44470t();
        Intrinsics.checkNotNull(f44470t);
        C42326h.m92868f(getF44516i(), 0.0f, getMChartConfiguration().getF44469s(), Paint.Style.STROKE, getMChartConfiguration().getF44466p(), new LinearGradient(left, top, right, top2, f44470t, (float[]) null, Shader.TileMode.CLAMP), null, 33, null);
        Canvas f44515h2 = getF44515h();
        if (f44515h2 != null) {
            f44515h2.drawPath(path, getF44516i().getF93838a());
        }
        getF44516i().getF93838a().setShader(null);
    }

    @Override // com.kubi.resources.widget.chart.view.AxisChartView
    @NotNull
    /* JADX INFO: renamed from: getRenderer, reason: from getter */
    public InterfaceC42321c getF44523n() {
        return this.f44523n;
    }

    /* JADX INFO: renamed from: p */
    public final void m55127p(@NotNull DataPoint dataPoint, @NotNull DataPoint first, @NotNull List<DataPoint> allPoints) {
        int i11;
        Intrinsics.checkNotNullParameter(dataPoint, "dataPoint");
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(allPoints, "allPoints");
        if (dataPoint.getNeedShowPoint()) {
            if (!dataPoint.isAnimatedSolidPoint()) {
                int iM55132u = m55132u(dataPoint, allPoints);
                int color = getResources().getColor(R$color.c_overlay);
                C42326h f44516i = getF44516i();
                Paint.Style style = Paint.Style.FILL;
                C42326h.m92868f(f44516i, 0.0f, iM55132u, style, 0.0f, null, null, 57, null);
                Canvas f44515h = getF44515h();
                if (f44515h != null) {
                    f44515h.drawCircle(dataPoint.getScreenPositionX(), dataPoint.getScreenPositionY(), getMChartConfiguration().getF44460G(), getF44516i().getF93838a());
                }
                C42326h.m92868f(getF44516i(), 0.0f, color, style, 0.0f, null, null, 57, null);
                Canvas f44515h2 = getF44515h();
                if (f44515h2 != null) {
                    f44515h2.drawCircle(dataPoint.getScreenPositionX(), dataPoint.getScreenPositionY(), getMChartConfiguration().getF44461H(), getF44516i().getF93838a());
                    return;
                }
                return;
            }
            int iM55129r = dataPoint.isAnimatedPoint() ? m55129r(dataPoint.getAnimationProgress()) : m55131t(dataPoint, allPoints);
            if (allPoints != null && allPoints.isEmpty()) {
                i11 = 255;
                break;
            }
            Iterator<T> it = allPoints.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i11 = 255;
                    break;
                }
                DataPoint dataPoint2 = (DataPoint) it.next();
                if (dataPoint2.getNeedShowPoint() && !Intrinsics.areEqual(dataPoint2, dataPoint)) {
                    i11 = 64;
                    break;
                }
            }
            C42326h.m92868f(getF44516i(), 0.0f, ColorUtils.setAlphaComponent(iM55129r, i11), Paint.Style.FILL, 0.0f, null, null, 57, null);
            Canvas f44515h3 = getF44515h();
            if (f44515h3 != null) {
                f44515h3.drawCircle(dataPoint.getScreenPositionX(), dataPoint.getScreenPositionY(), getMChartConfiguration().getF44460G(), getF44516i().getF93838a());
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final int m55130s(boolean z11) {
        Integer numLastOrNull = ArraysKt.lastOrNull(LineChartConfiguration.f44451M.getGradientColors(z11, m55135x()));
        return numLastOrNull != null ? numLastOrNull.intValue() : getMChartConfiguration().getF44462I();
    }

    /* JADX INFO: renamed from: v */
    public final int m55133v(int i11, int i12, float f11) {
        int i13 = (i11 >> 24) & 255;
        int i14 = (i11 >> 16) & 255;
        int i15 = (i11 >> 8) & 255;
        int i16 = i11 & 255;
        return ((int) (i16 + (((i12 & 255) - i16) * f11))) | (((int) (i13 + ((((i12 >> 24) & 255) - i13) * f11))) << 24) | (((int) (i14 + ((((i12 >> 16) & 255) - i14) * f11))) << 16) | (((int) (i15 + ((((i12 >> 8) & 255) - i15) * f11))) << 8);
    }

    public /* synthetic */ LineChartView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: i */
    public final void m55124i(TypedArray typedArray) {
        getMChartConfiguration().m55089g0(typedArray.getColor(R$styleable.LineChartAttrs_chart_lineColor, ViewCompat.MEASURED_STATE_MASK));
        getMChartConfiguration().m55091i0(typedArray.getDimension(R$styleable.LineChartAttrs_chart_lineThickness, 4.0f));
        getMChartConfiguration().m55102t0(typedArray.getBoolean(R$styleable.LineChartAttrs_chart_smoothLine, false));
        typedArray.recycle();
    }

    /* JADX INFO: renamed from: n */
    public final void m55125n(DataPoint dataPoint, Frame frame) {
        Bitmap bitmapDecodeResource;
        if (dataPoint.isDepositOrWithdraw() == 1 || dataPoint.isDepositOrWithdraw() == 2) {
            if (dataPoint.isDepositOrWithdraw() == 1) {
                bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R$mipmap.ic_line_chart_funds_in);
                Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(...)");
            } else {
                bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R$mipmap.ic_line_chart_funds_out);
                Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(...)");
            }
            float screenPositionX = dataPoint.getScreenPositionX() - (bitmapDecodeResource.getWidth() / 2.0f);
            if (bitmapDecodeResource.getWidth() + screenPositionX > frame.getRight()) {
                screenPositionX = frame.getRight() - bitmapDecodeResource.getWidth();
            }
            if (screenPositionX < frame.getLeft()) {
                screenPositionX = frame.getLeft();
            }
            if (dataPoint.getTipGravity() == TipGravity.TOP) {
                Canvas f44515h = getF44515h();
                if (f44515h != null) {
                    f44515h.drawBitmap(bitmapDecodeResource, screenPositionX, RangesKt.coerceAtLeast((dataPoint.getScreenPositionY() - bitmapDecodeResource.getHeight()) - 15.0f, 0.0f), (Paint) null);
                    return;
                }
                return;
            }
            Canvas f44515h2 = getF44515h();
            if (f44515h2 != null) {
                f44515h2.drawBitmap(bitmapDecodeResource, screenPositionX, dataPoint.getScreenPositionY() + 15.0f, (Paint) null);
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        getMChartConfiguration().m95373B(w11);
        getMChartConfiguration().m95394s(h11);
    }

    /* JADX INFO: renamed from: q */
    public final void m55128q(DataPoint dataPoint, Frame frame) {
        float screenPositionY;
        float screenPositionY2;
        if (dataPoint.getNeedShowTip()) {
            float fM92872d = getF44516i().m92872d(dataPoint.getNormalText(), getMChartConfiguration().getF95661l());
            float screenPositionX = dataPoint.getScreenPositionX();
            float fM92871c = getF44516i().m92871c(getMChartConfiguration().getF95661l());
            float left = screenPositionX - (fM92872d / 2);
            if (left + fM92872d > frame.getRight()) {
                left = frame.getRight() - fM92872d;
            }
            if (left < frame.getLeft()) {
                left = frame.getLeft();
            }
            if ((dataPoint.isDepositOrWithdraw() == 1 || dataPoint.isDepositOrWithdraw() == 2) && getMChartConfiguration().getF44464K()) {
                Canvas f44515h = getF44515h();
                if (f44515h != null) {
                    String normalText = dataPoint.getNormalText();
                    if (dataPoint.getTipGravity() == TipGravity.TOP) {
                        screenPositionY = RangesKt.coerceAtLeast(dataPoint.getScreenPositionY() - C27040e.m66658b(26), 0.0f);
                    } else {
                        screenPositionY = dataPoint.getScreenPositionY() + fM92871c + C27040e.m66658b(17);
                    }
                    f44515h.drawText(normalText, left, screenPositionY, getF44517j());
                    return;
                }
                return;
            }
            Canvas f44515h2 = getF44515h();
            if (f44515h2 != null) {
                String normalText2 = dataPoint.getNormalText();
                if (dataPoint.getTipGravity() == TipGravity.TOP) {
                    screenPositionY2 = RangesKt.coerceAtLeast(dataPoint.getScreenPositionY() - C27040e.m66658b(12), 0.0f);
                } else {
                    screenPositionY2 = dataPoint.getScreenPositionY() + fM92871c + C27040e.m66658b(7);
                }
                f44515h2.drawText(normalText2, left, screenPositionY2, getF44517j());
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final int m55129r(float f11) {
        int[] f44470t = getMChartConfiguration().getF44470t();
        if (f44470t == null) {
            return getMChartConfiguration().getF44462I();
        }
        if (f44470t.length == 0) {
            return getMChartConfiguration().getF44462I();
        }
        if (f44470t.length == 1) {
            return f44470t[0];
        }
        int length = f44470t.length - 1;
        float fCoerceIn = RangesKt.coerceIn(f11, 0.0f, 1.0f) * length;
        int i11 = (int) fCoerceIn;
        float f12 = fCoerceIn - i11;
        if (i11 >= length) {
            return ArraysKt.last(f44470t);
        }
        return m55133v(f44470t[i11], f44470t[i11 + 1], f12);
    }

    /* JADX INFO: renamed from: t */
    public final int m55131t(DataPoint dataPoint, List<DataPoint> list) {
        Object next;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                DataPoint dataPoint2 = (DataPoint) next;
                if (dataPoint2.getNeedShowPoint() && !Intrinsics.areEqual(dataPoint2, dataPoint)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        DataPoint dataPoint3 = (DataPoint) next;
        boolean z11 = false;
        DataPoint dataPoint4 = (DataPoint) CollectionsKt.getOrNull(list, 0);
        double value = 0.0d;
        if (dataPoint3 != null) {
            double value2 = dataPoint3.getValue();
            if (dataPoint4 != null) {
                value = dataPoint4.getValue();
            }
            if (value2 >= value) {
                z11 = true;
            }
            return m55130s(z11);
        }
        double value3 = dataPoint.getValue();
        if (dataPoint4 != null) {
            value = dataPoint4.getValue();
        }
        if (value3 >= value) {
            z11 = true;
        }
        return m55130s(z11);
    }

    /* JADX INFO: renamed from: u */
    public final int m55132u(DataPoint dataPoint, List<DataPoint> list) {
        int[] f44470t = getMChartConfiguration().getF44470t();
        if (f44470t == null) {
            return getMChartConfiguration().getF44462I();
        }
        if (f44470t.length == 0) {
            return getMChartConfiguration().getF44462I();
        }
        if (f44470t.length == 1) {
            return f44470t[0];
        }
        DataPoint dataPoint2 = (DataPoint) CollectionsKt.firstOrNull((List) list);
        if (dataPoint2 == null) {
            return f44470t[0];
        }
        DataPoint dataPoint3 = (DataPoint) CollectionsKt.lastOrNull((List) list);
        if (dataPoint3 == null) {
            return f44470t[0];
        }
        if (Intrinsics.areEqual(dataPoint2, dataPoint3)) {
            return f44470t[0];
        }
        float screenPositionX = dataPoint3.getScreenPositionX() - dataPoint2.getScreenPositionX();
        float fCoerceIn = 0.0f;
        if (screenPositionX != 0.0f) {
            fCoerceIn = RangesKt.coerceIn((dataPoint.getScreenPositionX() - dataPoint2.getScreenPositionX()) / screenPositionX, 0.0f, 1.0f);
        }
        return m55129r(fCoerceIn);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m55134w() {
        return getMChartConfiguration().getF44474x();
    }

    /* JADX INFO: renamed from: y */
    public final float m55136y() {
        return getMChartConfiguration().getF44466p();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LineChartView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, new LineChartConfiguration());
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44523n = new C44564b(this, getF44516i(), getMChartConfiguration());
        int[] LineChartAttrs = R$styleable.LineChartAttrs;
        Intrinsics.checkNotNullExpressionValue(LineChartAttrs, "LineChartAttrs");
        m55124i(C43880a.m96649a(this, attributeSet, LineChartAttrs));
        m55114j();
    }
}
