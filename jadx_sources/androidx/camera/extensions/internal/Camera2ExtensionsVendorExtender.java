package androidx.camera.extensions.internal;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.internal.utils.SizeUtil;
import androidx.camera.extensions.internal.compat.workaround.ExtensionCharacteristicsAccessGuard;
import androidx.camera.extensions.internal.sessionprocessor.Camera2ExtensionsSessionProcessor;
import androidx.core.util.Preconditions;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Camera2ExtensionsVendorExtender.kt */
/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(31)
@Metadata(m90083d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u0014\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00170\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J \u0010!\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0$0#0\"H\u0016J \u0010%\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0$0#0\"H\u0016J(\u0010&\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0$0#0\"2\u0006\u0010'\u001a\u00020(H\u0002J\u0013\u0010)\u001a\b\u0012\u0004\u0012\u00020 0$H\u0016¢\u0006\u0002\u0010*J\"\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\"0\u00162\u0006\u0010,\u001a\u00020 H\u0016J\b\u0010-\u001a\u00020\u0012H\u0016J\b\u0010.\u001a\u00020\u0012H\u0016J\b\u0010/\u001a\u00020\u0012H\u0016J\b\u00100\u001a\u00020\u0012H\u0016J\u0012\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u000204H\u0016J\u0012\u00105\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003060\"H\u0002J\u0012\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003080\"H\u0016J\b\u00109\u001a\u00020\u0012H\u0016J\u001e\u0010:\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030;\u0012\u0004\u0012\u00020\f0#0\"H\u0016J\b\u0010<\u001a\u00020 H\u0002J\b\u0010=\u001a\u00020\u0019H\u0002J\b\u0010>\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, m90084d2 = {"Landroidx/camera/extensions/internal/Camera2ExtensionsVendorExtender;", "Landroidx/camera/extensions/internal/VendorExtender;", "mode", "", "camera2ExtensionsInfo", "Landroidx/camera/extensions/internal/Camera2ExtensionsInfo;", "<init>", "(ILandroidx/camera/extensions/internal/Camera2ExtensionsInfo;)V", "extensionCharacteristicsAccessGuard", "Landroidx/camera/extensions/internal/compat/workaround/ExtensionCharacteristicsAccessGuard;", "camera2ExtensionMode", "lock", "", "cameraId", "", "cameraExtensionCharacteristics", "Landroid/hardware/camera2/CameraExtensionCharacteristics;", "isExtensionStrengthSupported", "", "isCurrentExtensionModeSupported", "isExtensionAvailable", "characteristicsMap", "", "Landroid/hardware/camera2/CameraCharacteristics;", "init", "", "cameraInfo", "Landroidx/camera/core/CameraInfo;", "getEstimatedCaptureLatencyRange", "Landroid/util/Range;", "", "size", "Landroid/util/Size;", "getSupportedPreviewOutputResolutions", "", "Landroid/util/Pair;", "", "getSupportedCaptureOutputResolutions", "getExtensionSupportedSizes", "formats", "", "getSupportedYuvAnalysisResolutions", "()[Landroid/util/Size;", "getSupportedPostviewResolutions", "captureSize", "isPostviewAvailable", "isCaptureProcessProgressAvailable", "isExtensionStrengthAvailable", "isCurrentExtensionModeAvailable", "createSessionProcessor", "Landroidx/camera/core/impl/SessionProcessor;", "context", "Landroid/content/Context;", "getAvailableCaptureRequestKeys", "Landroid/hardware/camera2/CaptureRequest$Key;", "getSupportedCaptureResultKeys", "Landroid/hardware/camera2/CaptureResult$Key;", "willReceiveOnCaptureCompleted", "getAvailableCharacteristicsKeyValues", "Landroid/hardware/camera2/CameraCharacteristics$Key;", "getCamera2ExtensionsMaximumSupportedSize", "checkInitialized", "isCamera2ExtensionAvailable", "camera-extensions_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCamera2ExtensionsVendorExtender.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Camera2ExtensionsVendorExtender.kt\nandroidx/camera/extensions/internal/Camera2ExtensionsVendorExtender\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,313:1\n37#2,2:314\n1863#3,2:316\n1863#3,2:318\n*S KotlinDebug\n*F\n+ 1 Camera2ExtensionsVendorExtender.kt\nandroidx/camera/extensions/internal/Camera2ExtensionsVendorExtender\n*L\n133#1:314,2\n250#1:316,2\n281#1:318,2\n*E\n"})
public final class Camera2ExtensionsVendorExtender implements VendorExtender {
    private final int camera2ExtensionMode;

    @NotNull
    private final Camera2ExtensionsInfo camera2ExtensionsInfo;
    private CameraExtensionCharacteristics cameraExtensionCharacteristics;
    private String cameraId;

    @NotNull
    private final ExtensionCharacteristicsAccessGuard extensionCharacteristicsAccessGuard;
    private boolean isCurrentExtensionModeSupported;
    private boolean isExtensionStrengthSupported;

    @NotNull
    private final Object lock;
    private final int mode;

    public Camera2ExtensionsVendorExtender(int i11, @NotNull Camera2ExtensionsInfo camera2ExtensionsInfo) {
        Intrinsics.checkNotNullParameter(camera2ExtensionsInfo, "camera2ExtensionsInfo");
        this.mode = i11;
        this.camera2ExtensionsInfo = camera2ExtensionsInfo;
        this.extensionCharacteristicsAccessGuard = new ExtensionCharacteristicsAccessGuard();
        this.camera2ExtensionMode = Camera2ExtensionsUtil.INSTANCE.convertCameraXModeToCamera2Mode(i11);
        this.lock = new Object();
    }

    private final void checkInitialized() {
        Preconditions.checkState(this.cameraId != null, "VendorExtender#init() must be called first");
    }

    private final List<CaptureRequest.Key<?>> getAvailableCaptureRequestKeys() {
        ArrayList arrayList = new ArrayList();
        if (!isCamera2ExtensionAvailable()) {
            return CollectionsKt.emptyList();
        }
        if (Build.VERSION.SDK_INT < 33) {
            return arrayList;
        }
        try {
            CameraExtensionCharacteristics cameraExtensionCharacteristics = this.cameraExtensionCharacteristics;
            if (cameraExtensionCharacteristics == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraExtensionCharacteristics");
                cameraExtensionCharacteristics = null;
            }
            Set<CaptureRequest.Key> availableCaptureRequestKeys = cameraExtensionCharacteristics.getAvailableCaptureRequestKeys(this.camera2ExtensionMode);
            Intrinsics.checkNotNullExpressionValue(availableCaptureRequestKeys, "getAvailableCaptureRequestKeys(...)");
            for (CaptureRequest.Key key : availableCaptureRequestKeys) {
                Intrinsics.checkNotNull(key);
                arrayList.add(key);
            }
            return arrayList;
        } catch (IllegalArgumentException e11) {
            Log.e("Camera2ExtExtender", "Failed to retrieve available capture request keys", e11);
            return CollectionsKt.emptyList();
        }
    }

    private final Size getCamera2ExtensionsMaximumSupportedSize() {
        Camera2ExtensionsInfo camera2ExtensionsInfo = this.camera2ExtensionsInfo;
        String str = this.cameraId;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraId");
            str = null;
        }
        List<Size> supportedOutputSizes = camera2ExtensionsInfo.getSupportedOutputSizes(str, this.camera2ExtensionMode, 256);
        if (!supportedOutputSizes.isEmpty()) {
            return (Size) CollectionsKt.maxWithOrThrow(supportedOutputSizes, new CompareSizesByArea(true));
        }
        Size size = SizeUtil.RESOLUTION_ZERO;
        Intrinsics.checkNotNull(size);
        return size;
    }

    private final List<Pair<Integer, Size[]>> getExtensionSupportedSizes(int[] formats) {
        ArrayList arrayList = new ArrayList();
        for (int i11 : formats) {
            try {
                Camera2ExtensionsInfo camera2ExtensionsInfo = this.camera2ExtensionsInfo;
                String str = this.cameraId;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cameraId");
                    str = null;
                }
                Size[] sizeArr = (Size[]) camera2ExtensionsInfo.getSupportedOutputSizes(str, this.camera2ExtensionMode, i11).toArray(new Size[0]);
                if (!(sizeArr.length == 0)) {
                    Pair pairCreate = Pair.create(Integer.valueOf(i11), sizeArr);
                    Intrinsics.checkNotNullExpressionValue(pairCreate, "create(...)");
                    arrayList.add(pairCreate);
                }
            } catch (IllegalArgumentException e11) {
                Log.e("Camera2ExtExtender", "Failed to retrieve supported output sizes of format " + i11, e11);
            }
        }
        return arrayList;
    }

    private final boolean isCamera2ExtensionAvailable() {
        Camera2ExtensionsInfo camera2ExtensionsInfo = this.camera2ExtensionsInfo;
        String str = this.cameraId;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraId");
            str = null;
        }
        return camera2ExtensionsInfo.isExtensionAvailable(str, this.camera2ExtensionMode);
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @Nullable
    public SessionProcessor createSessionProcessor(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        checkInitialized();
        return new Camera2ExtensionsSessionProcessor(getAvailableCaptureRequestKeys(), this.mode, this);
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @NotNull
    public Map<Integer, List<Size>> getSupportedPostviewResolutions(@NotNull Size captureSize) {
        Intrinsics.checkNotNullParameter(captureSize, "captureSize");
        checkInitialized();
        if (!isCamera2ExtensionAvailable()) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (Build.VERSION.SDK_INT >= 34) {
            int[] iArr = {256, 35, JAnalysisConstants.MainWhat.SET_STATIC_PROPERTY};
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr[i11];
                try {
                    CameraExtensionCharacteristics cameraExtensionCharacteristics = this.cameraExtensionCharacteristics;
                    if (cameraExtensionCharacteristics == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cameraExtensionCharacteristics");
                        cameraExtensionCharacteristics = null;
                    }
                    List postviewSupportedSizes = cameraExtensionCharacteristics.getPostviewSupportedSizes(this.camera2ExtensionMode, captureSize, i12);
                    Intrinsics.checkNotNull(postviewSupportedSizes);
                    if (!postviewSupportedSizes.isEmpty()) {
                        linkedHashMap.put(Integer.valueOf(i12), postviewSupportedSizes);
                    }
                } catch (IllegalArgumentException e11) {
                    Log.e("Camera2ExtExtender", "Failed to retrieve postview supported output sizes of format " + i12, e11);
                }
            }
        }
        return linkedHashMap;
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public void init(@NotNull CameraInfo cameraInfo) {
        boolean zContains;
        Intrinsics.checkNotNullParameter(cameraInfo, "cameraInfo");
        String cameraId = ((CameraInfoInternal) cameraInfo).getCameraId();
        this.cameraId = cameraId;
        Camera2ExtensionsInfo camera2ExtensionsInfo = this.camera2ExtensionsInfo;
        CameraExtensionCharacteristics cameraExtensionCharacteristics = null;
        if (cameraId == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraId");
            cameraId = null;
        }
        this.cameraExtensionCharacteristics = C1201c.m2071a(Preconditions.checkNotNull(camera2ExtensionsInfo.getExtensionCharacteristics(cameraId)));
        boolean zContains2 = false;
        if (!isCamera2ExtensionAvailable() || Build.VERSION.SDK_INT < 34) {
            zContains = false;
        } else {
            CameraExtensionCharacteristics cameraExtensionCharacteristics2 = this.cameraExtensionCharacteristics;
            if (cameraExtensionCharacteristics2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraExtensionCharacteristics");
                cameraExtensionCharacteristics2 = null;
            }
            zContains = cameraExtensionCharacteristics2.getAvailableCaptureRequestKeys(this.camera2ExtensionMode).contains(CaptureRequest.EXTENSION_STRENGTH);
        }
        this.isExtensionStrengthSupported = zContains;
        if (isCamera2ExtensionAvailable() && Build.VERSION.SDK_INT >= 34) {
            CameraExtensionCharacteristics cameraExtensionCharacteristics3 = this.cameraExtensionCharacteristics;
            if (cameraExtensionCharacteristics3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraExtensionCharacteristics");
            } else {
                cameraExtensionCharacteristics = cameraExtensionCharacteristics3;
            }
            zContains2 = cameraExtensionCharacteristics.getAvailableCaptureResultKeys(this.camera2ExtensionMode).contains(CaptureResult.EXTENSION_CURRENT_TYPE);
        }
        this.isCurrentExtensionModeSupported = zContains2;
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public boolean isExtensionAvailable(@NotNull String cameraId, @NotNull Map<String, CameraCharacteristics> characteristicsMap) {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        Intrinsics.checkNotNullParameter(characteristicsMap, "characteristicsMap");
        return this.camera2ExtensionsInfo.isExtensionAvailable(cameraId, this.camera2ExtensionMode);
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @NotNull
    public List<Pair<CameraCharacteristics.Key<?>, Object>> getAvailableCharacteristicsKeyValues() {
        checkInitialized();
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 35) {
            CameraExtensionCharacteristics cameraExtensionCharacteristics = this.cameraExtensionCharacteristics;
            if (cameraExtensionCharacteristics == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraExtensionCharacteristics");
                cameraExtensionCharacteristics = null;
            }
            Set<CameraCharacteristics.Key> keys = cameraExtensionCharacteristics.getKeys(this.camera2ExtensionMode);
            Intrinsics.checkNotNullExpressionValue(keys, "getKeys(...)");
            for (CameraCharacteristics.Key key : keys) {
                CameraExtensionCharacteristics cameraExtensionCharacteristics2 = this.cameraExtensionCharacteristics;
                if (cameraExtensionCharacteristics2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cameraExtensionCharacteristics");
                    cameraExtensionCharacteristics2 = null;
                }
                Object obj = cameraExtensionCharacteristics2.get(this.camera2ExtensionMode, key);
                if (obj != null) {
                    Pair pairCreate = Pair.create(key, obj);
                    Intrinsics.checkNotNullExpressionValue(pairCreate, "create(...)");
                    arrayList.add(pairCreate);
                }
            }
        }
        return arrayList;
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @Nullable
    public Range<Long> getEstimatedCaptureLatencyRange(@Nullable Size size) {
        checkInitialized();
        CameraExtensionCharacteristics cameraExtensionCharacteristics = null;
        if (!isCamera2ExtensionAvailable()) {
            return null;
        }
        CameraExtensionCharacteristics cameraExtensionCharacteristics2 = this.cameraExtensionCharacteristics;
        if (cameraExtensionCharacteristics2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cameraExtensionCharacteristics");
        } else {
            cameraExtensionCharacteristics = cameraExtensionCharacteristics2;
        }
        int i11 = this.camera2ExtensionMode;
        if (size == null) {
            size = getCamera2ExtensionsMaximumSupportedSize();
        }
        return cameraExtensionCharacteristics.getEstimatedCaptureLatencyRangeMillis(i11, size, 256);
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @NotNull
    public List<Pair<Integer, Size[]>> getSupportedCaptureOutputResolutions() {
        checkInitialized();
        if (isCamera2ExtensionAvailable()) {
            return getExtensionSupportedSizes(new int[]{256, 35, JAnalysisConstants.MainWhat.SET_STATIC_PROPERTY});
        }
        return CollectionsKt.emptyList();
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @NotNull
    public List<CaptureResult.Key<?>> getSupportedCaptureResultKeys() {
        checkInitialized();
        if (isCamera2ExtensionAvailable() && Build.VERSION.SDK_INT >= 33) {
            CameraExtensionCharacteristics cameraExtensionCharacteristics = this.cameraExtensionCharacteristics;
            if (cameraExtensionCharacteristics == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraExtensionCharacteristics");
                cameraExtensionCharacteristics = null;
            }
            Set availableCaptureResultKeys = cameraExtensionCharacteristics.getAvailableCaptureResultKeys(this.camera2ExtensionMode);
            Intrinsics.checkNotNullExpressionValue(availableCaptureResultKeys, "getAvailableCaptureResultKeys(...)");
            return CollectionsKt.toList(availableCaptureResultKeys);
        }
        return CollectionsKt.emptyList();
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @NotNull
    public List<Pair<Integer, Size[]>> getSupportedPreviewOutputResolutions() {
        checkInitialized();
        if (isCamera2ExtensionAvailable()) {
            return getExtensionSupportedSizes(new int[]{34, 35});
        }
        return CollectionsKt.emptyList();
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @NotNull
    public Size[] getSupportedYuvAnalysisResolutions() {
        checkInitialized();
        Size[] supportedYuvAnalysisResolutions = super.getSupportedYuvAnalysisResolutions();
        Intrinsics.checkNotNullExpressionValue(supportedYuvAnalysisResolutions, "getSupportedYuvAnalysisResolutions(...)");
        return supportedYuvAnalysisResolutions;
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public boolean isCaptureProcessProgressAvailable() {
        checkInitialized();
        if (!isCamera2ExtensionAvailable() || Build.VERSION.SDK_INT < 34 || !this.extensionCharacteristicsAccessGuard.allowCaptureProcessProgressAvailabilityCheck()) {
            return false;
        }
        try {
            CameraExtensionCharacteristics cameraExtensionCharacteristics = this.cameraExtensionCharacteristics;
            if (cameraExtensionCharacteristics == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraExtensionCharacteristics");
                cameraExtensionCharacteristics = null;
            }
            return cameraExtensionCharacteristics.isCaptureProcessProgressAvailable(this.camera2ExtensionMode);
        } catch (IllegalArgumentException e11) {
            Log.e("Camera2ExtExtender", "Failed to retrieve capture process progress availability", e11);
            return false;
        }
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public boolean isCurrentExtensionModeAvailable() {
        checkInitialized();
        return this.isCurrentExtensionModeSupported;
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public boolean isExtensionStrengthAvailable() {
        checkInitialized();
        return this.isExtensionStrengthSupported;
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public boolean isPostviewAvailable() {
        checkInitialized();
        if (!isCamera2ExtensionAvailable() || Build.VERSION.SDK_INT < 34 || !this.extensionCharacteristicsAccessGuard.allowPostviewAvailabilityCheck()) {
            return false;
        }
        try {
            CameraExtensionCharacteristics cameraExtensionCharacteristics = this.cameraExtensionCharacteristics;
            if (cameraExtensionCharacteristics == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraExtensionCharacteristics");
                cameraExtensionCharacteristics = null;
            }
            return cameraExtensionCharacteristics.isPostviewAvailable(this.camera2ExtensionMode);
        } catch (NoSuchMethodError e11) {
            Log.e("Camera2ExtExtender", "Failed to retrieve postview availability", e11);
            return false;
        }
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public boolean willReceiveOnCaptureCompleted() {
        return super.willReceiveOnCaptureCompleted();
    }
}
