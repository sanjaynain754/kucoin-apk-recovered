package aai.telemetry;

import p387k.C40833h;

/* JADX INFO: loaded from: classes23.dex */
public class AAITelemetryJNI {

    /* JADX INFO: renamed from: a */
    public static boolean f679a;

    /* JADX INFO: renamed from: O0 */
    public static native byte[] m827O0();

    public static native void O00000(String str, String str2);

    public static native void O00000000(String str, String str2);

    public static native byte[] O0OO0oOo0o0(String str, String str2, byte[] bArr, byte[] bArr2, long j11);

    public static native byte[] O0OO0oOo0o00000(String str, long j11);

    public static native byte[] O0OO0oOo0o0o(byte[][] bArr);

    public static native String O0OO0oOo0o0o0(String str);

    public static native byte[] O0OO0oOo0o0oooo(String str, String str2, String str3, long j11, String str4);

    public static native byte[] O0OO0oOo0o0ooooo(String str, String str2, String str3, String str4, String str5, String str6, long j11);

    public static native byte[] O0o();

    public static native void O0ooE(String str);

    public static native String oOo00oo0(String str, String str2);

    public static native String oOo00oo0o(String str, String str2);

    public static native void ooooooooo(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, double d11, int i12, boolean z11, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18);

    static {
        try {
            System.loadLibrary("aai_core_v1.4.5");
            f679a = true;
        } catch (UnsatisfiedLinkError e11) {
            f679a = false;
            C40833h.m89363g("Liveness JNI library load failed:" + e11.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m828a() {
        return f679a;
    }
}
