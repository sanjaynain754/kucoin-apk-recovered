package com.tencent.thumbplayer.tcmedia.p164g.p173h;

import android.util.Log;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.h.b */
/* JADX INFO: loaded from: classes64.dex */
public final class C35380b {

    /* JADX INFO: renamed from: a */
    private static int f76190a = 2;

    /* JADX INFO: renamed from: b */
    private static boolean f76191b = true;

    /* JADX INFO: renamed from: c */
    private static InterfaceC35379a f76192c = new InterfaceC35379a() { // from class: com.tencent.thumbplayer.tcmedia.g.h.b.1
        @Override // com.tencent.thumbplayer.tcmedia.p164g.p173h.InterfaceC35379a
        /* JADX INFO: renamed from: d */
        public final void mo78068d(String str, String str2) {
            Log.d(str, str2);
        }

        @Override // com.tencent.thumbplayer.tcmedia.p164g.p173h.InterfaceC35379a
        /* JADX INFO: renamed from: e */
        public final void mo78069e(String str, String str2, Throwable th2) {
            Log.e(str, str2, th2);
        }

        @Override // com.tencent.thumbplayer.tcmedia.p164g.p173h.InterfaceC35379a
        /* JADX INFO: renamed from: i */
        public final void mo78070i(String str, String str2) {
            Log.i(str, str2);
        }

        @Override // com.tencent.thumbplayer.tcmedia.p164g.p173h.InterfaceC35379a
        /* JADX INFO: renamed from: v */
        public final void mo78071v(String str, String str2) {
            Log.v(str, str2);
        }

        @Override // com.tencent.thumbplayer.tcmedia.p164g.p173h.InterfaceC35379a
        /* JADX INFO: renamed from: w */
        public final void mo78072w(String str, String str2, Throwable th2) {
            Log.w(str, str2, th2);
        }
    };

    /* JADX INFO: renamed from: a */
    public static void m78328a(InterfaceC35379a interfaceC35379a) {
        f76192c = interfaceC35379a;
    }

    /* JADX INFO: renamed from: b */
    public static void m78334b(String str, String str2) {
        if (m78333a(3)) {
            f76192c.mo78068d("TMediaCodec.".concat(String.valueOf(str)), str2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m78336c(String str, String str2) {
        if (m78333a(4)) {
            f76192c.mo78070i("TMediaCodec.".concat(String.valueOf(str)), str2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m78337d(String str, String str2) {
        if (m78333a(5)) {
            f76192c.mo78072w("TMediaCodec.".concat(String.valueOf(str)), str2, null);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m78338e(String str, String str2) {
        if (m78333a(6)) {
            f76192c.mo78069e("TMediaCodec.".concat(String.valueOf(str)), str2, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m78329a(String str, String str2) {
        if (m78333a(2)) {
            f76192c.mo78071v("TMediaCodec.".concat(String.valueOf(str)), str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m78335b(String str, String str2, Throwable th2) {
        if (m78333a(6)) {
            f76192c.mo78069e("TMediaCodec.".concat(String.valueOf(str)), str2, th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m78330a(String str, String str2, Throwable th2) {
        if (m78333a(5)) {
            f76192c.mo78072w("TMediaCodec.".concat(String.valueOf(str)), str2, th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m78331a(boolean z11) {
        f76191b = z11;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m78332a() {
        return f76191b;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m78333a(int i11) {
        return f76191b && i11 >= f76190a;
    }
}
