package com.jumio.core.overlay;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.core.C9301R;
import com.jumio.core.MobileContext;
import com.jumio.core.extraction.ExtractionUpdateInterface;
import com.jumio.core.models.ScanPartModel;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import jumio.core.RunnableC40673i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u00108\u001a\u0002092\u0006\u0010\t\u001a\u00020\fH\u0016J\b\u0010:\u001a\u000209H\u0016J\u0010\u0010;\u001a\u0002092\u0006\u0010<\u001a\u00020'H\u0016J\u0010\u0010=\u001a\u0002092\u0006\u0010>\u001a\u00020?H\u0016J\u0014\u0010@\u001a\u0002092\n\u0010A\u001a\u0006\u0012\u0002\b\u00030BH\u0016J\u0018\u0010C\u001a\u0002092\u0006\u0010D\u001a\u00020E2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010F\u001a\u0002092\u0006\u0010G\u001a\u00020HH\u0016J\u0010\u0010I\u001a\u0002092\u0006\u0010J\u001a\u00020KH\u0016J\u0010\u0010L\u001a\u0002092\u0006\u0010M\u001a\u00020*H\u0004J!\u0010N\u001a\u0004\u0018\u00010'2\b\b\u0001\u0010O\u001a\u00020\f2\u0006\u0010P\u001a\u00020QH\u0004¢\u0006\u0002\u0010RJ\u0010\u0010S\u001a\u0002092\u0006\u0010O\u001a\u00020\fH\u0002J\u0010\u0010T\u001a\u0002092\u0006\u0010O\u001a\u00020\fH\u0004J\b\u0010U\u001a\u000209H\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0010\u0010\t\u001a\u00020\n8\u0004X\u0085\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\f8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\f8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\f8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\f8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\f8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0013X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010.\u001a\u00020\f8\u0004@\u0004X\u0085\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u00103\u001a\u00020\f8\u0004@\u0004X\u0085\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\u0014\u00106\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0019¨\u0006V"}, m90084d2 = {"Lcom/jumio/core/overlay/BaseLivenessOverlay;", "Lcom/jumio/core/overlay/Overlay;", "mobileContext", "Lcom/jumio/core/MobileContext;", "<init>", "(Lcom/jumio/core/MobileContext;)V", "getMobileContext", "()Lcom/jumio/core/MobileContext;", "setMobileContext", "visibility", "Ljava/util/concurrent/atomic/AtomicInteger;", "width", "", "height", "overlayTopPixel", "overlayBottomPixel", "overlayLeftPixel", "overlayRightPixel", "styleMap", "", "getStyleMap", "()Ljava/util/Map;", "extractionArea", "Landroid/graphics/Rect;", "getExtractionArea", "()Landroid/graphics/Rect;", "setExtractionArea", "(Landroid/graphics/Rect;)V", "overlayView", "Landroidx/appcompat/widget/AppCompatImageView;", "getOverlayView", "()Landroidx/appcompat/widget/AppCompatImageView;", "setOverlayView", "(Landroidx/appcompat/widget/AppCompatImageView;)V", "paddingViewList", "", "Landroid/view/View;", "photinusView", "mirrorOverlay", "", "portraitMode", "scaleFactorWidth", "", "scaleFactorHeight", "lastColorChangeRunnable", "Lcom/jumio/core/overlay/ColorChangeRunnable;", "overlayCircleMainColor", "getOverlayCircleMainColor", "()I", "setOverlayCircleMainColor", "(I)V", "defaultOverlayColor", "getDefaultOverlayColor", "setDefaultOverlayColor", "overlayBounds", "getOverlayBounds", "setVisible", "", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "prepareDraw", "isFrontCamera", "doDraw", "canvas", "Landroid/graphics/Canvas;", "update", "extractionUpdate", "Lcom/jumio/core/extraction/ExtractionUpdateInterface;", "calculate", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "setScanPart", "scanPartModel", "Lcom/jumio/core/models/ScanPartModel;", "addViews", "rootView", "Landroid/view/ViewGroup;", "resizeOverlay", "percent", "changeColorOfOverlayCircle", "color", "delay", "", "(IJ)Ljava/lang/Boolean;", "setOverlayColor", "setPhotinusColor", "resetOverlayAnimation", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseLivenessOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseLivenessOverlay.kt\ncom/jumio/core/overlay/BaseLivenessOverlay\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,251:1\n1863#2,2:252\n1863#2,2:254\n*S KotlinDebug\n*F\n+ 1 BaseLivenessOverlay.kt\ncom/jumio/core/overlay/BaseLivenessOverlay\n*L\n147#1:252,2\n181#1:254,2\n*E\n"})
public class BaseLivenessOverlay implements Overlay {

    /* JADX INFO: renamed from: a */
    public MobileContext f14430a;

    /* JADX INFO: renamed from: b */
    public final Map f14431b;

    /* JADX INFO: renamed from: c */
    public Rect f14432c;

    /* JADX INFO: renamed from: d */
    public AppCompatImageView f14433d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f14434e;

