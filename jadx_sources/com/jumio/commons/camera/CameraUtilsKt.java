package com.jumio.commons.camera;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.jumio.commons.camera.CameraUtilsKt;
import com.jumio.commons.log.Log;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u001a\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a.\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u001a6\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u001a\u001e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b\u001a\u0016\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t\u001a\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b\u001a4\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"TAG", "", "frameRotationMatchesPreviewRotation", "", "metadata", "Lcom/jumio/commons/camera/Frame$Metadata;", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "surfaceToPreview", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/Rect;", "manipulateMatrix", "Lkotlin/Function1;", "Landroid/graphics/Matrix;", "", "surfaceToCapture", "surfaceToCamera", "previewToSurface", "centerCropRect", "extractionArea", "frameCropRect", "centerCrop", BridgeParamKeyKt.CAPTURE, "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCameraUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraUtils.kt\ncom/jumio/commons/camera/CameraUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,216:1\n1#2:217\n337#3:218\n*S KotlinDebug\n*F\n+ 1 CameraUtils.kt\ncom/jumio/commons/camera/CameraUtilsKt\n*L\n145#1:218\n*E\n"})
public final class CameraUtilsKt {

    @NotNull
    private static final String TAG = "CameraUtils";

    @NotNull
    public static final Rect centerCropRect(@NotNull Rect extractionArea) {
        int iHeight;
        int iHeight2;
        Intrinsics.checkNotNullParameter(extractionArea, "extractionArea");
        if (extractionArea.isEmpty()) {
            return new Rect(0, 0, 0, 0);
        }
        float fWidth = extractionArea.width() / extractionArea.height();
        int iWidth = extractionArea.left;
        int iHeight3 = extractionArea.top;
        if (fWidth <= 1.0f) {
            iHeight2 = extractionArea.width();
            iHeight = extractionArea.width();
            iHeight3 += (int) ((extractionArea.height() - iHeight2) / 2);
        } else {
            iHeight = extractionArea.height();
            iHeight2 = extractionArea.height();
            iWidth += (int) ((extractionArea.width() - iHeight) / 2);
        }
        return new Rect(iWidth, iHeight3, iHeight + iWidth, iHeight2 + iHeight3);
    }

