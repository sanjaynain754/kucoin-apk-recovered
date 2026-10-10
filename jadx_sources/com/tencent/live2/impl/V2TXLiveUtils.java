package com.tencent.live2.impl;

import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.exoplayer.DefaultLoadControl;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.live2.V2TXLiveDef;

/* JADX INFO: loaded from: classes45.dex */
public class V2TXLiveUtils {
    private static final String TAG = "V2TXLiveUtils";
    public static final String TRTC_ADDRESS1 = new String(Base64.decode("cm9vbTovL2Nsb3VkLnRlbmNlbnQuY29tL3J0Yw==", 0));
    public static final String TRTC_ADDRESS2 = new String(Base64.decode("cm9vbTovL3J0Yy50ZW5jZW50LmNvbQ==", 0));

    /* JADX INFO: renamed from: com.tencent.live2.impl.V2TXLiveUtils$1 */
    public static /* synthetic */ class C349821 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f74808a;

        static {
            int[] iArr = new int[V2TXLiveDef.V2TXLiveVideoResolution.values().length];
            f74808a = iArr;
            try {
                iArr[V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution160x160.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74808a[V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution270x270.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74808a[V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution480x480.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74808a[V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution320x240.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74808a[V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution480x360.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74808a[V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution640x480.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f74808a[V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution320x180.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f74808a[V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution480x270.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f74808a[V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution640x360.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f74808a[V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution960x540.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f74808a[V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution1280x720.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f74808a[V2TXLiveDef.V2TXLiveVideoResolution.V2TXLiveVideoResolution1920x1080.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.live2.impl.V2TXLiveUtils$a */
    public static class C34983a {

        /* JADX INFO: renamed from: a */
        public int f74809a;

        /* JADX INFO: renamed from: b */
        public int f74810b;

        public C34983a(int i11, int i12) {
            this.f74809a = i11;
            this.f74810b = i12;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C34983a getBitrateByResolution(V2TXLiveDef.V2TXLiveVideoResolution v2TXLiveVideoResolution) {
        int i11;
        int i12;
        int i13 = 600;
        switch (C349821.f74808a[v2TXLiveVideoResolution.ordinal()]) {
            case 1:
                i13 = 100;
                i11 = 150;
                break;
            case 2:
                i13 = 200;
                i11 = 300;
                break;
            case 3:
                i12 = 525;
                i11 = i12;
                i13 = 350;
                break;
            case 4:
                i11 = 375;
                i13 = 250;
                break;
            case 5:
                i11 = 600;
                i13 = 400;
                break;
            case 6:
                i11 = 900;
                break;
            case 7:
                i11 = 400;
                i13 = 250;
                break;
            case 8:
                i12 = C33556b3.f69039f;
                i11 = i12;
                i13 = 350;
                break;
            case 9:
                i13 = 500;
                i11 = 900;
                break;
            case 10:
            default:
                i13 = 800;
                i11 = 1500;
                break;
            case 11:
                i13 = 1000;
                i11 = 1800;
                break;
            case 12:
                i13 = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS;
                i11 = 3000;
                break;
        }
        return new C34983a(i13, i11);
    }

    public static V2TXLiveDef.V2TXLiveMode parseLiveMode(String str) {
        if (!str.startsWith("trtc://") && !str.startsWith(TRTC_ADDRESS1) && !str.startsWith(TRTC_ADDRESS2)) {
            TXCLog.m76153i(TAG, "parseLiveMode: rtmp.");
            return V2TXLiveDef.V2TXLiveMode.TXLiveMode_RTMP;
        }
        TXCLog.m76153i(TAG, "parseLiveMode: rtc.");
        return V2TXLiveDef.V2TXLiveMode.TXLiveMode_RTC;
    }

    public static String removeURLSensitiveInfo(String str) {
        int iIndexOf;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            String[] strArr = {"roomsig", "privatemapkey", "usersig"};
            for (int i11 = 0; i11 < 3; i11++) {
                if (str.contains(strArr[i11]) && (iIndexOf = str.indexOf(strArr[i11])) != -1) {
                    int iIndexOf2 = str.indexOf("&", iIndexOf);
                    if (iIndexOf2 == -1) {
                        str = str.substring(0, iIndexOf);
                    } else {
                        str = str.substring(0, iIndexOf) + str.substring(iIndexOf2);
                    }
                }
            }
            return str;
        } catch (Exception e11) {
            TXCLog.m76152e(TAG, "remove url sensitive info failed.", e11);
            return str;
        }
    }
}
