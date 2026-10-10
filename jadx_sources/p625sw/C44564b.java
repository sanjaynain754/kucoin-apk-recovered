package p625sw;

import android.graphics.Path;
import android.graphics.PathMeasure;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.kubi.resources.widget.chart.data.DataPoint;
import com.kubi.resources.widget.chart.data.configuration.LineChartConfiguration;
import com.kubi.utils.C27063n;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mw.C42660c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p439lw.C42326h;
import p439lw.InterfaceC42320b;
import p439lw.InterfaceC42321c;
import p479nw.C42888a;
import p479nw.C42890c;
import p479nw.Frame;
import p479nw.Label;
import p479nw.Paddings;
import p479nw.PointFrame;
import p479nw.Scale;
import p516ow.C43333a;
import p516ow.C43334b;
import p575qw.C43882c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tw.C45076a;

/* JADX INFO: renamed from: sw.b */
/* JADX INFO: compiled from: LineChartRenderer.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0002J\u001e\u0010!\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010#\u001a\u00020\u0013H\u0002J\b\u0010$\u001a\u00020 H\u0002J\u0006\u0010%\u001a\u00020\u001cJ\b\u0010&\u001a\u00020 H\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010'\u001a\u00020 H\u0016J\b\u0010(\u001a\u00020 H\u0016J\b\u0010)\u001a\u00020 H\u0016J\u0010\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020\fH\u0016J\b\u0010,\u001a\u00020 H\u0016J\b\u0010-\u001a\u00020 H\u0016J\b\u0010.\u001a\u00020 H\u0002J\b\u0010/\u001a\u00020 H\u0002J\b\u00100\u001a\u00020 H\u0002J\b\u00101\u001a\u00020 H\u0002J\b\u00102\u001a\u00020 H\u0002J\u0016\u00103\u001a\u00020 2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J#\u00106\u001a\u0004\u0018\u00010\f2\b\u00107\u001a\u0004\u0018\u00010\u00132\b\u00108\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0002\u00109J\u0010\u0010:\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010;\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010<\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J0\u0010=\u001a\u00020 2\u0006\u0010+\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020\u00132\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u0013H\u0002J(\u0010B\u001a\u00020 2\u0006\u0010?\u001a\u00020@2\u0006\u0010+\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u0013H\u0002J\b\u0010D\u001a\u00020 H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006E"}, m90084d2 = {"Lcom/kubi/resources/widget/chart/renderer/LineChartRenderer;", "Lcom/kubi/resources/widget/chart/ChartContract$Renderer;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Lcom/kubi/resources/widget/chart/ChartContract$LineView;", "painter", "Lcom/kubi/resources/widget/chart/Painter;", "chartConfiguration", "Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;", "<init>", "(Lcom/kubi/resources/widget/chart/ChartContract$LineView;Lcom/kubi/resources/widget/chart/Painter;Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;)V", "data", "", "Lcom/kubi/resources/widget/chart/data/DataPoint;", "outerFrame", "Lcom/kubi/resources/widget/chart/data/Frame;", "innerFrame", "mPathAnimation", "Lcom/kubi/resources/widget/chart/animation/PathAnimation;", "mLength", "", "mPathMeasure", "Landroid/graphics/PathMeasure;", "linePath", "Landroid/graphics/Path;", "xFrameList", "", "Lcom/kubi/resources/widget/chart/data/PointFrame;", "preDraw", "", "configuration", "Lcom/kubi/resources/widget/chart/data/configuration/ChartConfiguration;", "createLinePath", "", "createBackgroundPath", "points", "innerFrameBottom", "startAnimator", "isUpGreen", "draw", "hidePointTip", "postInvalidate", "showPointTip", "selectPoint", "dataPoint", "unSelectPoint", "stopAnimation", "drawPoints", "drawDebugFrame", "drawLineBackground", "drawBackgroundImage", "drawLine", "render", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "getDataPointList", "processTouch", "x", "y", "(Ljava/lang/Float;Ljava/lang/Float;)Lcom/kubi/resources/widget/chart/data/DataPoint;", "placeLabelsX", "placeLabelsY", "placeDataPoints", "updatePointXY", "widthBetweenLabels", "index", "", "chartHeight", "addPointFrame", "halfWidthBetweenLabels", "drawAnimatedLastPoint", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLineChartRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LineChartRenderer.kt\ncom/kubi/resources/widget/chart/renderer/LineChartRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IterableExt.kt\ncom/kubi/resources/widget/chart/extensions/IterableExtKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,528:1\n1#2:529\n1#2:555\n1#2:557\n1#2:559\n1#2:561\n4#3,13:530\n1761#4,3:543\n1563#4:546\n1634#4,3:547\n1563#4:550\n1634#4,3:551\n2756#4:554\n2756#4:556\n2756#4:558\n2756#4:560\n295#4,2:562\n1878#4,3:564\n1878#4,3:567\n1878#4,3:570\n*S KotlinDebug\n*F\n+ 1 LineChartRenderer.kt\ncom/kubi/resources/widget/chart/renderer/LineChartRenderer\n*L\n214#1:555\n224#1:557\n230#1:559\n237#1:561\n69#1:530,13\n164#1:543,3\n186#1:546\n186#1:547,3\n187#1:550\n187#1:551,3\n214#1:554\n224#1:556\n230#1:558\n237#1:560\n341#1:562,2\n369#1:564,3\n390#1:567,3\n418#1:570,3\n*E\n"})
public final class C44564b implements InterfaceC42321c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC42320b f98840a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final C42326h f98841b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public LineChartConfiguration f98842c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public List<DataPoint> f98843d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public Frame f98844e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public Frame f98845f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public C42660c f98846g;

    /* JADX INFO: renamed from: h */
    public float f98847h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public PathMeasure f98848i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public Path f98849j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public List<PointFrame> f98850k;

    @Override // p439lw.InterfaceC42321c
    @Nullable
    /* JADX INFO: renamed from: f */
    public DataPoint mo92862f(@Nullable Float f11, @Nullable Float f12) {
        Object next;
        if (f11 != null && f12 != null) {
            Iterator<T> it = this.f98850k.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!C42890c.m94048a((PointFrame) next, f11.floatValue(), f12.floatValue()));
            PointFrame pointFrame = (PointFrame) next;
            if (pointFrame != null) {
                return pointFrame.getDataPoint();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m98648t() {
        return C27063n.m66765c(KCTurboSystemSettingsModuleImpl.KV_KEY_UP_DOWN, 0, 1, null) == 0;
    }

    public C44564b(@NotNull InterfaceC42320b view, @NotNull C42326h painter, @NotNull LineChartConfiguration chartConfiguration) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(chartConfiguration, "chartConfiguration");
        this.f98840a = view;
        this.f98841b = painter;
        this.f98842c = chartConfiguration;
        this.f98843d = CollectionsKt.emptyList();
        this.f98844e = new Frame(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        this.f98845f = new Frame(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        this.f98850k = new ArrayList();
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m98638y(C44564b c44564b, float f11) {
        c44564b.f98840a.postInvalidate();
        return Unit.INSTANCE;
    }

    @Override // p439lw.InterfaceC42321c
    /* JADX INFO: renamed from: a */
    public void mo92857a(@NotNull DataPoint dataPoint) {
        Intrinsics.checkNotNullParameter(dataPoint, "dataPoint");
        for (DataPoint dataPoint2 : this.f98843d) {
            boolean z11 = false;
            dataPoint2.setNeedShowPoint(dataPoint2.getIndex() == dataPoint.getIndex());
            if (dataPoint2.getIndex() == dataPoint.getIndex()) {
                z11 = true;
            }
            dataPoint2.setNeedShowSelectLine(z11);
        }
    }

    @Override // p439lw.InterfaceC42321c
    /* JADX INFO: renamed from: b */
    public void mo92858b() {
        for (DataPoint dataPoint : this.f98843d) {
            dataPoint.setNeedShowTip(dataPoint.isMax() || dataPoint.isMin());
        }
    }

    @Override // p439lw.InterfaceC42321c
    /* JADX INFO: renamed from: c */
    public boolean mo92859c(@NotNull C43333a configuration) {
        Double dValueOf;
        Double dValueOf2;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        if (this.f98843d.isEmpty()) {
            return true;
        }
        LineChartConfiguration lineChartConfiguration = (LineChartConfiguration) configuration;
        this.f98842c = lineChartConfiguration;
        Iterator<T> it = lineChartConfiguration.m95390o().iterator();
        Float fValueOf = null;
        if (it.hasNext()) {
            double value = ((Label) it.next()).getValue();
            while (it.hasNext()) {
                value = Math.min(value, ((Label) it.next()).getValue());
            }
            dValueOf = Double.valueOf(value);
        } else {
            dValueOf = null;
        }
        double dM66646f = C27039d.m66646f(dValueOf);
        Iterator<T> it2 = this.f98842c.m95390o().iterator();
        if (it2.hasNext()) {
            double value2 = ((Label) it2.next()).getValue();
            while (it2.hasNext()) {
                value2 = Math.max(value2, ((Label) it2.next()).getValue());
            }
            dValueOf2 = Double.valueOf(value2);
        } else {
            dValueOf2 = null;
        }
        lineChartConfiguration.m95399x(new Scale(dM66646f, C27039d.m66646f(dValueOf2)));
        this.f98842c.m95374C(C43882c.m96652b(this.f98843d));
        Iterator<T> it3 = this.f98842c.m95390o().iterator();
        if (it3.hasNext()) {
            fValueOf = Float.valueOf(this.f98841b.m92872d(((Label) it3.next()).getLabel(), this.f98842c.getF95655f()));
            if (it3.hasNext()) {
                do {
                    Float fValueOf2 = Float.valueOf(this.f98841b.m92872d(((Label) it3.next()).getLabel(), this.f98842c.getF95655f()));
                    if (fValueOf.compareTo(fValueOf2) < 0) {
                        fValueOf = fValueOf2;
                    }
                } while (it3.hasNext());
            }
        }
        if (fValueOf == null) {
            return true;
        }
        Paddings paddingsM99679a = new C45076a().m99679a(this.f98842c.getF95653d(), this.f98841b.m92871c(this.f98842c.getF95655f()), fValueOf.floatValue(), 15.0f, this.f98842c.getF44466p(), (int) this.f98842c.getF44460G(), (int) this.f98842c.getF44460G(), this.f98842c.getF44465L());
        Frame frameM95402a = C43334b.m95402a(this.f98842c);
        this.f98844e = frameM95402a;
        this.f98845f = C42890c.m94050c(frameM95402a, paddingsM99679a);
        Function2<Frame, Frame, Unit> function2M55068L = this.f98842c.m55068L();
        if (function2M55068L != null) {
            function2M55068L.invoke(this.f98844e, this.f98845f);
        }
        m98650v(this.f98845f);
        m98651w(this.f98845f);
        m98649u(this.f98845f);
        m98641m();
        if (!lineChartConfiguration.getF44454A()) {
            return false;
        }
        m98652x();
        return false;
    }

    @Override // p439lw.InterfaceC42321c
    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public Frame getF98845f() {
        return this.f98845f;
    }

    @Override // p439lw.InterfaceC42321c
    /* JADX INFO: renamed from: e */
    public void mo92861e(@NotNull List<DataPoint> entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f98843d = entries;
        this.f98840a.postInvalidate();
    }

    @Override // p439lw.InterfaceC42321c
    /* JADX INFO: renamed from: g */
    public void mo92863g() {
        for (DataPoint dataPoint : this.f98843d) {
            dataPoint.setNeedShowPoint(false);
            dataPoint.setNeedShowSelectLine(false);
        }
    }

    @Override // p439lw.InterfaceC42321c
    /* JADX INFO: renamed from: h */
    public void mo92864h() {
        Iterator<T> it = this.f98843d.iterator();
        while (it.hasNext()) {
            ((DataPoint) it.next()).setNeedShowTip(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    @Override // p439lw.InterfaceC42321c
    /* JADX INFO: renamed from: i */
    public void mo92865i() {
        DataPoint dataPoint;
        boolean zBooleanValue;
        double value;
        DataPoint dataPoint2;
        Boolean boolValueOf;
        boolean z11;
        if (this.f98843d.isEmpty()) {
            return;
        }
        List<DataPoint> list = this.f98843d;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dataPoint = (DataPoint) CollectionsKt.firstOrNull((List) this.f98843d);
                    zBooleanValue = true;
                    if (dataPoint != null) {
                        value = dataPoint.getValue();
                        dataPoint2 = (DataPoint) CollectionsKt.lastOrNull((List) this.f98843d);
                        if (dataPoint2 != null) {
                            if (dataPoint2.getValue() >= value) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            boolValueOf = Boolean.valueOf(z11);
                        } else {
                            boolValueOf = null;
                        }
                        if (boolValueOf != null) {
                            zBooleanValue = boolValueOf.booleanValue();
                        }
                    }
                    LineChartConfiguration lineChartConfiguration = this.f98842c;
                    LineChartConfiguration.Companion companion = LineChartConfiguration.f44451M;
                    lineChartConfiguration.m55090h0(companion.getGradientColors(zBooleanValue, m98648t()));
                    this.f98842c.m55087e0(Integer.valueOf(companion.getBackground(zBooleanValue, m98648t())));
                } else if (((DataPoint) it.next()).getNeedShowPoint()) {
                }
            }
        } else {
            dataPoint = (DataPoint) CollectionsKt.firstOrNull((List) this.f98843d);
            zBooleanValue = true;
            if (dataPoint != null) {
                value = dataPoint.getValue();
                dataPoint2 = (DataPoint) CollectionsKt.lastOrNull((List) this.f98843d);
                if (dataPoint2 != null) {
                    if (dataPoint2.getValue() >= value) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolValueOf = Boolean.valueOf(z11);
                } else {
                    boolValueOf = null;
                }
                if (boolValueOf != null) {
                    zBooleanValue = boolValueOf.booleanValue();
                }
            }
            LineChartConfiguration lineChartConfiguration2 = this.f98842c;
            LineChartConfiguration.Companion companion2 = LineChartConfiguration.f44451M;
            lineChartConfiguration2.m55090h0(companion2.getGradientColors(zBooleanValue, m98648t()));
            this.f98842c.m55087e0(Integer.valueOf(companion2.getBackground(zBooleanValue, m98648t())));
        }
        if (C42888a.m94042a(this.f98842c.getF95653d())) {
            this.f98840a.mo55119b(this.f98842c.m95389n());
        }
        if (C42888a.m94043b(this.f98842c.getF95653d())) {
            this.f98840a.mo55119b(this.f98842c.m95390o());
        }
        InterfaceC42320b interfaceC42320b = this.f98840a;
        Frame frame = this.f98845f;
        List<Label> listM95389n = this.f98842c.m95389n();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM95389n, 10));
        Iterator<T> it2 = listM95389n.iterator();
        while (it2.hasNext()) {
            arrayList.add(Float.valueOf(((Label) it2.next()).getScreenPositionX()));
        }
        List<Label> listM95390o = this.f98842c.m95390o();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM95390o, 10));
        Iterator<T> it3 = listM95390o.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Float.valueOf(((Label) it3.next()).getScreenPositionY()));
        }
        interfaceC42320b.mo55121d(frame, arrayList, arrayList2);
        m98646r();
        m98645q();
        C42660c c42660c = this.f98846g;
        if (C27025c.m66566d(c42660c != null ? Boolean.valueOf(c42660c.m93443d()) : null)) {
            m98642n();
        } else {
            m98647s();
        }
        m98643o();
        m98644p();
    }

    /* JADX INFO: renamed from: k */
    public final void m98639k(int i11, DataPoint dataPoint, Frame frame, float f11) {
        if (i11 == 0) {
            this.f98850k.add(new PointFrame(dataPoint, new Frame(frame.getLeft(), 0.0f, frame.getLeft() + f11, 0.0f, 10, null)));
        } else {
            if (i11 != this.f98843d.size() - 1) {
                this.f98850k.add(new PointFrame(dataPoint, new Frame(dataPoint.getScreenPositionX() - f11, 0.0f, dataPoint.getScreenPositionX() + f11, 0.0f, 10, null)));
                return;
            }
            this.f98850k.add(new PointFrame(dataPoint, new Frame(frame.getRight() - f11, 0.0f, frame.getRight(), 0.0f, 10, null)));
        }
    }

    /* JADX INFO: renamed from: l */
    public final Path m98640l(List<DataPoint> list, float f11) {
        Path path = new Path(!this.f98842c.getF44474x() ? C43882c.m96653c(list) : C43882c.m96654d(list, 0.2f));
        DataPoint dataPoint = (DataPoint) CollectionsKt.lastOrNull((List) list);
        path.lineTo(dataPoint != null ? dataPoint.getScreenPositionX() : 0.0f, f11);
        DataPoint dataPoint2 = (DataPoint) CollectionsKt.firstOrNull((List) list);
        path.lineTo(dataPoint2 != null ? dataPoint2.getScreenPositionX() : 0.0f, f11);
        path.close();
        return path;
    }

    /* JADX INFO: renamed from: m */
    public final void m98641m() {
        if (this.f98842c.getF44454A()) {
            this.f98848i = new PathMeasure();
        }
        Path pathM96653c = !this.f98842c.getF44474x() ? C43882c.m96653c(this.f98843d) : C43882c.m96654d(this.f98843d, 0.2f);
        this.f98849j = pathM96653c;
        if (pathM96653c != null) {
            PathMeasure pathMeasure = this.f98848i;
            if (pathMeasure != null) {
                pathMeasure.setPath(pathM96653c, false);
            }
            PathMeasure pathMeasure2 = this.f98848i;
            this.f98847h = pathMeasure2 != null ? pathMeasure2.getLength() : 0.0f;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m98642n() {
        if (this.f98843d.isEmpty() || this.f98848i == null) {
            return;
        }
        DataPoint dataPoint = (DataPoint) CollectionsKt.last((List) this.f98843d);
        C42660c c42660c = this.f98846g;
        float fM93442c = c42660c != null ? c42660c.m93442c() : 0.0f;
        PathMeasure pathMeasure = this.f98848i;
        float length = (pathMeasure != null ? pathMeasure.getLength() : 0.0f) * fM93442c;
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        PathMeasure pathMeasure2 = this.f98848i;
        if (pathMeasure2 == null || !pathMeasure2.getPosTan(length, fArr, fArr2)) {
            return;
        }
        float screenPositionX = dataPoint.getScreenPositionX();
        float screenPositionY = dataPoint.getScreenPositionY();
        boolean zIsAnimatedSolidPoint = dataPoint.isAnimatedSolidPoint();
        boolean zIsAnimatedPoint = dataPoint.isAnimatedPoint();
        float animationProgress = dataPoint.getAnimationProgress();
        dataPoint.setScreenPositionX(fArr[0]);
        dataPoint.setScreenPositionY(fArr[1]);
        dataPoint.setNeedShowPoint(true);
        dataPoint.setAnimatedSolidPoint(true);
        dataPoint.setAnimatedPoint(true);
        dataPoint.setAnimationProgress(fM93442c);
        this.f98840a.mo55118a(CollectionsKt.listOf(dataPoint), this.f98845f);
        dataPoint.setScreenPositionX(screenPositionX);
        dataPoint.setScreenPositionY(screenPositionY);
        dataPoint.setAnimatedSolidPoint(zIsAnimatedSolidPoint);
        dataPoint.setAnimatedPoint(zIsAnimatedPoint);
        dataPoint.setAnimationProgress(animationProgress);
    }

    /* JADX INFO: renamed from: o */
    public final void m98643o() {
        this.f98840a.mo55120c(this.f98845f, this.f98843d);
    }

    @Override // p439lw.InterfaceC42321c
    public void postInvalidate() {
        this.f98840a.postInvalidate();
    }

    /* JADX INFO: renamed from: q */
    public final void m98645q() {
        C42660c c42660c;
        float length;
        Path path = this.f98849j;
        if (path != null) {
            if (this.f98842c.getF44454A() && (c42660c = this.f98846g) != null && c42660c.m93443d() && this.f98842c.getF44455B()) {
                path.rewind();
                C42660c c42660c2 = this.f98846g;
                if (c42660c2 != null) {
                    float fM93442c = c42660c2.m93442c();
                    PathMeasure pathMeasure = this.f98848i;
                    length = fM93442c * (pathMeasure != null ? pathMeasure.getLength() : 0.0f);
                } else {
                    length = 0.0f;
                }
                PathMeasure pathMeasure2 = this.f98848i;
                if (pathMeasure2 != null) {
                    pathMeasure2.getSegment(0.0f, length, path, true);
                }
            }
            this.f98840a.mo55123f(path, this.f98843d);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m98646r() {
        if (this.f98842c.getF44476z()) {
            Path pathM98640l = m98640l(this.f98843d, this.f98845f.getBottom());
            InterfaceC42320b interfaceC42320b = this.f98840a;
            Frame frame = this.f98845f;
            List<DataPoint> list = this.f98843d;
            C42660c c42660c = this.f98846g;
            interfaceC42320b.mo55122e(frame, list, pathM98640l, (int) ((c42660c != null ? c42660c.m93442c() : 0.0f) * 255));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m98647s() {
        this.f98840a.mo55118a(this.f98843d, this.f98845f);
    }

    @Override // p439lw.InterfaceC42321c
    public void stopAnimation() {
        C42660c c42660c = this.f98846g;
        if (c42660c != null) {
            c42660c.m93446g();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m98651w(Frame frame) {
        if (this.f98842c.m95390o().isEmpty()) {
            return;
        }
        float bottom = (frame.getBottom() - frame.getTop()) / (this.f98842c.m95390o().size() - 1);
        float bottom2 = frame.getBottom();
        int i11 = 0;
        for (Object obj : this.f98842c.m95390o()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Label label = (Label) obj;
            label.m94055e((frame.getLeft() - 15.0f) - (this.f98841b.m92872d(label.getLabel(), this.f98842c.getF95655f()) / 2));
            label.m94056f(bottom2 - (i11 * bottom));
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m98652x() {
        if (this.f98846g == null) {
            C42660c c42660c = new C42660c(this.f98842c.getF95663n());
            c42660c.m93444e(new Function1() { // from class: sw.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C44564b.m98638y(this.f98839b, ((Float) obj).floatValue());
                }
            });
            this.f98846g = c42660c;
        }
        C42660c c42660c2 = this.f98846g;
        if (c42660c2 != null) {
            c42660c2.m93446g();
        }
        C42660c c42660c3 = this.f98846g;
        if (c42660c3 != null) {
            c42660c3.m93445f();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m98649u(Frame frame) {
        float bottom = frame.getBottom() - frame.getTop();
        float right = (frame.getRight() - frame.getLeft()) / (this.f98842c.m95389n().size() - 1);
        float f11 = right / 2;
        this.f98850k.clear();
        int i11 = 0;
        for (Object obj : this.f98843d) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DataPoint dataPoint = (DataPoint) obj;
            m98653z(dataPoint, frame, right, i11, bottom);
            m98639k(i11, dataPoint, frame, f11);
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m98650v(Frame frame) {
        String label;
        String label2;
        float left = frame.getLeft();
        C42326h c42326h = this.f98841b;
        Label label3 = (Label) CollectionsKt.firstOrNull((List) this.f98842c.m95389n());
        String str = "";
        if (label3 == null || (label = label3.getLabel()) == null) {
            label = "";
        }
        float fM92872d = c42326h.m92872d(label, this.f98842c.getF95655f());
        float f11 = 2;
        float f12 = left + (fM92872d / f11);
        float right = frame.getRight();
        C42326h c42326h2 = this.f98841b;
        Label label4 = (Label) CollectionsKt.lastOrNull((List) this.f98842c.m95389n());
        if (label4 != null && (label2 = label4.getLabel()) != null) {
            str = label2;
        }
        float fM92872d2 = ((right - (c42326h2.m92872d(str, this.f98842c.getF95655f()) / f11)) - f12) / (this.f98842c.m95389n().size() - 1);
        float bottom = (frame.getBottom() - this.f98841b.m92870b(this.f98842c.getF95655f())) + 15.0f;
        int i11 = 0;
        for (Object obj : this.f98842c.m95389n()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Label label5 = (Label) obj;
            label5.m94055e((i11 * fM92872d2) + f12);
            label5.m94056f(bottom);
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m98653z(DataPoint dataPoint, Frame frame, float f11, int i11, float f12) {
        dataPoint.setScreenPositionX(frame.getLeft() + (f11 * i11));
        dataPoint.setScreenPositionY(frame.getBottom() - ((float) (((double) f12) * ((dataPoint.getValue() - this.f98842c.getF95657h().getMin()) / this.f98842c.getF95657h().getF94976c()))));
    }

    /* JADX INFO: renamed from: p */
    public final void m98644p() {
    }
}
