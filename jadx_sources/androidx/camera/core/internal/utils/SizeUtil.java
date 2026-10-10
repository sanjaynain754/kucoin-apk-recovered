package androidx.camera.core.internal.utils;

import android.util.Size;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes23.dex */
public final class SizeUtil {
    public static final Size RESOLUTION_ZERO = new Size(0, 0);
    public static final Size RESOLUTION_QVGA = new Size(320, 240);
    public static final Size RESOLUTION_VGA = new Size(C33556b3.f69051i, TXVodDownloadDataSource.QUALITY_480P);
    public static final Size RESOLUTION_480P = new Size(720, TXVodDownloadDataSource.QUALITY_480P);
    public static final Size RESOLUTION_720P = new Size(1280, 720);
    public static final Size RESOLUTION_1080P = new Size(1920, TXVodDownloadDataSource.QUALITY_1080P);
    public static final Size RESOLUTION_1440P = new Size(1920, 1440);
    public static final Size RESOLUTION_1440P_16_9 = new Size(2560, 1440);
    public static final Size RESOLUTION_UHD = new Size(3840, 2160);

    public static int getArea(int i11, int i12) {
        return i11 * i12;
    }

    public static int getArea(Size size) {
        return getArea(size.getWidth(), size.getHeight());
    }

    private SizeUtil() {
    }

    public static <T> T findNearestHigherFor(Size size, TreeMap<Size, T> treeMap) {
        Map.Entry<Size, T> entryCeilingEntry = treeMap.ceilingEntry(size);
        if (entryCeilingEntry != null) {
            return entryCeilingEntry.getValue();
        }
        Map.Entry<Size, T> entryFloorEntry = treeMap.floorEntry(size);
        if (entryFloorEntry != null) {
            return entryFloorEntry.getValue();
        }
        return null;
    }

    public static Size getMaxSize(List<Size> list) {
        if (list.isEmpty()) {
            return null;
        }
        return (Size) Collections.max(list, new CompareSizesByArea());
    }

    public static boolean isLongerInAnyEdge(Size size, Size size2) {
        if (size.getWidth() <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
            return false;
        }
        return true;
    }

    public static boolean isSmallerByArea(Size size, Size size2) {
        if (getArea(size) < getArea(size2)) {
            return true;
        }
        return false;
    }
}
