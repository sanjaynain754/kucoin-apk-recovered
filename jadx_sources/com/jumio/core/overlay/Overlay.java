package com.jumio.core.overlay;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.core.C9301R;
import com.jumio.core.MobileContext;
import com.jumio.core.extraction.ExtractionUpdateInterface;
import com.jumio.core.models.ScanPartModel;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0014\u0010\u0014\u001a\u00020\u00032\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\u0003H&R\u0012\u0010\u001b\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001fÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/overlay/Overlay;", "", "addViews", "", "rootView", "Landroid/view/ViewGroup;", "setScanPart", "scanPartModel", "Lcom/jumio/core/models/ScanPartModel;", "calculate", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "extractionArea", "Landroid/graphics/Rect;", "prepareDraw", "isFrontCamera", "", "doDraw", "canvas", "Landroid/graphics/Canvas;", "update", "extractionUpdate", "Lcom/jumio/core/extraction/ExtractionUpdateInterface;", "setVisible", "visibility", "", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "overlayBounds", "getOverlayBounds", "()Landroid/graphics/Rect;", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface Overlay {
    public static final int BORDER_STROKE_WIDTH_IN_DP = 2;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f14460a;
    public static final int DETECTED_BORDER_STROKE_WIDTH_IN_DP = 6;

    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/jumio/core/overlay/Overlay$Companion;", "", "<init>", "()V", "BORDER_STROKE_WIDTH_IN_DP", "", "DETECTED_BORDER_STROKE_WIDTH_IN_DP", "getCustomizations", "", "context", "Lcom/jumio/core/MobileContext;", "getCustomizations$jumio_core_release", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public static final int BORDER_STROKE_WIDTH_IN_DP = 2;
        public static final int DETECTED_BORDER_STROKE_WIDTH_IN_DP = 6;

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f14460a = new Companion();

        /* JADX INFO: renamed from: a */
        public static final int m14577a(TypedArray typedArray, int i11) {
            Intrinsics.checkNotNullParameter(typedArray, "typedArray");
            return typedArray.getColor(i11, -1);
        }

        @NotNull
        public final Map<Integer, Integer> getCustomizations$jumio_core_release(@NotNull MobileContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.getCustomizations(C9301R.style.Jumio_Overlay_Customization, C9301R.attr.jumio_overlay_customization, new int[]{C9301R.attr.jumio_scanOverlay, C9301R.attr.jumio_scanOverlayFill, C9301R.attr.jumio_scanOverlayTransparent, C9301R.attr.jumio_scanBackground, C9301R.attr.jumio_scanOverlay_livenessStroke, C9301R.attr.jumio_scanOverlay_livenessStrokeAnimation, C9301R.attr.jumio_scanOverlay_livenessStrokeAnimationCompleted, C9301R.attr.jumio_id_aligned_stroke, C9301R.attr.jumio_id_unaligned_stroke}, new Function2() { // from class: com.jumio.core.overlay.a
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(Overlay.Companion.m14577a((TypedArray) obj, ((Integer) obj2).intValue()));
                }
            });
        }
    }

    void addViews(@NotNull ViewGroup rootView);

    void calculate(@NotNull CameraSettings cameraSettings, @NotNull Rect extractionArea);

    void destroy();

    void doDraw(@NotNull Canvas canvas);

    @NotNull
    Rect getOverlayBounds();

    void prepareDraw(boolean isFrontCamera);

    void setScanPart(@NotNull ScanPartModel scanPartModel);

    void setVisible(int visibility);

    void update(@NotNull ExtractionUpdateInterface<?> extractionUpdate);
}
