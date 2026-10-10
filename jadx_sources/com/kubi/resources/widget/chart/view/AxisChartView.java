package com.kubi.resources.widget.chart.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.OneShotPreDrawListener;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.resources.widget.chart.animation.ChartAnimation;
import com.kubi.resources.widget.chart.data.AxisType;
import com.kubi.resources.widget.chart.data.DataPoint;
import com.kubi.resources.widget.chart.plugin.GridEffect;
import com.kubi.resources.widget.chart.plugin.GridType;
import com.kubi.sdk.res.R$styleable;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mw.C42658a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p439lw.C42326h;
import p439lw.InterfaceC42321c;
import p439lw.InterfaceC42322d;
import p439lw.InterfaceC42325g;
import p439lw.InterfaceC42327i;
import p516ow.C43333a;
import p575qw.C43880a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import rw.C44185b;
import rw.C44186c;

/* JADX INFO: compiled from: AxisChartView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 T*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001TB/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010;\u001a\u00020<H\u0014J\b\u0010=\u001a\u00020<H\u0014J\u0018\u0010>\u001a\u00020<2\u0006\u0010?\u001a\u00020\t2\u0006\u0010@\u001a\u00020\tH\u0014J\u0010\u0010A\u001a\u00020<2\u0006\u0010&\u001a\u00020'H\u0014J\u0012\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\u0010\u0010F\u001a\u00020<2\u0006\u0010D\u001a\u00020EH\u0002J\u0014\u0010G\u001a\u00020<2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00140IJ\u001f\u0010J\u001a\u00020<2\u0017\u0010K\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020<0L¢\u0006\u0002\bMJ\u0010\u0010N\u001a\u00020<2\u0006\u0010O\u001a\u00020PH\u0002J\b\u0010Q\u001a\u00020<H\u0004J\u000e\u0010R\u001a\u00020<2\u0006\u0010S\u001a\u000206R\u001c\u0010\n\u001a\u00028\u0000X\u0084\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020-X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u000201X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020605X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u00107\u001a\u000208X¤\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006U"}, m90084d2 = {"Lcom/kubi/resources/widget/chart/view/AxisChartView;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/kubi/resources/widget/chart/data/configuration/ChartConfiguration;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "mChartConfiguration", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/kubi/resources/widget/chart/data/configuration/ChartConfiguration;)V", "getMChartConfiguration", "()Lcom/kubi/resources/widget/chart/data/configuration/ChartConfiguration;", "setMChartConfiguration", "(Lcom/kubi/resources/widget/chart/data/configuration/ChartConfiguration;)V", "Lcom/kubi/resources/widget/chart/data/configuration/ChartConfiguration;", "animation", "Lcom/kubi/resources/widget/chart/animation/ChartAnimation;", "Lcom/kubi/resources/widget/chart/data/DataPoint;", "getAnimation", "()Lcom/kubi/resources/widget/chart/animation/ChartAnimation;", "setAnimation", "(Lcom/kubi/resources/widget/chart/animation/ChartAnimation;)V", "labels", "Lcom/kubi/resources/widget/chart/Labels;", "getLabels", "()Lcom/kubi/resources/widget/chart/Labels;", "grid", "Lcom/kubi/resources/widget/chart/Grid;", "getGrid", "()Lcom/kubi/resources/widget/chart/Grid;", "setGrid", "(Lcom/kubi/resources/widget/chart/Grid;)V", "startX", "", "startY", "canvas", "Landroid/graphics/Canvas;", "getCanvas", "()Landroid/graphics/Canvas;", "setCanvas", "(Landroid/graphics/Canvas;)V", "painter", "Lcom/kubi/resources/widget/chart/Painter;", "getPainter", "()Lcom/kubi/resources/widget/chart/Painter;", "textPainter", "Landroid/text/TextPaint;", "getTextPainter", "()Landroid/text/TextPaint;", "tooltipListeners", "", "Lcom/kubi/resources/widget/chart/Tooltip;", "renderer", "Lcom/kubi/resources/widget/chart/ChartContract$Renderer;", "getRenderer", "()Lcom/kubi/resources/widget/chart/ChartContract$Renderer;", "onAttachedToWindow", "", "onDetachedFromWindow", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "selectPoint", TIMPushProvider.f75062n, RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "updateConfig", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "handleAttributes", "typedArray", "Landroid/content/res/TypedArray;", "handleEditMode", "addDataTransferListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Companion", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAxisChartView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AxisChartView.kt\ncom/kubi/resources/widget/chart/view/AxisChartView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,244:1\n81#2:245\n81#2:246\n*S KotlinDebug\n*F\n+ 1 AxisChartView.kt\ncom/kubi/resources/widget/chart/view/AxisChartView\n*L\n62#1:245\n143#1:246\n*E\n"})
public abstract class AxisChartView<T extends C43333a> extends FrameLayout {

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final Companion f44507l = new Companion(null);

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final List<DataPoint> f44508m = CollectionsKt.listOf((Object[]) new DataPoint[]{new DataPoint(0, 1.0d, false, false, false, false, false, false, false, 0.0f, null, null, null, null, 0.0f, 0.0f, null, 0, null, null, 0, 0, 4194301, null), new DataPoint(0, 7.5d, false, false, false, false, false, false, false, 0.0f, null, null, null, null, 0.0f, 0.0f, null, 0, null, null, 0, 0, 4194301, null), new DataPoint(0, 4.7d, false, false, false, false, false, false, false, 0.0f, null, null, null, null, 0.0f, 0.0f, null, 0, null, null, 0, 0, 4194301, null), new DataPoint(0, 3.5d, false, false, false, false, false, false, false, 0.0f, null, null, null, null, 0.0f, 0.0f, null, 0, null, null, 0, 0, 4194301, null)});

    /* JADX INFO: renamed from: b */
    @NotNull
    public T f44509b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public ChartAnimation<DataPoint> f44510c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final InterfaceC42325g f44511d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public InterfaceC42322d f44512e;

    /* JADX INFO: renamed from: f */
    public float f44513f;

    /* JADX INFO: renamed from: g */
    public float f44514g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Canvas f44515h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final C42326h f44516i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final TextPaint f44517j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final List<InterfaceC42327i> f44518k;

    /* JADX INFO: compiled from: AxisChartView.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/resources/widget/chart/view/AxisChartView$Companion;", "", "<init>", "()V", "defaultFrameWidth", "", "defaultFrameHeight", "defaultLabelsSize", "", "editModeSampleData", "", "Lcom/kubi/resources/widget/chart/data/DataPoint;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.chart.view.AxisChartView$a */
    /* JADX INFO: compiled from: View.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, m90084d2 = {"<anonymous>", "", "run", "androidx/core/view/ViewKt$doOnPreDraw$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnPreDraw$1\n+ 2 AxisChartView.kt\ncom/kubi/resources/widget/chart/view/AxisChartView\n*L\n1#1,414:1\n143#2:415\n*E\n"})
    public static final class RunnableC23025a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f44519b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AxisChartView f44520c;

        public RunnableC23025a(View view, AxisChartView axisChartView) {
            this.f44519b = view;
            this.f44520c = axisChartView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f44520c.getF44523n().mo92859c(this.f44520c.getMChartConfiguration());
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.widget.chart.view.AxisChartView$b */
    /* JADX INFO: compiled from: View.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, m90084d2 = {"<anonymous>", "", "run", "androidx/core/view/ViewKt$doOnPreDraw$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnPreDraw$1\n+ 2 AxisChartView.kt\ncom/kubi/resources/widget/chart/view/AxisChartView\n*L\n1#1,414:1\n63#2,4:415\n*E\n"})
    public static final class RunnableC23026b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f44521b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AxisChartView f44522c;

        public RunnableC23026b(View view, AxisChartView axisChartView) {
            this.f44521b = view;
            this.f44522c = axisChartView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = this.f44522c.f44518k.iterator();
            while (it.hasNext()) {
                ((InterfaceC42327i) it.next()).mo50055c(this.f44522c);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getRenderer */
    public abstract InterfaceC42321c getF44523n();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AxisChartView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, @NotNull T mChartConfiguration) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mChartConfiguration, "mChartConfiguration");
        this.f44509b = mChartConfiguration;
        this.f44510c = new C42658a();
        this.f44511d = new C44186c();
        this.f44516i = new C42326h(null, null, 3, null);
        this.f44517j = new TextPaint();
        this.f44518k = new ArrayList();
        int[] ChartAttrs = R$styleable.ChartAttrs;
        Intrinsics.checkNotNullExpressionValue(ChartAttrs, "ChartAttrs");
        m55112i(C43880a.m96649a(this, attributeSet, ChartAttrs));
        OneShotPreDrawListener.add(this, new RunnableC23026b(this, this));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x010a  */
    /* JADX INFO: renamed from: i */
    private final void m55112i(TypedArray typedArray) {
        AxisType axisType;
        GridType gridType;
        GridEffect gridEffect;
        T t11 = this.f44509b;
        String string = typedArray.getString(R$styleable.ChartAttrs_chart_axis);
        if (string != null) {
            switch (string) {
                case "0":
                    axisType = AxisType.NONE;
                    break;
                case "1":
                    axisType = AxisType.X;
                    break;
                case "2":
                    axisType = AxisType.Y;
                    break;
                default:
                    axisType = AxisType.XY;
                    break;
            }
        } else {
            axisType = AxisType.XY;
        }
        t11.m95392q(axisType);
        T t12 = this.f44509b;
        t12.m95397v(typedArray.getDimension(R$styleable.ChartAttrs_chart_labelsSize, t12.getF95655f()));
        T t13 = this.f44509b;
        t13.m95395t(typedArray.getColor(R$styleable.ChartAttrs_chart_labelsColor, t13.getF95654e()));
        int i11 = R$styleable.ChartAttrs_chart_labelsFont;
        if (typedArray.hasValue(i11) && !isInEditMode()) {
            this.f44509b.m95396u(ResourcesCompat.getFont(getContext(), typedArray.getResourceId(i11, -1)));
            this.f44516i.m92874g(this.f44509b.getF95656g());
        }
        int i12 = R$styleable.ChartAttrs_chart_grid;
        if (typedArray.hasValue(i12)) {
            C44185b c44185b = new C44185b();
            String string2 = typedArray.getString(i12);
            if (string2 != null) {
                switch (string2) {
                    case "0":
                        gridType = GridType.FULL;
                        break;
                    case "1":
                        gridType = GridType.VERTICAL;
                        break;
                    case "2":
                        gridType = GridType.HORIZONTAL;
                        break;
                    default:
                        gridType = GridType.FULL;
                        break;
                }
            } else {
                gridType = GridType.FULL;
            }
            c44185b.m97418i(gridType);
            c44185b.m97416g(typedArray.getColor(R$styleable.ChartAttrs_chart_gridColor, c44185b.getF97531c()));
            c44185b.m97419j(typedArray.getDimension(R$styleable.ChartAttrs_chart_gridStrokeWidth, c44185b.getF97532d()));
            String string3 = typedArray.getString(R$styleable.ChartAttrs_chart_gridEffect);
            if (string3 != null) {
                switch (string3) {
                    case "0":
                        gridEffect = GridEffect.SOLID;
                        break;
                    case "1":
                        gridEffect = GridEffect.DASHED;
                        break;
                    case "2":
                        gridEffect = GridEffect.DOTTED;
                        break;
                    default:
                        gridEffect = GridEffect.SOLID;
                        break;
                }
            } else {
                gridEffect = GridEffect.SOLID;
            }
            c44185b.m97417h(gridEffect);
            this.f44512e = c44185b;
        }
        typedArray.recycle();
    }

    @Override // android.view.View
    @NotNull
    public final ChartAnimation<DataPoint> getAnimation() {
        return this.f44510c;
    }

    @Nullable
    /* JADX INFO: renamed from: getCanvas, reason: from getter */
    public final Canvas getF44515h() {
        return this.f44515h;
    }

    @Nullable
    /* JADX INFO: renamed from: getGrid, reason: from getter */
    public final InterfaceC42322d getF44512e() {
        return this.f44512e;
    }

    @NotNull
    /* JADX INFO: renamed from: getLabels, reason: from getter */
    public final InterfaceC42325g getF44511d() {
        return this.f44511d;
    }

    @NotNull
    public final T getMChartConfiguration() {
        return this.f44509b;
    }

    @NotNull
    /* JADX INFO: renamed from: getPainter, reason: from getter */
    public final C42326h getF44516i() {
        return this.f44516i;
    }

    @NotNull
    /* JADX INFO: renamed from: getTextPainter, reason: from getter */
    public final TextPaint getF44517j() {
        return this.f44517j;
    }

    /* JADX INFO: renamed from: h */
    public final void m55113h(@NotNull InterfaceC42327i listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f44518k.add(listener);
    }

    /* JADX INFO: renamed from: l */
    public final void m55116l(@NotNull List<DataPoint> entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        OneShotPreDrawListener.add(this, new RunnableC23025a(this, this));
        getF44523n().mo92861e(entries);
    }

    /* JADX INFO: renamed from: m */
    public final void m55117m(@NotNull Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(this.f44509b);
        this.f44517j.setTextSize(this.f44509b.getF95661l());
        this.f44517j.setColor(this.f44509b.getF95660k());
        if (this.f44509b.getF95662m() != null) {
            this.f44517j.setTypeface(this.f44509b.getF95662m());
        }
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.f44515h = canvas;
        getF44523n().mo92865i();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        if (!this.f44509b.getF95664o()) {
            return super.onTouchEvent(event);
        }
        if (event != null && event.getAction() == 0) {
            getF44523n().mo92864h();
            this.f44513f = event.getX();
            this.f44514g = event.getY();
            m55115k(event);
        }
        if (event != null && event.getAction() == 2) {
            float x11 = event.getX();
            float y11 = event.getY();
            if (Math.abs(x11 - this.f44513f) > Math.abs(y11 - this.f44514g)) {
                getParent().requestDisallowInterceptTouchEvent(true);
                m55115k(event);
            }
        }
        if ((event != null && event.getAction() == 1) || (event != null && event.getAction() == 3)) {
            C44128b.m97259c("chart", "MotionEvent event ---> ACTION_UP");
            Iterator<InterfaceC42327i> it = this.f44518k.iterator();
            while (it.hasNext()) {
                it.next().mo50054b(getF44523n());
            }
        }
        return true;
    }

    public final void setAnimation(@NotNull ChartAnimation<DataPoint> chartAnimation) {
        Intrinsics.checkNotNullParameter(chartAnimation, "<set-?>");
        this.f44510c = chartAnimation;
    }

    public final void setCanvas(@Nullable Canvas canvas) {
        this.f44515h = canvas;
    }

    public final void setGrid(@Nullable InterfaceC42322d interfaceC42322d) {
        this.f44512e = interfaceC42322d;
    }

    public final void setMChartConfiguration(@NotNull T t11) {
        Intrinsics.checkNotNullParameter(t11, "<set-?>");
        this.f44509b = t11;
    }

    /* JADX INFO: renamed from: j */
    public final void m55114j() {
        if (isInEditMode()) {
            m55116l(f44508m);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m55115k(MotionEvent motionEvent) {
        DataPoint dataPointMo92862f = getF44523n().mo92862f(Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()));
        C44128b.m97259c("chart", "MotionEvent event ---> ACTION_DOWN index:" + dataPointMo92862f);
        if (dataPointMo92862f != null) {
            Iterator<InterfaceC42327i> it = this.f44518k.iterator();
            while (it.hasNext()) {
                it.next().mo50053a(dataPointMo92862f, getF44523n());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getF44523n().stopAnimation();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        if (mode == Integer.MIN_VALUE) {
            widthMeasureSpec = 200;
        }
        if (mode2 == Integer.MIN_VALUE) {
            heightMeasureSpec = 100;
        }
        setMeasuredDimension(widthMeasureSpec, heightMeasureSpec);
    }
}
