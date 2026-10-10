package androidx.camera.core.internal.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: PreviewGreenTintQuirk.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\u0005H\u0007J\u001e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007J\u001e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u000f"}, m90084d2 = {"Landroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk;", "Landroidx/camera/core/impl/Quirk;", "<init>", "()V", "isMotoE20", "", "()Z", "load", "shouldForceEnableStreamSharing", "cameraId", "", "appUseCases", "", "Landroidx/camera/core/UseCase;", "shouldForceEnableStreamSharingForMotoE20", "camera-core_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
@SourceDebugExtension({"SMAP\nPreviewGreenTintQuirk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewGreenTintQuirk.kt\nandroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n1755#2,3:71\n1755#2,3:74\n*S KotlinDebug\n*F\n+ 1 PreviewGreenTintQuirk.kt\nandroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk\n*L\n61#1:71,3\n63#1:74,3\n*E\n"})
public final class PreviewGreenTintQuirk implements Quirk {

    @NotNull
    public static final PreviewGreenTintQuirk INSTANCE = new PreviewGreenTintQuirk();

    private final boolean isMotoE20() {
        return StringsKt.equals("motorola", Build.BRAND, true) && StringsKt.equals("moto e20", Build.MODEL, true);
    }

    @JvmStatic
    public static final boolean load() {
        return INSTANCE.isMotoE20();
    }

    @JvmStatic
    public static final boolean shouldForceEnableStreamSharing(@NotNull String cameraId, @NotNull Collection<? extends UseCase> appUseCases) {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        Intrinsics.checkNotNullParameter(appUseCases, "appUseCases");
        PreviewGreenTintQuirk previewGreenTintQuirk = INSTANCE;
        if (previewGreenTintQuirk.isMotoE20()) {
            return previewGreenTintQuirk.shouldForceEnableStreamSharingForMotoE20(cameraId, appUseCases);
        }
        return false;
    }

    private final boolean shouldForceEnableStreamSharingForMotoE20(String cameraId, Collection<? extends UseCase> appUseCases) {
        boolean z11;
        boolean z12;
        if (Intrinsics.areEqual(cameraId, "0") && appUseCases.size() == 2) {
            if (!appUseCases.isEmpty()) {
                Iterator<T> it = appUseCases.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z11 = false;
                        break;
                    }
                    if (((UseCase) it.next()) instanceof Preview) {
                        z11 = true;
                        break;
                    }
                }
            } else {
                z11 = false;
                break;
            }
            if (!appUseCases.isEmpty()) {
                Iterator<T> it2 = appUseCases.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z12 = false;
                        break;
                    }
                    UseCase useCase = (UseCase) it2.next();
                    if (useCase.getCurrentConfig().containsOption(UseCaseConfig.OPTION_CAPTURE_TYPE) && useCase.getCurrentConfig().getCaptureType() == UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE) {
                        z12 = true;
                        break;
                    }
                }
            } else {
                z12 = false;
                break;
            }
            if (z11 && z12) {
                return true;
            }
        }
        return false;
    }

    private PreviewGreenTintQuirk() {
    }
}