    /* JADX INFO: renamed from: f */
    public View f14435f;

    /* JADX INFO: renamed from: g */
    public boolean f14436g;

    /* JADX INFO: renamed from: h */
    public float f14437h;

    @JvmField
    protected int height;

    /* JADX INFO: renamed from: i */
    public float f14438i;

    /* JADX INFO: renamed from: j */
    public RunnableC40673i0 f14439j;

    /* JADX INFO: renamed from: k */
    public int f14440k;

    /* JADX INFO: renamed from: l */
    public int f14441l;

    @JvmField
    protected int overlayBottomPixel;

    @JvmField
    protected int overlayLeftPixel;

    @JvmField
    protected int overlayRightPixel;

    @JvmField
    protected int overlayTopPixel;

    @JvmField
    @NotNull
    protected final AtomicInteger visibility;

    @JvmField
    protected int width;

    @Override // com.jumio.core.overlay.Overlay
    public void destroy() {
        this.f14435f = null;
        this.f14433d = null;
        this.f14434e.clear();
    }

    public BaseLivenessOverlay(@NotNull MobileContext mobileContext) {
        Intrinsics.checkNotNullParameter(mobileContext, "mobileContext");
        this.f14430a = mobileContext;
        this.visibility = new AtomicInteger();
        Map<Integer, Integer> customizations$jumio_core_release = Overlay.INSTANCE.getCustomizations$jumio_core_release(this.f14430a);
        this.f14431b = customizations$jumio_core_release;
        this.f14432c = new Rect();
        this.f14434e = new ArrayList();
        this.f14436g = true;
        this.f14437h = 1.0f;
        this.f14438i = 1.0f;
        Integer num = customizations$jumio_core_release.get(Integer.valueOf(C9301R.attr.jumio_scanOverlay_livenessStroke));
        this.f14440k = num != null ? num.intValue() : ContextCompat.getColor(this.f14430a, C9301R.color.jumio_gray_8);
        this.f14441l = ContextCompat.getColor(this.f14430a, C9301R.color.jumio_white_alpha80);
    }