    @NotNull
    public static final Rect frameCropRect(@NotNull Frame.Metadata metadata, @NotNull CameraSettings cameraSettings, @Nullable Rect rect, boolean z11, boolean z12) {
        Frame.Metadata metadata2;
        CameraSettings cameraSettings2;
        Rect rect2;
        RectF rectFSurfaceToPreview$default;
        int i11;
        int i12;
        int iWidth;
        int iHeight;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        if (rect == null) {
            rectFSurfaceToPreview$default = new RectF(metadata.getSize().toRect());
            metadata2 = metadata;
            cameraSettings2 = cameraSettings;
            rect2 = rect;
        } else if (z12) {
            metadata2 = metadata;
            cameraSettings2 = cameraSettings;
            rect2 = rect;
            rectFSurfaceToPreview$default = surfaceToCapture$default(metadata2, cameraSettings2, rect2, null, 8, null);
        } else {
            metadata2 = metadata;
            cameraSettings2 = cameraSettings;
            rect2 = rect;
            rectFSurfaceToPreview$default = surfaceToPreview$default(cameraSettings2, rect2, null, 4, null);
        }
        float ratio = rect2 == null ? metadata2.getSize().getRatio() : rect2.height() / rect2.width();
        if (frameRotationMatchesPreviewRotation(metadata2, cameraSettings2)) {
            i11 = (int) rectFSurfaceToPreview$default.left;
            i12 = (int) rectFSurfaceToPreview$default.top;
            iWidth = (int) rectFSurfaceToPreview$default.width();
            iHeight = (int) rectFSurfaceToPreview$default.height();
            if (z11 && ratio <= 1.0f) {
                i11 += (iWidth - iHeight) / 2;
                iWidth = iHeight;
            } else if (z11) {
                i12 += (iHeight - iWidth) / 2;
                iHeight = iWidth;
            }
        } else {
            i12 = (int) rectFSurfaceToPreview$default.left;
            i11 = (int) rectFSurfaceToPreview$default.top;
            iWidth = (int) rectFSurfaceToPreview$default.width();
            iHeight = (int) rectFSurfaceToPreview$default.height();
            if (z11 && ratio >= 1.0f) {
                i11 += (iHeight - iWidth) / 2;
                iHeight = iWidth;
            } else if (z11) {
                i12 += (iWidth - iHeight) / 2;
                iWidth = iHeight;
            } else {
                iWidth = iHeight;
                iHeight = iWidth;
            }
        }
        int width = metadata2.getSize().getWidth();
        int height = metadata2.getSize().getHeight();
        int rotation = metadata2.getRotation();
        if ((!cameraSettings2.getF13519e() && (rotation == 180 || rotation == 360 || rotation == 270)) || (cameraSettings2.getF13519e() && (rotation == 90 || rotation == 180))) {
            Log.m14479v(TAG, "Adapting left/top because of image rotation");
            i11 = (width - iWidth) - i11;
            i12 = (height - iHeight) - i12;
        }
        if (i11 < 0 || i11 > metadata2.getSize().getWidth() || i12 < 0 || i12 > metadata2.getSize().getHeight() || (i13 = i11 + iWidth) < 0 || i13 > metadata2.getSize().getWidth() || (i14 = i12 + iHeight) < 0 || i14 > metadata2.getSize().getHeight()) {
            Log.m14484w(TAG, StringsKt.trimMargin$default("Invalid parameters for cropping:\n\t\t\t\t\t| holeLeft: " + i11 + " ; \n\t\t\t\t\t| holeTop: " + i12 + " ; \n\t\t\t\t\t| holeWidth: " + iWidth + " ; \n\t\t\t\t\t| holeHeight " + iHeight + " ; \n\t\t\t\t\t| cameraSettings: " + cameraSettings2 + "\n\t\t\t", null, 1, null));
        }
        return new Rect(i11, i12, iWidth + i11, iHeight + i12);
    }

    public static /* synthetic */ Rect frameCropRect$default(Frame.Metadata metadata, CameraSettings cameraSettings, Rect rect, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        if ((i11 & 16) != 0) {
            z12 = false;
        }
        return frameCropRect(metadata, cameraSettings, rect, z11, z12);
    }

