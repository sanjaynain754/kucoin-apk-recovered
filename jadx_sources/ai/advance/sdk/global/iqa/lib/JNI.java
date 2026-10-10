package ai.advance.sdk.global.iqa.lib;

import ai.advance.sdk.global.iqa.lib.enums.CardType;
import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p387k.C40833h;
import p387k.C40835j;
import p611s.C44234n;

/* JADX INFO: loaded from: classes23.dex */
public class JNI {

    /* JADX INFO: renamed from: a */
    public static boolean f999a;

    /* JADX INFO: renamed from: b */
    public static boolean f1000b;

    public static native String buildUploadPictureData(String str, boolean z11, String str2, String str3, String str4, String str5, String str6);

    public static native boolean deviceInfoEnable();

    public static native int getAutoFocusInterval();

    public static native int getCompressQuality();

    public static native int getCompressSize();

    public static native int getContinuousWarnCodeCount();

    public static native int getHoldStillTimeMills();

    public static native String getModelVersion();

    private static native String getNativeHttpHeaders();

    public static native int getOutputPictureMinSize();

    public static native String getParamVersion();

    public static native int getPreProcessQueueMaxSize();

    public static native int getPreProcessThreadCount();

    public static native String getSDKType();

    public static native String getUrlByType(String str);

    public static native int getYuvQueueMaxSize();

    public static native boolean isAuthenticated();

    public static native boolean isOP();

    public static native boolean isProdEnv();

    public static native boolean isRecordModelLog();

    public static native boolean isRecordR();

    public static native boolean isTestAccount();

    /* JADX INFO: renamed from: lr */
    private static native float m1364lr();

    private static native String nativeImageQualityDetection(byte[] bArr, int i11, int i12, boolean z11, String str);

    public static native boolean nativeInit(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public static native String nativeInitSdk(String str, String str2);

    public static native String nativeLicenseAuth(String str);

    public static native void release();

    public static native void setExtra(String str);

    public static native void setPaddingRatio(float f11);

    /* JADX INFO: renamed from: tb */
    private static native float m1365tb();

    static {
        try {
            System.loadLibrary("aai_global_iqa_v1.5.4");
            f999a = true;
        } catch (Exception e11) {
            f999a = false;
            C40833h.m89363g("JNI library load failed:" + e11.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m1356a(Context context, String str) {
        String str2;
        try {
            if (m1357b()) {
                return;
            }
            try {
                if (m1359d()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(context.getFilesDir().getAbsolutePath());
                    String str3 = File.separator;
                    sb2.append(str3);
                    sb2.append("aai");
                    sb2.append(str3);
                    sb2.append("aai-iqa-model");
                    sb2.append(str3);
                    String string = sb2.toString();
                    byte[] bArrM97535d = C44234n.m97535d(string + "global_iqa-card_detection-v0.2.dat");
                    byte[] bArrM97535d2 = C44234n.m97535d(string + "global_iqa-quality-v1.2.dat");
                    String str4 = "card_occlusion_mobilecardocc_classification-th-v0.1.2.half.dat";
                    if (!str.contains("TH")) {
                        str2 = str.contains("PH") ? "card_occlusion_mobilecardocc_classification-ph-v0.0.5.half.dat" : "card_occlusion_mobilecardocc_classification-th-v0.1.2.half.dat";
                        nativeInit(bArrM97535d, bArrM97535d2, C44234n.m97535d(string + str4), C44234n.m97535d(string + "glossy_classification_mobilenet_v3_smaller_global-v1.0.half.dat"));
                        f1000b = true;
                    }
                    str4 = str2;
                    nativeInit(bArrM97535d, bArrM97535d2, C44234n.m97535d(string + str4), C44234n.m97535d(string + "glossy_classification_mobilenet_v3_smaller_global-v1.0.half.dat"));
                    f1000b = true;
                }
            } catch (Exception e11) {
                C40833h.m89363g("IQA model load failed:" + e11.getMessage());
                f1000b = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1357b() {
        return f1000b;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1359d() {
        return f999a;
    }

    /* JADX INFO: renamed from: h */
    public static String m1363h(byte[] bArr, int i11, int i12, CardType cardType, String str) {
        return nativeImageQualityDetection(bArr, i11, i12, cardType.cardCheck, str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1358c(String str, String str2) {
        if (m1359d()) {
            nativeInitSdk(str, str2);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static double m1360e() {
        return m1364lr();
    }

    /* JADX INFO: renamed from: f */
    public static double m1361f() {
        return m1365tb();
    }

    /* JADX INFO: renamed from: g */
    public static Map<String, Object> m1362g() {
        try {
            JSONObject jSONObject = new JSONObject(getNativeHttpHeaders());
            HashMap map = new HashMap();
            map.put("X-ADVAI-LOCALE", C40835j.m89368b());
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.get(next));
            }
            return map;
        } catch (Exception unused) {
            return null;
        }
    }
}