    @Override // com.jumio.core.overlay.Overlay
    public void addViews(@NotNull ViewGroup rootView) {
        Drawable drawableAccess$layerDrawable;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        View viewFindViewById = rootView.findViewById(C9301R.id.liveness_overlay_root);
        if (viewFindViewById != null) {
            rootView.removeViewInLayout(viewFindViewById);
        }
        View viewInflate = LayoutInflater.from(this.f14430a).inflate(this.f14436g ? C9301R.layout.jumio_face_liveness_overlay : C9301R.layout.jumio_face_liveness_overlay_land, rootView, false);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        rootView.addView(viewInflate, layoutParams);
        this.f14433d = (AppCompatImageView) rootView.findViewById(C9301R.id.iv_liveness_overlay);
        this.f14435f = rootView.findViewById(C9301R.id.photinus_color);
        Iterator it = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(C9301R.id.top_padding), Integer.valueOf(C9301R.id.bottom_padding), Integer.valueOf(C9301R.id.left_padding), Integer.valueOf(C9301R.id.right_padding)}).iterator();
        while (it.hasNext()) {
            View viewFindViewById2 = viewInflate.findViewById(((Number) it.next()).intValue());
            if (viewFindViewById2 != null) {
                this.f14434e.add(viewFindViewById2);
            }
        }
        int i11 = this.f14441l;
        AppCompatImageView appCompatImageView = this.f14433d;
        if (appCompatImageView != null && (drawableAccess$layerDrawable = BaseLivenessOverlayKt.access$layerDrawable(appCompatImageView, C9301R.id.liveness_overlay_outer)) != null) {
            BaseLivenessOverlayKt.setColor(drawableAccess$layerDrawable, i11);
        }
        Iterator it2 = this.f14434e.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setBackgroundColor(i11);
        }
        resizeOverlay(0.7125f);
        resetOverlayAnimation();
    }

    @Override // com.jumio.core.overlay.Overlay
    public void calculate(@NotNull CameraSettings cameraSettings, @NotNull Rect extractionArea) {
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Intrinsics.checkNotNullParameter(extractionArea, "extractionArea");
        this.width = cameraSettings.getF13516b().getWidth();
        this.height = cameraSettings.getF13516b().getHeight();
        this.f14436g = cameraSettings.getF13517c().getWidth() < cameraSettings.getF13517c().getHeight();
        this.f14437h = cameraSettings.getF13515a().getWidth() / cameraSettings.getF13516b().getWidth();
        this.f14438i = cameraSettings.getF13515a().getHeight() / cameraSettings.getF13516b().getHeight();
        this.overlayRightPixel = this.width;
        this.overlayBottomPixel = this.height;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Nullable
    public final Boolean changeColorOfOverlayCircle(@ColorInt int color, long delay) {
        AppCompatImageView appCompatImageView = this.f14433d;
        if (appCompatImageView == null) {
            return null;
        }
        RunnableC40673i0 runnableC40673i0 = new RunnableC40673i0(appCompatImageView, color);
        this.f14439j = runnableC40673i0;
        return Boolean.valueOf(appCompatImageView.postDelayed(runnableC40673i0, delay));
    }

    @Override // com.jumio.core.overlay.Overlay
    public void doDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
    }

    /* JADX INFO: renamed from: getDefaultOverlayColor, reason: from getter */
    public final int getF14441l() {
        return this.f14441l;
    }

    @NotNull
    /* JADX INFO: renamed from: getExtractionArea, reason: from getter */
    public final Rect getF14432c() {
        return this.f14432c;
    }

    @NotNull
    /* JADX INFO: renamed from: getMobileContext, reason: from getter */
    public final MobileContext getF14430a() {
        return this.f14430a;
    }

    @Override // com.jumio.core.overlay.Overlay
    @NotNull
    public Rect getOverlayBounds() {
        return new Rect(this.overlayLeftPixel, this.overlayTopPixel, this.overlayRightPixel, this.overlayBottomPixel);
    }

    /* JADX INFO: renamed from: getOverlayCircleMainColor, reason: from getter */
    public final int getF14440k() {
        return this.f14440k;
    }

    @Nullable
    /* JADX INFO: renamed from: getOverlayView, reason: from getter */
    public final AppCompatImageView getF14433d() {
        return this.f14433d;
    }

    @NotNull
    public final Map<Integer, Integer> getStyleMap() {
        return this.f14431b;
    }

    public final void resetOverlayAnimation() {
        AppCompatImageView appCompatImageView = this.f14433d;
        if (appCompatImageView != null) {
            appCompatImageView.removeCallbacks(this.f14439j);
            BaseLivenessOverlayKt.access$resetAnyLayerDrawableAnimation(appCompatImageView, C9301R.id.liveness_overlay_main, this.f14440k);
        }
        setPhotinusColor(0);
    }

    public final void setDefaultOverlayColor(int i11) {
        this.f14441l = i11;
    }

    public final void setExtractionArea(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<set-?>");
        this.f14432c = rect;
    }

    public final void setMobileContext(@NotNull MobileContext mobileContext) {
        Intrinsics.checkNotNullParameter(mobileContext, "<set-?>");
        this.f14430a = mobileContext;
    }

    public final void setOverlayCircleMainColor(int i11) {
        this.f14440k = i11;
    }

    public final void setOverlayView(@Nullable AppCompatImageView appCompatImageView) {
        this.f14433d = appCompatImageView;
    }

    public final void setPhotinusColor(int color) {
        int i11;
        Drawable drawableAccess$layerDrawable;
        if (color == 0) {
            color = this.f14441l;
            i11 = 0;
        } else {
            i11 = (-1308622848) + color;
        }
        AppCompatImageView appCompatImageView = this.f14433d;
        if (appCompatImageView != null && (drawableAccess$layerDrawable = BaseLivenessOverlayKt.access$layerDrawable(appCompatImageView, C9301R.id.liveness_overlay_outer)) != null) {
            BaseLivenessOverlayKt.setColor(drawableAccess$layerDrawable, color);
        }
        Iterator it = this.f14434e.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setBackgroundColor(color);
        }
        View view = this.f14435f;
        if (view != null) {
            view.setBackgroundColor(i11);
        }
    }

    @Override // com.jumio.core.overlay.Overlay
    public void setScanPart(@NotNull ScanPartModel scanPartModel) {
        Intrinsics.checkNotNullParameter(scanPartModel, "scanPartModel");
    }

    @Override // com.jumio.core.overlay.Overlay
    public void setVisible(int visibility) {
        this.visibility.set(visibility);
    }

    @Override // com.jumio.core.overlay.Overlay
    public void update(@NotNull ExtractionUpdateInterface<?> extractionUpdate) {
        Intrinsics.checkNotNullParameter(extractionUpdate, "extractionUpdate");
    }

    public final void resizeOverlay(float percent) {
        ViewGroup.LayoutParams layoutParams;
        resetOverlayAnimation();
        AppCompatImageView appCompatImageView = this.f14433d;
        ConstraintLayout.LayoutParams layoutParams2 = null;
        if (appCompatImageView != null) {
            layoutParams = appCompatImageView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        }
        if (layoutParams2 != null) {
            if (this.f14436g) {
                layoutParams2.matchConstraintPercentWidth = percent * this.f14437h;
            } else {
                layoutParams2.matchConstraintPercentHeight = percent * this.f14438i;
            }
        }
        AppCompatImageView appCompatImageView2 = this.f14433d;
        if (appCompatImageView2 != null) {
            BaseLivenessOverlayKt.access$reset(appCompatImageView2, this.f14441l);
        }
        AppCompatImageView appCompatImageView3 = this.f14433d;
        if (appCompatImageView3 != null) {
            appCompatImageView3.requestLayout();
        }
    }

    @Override // com.jumio.core.overlay.Overlay
    public void prepareDraw(boolean isFrontCamera) {
    }
}
