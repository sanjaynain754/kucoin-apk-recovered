package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import cn.jiguang.privates.push.constants.JPushConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements Quirk {
    private static final Set<String> PIXEL_MODELS = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    private static boolean isPixelProblematicDevice() {
        return "google".equalsIgnoreCase(Build.BRAND) && PIXEL_MODELS.contains(Build.MODEL.toLowerCase());
    }

    private boolean shouldForceEnableStreamSharingForOnePlus12(String str, Collection<UseCase> collection) {
        return str.equals("1") && isVideoCapturePreviewImageCaptureCombination(collection);
    }

    private boolean shouldForceEnableStreamSharingForPixelDevice(String str, Collection<UseCase> collection) {
        return str.equals("1") && isVideoCapturePreviewImageCaptureCombination(collection);
    }

    private static boolean isOnePlus12() {
        if (JPushConstants.Manufacturer.ONEPLUS.equalsIgnoreCase(Build.BRAND) && "cph2583".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    private boolean isVideoCapturePreviewImageCaptureCombination(Collection<UseCase> collection) {
        if (collection.size() != 3) {
            return false;
        }
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        for (UseCase useCase : collection) {
            if (useCase instanceof Preview) {
                z11 = true;
            } else if (useCase instanceof ImageCapture) {
                z13 = true;
            } else if (useCase.getCurrentConfig().containsOption(UseCaseConfig.OPTION_CAPTURE_TYPE)) {
                if (useCase.getCurrentConfig().getCaptureType() == UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
        }
        if (!z11 || !z12 || !z13) {
            return false;
        }
        return true;
    }

    public static boolean load() {
        if (!isOnePlus12() && !isPixelProblematicDevice()) {
            return false;
        }
        return true;
    }

    public boolean shouldForceEnableStreamSharing(String str, Collection<UseCase> collection) {
        if (isOnePlus12()) {
            return shouldForceEnableStreamSharingForOnePlus12(str, collection);
        }
        if (isPixelProblematicDevice()) {
            return shouldForceEnableStreamSharingForPixelDevice(str, collection);
        }
        return false;
    }
}
