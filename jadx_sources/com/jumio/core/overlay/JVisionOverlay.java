package com.jumio.core.overlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.log.Log;
import com.jumio.commons.log.LogLevel;
import com.jumio.commons.utils.DrawingUtil;
import com.jumio.commons.utils.ScreenUtilKt;
import com.jumio.core.C9301R;
import com.jumio.core.MobileContext;
import com.jumio.core.data.ScanMode;
import com.jumio.core.data.document.DocumentFormat;
import com.jumio.core.extraction.ExtractionUpdateInterface;
import com.jumio.core.models.PhysicalIdScanPartModel;
import com.jumio.core.models.ScanPartModel;
import com.jumio.sdk.enums.JumioCredentialPart;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010W\u001a\u00020X*\u00020!J\u0018\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010]\u001a\u00020Z2\u0006\u0010^\u001a\u00020_H\u0016J\u0010\u0010`\u001a\u00020Z2\u0006\u0010a\u001a\u00020bH\u0016J\u0010\u0010c\u001a\u00020Z2\u0006\u0010d\u001a\u00020eH\u0016J\u0010\u0010f\u001a\u00020Z2\u0006\u0010g\u001a\u00020?H\u0016J\b\u0010h\u001a\u00020ZH\u0014J\u0010\u0010i\u001a\u00020Z2\u0006\u0010Q\u001a\u00020\nH\u0016J\u0010\u0010l\u001a\u00020Z2\u0006\u0010m\u001a\u00020nH\u0016J\u0014\u0010o\u001a\u00020Z2\n\u0010p\u001a\u0006\u0012\u0002\b\u00030qH\u0016J\b\u0010r\u001a\u00020ZH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0012\u0010\t\u001a\u00020\n8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\n8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\n8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\n8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\nX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\n8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\n8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\n8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\n8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\n8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\nX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\nX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0012R\u0012\u0010\u001e\u001a\u00020\n8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u00020\n8\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020!X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0010\u0010&\u001a\u00020'8\u0004X\u0085\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020'X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020'X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u000e\u0010-\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u00103\u001a\u00020/2\u0006\u00102\u001a\u00020/@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0014\u00106\u001a\u0004\u0018\u0001078\u0004@\u0004X\u0085\u000e¢\u0006\u0002\n\u0000R\u001c\u00108\u001a\u0004\u0018\u000109X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0012\u0010>\u001a\u00020?8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010@\u001a\u00020?8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010A\u001a\u00020?8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010B\u001a\u00020?8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010C\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010D\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001e\u0010F\u001a\u00020E2\u0006\u00102\u001a\u00020E@BX\u0084\u000e¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u000e\u0010I\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010K\u001a\u00020?X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u000e\u0010P\u001a\u00020?X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010Q\u001a\u00020R8\u0004X\u0085\u0004¢\u0006\u0002\n\u0000R \u0010S\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0TX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0014\u0010j\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010#¨\u0006s"}, m90084d2 = {"Lcom/jumio/core/overlay/JVisionOverlay;", "Lcom/jumio/core/overlay/Overlay;", "mobileContext", "Lcom/jumio/core/MobileContext;", "<init>", "(Lcom/jumio/core/MobileContext;)V", "getMobileContext", "()Lcom/jumio/core/MobileContext;", "setMobileContext", "overlayLeftMargin", "", "overlayRightMargin", "overlayTopMargin", "overlayBottomMargin", "overlayWidth", "getOverlayWidth", "()I", "setOverlayWidth", "(I)V", "overlayHeight", "overlayTopPixel", "overlayBottomPixel", "overlayLeftPixel", "overlayRightPixel", "topOffset", "getTopOffset", "setTopOffset", "leftOffset", "getLeftOffset", "setLeftOffset", "width", "height", "extractionArea", "Landroid/graphics/Rect;", "getExtractionArea", "()Landroid/graphics/Rect;", "setExtractionArea", "(Landroid/graphics/Rect;)V", "borderPaint", "Landroid/graphics/Paint;", "largeBorderPaint", "getLargeBorderPaint", "()Landroid/graphics/Paint;", "backgroundPaint", "getBackgroundPaint", "debugPaint", "borderPath", "Landroid/graphics/Path;", "largeBorderPath", "cutoutPath", "value", "backgroundPath", "getBackgroundPath", "()Landroid/graphics/Path;", "scanMode", "Lcom/jumio/core/data/ScanMode;", "credentialPart", "Lcom/jumio/sdk/enums/JumioCredentialPart;", "getCredentialPart", "()Lcom/jumio/sdk/enums/JumioCredentialPart;", "setCredentialPart", "(Lcom/jumio/sdk/enums/JumioCredentialPart;)V", "useCenterCrop", "", "dimBackground", "drawBrackets", "detectLines", "topLeftCornerRadius", "topRightCornerRadius", "Lcom/jumio/core/data/document/DocumentFormat;", "documentFormat", "getDocumentFormat", "()Lcom/jumio/core/data/document/DocumentFormat;", "bottomLeftCornerRadius", "bottomRightCornerRadius", "mirrorOverlay", "getMirrorOverlay", "()Z", "setMirrorOverlay", "(Z)V", "initialized", "visibility", "Ljava/util/concurrent/atomic/AtomicInteger;", "styleMap", "", "getStyleMap", "()Ljava/util/Map;", "area", "", "calculate", "", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "addViews", "rootView", "Landroid/view/ViewGroup;", "setScanPart", "scanPartModel", "Lcom/jumio/core/models/ScanPartModel;", "updateOverlayConfiguration", "context", "Landroid/content/Context;", "prepareDraw", "isFrontCamera", "prepareBackground", "setVisible", "overlayBounds", "getOverlayBounds", "doDraw", "canvas", "Landroid/graphics/Canvas;", "update", "extractionUpdate", "Lcom/jumio/core/extraction/ExtractionUpdateInterface;", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJVisionOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JVisionOverlay.kt\ncom/jumio/core/overlay/JVisionOverlay\n+ 2 Log.kt\ncom/jumio/commons/log/Log\n*L\n1#1,378:1\n34#2:379\n34#2:380\n*S KotlinDebug\n*F\n+ 1 JVisionOverlay.kt\ncom/jumio/core/overlay/JVisionOverlay\n*L\n276#1:379\n365#1:380\n*E\n"})
public class JVisionOverlay implements Overlay {

    /* JADX INFO: renamed from: a */
    public MobileContext f14442a;

    /* JADX INFO: renamed from: b */
    public int f14443b;

    @JvmField
    @NotNull
    protected final Paint borderPaint;

    /* JADX INFO: renamed from: c */
    public int f14444c;

    /* JADX INFO: renamed from: d */
    public int f14445d;

    @JvmField
    public boolean detectLines;

    @JvmField
    public boolean dimBackground;

    @JvmField
    public boolean drawBrackets;

    /* JADX INFO: renamed from: e */
    public Rect f14446e;

    /* JADX INFO: renamed from: f */
    public final Paint f14447f;

    /* JADX INFO: renamed from: g */
    public final Paint f14448g;

    /* JADX INFO: renamed from: h */
    public Path f14449h;

    @JvmField
    protected int height;

    /* JADX INFO: renamed from: i */
    public Path f14450i;

    /* JADX INFO: renamed from: j */
    public Path f14451j;

    /* JADX INFO: renamed from: k */
    public Path f14452k;

    /* JADX INFO: renamed from: l */
    public JumioCredentialPart f14453l;

    /* JADX INFO: renamed from: m */
    public DocumentFormat f14454m;

    /* JADX INFO: renamed from: n */
    public int f14455n;

    /* JADX INFO: renamed from: o */
    public int f14456o;

    @JvmField
    protected int overlayBottomMargin;

    @JvmField
    protected int overlayBottomPixel;

    @JvmField
    protected int overlayHeight;

    @JvmField
    protected int overlayLeftMargin;

    @JvmField
    protected int overlayLeftPixel;

    @JvmField
    protected int overlayRightMargin;

    @JvmField
    protected int overlayRightPixel;

    @JvmField
    protected int overlayTopMargin;

    @JvmField
    protected int overlayTopPixel;

    /* JADX INFO: renamed from: p */
    public boolean f14457p;

    /* JADX INFO: renamed from: q */
    public boolean f14458q;

    /* JADX INFO: renamed from: r */
    public final Map f14459r;

    @JvmField
    @Nullable
    protected ScanMode scanMode;

    @JvmField
    public int topLeftCornerRadius;

    @JvmField
    public int topRightCornerRadius;

    @JvmField
    public boolean useCenterCrop;

    @JvmField
    @NotNull
    protected final AtomicInteger visibility;

    @JvmField
    protected int width;

    public JVisionOverlay(@NotNull MobileContext mobileContext) {
        Intrinsics.checkNotNullParameter(mobileContext, "mobileContext");
        this.f14442a = mobileContext;
        this.f14446e = new Rect();
        this.borderPaint = new Paint();
        this.f14447f = new Paint();
        this.f14448g = new Paint();
        new Paint();
        this.f14449h = new Path();
        this.f14450i = new Path();
        this.f14451j = new Path();
        this.f14452k = new Path();
        this.f14454m = DocumentFormat.NONE;
        this.visibility = new AtomicInteger();
        this.f14459r = Overlay.INSTANCE.getCustomizations$jumio_core_release(this.f14442a);
    }

    @Override // com.jumio.core.overlay.Overlay
    public void addViews(@NotNull ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
    }

    public final float area(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.width() * rect.height();
    }

    @Override // com.jumio.core.overlay.Overlay
    public void calculate(@NotNull CameraSettings cameraSettings, @NotNull Rect extractionArea) {
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Intrinsics.checkNotNullParameter(extractionArea, "extractionArea");
        this.width = cameraSettings.getF13516b().getWidth();
        int height = cameraSettings.getF13516b().getHeight();
        this.height = height;
        this.f14446e = extractionArea;
        if (this.useCenterCrop) {
            this.overlayLeftPixel = extractionArea.left;
            this.overlayRightPixel = extractionArea.right;
            this.overlayTopPixel = extractionArea.top;
            this.overlayBottomPixel = extractionArea.bottom;
            return;
        }
        DocumentFormat documentFormat = this.f14454m;
        int f13804e = 0;
        if (documentFormat == DocumentFormat.NONE) {
            this.overlayLeftPixel = 0;
            this.overlayTopPixel = 0;
            this.overlayRightPixel = this.width;
            this.overlayBottomPixel = height;
            return;
        }
        if (documentFormat != DocumentFormat.ID1 && documentFormat != DocumentFormat.ID2) {
            if (documentFormat == DocumentFormat.ID3) {
                this.overlayLeftMargin = documentFormat.getOverlayLeftInPx(this.width);
                this.overlayRightMargin = this.f14454m.getOverlayRightInPx(this.width);
                this.overlayTopMargin = this.f14454m.getOverlayTopInPx(this.height);
                this.overlayBottomMargin = this.f14454m.getOverlayBottomInPx(this.height);
                if (this.width / this.height >= this.f14454m.getF13804e()) {
                    this.f14444c = 0;
                    this.f14445d = (this.width - ((((int) (this.f14454m.getF13804e() * ((double) ((this.height - this.overlayTopMargin) - this.overlayBottomMargin)))) + this.overlayLeftMargin) + this.overlayRightMargin)) / 2;
                } else {
                    this.f14445d = 0;
                    f13804e = (this.height - ((((int) (((double) ((this.width - this.overlayLeftMargin) - this.overlayRightMargin)) / this.f14454m.getF13804e())) + this.overlayTopMargin) + this.overlayBottomMargin)) / 2;
                    this.f14444c = f13804e;
                }
                int i11 = this.width;
                int i12 = this.f14445d;
                this.f14443b = i11 - (i12 * 2);
                int i13 = this.height;
                int i14 = this.f14444c;
                this.overlayHeight = (i13 - i14) - f13804e;
                this.overlayRightPixel = (i11 - i12) - this.overlayRightMargin;
                this.overlayBottomPixel = (i13 - f13804e) - this.overlayBottomMargin;
                this.overlayLeftPixel = this.overlayLeftMargin + i12;
                this.overlayTopPixel = this.overlayTopMargin + i14;
                return;
            }
            return;
        }
        int i15 = this.width;
        if (i15 / height >= 1.3333334f) {
            this.overlayHeight = height;
            int i16 = (height * 4) / 3;
            this.f14443b = i16;
            this.f14444c = extractionArea.top;
            this.f14445d = ((i15 - i16) / 2) + extractionArea.left;
        } else {
            this.f14443b = i15;
            int i17 = (i15 * 3) / 4;
            this.overlayHeight = i17;
            this.f14444c = ((height - i17) / 2) + extractionArea.top;
            this.f14445d = extractionArea.left;
        }
        this.overlayLeftMargin = documentFormat.getOverlayLeftInPx(this.f14443b);
        this.overlayRightMargin = this.f14454m.getOverlayRightInPx(this.f14443b);
        this.overlayTopMargin = this.f14454m.getOverlayTopInPx(this.overlayHeight);
        int overlayBottomInPx = this.f14454m.getOverlayBottomInPx(this.overlayHeight);
        this.overlayBottomMargin = overlayBottomInPx;
        int i18 = this.width;
        int i19 = this.overlayRightMargin;
        int i21 = this.f14445d;
        this.overlayRightPixel = i18 - (i19 + i21);
        int i22 = this.height;
        int i23 = this.f14444c;
        this.overlayBottomPixel = i22 - (overlayBottomInPx + i23);
        this.overlayLeftPixel = this.overlayLeftMargin + i21;
        this.overlayTopPixel = this.overlayTopMargin + i23;
    }

    @Override // com.jumio.core.overlay.Overlay
    public void doDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.visibility.get() == 0 && this.f14458q) {
            if (!this.f14452k.isEmpty()) {
                canvas.drawPath(this.f14452k, this.f14448g);
            }
            if (!this.f14450i.isEmpty()) {
                canvas.drawPath(this.f14450i, this.f14447f);
            }
            if (!this.f14449h.isEmpty()) {
                canvas.drawPath(this.f14449h, this.borderPaint);
            }
            Log log = Log.INSTANCE;
            LogLevel logLevel = LogLevel.OFF;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getBackgroundPaint, reason: from getter */
    public final Paint getF14448g() {
        return this.f14448g;
    }

    @NotNull
    /* JADX INFO: renamed from: getBackgroundPath, reason: from getter */
    public final Path getF14452k() {
        return this.f14452k;
    }

    @Nullable
    /* JADX INFO: renamed from: getCredentialPart, reason: from getter */
    public final JumioCredentialPart getF14453l() {
        return this.f14453l;
    }

    @NotNull
    /* JADX INFO: renamed from: getDocumentFormat, reason: from getter */
    public final DocumentFormat getF14454m() {
        return this.f14454m;
    }

    @NotNull
    /* JADX INFO: renamed from: getExtractionArea, reason: from getter */
    public final Rect getF14446e() {
        return this.f14446e;
    }

    @NotNull
    /* JADX INFO: renamed from: getLargeBorderPaint, reason: from getter */
    public final Paint getF14447f() {
        return this.f14447f;
    }

    /* JADX INFO: renamed from: getLeftOffset, reason: from getter */
    public final int getF14445d() {
        return this.f14445d;
    }

    /* JADX INFO: renamed from: getMirrorOverlay, reason: from getter */
    public final boolean getF14457p() {
        return this.f14457p;
    }

    @NotNull
    /* JADX INFO: renamed from: getMobileContext, reason: from getter */
    public final MobileContext getF14442a() {
        return this.f14442a;
    }

    @Override // com.jumio.core.overlay.Overlay
    @NotNull
    public Rect getOverlayBounds() {
        return new Rect(this.overlayLeftPixel, this.overlayTopPixel, this.overlayRightPixel, this.overlayBottomPixel);
    }

    /* JADX INFO: renamed from: getOverlayWidth, reason: from getter */
    public final int getF14443b() {
        return this.f14443b;
    }

    @NotNull
    public final Map<Integer, Integer> getStyleMap() {
        return this.f14459r;
    }

    /* JADX INFO: renamed from: getTopOffset, reason: from getter */
    public final int getF14444c() {
        return this.f14444c;
    }

    public void prepareBackground() {
        this.f14452k.addRect(0.0f, 0.0f, this.width, this.height, Path.Direction.CW);
        this.f14452k.addPath(this.f14451j);
    }

    @Override // com.jumio.core.overlay.Overlay
    public void prepareDraw(boolean isFrontCamera) {
        updateOverlayConfiguration(this.f14442a);
        this.f14457p = isFrontCamera;
        Paint paint = this.borderPaint;
        Map map = this.f14459r;
        int i11 = C9301R.attr.jumio_scanOverlay;
        Integer num = (Integer) map.get(Integer.valueOf(i11));
        paint.setColor(num != null ? num.intValue() : -1);
        Paint paint2 = this.borderPaint;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.borderPaint.setDither(true);
        Paint paint3 = this.borderPaint;
        Paint.Join join = Paint.Join.ROUND;
        paint3.setStrokeJoin(join);
        Paint paint4 = this.borderPaint;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint4.setStrokeCap(cap);
        this.borderPaint.setAntiAlias(true);
        this.borderPaint.setStrokeWidth(ScreenUtilKt.dpToPx(2, this.f14442a));
        Paint paint5 = this.f14447f;
        Integer num2 = (Integer) this.f14459r.get(Integer.valueOf(i11));
        paint5.setColor(num2 != null ? num2.intValue() : Color.parseColor("#80000000"));
        this.f14447f.setAlpha(0);
        this.f14447f.setStyle(style);
        this.f14447f.setDither(true);
        this.f14447f.setStrokeJoin(join);
        this.f14447f.setStrokeCap(cap);
        this.f14447f.setAntiAlias(true);
        this.f14447f.setStrokeWidth(ScreenUtilKt.dpToPx(6, this.f14442a));
        Paint paint6 = this.f14448g;
        Integer num3 = (Integer) this.f14459r.get(Integer.valueOf(C9301R.attr.jumio_scanBackground));
        paint6.setColor(num3 != null ? num3.intValue() : Color.parseColor("#99000000"));
        this.f14448g.setStyle(Paint.Style.FILL);
        this.f14448g.setDither(true);
        this.f14448g.setStrokeJoin(join);
        this.f14448g.setStrokeCap(cap);
        this.f14448g.setAntiAlias(true);
        Log log = Log.INSTANCE;
        LogLevel logLevel = LogLevel.OFF;
        if (this.drawBrackets) {
            if (!this.useCenterCrop) {
                this.f14449h = DrawingUtil.INSTANCE.createRectWithRoundedCornersAsPath(getOverlayBounds(), this.topLeftCornerRadius, this.topRightCornerRadius, this.f14455n, this.f14456o);
            }
            int iDpToPx = ScreenUtilKt.dpToPx(4, this.f14442a) / 2;
            Rect rect = new Rect(getOverlayBounds().left - iDpToPx, getOverlayBounds().top - iDpToPx, getOverlayBounds().right + iDpToPx, getOverlayBounds().bottom + iDpToPx);
            DrawingUtil drawingUtil = DrawingUtil.INSTANCE;
            this.f14450i = drawingUtil.createRectWithRoundedCornersAsPath(rect, this.topLeftCornerRadius + iDpToPx, this.topRightCornerRadius + iDpToPx, this.f14455n + iDpToPx, this.f14456o + iDpToPx);
            this.f14451j = drawingUtil.createRectWithRoundedCornersAsPath(new Rect(getOverlayBounds().left, getOverlayBounds().top, getOverlayBounds().right, getOverlayBounds().bottom), this.topLeftCornerRadius, this.topRightCornerRadius, this.f14455n, this.f14456o);
        } else {
            this.f14449h.reset();
        }
        if (this.dimBackground) {
            Path path = new Path();
            this.f14452k = path;
            path.setFillType(Path.FillType.EVEN_ODD);
            prepareBackground();
        } else {
            this.f14452k.reset();
        }
        this.f14458q = true;
    }

    public final void setCredentialPart(@Nullable JumioCredentialPart jumioCredentialPart) {
        this.f14453l = jumioCredentialPart;
    }

    public final void setExtractionArea(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<set-?>");
        this.f14446e = rect;
    }

    public final void setLeftOffset(int i11) {
        this.f14445d = i11;
    }

    public final void setMirrorOverlay(boolean z11) {
        this.f14457p = z11;
    }

    public final void setMobileContext(@NotNull MobileContext mobileContext) {
        Intrinsics.checkNotNullParameter(mobileContext, "<set-?>");
        this.f14442a = mobileContext;
    }

    public final void setOverlayWidth(int i11) {
        this.f14443b = i11;
    }

    @Override // com.jumio.core.overlay.Overlay
    public void setScanPart(@NotNull ScanPartModel scanPartModel) {
        Intrinsics.checkNotNullParameter(scanPartModel, "scanPartModel");
        this.scanMode = scanPartModel.getF14313b();
        this.f14453l = scanPartModel.getF14312a();
        if (scanPartModel instanceof PhysicalIdScanPartModel) {
            DocumentFormat format = ((PhysicalIdScanPartModel) scanPartModel).getFormat();
            this.f14454m = format;
            this.useCenterCrop = this.useCenterCrop && format != DocumentFormat.NONE;
        }
        updateOverlayConfiguration(this.f14442a);
    }

    public final void setTopOffset(int i11) {
        this.f14444c = i11;
    }

    @Override // com.jumio.core.overlay.Overlay
    public void setVisible(int visibility) {
        this.visibility.set(visibility);
    }

    @Override // com.jumio.core.overlay.Overlay
    public void update(@NotNull ExtractionUpdateInterface<?> extractionUpdate) {
        Intrinsics.checkNotNullParameter(extractionUpdate, "extractionUpdate");
    }

    public void updateOverlayConfiguration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.useCenterCrop) {
            boolean z11 = ((this.f14446e.isEmpty() || this.width == 0 || this.height == 0) ? 0.0f : (((float) this.f14446e.width()) * ((float) this.f14446e.height())) / (((float) this.width) * ((float) this.height))) <= 0.76f;
            this.dimBackground = z11;
            this.drawBrackets = z11;
            this.detectLines = false;
            this.topLeftCornerRadius = 0;
            this.topRightCornerRadius = 0;
            this.f14455n = 0;
            this.f14456o = 0;
            return;
        }
        DocumentFormat documentFormat = this.f14454m;
        if (documentFormat == DocumentFormat.ID1 || documentFormat == DocumentFormat.ID2) {
            this.drawBrackets = true;
            this.dimBackground = true;
            this.detectLines = false;
            int iDpToPx = ScreenUtilKt.dpToPx(16, context);
            this.topLeftCornerRadius = iDpToPx;
            this.topRightCornerRadius = iDpToPx;
            this.f14455n = iDpToPx;
            this.f14456o = iDpToPx;
            return;
        }
        if (documentFormat != DocumentFormat.ID3) {
            this.drawBrackets = false;
            this.dimBackground = false;
            this.detectLines = false;
            return;
        }
        this.drawBrackets = true;
        this.dimBackground = true;
        this.detectLines = false;
        this.topLeftCornerRadius = 0;
        this.topRightCornerRadius = 0;
        int iDpToPx2 = ScreenUtilKt.dpToPx(16, context);
        this.f14455n = iDpToPx2;
        this.f14456o = iDpToPx2;
    }

    @Override // com.jumio.core.overlay.Overlay
    public void destroy() {
    }
}
