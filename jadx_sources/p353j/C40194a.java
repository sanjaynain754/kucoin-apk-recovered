package p353j;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import androidx.annotation.RequiresApi;

/* JADX INFO: renamed from: j.a */
/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(18)
public class C40194a {
    /* JADX INFO: renamed from: a */
    public static int m88547a(MediaCodecInfo mediaCodecInfo, String str) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        int i11 = 0;
        while (true) {
            int[] iArr = capabilitiesForType.colorFormats;
            if (i11 >= iArr.length) {
                return 0;
            }
            int i12 = iArr[i11];
            if (m88549c(i12)) {
                return i12;
            }
            i11++;
        }
    }

    /* JADX INFO: renamed from: b */
    public static MediaCodecInfo m88548b(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i11 = 0; i11 < codecCount; i11++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i11);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m88549c(int i11) {
        switch (i11) {
            case 19:
            case 20:
            case 21:
                return true;
            default:
                return false;
        }
    }
}
