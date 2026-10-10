package com.jumio.core.extraction.docfinder.overlay;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.log.Log;
import com.jumio.commons.log.LogLevel;
import com.jumio.commons.utils.ScreenUtilKt;
import com.jumio.core.C9301R;
import com.jumio.core.MobileContext;
import com.jumio.core.data.document.DocumentFormat;
import com.jumio.core.extraction.ExtractionUpdateInterface;
import com.jumio.core.extraction.docfinder.extraction.DocFinderUpdateState;
import com.jumio.core.extraction.docfinder.overlay.DocFinderOverlay;
import com.jumio.core.extraction.docfinder.processor.base.BaseImageData;
import com.jumio.core.overlay.JVisionOverlay;
import com.p059BV.LinearGradient.LinearGradientManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002DEB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010'\u001a\u00020!H\u0014J\u0010\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020!2\u0006\u0010)\u001a\u00020*H\u0002J\u0014\u0010,\u001a\u00020!2\n\u0010-\u001a\u0006\u0012\u0002\b\u00030.H\u0016J\u0010\u0010/\u001a\u00020!2\u0006\u00100\u001a\u000201H\u0002J\u001c\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0018032\u0006\u00100\u001a\u000201H\u0002J\u0010\u00104\u001a\u00020!2\u0006\u0010)\u001a\u00020*H\u0002J$\u00105\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u00106\u001a\u00020\u0014H\u0002J0\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b2\u0006\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020=H\u0002J\b\u0010?\u001a\u00020!H\u0002J\u0016\u0010@\u001a\u00020!2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0010\u0010A\u001a\u00020!2\u0006\u0010B\u001a\u00020\u000eH\u0002J\b\u0010C\u001a\u00020!H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006F"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay;", "Lcom/jumio/core/overlay/JVisionOverlay;", "context", "Lcom/jumio/core/MobileContext;", "<init>", "(Lcom/jumio/core/MobileContext;)V", "corners", "", "Landroid/graphics/PointF;", "validLinesPaint", "Landroid/graphics/Paint;", "invalidLinesPaint", "idAlignmentPaint", "targetStrokeColor", "", "currentPaint", "guideCorners", "showGuideOverlay", "", "currentRotationAngle", "", "documentOrientationFormat", "Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;", "layoutOrientation", "Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;", "rootView", "Landroid/view/ViewGroup;", "animatedCorners", "targetCorners", "cornerAnimator", "Landroid/animation/ValueAnimator;", "colorAnimator", "calculate", "", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "extractionArea", "Landroid/graphics/Rect;", "addViews", "prepareBackground", "doDraw", "canvas", "Landroid/graphics/Canvas;", "drawCorners", "update", "extractionUpdate", "Lcom/jumio/core/extraction/ExtractionUpdateInterface;", "checkGuideOrientationAndRotation", "baseImageData", "Lcom/jumio/core/extraction/docfinder/processor/base/BaseImageData;", "calculateOrientationAndRotation", "Lkotlin/Pair;", "drawGuidePolygon", "rotatePolygon", LinearGradientManager.PROP_ANGLE, "buildCornerPath", "Landroid/graphics/Path;", "corner", "toX", "toY", "sideLength", "", "cornerRadius", "calculateGuidePolygon", "animateCorners", "animateStrokeColor", "color", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "LayoutOrientation", "DocumentOrientationFormat", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDocFinderOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DocFinderOverlay.kt\ncom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay\n+ 2 Log.kt\ncom/jumio/commons/log/Log\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,439:1\n34#2:440\n1#3:441\n1557#4:442\n1628#4,3:443\n1557#4:446\n1628#4,3:447\n1557#4:450\n1628#4,3:451\n1567#4:454\n1598#4,4:455\n*S KotlinDebug\n*F\n+ 1 DocFinderOverlay.kt\ncom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay\n*L\n142#1:440\n286#1:442\n286#1:443,3\n287#1:446\n287#1:447,3\n289#1:450\n289#1:451,3\n381#1:454\n381#1:455,4\n*E\n"})
public final class DocFinderOverlay extends JVisionOverlay {

    /* JADX INFO: renamed from: A */
    public DocumentOrientationFormat f14063A;

