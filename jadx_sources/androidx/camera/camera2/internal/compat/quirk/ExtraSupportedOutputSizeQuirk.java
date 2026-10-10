package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.Quirk;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;

/* JADX INFO: loaded from: classes23.dex */
public class ExtraSupportedOutputSizeQuirk implements Quirk {
    public Size[] getExtraSupportedResolutions(int i11) {
        return (i11 == 34 && isMotoE5Play()) ? getMotoE5PlayExtraSupportedResolutions() : new Size[0];
    }

    private Size[] getMotoE5PlayExtraSupportedResolutions() {
        return new Size[]{new Size(1440, TXVodDownloadDataSource.QUALITY_1080P), new Size(960, 720)};
    }

    private static boolean isMotoE5Play() {
        if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean load() {
        return isMotoE5Play();
    }

    public <T> Size[] getExtraSupportedResolutions(Class<T> cls) {
        if (StreamConfigurationMap.isOutputSupportedFor(cls) && isMotoE5Play()) {
            return getMotoE5PlayExtraSupportedResolutions();
        }
        return new Size[0];
    }
}
