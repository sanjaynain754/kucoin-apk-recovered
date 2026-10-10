package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.Quirk;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;

/* JADX INFO: loaded from: classes23.dex */
public class StretchedVideoResolutionQuirk implements Quirk {
    public Size getAlternativeResolution(int i11) {
        if (i11 == 4) {
            return new Size(C33556b3.f69051i, TXVodDownloadDataSource.QUALITY_480P);
        }
        if (i11 == 5) {
            return new Size(960, 720);
        }
        if (i11 != 6) {
            return null;
        }
        return new Size(1440, TXVodDownloadDataSource.QUALITY_1080P);
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
}