    /* JADX INFO: renamed from: B */
    public LayoutOrientation f14064B;

    /* JADX INFO: renamed from: C */
    public ViewGroup f14065C;

    /* JADX INFO: renamed from: D */
    public List f14066D;

    /* JADX INFO: renamed from: E */
    public List f14067E;

    /* JADX INFO: renamed from: F */
    public ValueAnimator f14068F;

    /* JADX INFO: renamed from: G */
    public ValueAnimator f14069G;

    /* JADX INFO: renamed from: s */
    public List f14070s;

    /* JADX INFO: renamed from: t */
    public final Paint f14071t;

    /* JADX INFO: renamed from: u */
    public final Paint f14072u;

    /* JADX INFO: renamed from: v */
    public final Paint f14073v;

    /* JADX INFO: renamed from: w */
    public int f14074w;

    /* JADX INFO: renamed from: x */
    public List f14075x;

    /* JADX INFO: renamed from: y */
    public boolean f14076y;

    /* JADX INFO: renamed from: z */
    public double f14077z;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.jumio.core.extraction.docfinder.overlay.DocFinderOverlay$DocumentOrientationFormat[], still in use, count: 1, list:
      (r0v1 com.jumio.core.extraction.docfinder.overlay.DocFinderOverlay$DocumentOrientationFormat[]) from 0x0024: INVOKE (r0v1 com.jumio.core.extraction.docfinder.overlay.DocFinderOverlay$DocumentOrientationFormat[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:39)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$DocumentOrientationFormat;", "", "<init>", "(Ljava/lang/String;I)V", "PORTRAIT", "LANDSCAPE", "NONE", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class DocumentOrientationFormat {
        PORTRAIT,
        LANDSCAPE,
        NONE;


        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ EnumEntries f14079b;

        static {
            f14079b = EnumEntriesKt.enumEntries(documentOrientationFormatArr);
        }

        @NotNull
        public static EnumEntries<DocumentOrientationFormat> getEntries() {
            return f14079b;
        }

        public static DocumentOrientationFormat valueOf(String str) {
            return (DocumentOrientationFormat) Enum.valueOf(DocumentOrientationFormat.class, str);
        }

        public static DocumentOrientationFormat[] values() {
            return (DocumentOrientationFormat[]) f14078a.clone();
        }

        public DocumentOrientationFormat() {
            super(str, i);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.jumio.core.extraction.docfinder.overlay.DocFinderOverlay$LayoutOrientation[], still in use, count: 1, list:
      (r0v1 com.jumio.core.extraction.docfinder.overlay.DocFinderOverlay$LayoutOrientation[]) from 0x001a: INVOKE (r0v1 com.jumio.core.extraction.docfinder.overlay.DocFinderOverlay$LayoutOrientation[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:29)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/jumio/core/extraction/docfinder/overlay/DocFinderOverlay$LayoutOrientation;", "", "<init>", "(Ljava/lang/String;I)V", "HORIZONTAL", "VERTICAL", "jumio-docfinder_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class LayoutOrientation {
        HORIZONTAL,
        VERTICAL;


        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ EnumEntries f14081b;

        static {
            f14081b = EnumEntriesKt.enumEntries(layoutOrientationArr);
        }

        @NotNull
        public static EnumEntries<LayoutOrientation> getEntries() {
            return f14081b;
        }

        public static LayoutOrientation valueOf(String str) {
            return (LayoutOrientation) Enum.valueOf(LayoutOrientation.class, str);
        }

        public static LayoutOrientation[] values() {
            return (LayoutOrientation[]) f14080a.clone();
        }

        public LayoutOrientation() {
            super(str, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14543a() {
        float fHeight;
        float f11;
        float fCenterX = getF14446e().centerX();
        float fCenterY = getF14446e().centerY();
        double f13804e = this.f14064B == LayoutOrientation.HORIZONTAL ? getF14454m().getF13804e() : ((double) 1.0f) / getF14454m().getF13804e();
        if (this.f14064B == LayoutOrientation.VERTICAL) {
            fHeight = (getF14446e().height() - getF14454m().getOverlayLeftInPx(getF14446e().height())) - getF14454m().getOverlayRightInPx(getF14446e().height());
            f11 = (float) (((double) fHeight) * f13804e);
        } else {
            float fWidth = (getF14446e().width() - getF14454m().getOverlayLeftInPx(getF14446e().width())) - getF14454m().getOverlayRightInPx(getF14446e().width());
            fHeight = (float) (((double) fWidth) / f13804e);
            f11 = fWidth;
        }
        float f12 = 2;
        float f13 = 1 - ((getF14454m() == DocumentFormat.ID3 ? 0.06f : 0.0f) * f12);
        float f14 = fHeight * f13;
        float f15 = (f11 * f13) / f12;
        float f16 = fCenterX - f15;
        float f17 = f14 / f12;
        float f18 = fCenterY - f17;
        float f19 = fCenterX + f15;
        float f21 = fCenterY + f17;
        this.f14075x = CollectionsKt.listOf((Object[]) new PointF[]{new PointF(f16, f18), new PointF(f19, f18), new PointF(f19, f21), new PointF(f16, f21)});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocFinderOverlay(@NotNull MobileContext context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14070s = CollectionsKt.emptyList();
        Paint paint = new Paint(1);
        Paint.Join join = Paint.Join.MITER;
        paint.setStrokeJoin(join);
        Map<Integer, Integer> styleMap = getStyleMap();
        int i11 = C9301R.attr.jumio_scanOverlay;
        Integer num = styleMap.get(Integer.valueOf(i11));
        paint.setColor(num != null ? num.intValue() : -1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f14071t = paint;
        Paint paint2 = new Paint(1);
        paint2.setStrokeJoin(join);
        Integer num2 = getStyleMap().get(Integer.valueOf(i11));
        paint2.setColor(num2 != null ? num2.intValue() : -1);
        paint2.setStyle(style);
        this.f14072u = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStrokeJoin(Paint.Join.ROUND);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        Integer num3 = getStyleMap().get(Integer.valueOf(C9301R.attr.jumio_id_unaligned_stroke));
        paint3.setColor(num3 != null ? num3.intValue() : -1);
        paint3.setStyle(style);
        this.f14073v = paint3;
        this.f14074w = paint3.getColor();
        this.f14075x = CollectionsKt.emptyList();
        this.f14063A = DocumentOrientationFormat.NONE;
        this.f14064B = LayoutOrientation.HORIZONTAL;
        this.f14066D = CollectionsKt.emptyList();
        this.f14067E = CollectionsKt.emptyList();
        this.useCenterCrop = true;
    }

    @Override // com.jumio.core.overlay.JVisionOverlay, com.jumio.core.overlay.Overlay
    public void addViews(@NotNull ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.f14065C = rootView;
        rootView.setLayerType(1, null);
    }

    @Override // com.jumio.core.overlay.JVisionOverlay, com.jumio.core.overlay.Overlay
    public void calculate(@NotNull CameraSettings cameraSettings, @NotNull Rect extractionArea) {
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Intrinsics.checkNotNullParameter(extractionArea, "extractionArea");
        super.calculate(cameraSettings, extractionArea);
        float f11 = getF14442a().getResources().getDisplayMetrics().density;
        this.f14071t.setStrokeWidth(ScreenUtilKt.dpToPx(6, getF14442a()));
        this.f14072u.setStrokeWidth(ScreenUtilKt.dpToPx(2, getF14442a()));
        float f12 = 6.0f * f11;
        this.f14073v.setStrokeWidth(f12);
        Paint paint = this.f14071t;
        paint.setStrokeMiter(paint.getStrokeWidth());
        Paint paint2 = this.f14072u;
        paint2.setStrokeMiter(paint2.getStrokeWidth());
        Paint paint3 = this.f14073v;
        paint3.setStrokeMiter(paint3.getStrokeWidth());
        this.f14073v.setShadowLayer(f11 * 2.0f, f12, f12, getF14442a().getColor(C9301R.color.jumio_black_alpha40));
        this.f14072u.setPathEffect(new DashPathEffect(new float[]{10.0f, 5.0f, 10.0f, 5.0f}, 0.0f));
        this.overlayBottomPixel = 0;
    }

    @Override // com.jumio.core.overlay.JVisionOverlay, com.jumio.core.overlay.Overlay
    public void destroy() {
        ViewGroup viewGroup = this.f14065C;
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: p9.b
                @Override // java.lang.Runnable
                public final void run() {
                    DocFinderOverlay.m14540a(this.f95866b);
                }
            });
        }
        this.f14065C = null;
        this.f14068F = null;
        this.f14069G = null;
        this.f14066D = CollectionsKt.emptyList();
        this.f14067E = CollectionsKt.emptyList();
        this.f14075x = CollectionsKt.emptyList();
        this.f14070s = CollectionsKt.emptyList();
        super.destroy();
    }

    @Override // com.jumio.core.overlay.JVisionOverlay, com.jumio.core.overlay.Overlay
    public void doDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.doDraw(canvas);
        if (this.visibility.get() != 0) {
            return;
        }
        if (this.f14076y) {
            double d11 = getF14457p() ? -this.f14077z : this.f14077z;
            List<PointF> list = this.f14075x;
            if (d11 != 0.0d) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Float.valueOf(((PointF) it.next()).x));
                }
                float fAverageOfFloat = (float) CollectionsKt.averageOfFloat(arrayList);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Float.valueOf(((PointF) it2.next()).y));
                }
                float fAverageOfFloat2 = (float) CollectionsKt.averageOfFloat(arrayList2);
                double radians = Math.toRadians(d11);
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (PointF pointF : list) {
                    float f11 = pointF.x - fAverageOfFloat;
                    float f12 = pointF.y - fAverageOfFloat2;
                    double d12 = f11;
                    double dCos = Math.cos(radians) * d12;
                    double d13 = radians;
                    double d14 = f12;
                    arrayList3.add(new PointF(((float) (dCos - (Math.sin(d13) * d14))) + fAverageOfFloat, ((float) ((Math.cos(d13) * d14) + (Math.sin(d13) * d12))) + fAverageOfFloat2));
                    radians = d13;
                }
                list = arrayList3;
            }
            if (!Intrinsics.areEqual(this.f14067E, list)) {
                m14545a(list);
            }
            List list2 = this.f14066D;
            if (!list2.isEmpty()) {
                list = list2;
            }
            float f13 = getF14442a().getResources().getDisplayMetrics().density;
            float f14 = 36.0f * f13;
            float f15 = f13 * 20.0f;
            int size = list.size();
            int i11 = 0;
            while (i11 < size) {
                PointF pointF2 = (PointF) list.get(i11);
                int i12 = i11 + 1;
                PointF pointF3 = (PointF) list.get(i12 % 4);
                PointF pointF4 = (PointF) list.get((i11 + 3) % 4);
                PointF pointF5 = new PointF(pointF3.x - pointF2.x, pointF3.y - pointF2.y);
                double d15 = 2;
                float fSqrt = (float) Math.sqrt(((float) Math.pow(pointF5.x, d15)) + ((float) Math.pow(pointF5.y, d15)));
                pointF5.x /= fSqrt;
                pointF5.y /= fSqrt;
                PointF pointF6 = new PointF(pointF4.x - pointF2.x, pointF4.y - pointF2.y);
                float fSqrt2 = (float) Math.sqrt(((float) Math.pow(pointF6.x, d15)) + ((float) Math.pow(pointF6.y, d15)));
                pointF6.x /= fSqrt2;
                pointF6.y /= fSqrt2;
                PointF pointF7 = new PointF((pointF5.x * f14) + pointF2.x, (pointF5.y * f14) + pointF2.y);
                PointF pointF8 = new PointF((pointF5.x * f15) + pointF2.x, (pointF5.y * f15) + pointF2.y);
                PointF pointF9 = new PointF((pointF6.x * f15) + pointF2.x, (pointF6.y * f15) + pointF2.y);
                PointF pointF10 = new PointF((pointF6.x * f14) + pointF2.x, (pointF6.y * f14) + pointF2.y);
                Path path = new Path();
                path.moveTo(pointF7.x, pointF7.y);
                path.lineTo(pointF8.x, pointF8.y);
                path.quadTo(pointF2.x, pointF2.y, pointF9.x, pointF9.y);
                path.lineTo(pointF10.x, pointF10.y);
                canvas.drawPath(path, this.f14073v);
                i11 = i12;
            }
        }
        if (this.f14070s.isEmpty()) {
            Log.m14477v("No corners detected");
        } else {
            Log.m14477v("Corners detected");
            LogLevel logLevel = LogLevel.OFF;
        }
    }

    @Override // com.jumio.core.overlay.JVisionOverlay, com.jumio.core.overlay.Overlay
    public void update(@NotNull ExtractionUpdateInterface<?> extractionUpdate) {
        List listEmptyList;
        DocumentOrientationFormat documentOrientationFormat;
        double rotationAngle;
        Intrinsics.checkNotNullParameter(extractionUpdate, "extractionUpdate");
        Object data = extractionUpdate.getData();
        BaseImageData baseImageData = data instanceof BaseImageData ? (BaseImageData) data : null;
        if (baseImageData != null) {
            this.f14070s = baseImageData.getCorners().asList();
            this.f14076y = baseImageData.getShowGuideOverlay();
            double dSignum = 0.0d;
            if (baseImageData.getShowGuideOverlay() && baseImageData.getCorners().isValid()) {
                float aspectRatio = baseImageData.getCorners().getAspectRatio();
                if (Float.isNaN(aspectRatio) || Float.isInfinite(aspectRatio) || aspectRatio < 0.4f) {
                    documentOrientationFormat = DocumentOrientationFormat.NONE;
                } else if (aspectRatio >= 1.0f) {
                    documentOrientationFormat = DocumentOrientationFormat.LANDSCAPE;
                } else {
                    documentOrientationFormat = aspectRatio < 1.0f ? DocumentOrientationFormat.PORTRAIT : DocumentOrientationFormat.NONE;
                }
                if (documentOrientationFormat != this.f14063A && documentOrientationFormat != DocumentOrientationFormat.NONE) {
                    this.f14063A = documentOrientationFormat;
                    this.f14064B = documentOrientationFormat == DocumentOrientationFormat.LANDSCAPE ? LayoutOrientation.HORIZONTAL : LayoutOrientation.VERTICAL;
                    m14543a();
                }
                double dAbs = Math.abs(baseImageData.getRotationAngle());
                DocumentOrientationFormat documentOrientationFormat2 = this.f14063A;
                DocumentOrientationFormat documentOrientationFormat3 = DocumentOrientationFormat.LANDSCAPE;
                boolean z11 = (documentOrientationFormat2 == documentOrientationFormat3 && this.f14064B == LayoutOrientation.HORIZONTAL) || (documentOrientationFormat2 == DocumentOrientationFormat.PORTRAIT && this.f14064B == LayoutOrientation.VERTICAL);
                LayoutOrientation layoutOrientation = this.f14064B;
                double degrees = Math.toDegrees(3.141592653589793d) / ((double) 2);
                if (z11 && dAbs <= baseImageData.getRotationTolerance()) {
                    dSignum = baseImageData.getRotationAngle();
                } else if (!z11 || dAbs > baseImageData.getRotationThreshold()) {
                    if (!z11 || dAbs > degrees) {
                        if (!z11 && dAbs >= degrees - baseImageData.getRotationTolerance()) {
                            rotationAngle = Math.signum(baseImageData.getRotationAngle()) * (degrees - dAbs);
                        } else if ((z11 || dAbs < degrees - baseImageData.getRotationThreshold()) && !z11 && dAbs >= 0.0d) {
                            layoutOrientation = this.f14063A == documentOrientationFormat3 ? LayoutOrientation.HORIZONTAL : LayoutOrientation.VERTICAL;
                            if (dAbs < baseImageData.getRotationTolerance()) {
                                rotationAngle = baseImageData.getRotationAngle();
                            }
                        }
                        dSignum = -rotationAngle;
                    } else {
                        layoutOrientation = this.f14063A == documentOrientationFormat3 ? LayoutOrientation.VERTICAL : LayoutOrientation.HORIZONTAL;
                        if (dAbs > degrees - baseImageData.getRotationTolerance()) {
                            dSignum = Math.signum(baseImageData.getRotationAngle()) * (degrees - dAbs);
                        }
                    }
                }
                Pair pair = new Pair(Double.valueOf(dSignum), layoutOrientation);
                double dDoubleValue = ((Number) pair.component1()).doubleValue();
                LayoutOrientation layoutOrientation2 = (LayoutOrientation) pair.component2();
                this.f14077z = dDoubleValue;
                if (layoutOrientation2 != this.f14064B) {
                    this.f14064B = layoutOrientation2;
                    m14543a();
                }
            } else {
                this.f14077z = 0.0d;
            }
            Log.m14463d("DocFinderOverlay", "currentRotationAngle - " + this.f14077z + " baseImageData - " + baseImageData);
        } else {
            Object data2 = extractionUpdate.getData();
            if ((data2 instanceof List ? (List) data2 : null) != null) {
                Object data3 = extractionUpdate.getData();
                Intrinsics.checkNotNull(data3, "null cannot be cast to non-null type kotlin.collections.List<android.graphics.PointF>");
                listEmptyList = (List) data3;
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            this.f14070s = listEmptyList;
        }
        Integer f13842a = extractionUpdate.getF13842a();
        DocFinderUpdateState docFinderUpdateState = DocFinderUpdateState.INSTANCE;
        int validCorners = docFinderUpdateState.getValidCorners();
        if (f13842a != null && f13842a.intValue() == validCorners) {
            Integer num = getStyleMap().get(Integer.valueOf(C9301R.attr.jumio_id_aligned_stroke));
            m14544a(num != null ? num.intValue() : -1);
            return;
        }
        int invalidCorners = docFinderUpdateState.getInvalidCorners();
        if (f13842a != null && f13842a.intValue() == invalidCorners) {
            Integer num2 = getStyleMap().get(Integer.valueOf(C9301R.attr.jumio_id_unaligned_stroke));
            m14544a(num2 != null ? num2.intValue() : -1);
        }
    }

    @Override // com.jumio.core.overlay.JVisionOverlay
    public void prepareBackground() {
        getF14452k().addRect(0.0f, 0.0f, this.width, getOverlayBounds().top, Path.Direction.CW);
    }

    /* JADX INFO: renamed from: a */
    public final void m14545a(final List list) {
        ValueAnimator valueAnimator = this.f14068F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final List list2 = this.f14066D;
        if (list2.isEmpty()) {
            list2 = this.f14075x;
        }
        this.f14067E = list;
        if (list2.isEmpty()) {
            this.f14066D = list;
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p9.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DocFinderOverlay.m14542a(this.f95867b, list2, list, valueAnimator2);
            }
        });
        valueAnimatorOfFloat.start();
        this.f14068F = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: a */
    public static final void m14542a(DocFinderOverlay docFinderOverlay, List list, List list2, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            PointF pointF = (PointF) obj;
            PointF pointF2 = (PointF) list2.get(i11);
            float f11 = pointF.x;
            float f12 = ((pointF2.x - f11) * fFloatValue) + f11;
            float f13 = pointF.y;
            arrayList.add(new PointF(f12, ((pointF2.y - f13) * fFloatValue) + f13));
            i11 = i12;
        }
        docFinderOverlay.f14066D = arrayList;
        ViewGroup viewGroup = docFinderOverlay.f14065C;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14544a(int i11) {
        if (this.f14074w == i11) {
            return;
        }
        this.f14074w = i11;
        ValueAnimator valueAnimator = this.f14069G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.f14073v.getColor()), Integer.valueOf(i11));
        valueAnimatorOfObject.setDuration(300L);
        valueAnimatorOfObject.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p9.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DocFinderOverlay.m14541a(this.f95865b, valueAnimator2);
            }
        });
        valueAnimatorOfObject.start();
        this.f14069G = valueAnimatorOfObject;
    }

    /* JADX INFO: renamed from: a */
    public static final void m14541a(DocFinderOverlay docFinderOverlay, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Paint paint = docFinderOverlay.f14073v;
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        paint.setColor(((Integer) animatedValue).intValue());
        ViewGroup viewGroup = docFinderOverlay.f14065C;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m14540a(DocFinderOverlay docFinderOverlay) {
        ValueAnimator valueAnimator = docFinderOverlay.f14068F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = docFinderOverlay.f14069G;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }
}