    public static final boolean frameRotationMatchesPreviewRotation(@NotNull Frame.Metadata metadata, @NotNull CameraSettings cameraSettings) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        return metadata.getSize().getRatio() == cameraSettings.getF13517c().getRatio();
    }

    @NotNull
    public static final RectF previewToSurface(@NotNull CameraSettings cameraSettings, @NotNull RectF rect) {
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Intrinsics.checkNotNullParameter(rect, "rect");
        Matrix matrix = new Matrix();
        float width = cameraSettings.getF13515a().getWidth() / cameraSettings.getF13517c().getWidth();
        float height = cameraSettings.getF13515a().getHeight() / cameraSettings.getF13517c().getHeight();
        if (cameraSettings.getF13519e()) {
            matrix.setScale(width * (-1), height);
            matrix.postTranslate(cameraSettings.getF13515a().getWidth(), 0.0f);
        } else {
            matrix.setScale(width, height);
        }
        float width2 = (cameraSettings.getF13516b().getWidth() - cameraSettings.getF13515a().getWidth()) / 2.0f;
        float height2 = (cameraSettings.getF13516b().getHeight() - cameraSettings.getF13515a().getHeight()) / 2.0f;
        RectF rectF = new RectF(rect);
        RectF rectF2 = new RectF();
        matrix.mapRect(rectF2, rectF);
        rectF2.offset(width2, height2);
        return rectF2;
    }

    @NotNull
    public static final RectF surfaceToCamera(@NotNull CameraSettings cameraSettings, @NotNull final Frame.Metadata metadata, @NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(rect, "rect");
        RectF rectFSurfaceToPreview = surfaceToPreview(cameraSettings, rect, new Function1() { // from class: f9.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CameraUtilsKt.surfaceToCamera$lambda$1(metadata, (Matrix) obj);
            }
        });
        Size size = metadata.getSize();
        rectFSurfaceToPreview.left = Math.max(rectFSurfaceToPreview.left, 0.0f);
        rectFSurfaceToPreview.top = Math.max(rectFSurfaceToPreview.top, 0.0f);
        rectFSurfaceToPreview.right = Math.min(rectFSurfaceToPreview.right, size.getWidth());
        rectFSurfaceToPreview.bottom = Math.min(rectFSurfaceToPreview.bottom, size.getHeight());
        return rectFSurfaceToPreview;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit surfaceToCamera$lambda$1(Frame.Metadata metadata, Matrix it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.postRotate(TXVodDownloadDataSource.QUALITY_360P - metadata.getRotation(), 0.0f, 0.0f);
        int rotation = TXVodDownloadDataSource.QUALITY_360P - metadata.getRotation();
        if (rotation == 90) {
            it.postTranslate(metadata.getSize().getWidth(), 0.0f);
        } else if (rotation == 180) {
            it.postTranslate(metadata.getSize().getWidth(), metadata.getSize().getHeight());
        } else if (rotation == 270) {
            it.postTranslate(0.0f, metadata.getSize().getHeight());
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public static final RectF surfaceToCapture(@NotNull Frame.Metadata metadata, @NotNull CameraSettings cameraSettings, @NotNull Rect rect, @Nullable Function1<? super Matrix, Unit> function1) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Intrinsics.checkNotNullParameter(rect, "rect");
        Matrix matrix = new Matrix();
        Size sizeFlip = !frameRotationMatchesPreviewRotation(metadata, cameraSettings) ? metadata.getSize().flip() : metadata.getSize();
        matrix.setScale(sizeFlip.getWidth() / cameraSettings.getF13517c().getWidth(), sizeFlip.getHeight() / cameraSettings.getF13517c().getHeight());
        RectF rectF = new RectF();
        matrix.mapRect(rectF, surfaceToPreview(cameraSettings, rect, function1));
        return rectF;
    }

    public static /* synthetic */ RectF surfaceToCapture$default(Frame.Metadata metadata, CameraSettings cameraSettings, Rect rect, Function1 function1, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        return surfaceToCapture(metadata, cameraSettings, rect, function1);
    }

    @NotNull
    public static final RectF surfaceToPreview(@NotNull CameraSettings cameraSettings, @NotNull Rect rect, @Nullable Function1<? super Matrix, Unit> function1) {
        Intrinsics.checkNotNullParameter(cameraSettings, "cameraSettings");
        Intrinsics.checkNotNullParameter(rect, "rect");
        Matrix matrix = new Matrix();
        matrix.setScale(cameraSettings.getF13517c().getWidth() / cameraSettings.getF13515a().getWidth(), cameraSettings.getF13517c().getHeight() / cameraSettings.getF13515a().getHeight());
        if (function1 != null) {
            function1.invoke(matrix);
        }
        float width = (cameraSettings.getF13515a().getWidth() - cameraSettings.getF13516b().getWidth()) / 2.0f;
        float height = (cameraSettings.getF13515a().getHeight() - cameraSettings.getF13516b().getHeight()) / 2.0f;
        RectF rectF = new RectF(rect);
        rectF.offset(width, height);
        RectF rectF2 = new RectF();
        matrix.mapRect(rectF2, rectF);
        return rectF2;
    }

    public static /* synthetic */ RectF surfaceToPreview$default(CameraSettings cameraSettings, Rect rect, Function1 function1, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        return surfaceToPreview(cameraSettings, rect, function1);
    }
}
