package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.compat.workaround.DisplaySizeCorrector;
import androidx.camera.camera2.internal.compat.workaround.MaxPreviewSize;
import androidx.camera.core.internal.utils.SizeUtil;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;

/* JADX INFO: loaded from: classes23.dex */
public class DisplayInfoManager {
    private static volatile DisplayInfoManager sInstance;
    private final DisplayManager mDisplayManager;
    private static final Size MAX_PREVIEW_SIZE = new Size(1920, TXVodDownloadDataSource.QUALITY_1080P);
    private static final Size ABNORMAL_DISPLAY_SIZE_THRESHOLD = new Size(320, 240);
    private static final Size FALLBACK_DISPLAY_SIZE = new Size(C33556b3.f69051i, TXVodDownloadDataSource.QUALITY_480P);
    private static final Object INSTANCE_LOCK = new Object();
    private volatile Size mPreviewSize = null;
    private final MaxPreviewSize mMaxPreviewSize = new MaxPreviewSize();
    private final DisplaySizeCorrector mDisplaySizeCorrector = new DisplaySizeCorrector();

    private Display getMaxSizeDisplayInternal(Display[] displayArr, boolean z11) {
        Display display = null;
        int i11 = -1;
        for (Display display2 : displayArr) {
            if (!z11 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i12 = point.x;
                int i13 = point.y;
                if (i12 * i13 > i11) {
                    display = display2;
                    i11 = i12 * i13;
                }
            }
        }
        return display;
    }

    @VisibleForTesting
    public static void releaseInstance() {
        sInstance = null;
    }

    private Size getCorrectedDisplaySize() {
        Point point = new Point();
        getMaxSizeDisplay(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (SizeUtil.isSmallerByArea(size, ABNORMAL_DISPLAY_SIZE_THRESHOLD) && (size = this.mDisplaySizeCorrector.getDisplaySize()) == null) {
            size = FALLBACK_DISPLAY_SIZE;
        }
        return size.getHeight() > size.getWidth() ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    public static DisplayInfoManager getInstance(Context context) {
        if (sInstance == null) {
            synchronized (INSTANCE_LOCK) {
                try {
                    if (sInstance == null) {
                        sInstance = new DisplayInfoManager(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return sInstance;
    }

    public Display getMaxSizeDisplay(boolean z11) {
        Display[] displays = this.mDisplayManager.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display maxSizeDisplayInternal = getMaxSizeDisplayInternal(displays, z11);
        if (maxSizeDisplayInternal == null && z11) {
            maxSizeDisplayInternal = getMaxSizeDisplayInternal(displays, false);
        }
        if (maxSizeDisplayInternal != null) {
            return maxSizeDisplayInternal;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    public Size getPreviewSize() {
        if (this.mPreviewSize != null) {
            return this.mPreviewSize;
        }
        this.mPreviewSize = calculatePreviewSize();
        return this.mPreviewSize;
    }

    private DisplayInfoManager(Context context) {
        this.mDisplayManager = (DisplayManager) context.getSystemService("display");
    }

    private Size calculatePreviewSize() {
        Size correctedDisplaySize = getCorrectedDisplaySize();
        int width = correctedDisplaySize.getWidth() * correctedDisplaySize.getHeight();
        Size size = MAX_PREVIEW_SIZE;
        if (width > size.getWidth() * size.getHeight()) {
            correctedDisplaySize = size;
        }
        return this.mMaxPreviewSize.getMaxPreviewResolution(correctedDisplaySize);
    }

    public void refresh() {
        this.mPreviewSize = calculatePreviewSize();
    }
}
