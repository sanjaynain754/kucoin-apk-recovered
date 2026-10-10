package com.tencent.thumbplayer.tcmedia.p155b;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.b.f */
/* JADX INFO: loaded from: classes62.dex */
class C35281f {

    /* JADX INFO: renamed from: a */
    public static String f75834a = "base_video";

    /* JADX INFO: renamed from: b */
    private static int f75835b;

    /* JADX INFO: renamed from: c */
    private static int f75836c;

    /* JADX INFO: renamed from: d */
    private static int f75837d;

    /* JADX INFO: renamed from: a */
    public static int m77868a(int i11) {
        if (i11 == 1) {
            int i12 = f75837d;
            f75837d = i12 + 1;
            return i12;
        }
        if (i11 == 2) {
            int i13 = f75835b;
            f75835b = i13 + 1;
            return i13;
        }
        if (i11 != 3) {
            return -1;
        }
        int i14 = f75836c;
        f75836c = i14 + 1;
        return i14;
    }
}
