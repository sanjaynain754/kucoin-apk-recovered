package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;

/* JADX INFO: loaded from: classes23.dex */
public class AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk implements CaptureIntentPreviewQuirk {
    public static boolean isSamsungM55() {
        if ("samsung".equalsIgnoreCase(Build.BRAND) && Build.DEVICE.equalsIgnoreCase("m55xq")) {
            return true;
        }
        return false;
    }

    public static boolean load() {
        return isSamsungM55();
    }

    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    public boolean workaroundByCaptureIntentPreview() {
        return isSamsungM55();
    }
}
