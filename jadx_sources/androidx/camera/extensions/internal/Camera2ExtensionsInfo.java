package androidx.camera.extensions.internal;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.Size;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Camera2ExtensionsInfo.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\tH\u0007J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000fJ\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\u0011\u001a\u00020\tH\u0003J$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fJ \u0010\u0018\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m90084d2 = {"Landroidx/camera/extensions/internal/Camera2ExtensionsInfo;", "", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "<init>", "(Landroid/hardware/camera2/CameraManager;)V", "lock", "cachedCharacteristics", "", "", "Landroid/hardware/camera2/CameraExtensionCharacteristics;", "cachedSupportedOutputSizes", "", "Landroid/util/Size;", "cachedSupportedExtensions", "", "getExtensionCharacteristics", "cameraId", "isExtensionAvailable", "", "mode", "getSupportedExtensions", "getSupportedOutputSizes", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "getCachedOutputSizesKey", "Companion", "camera-extensions_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCamera2ExtensionsInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Camera2ExtensionsInfo.kt\nandroidx/camera/extensions/internal/Camera2ExtensionsInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
public final class Camera2ExtensionsInfo {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "Camera2ExtensionsInfo";

    @GuardedBy("lock")
    @NotNull
    private final Map<String, CameraExtensionCharacteristics> cachedCharacteristics;

    @GuardedBy("lock")
    @NotNull
    private final Map<String, List<Integer>> cachedSupportedExtensions;

    @GuardedBy("lock")
    @NotNull
    private final Map<String, List<Size>> cachedSupportedOutputSizes;

    @NotNull
    private final CameraManager cameraManager;

    @NotNull
    private final Object lock;

    /* JADX INFO: compiled from: Camera2ExtensionsInfo.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Landroidx/camera/extensions/internal/Camera2ExtensionsInfo$Companion;", "", "<init>", "()V", "TAG", "", "camera-extensions_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public Camera2ExtensionsInfo(@NotNull CameraManager cameraManager) {
        Intrinsics.checkNotNullParameter(cameraManager, "cameraManager");
        this.cameraManager = cameraManager;
        this.lock = new Object();
        this.cachedCharacteristics = new LinkedHashMap();
        this.cachedSupportedOutputSizes = new LinkedHashMap();
        this.cachedSupportedExtensions = new LinkedHashMap();
    }

    private final String getCachedOutputSizesKey(String cameraId, int mode, int format) {
        return cameraId + '-' + mode + '-' + format;
    }

    @RequiresApi(31)
    private final List<Integer> getSupportedExtensions(String cameraId) {
        List<Integer> supportedExtensions;
        synchronized (this.lock) {
            supportedExtensions = this.cachedSupportedExtensions.get(cameraId);
            if (supportedExtensions == null) {
                supportedExtensions = getExtensionCharacteristics(cameraId).getSupportedExtensions();
                this.cachedSupportedExtensions.put(cameraId, supportedExtensions);
                Intrinsics.checkNotNullExpressionValue(supportedExtensions, "also(...)");
            }
        }
        return supportedExtensions;
    }

    @RequiresApi(31)
    @NotNull
    public final CameraExtensionCharacteristics getExtensionCharacteristics(@NotNull String cameraId) {
        CameraExtensionCharacteristics cameraExtensionCharacteristicsM2071a;
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        synchronized (this.lock) {
            cameraExtensionCharacteristicsM2071a = C1201c.m2071a(this.cachedCharacteristics.get(cameraId));
            if (cameraExtensionCharacteristicsM2071a == null) {
                cameraExtensionCharacteristicsM2071a = this.cameraManager.getCameraExtensionCharacteristics(cameraId);
                this.cachedCharacteristics.put(cameraId, cameraExtensionCharacteristicsM2071a);
                Intrinsics.checkNotNullExpressionValue(cameraExtensionCharacteristicsM2071a, "also(...)");
            }
        }
        return cameraExtensionCharacteristicsM2071a;
    }

    @NotNull
    public final List<Size> getSupportedOutputSizes(@NotNull String cameraId, int mode, int format) {
        List<Size> list;
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        if (Build.VERSION.SDK_INT < 31) {
            return CollectionsKt.emptyList();
        }
        String cachedOutputSizesKey = getCachedOutputSizesKey(cameraId, mode, format);
        synchronized (this.lock) {
            list = this.cachedSupportedOutputSizes.get(cachedOutputSizesKey);
        }
        if (list != null) {
            return list;
        }
        try {
            List<Size> extensionSupportedSizes = format == 34 ? getExtensionCharacteristics(cameraId).getExtensionSupportedSizes(mode, SurfaceTexture.class) : getExtensionCharacteristics(cameraId).getExtensionSupportedSizes(mode, format);
            synchronized (this.lock) {
                this.cachedSupportedOutputSizes.put(cachedOutputSizesKey, extensionSupportedSizes);
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(extensionSupportedSizes);
            return extensionSupportedSizes;
        } catch (IllegalArgumentException e11) {
            Logger.m1869e(TAG, "Failed to retrieve supported output sizes for camera " + cameraId + ", mode " + mode + ", format " + format, e11);
            return CollectionsKt.emptyList();
        }
    }

    public final boolean isExtensionAvailable(@NotNull String cameraId, int mode) {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        return getSupportedExtensions(cameraId).contains(Integer.valueOf(mode));
    }
}
