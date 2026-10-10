package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Quirk;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import com.tencent.thumbplayer.tcmedia.api.TPErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class ExcludedSupportedSizesQuirk implements Quirk {
    private static final String TAG = "ExcludedSupportedSizesQuirk";
    private static final int UNKNOWN_IMAGE_FORMAT = -1;

    public List<Size> getExcludedSizes(String str, int i11) {
        if (isOnePlus6()) {
            return getOnePlus6ExcludedSizes(str, i11);
        }
        if (isOnePlus6T()) {
            return getOnePlus6TExcludedSizes(str, i11);
        }
        if (isHuaweiP20Lite()) {
            return getHuaweiP20LiteExcludedSizes(str, i11, null);
        }
        if (isSamsungJ7PrimeApi27Above()) {
            return getSamsungJ7PrimeApi27AboveExcludedSizes(str, i11, null);
        }
        if (isSamsungJ7Api27Above()) {
            return getSamsungJ7Api27AboveExcludedSizes(str, i11, null);
        }
        if (isRedmiNote9Pro()) {
            return getRedmiNote9ProExcludedSizes(str, i11);
        }
        if (isSamsungA05s()) {
            return getSamsungA05sExcludedSizes(i11);
        }
        if (isNokia7Plus()) {
            return getNokia7PlusExcludedSizes(i11);
        }
        Logger.m1872w(TAG, "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.EMPTY_LIST;
    }

    private List<Size> getHuaweiP20LiteExcludedSizes(String str, int i11, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && (i11 == 34 || i11 == 35 || cls != null)) {
            arrayList.add(new Size(720, 720));
            arrayList.add(new Size(400, 400));
        }
        return arrayList;
    }

    private List<Size> getNokia7PlusExcludedSizes(int i11) {
        ArrayList arrayList = new ArrayList();
        if (i11 == 35) {
            arrayList.add(new Size(4032, 3024));
            arrayList.add(new Size(TPErrorCode.TP_ERROR_TYPE_DOWNLOAD_PROXY, 3000));
            arrayList.add(new Size(3264, 2448));
            arrayList.add(new Size(3200, 2400));
            arrayList.add(new Size(3024, 3024));
            arrayList.add(new Size(2976, 2976));
            arrayList.add(new Size(2448, 2448));
        }
        return arrayList;
    }

    private List<Size> getOnePlus6ExcludedSizes(String str, int i11) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i11 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(TPErrorCode.TP_ERROR_TYPE_DOWNLOAD_PROXY, 3000));
        }
        return arrayList;
    }

    private List<Size> getOnePlus6TExcludedSizes(String str, int i11) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i11 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(TPErrorCode.TP_ERROR_TYPE_DOWNLOAD_PROXY, 3000));
        }
        return arrayList;
    }

    private List<Size> getRedmiNote9ProExcludedSizes(String str, int i11) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i11 == 256) {
            arrayList.add(new Size(9280, 6944));
        }
        return arrayList;
    }

    private List<Size> getSamsungA05sExcludedSizes(int i11) {
        ArrayList arrayList = new ArrayList();
        if (i11 == 35) {
            arrayList.add(new Size(3840, 2160));
            arrayList.add(new Size(3264, 2448));
            arrayList.add(new Size(3200, 2400));
            arrayList.add(new Size(2688, 1512));
            arrayList.add(new Size(2592, 1944));
            arrayList.add(new Size(2592, 1940));
            arrayList.add(new Size(1920, 1440));
        }
        return arrayList;
    }

    private List<Size> getSamsungJ7Api27AboveExcludedSizes(String str, int i11, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0")) {
            if (i11 == 34 || cls != null) {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, TXVodDownloadDataSource.QUALITY_1080P));
                return arrayList;
            }
            if (i11 == 35) {
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, TXVodDownloadDataSource.QUALITY_1080P));
                return arrayList;
            }
        } else if (str.equals("1") && (i11 == 34 || i11 == 35 || cls != null)) {
            arrayList.add(new Size(2576, 1932));
            arrayList.add(new Size(2560, 1440));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(2048, 1536));
            arrayList.add(new Size(2048, 1152));
            arrayList.add(new Size(1920, TXVodDownloadDataSource.QUALITY_1080P));
        }
        return arrayList;
    }

    private List<Size> getSamsungJ7PrimeApi27AboveExcludedSizes(String str, int i11, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0")) {
            if (i11 == 34 || cls != null) {
                arrayList.add(new Size(4128, 3096));
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, TXVodDownloadDataSource.QUALITY_1080P));
                return arrayList;
            }
            if (i11 == 35) {
                arrayList.add(new Size(4128, 2322));
                arrayList.add(new Size(3088, 3088));
                arrayList.add(new Size(3264, 2448));
                arrayList.add(new Size(3264, 1836));
                arrayList.add(new Size(2048, 1536));
                arrayList.add(new Size(2048, 1152));
                arrayList.add(new Size(1920, TXVodDownloadDataSource.QUALITY_1080P));
                return arrayList;
            }
        } else if (str.equals("1") && (i11 == 34 || i11 == 35 || cls != null)) {
            arrayList.add(new Size(3264, 2448));
            arrayList.add(new Size(3264, 1836));
            arrayList.add(new Size(2448, 2448));
            arrayList.add(new Size(1920, 1920));
            arrayList.add(new Size(2048, 1536));
            arrayList.add(new Size(2048, 1152));
            arrayList.add(new Size(1920, TXVodDownloadDataSource.QUALITY_1080P));
        }
        return arrayList;
    }

    private static boolean isHuaweiP20Lite() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean isNokia7Plus() {
        if (!"Nokia".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String str = Build.DEVICE;
        return "B2N".equalsIgnoreCase(str) || "B2N_sprout".equalsIgnoreCase(str);
    }

    private static boolean isOnePlus6() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean isOnePlus6T() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean isRedmiNote9Pro() {
        return "REDMI".equalsIgnoreCase(Build.BRAND) && "joyeuse".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean isSamsungA05s() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "a05s".equalsIgnoreCase(Build.DEVICE) && Build.MODEL.toUpperCase().contains("SM-A057");
    }

    private static boolean isSamsungJ7Api27Above() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    private static boolean isSamsungJ7PrimeApi27Above() {
        return "SAMSUNG".equalsIgnoreCase(Build.BRAND) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    public static boolean load() {
        if (!isOnePlus6() && !isOnePlus6T() && !isHuaweiP20Lite() && !isSamsungJ7PrimeApi27Above() && !isSamsungJ7Api27Above() && !isRedmiNote9Pro() && !isSamsungA05s() && !isNokia7Plus()) {
            return false;
        }
        return true;
    }

    public List<Size> getExcludedSizes(String str, Class<?> cls) {
        if (isHuaweiP20Lite()) {
            return getHuaweiP20LiteExcludedSizes(str, -1, cls);
        }
        if (isSamsungJ7PrimeApi27Above()) {
            return getSamsungJ7PrimeApi27AboveExcludedSizes(str, -1, cls);
        }
        if (isSamsungJ7Api27Above()) {
            return getSamsungJ7Api27AboveExcludedSizes(str, -1, cls);
        }
        Logger.m1872w(TAG, "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.EMPTY_LIST;
    }
}
