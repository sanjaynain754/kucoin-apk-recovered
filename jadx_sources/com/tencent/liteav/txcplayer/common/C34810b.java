package com.tencent.liteav.txcplayer.common;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.liteav.txcplayer.common.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C34810b {

    /* JADX INFO: renamed from: a */
    private static String f73731a = null;

    /* JADX INFO: renamed from: b */
    private static int f73732b = -1;

    /* JADX INFO: renamed from: c */
    private static List<String> f73733c;

    /* JADX INFO: renamed from: a */
    public static void m76233a(String str) {
        f73731a = str;
    }

    /* JADX INFO: renamed from: a */
    public static void m76232a(int i11) {
        f73732b = i11;
    }

    /* JADX INFO: renamed from: b */
    public static int m76235b() {
        return f73732b;
    }

    /* JADX INFO: renamed from: c */
    public static List<String> m76236c() {
        return f73733c;
    }

    /* JADX INFO: renamed from: a */
    public static String m76231a() {
        return f73731a;
    }

    /* JADX INFO: renamed from: a */
    public static void m76234a(List<String> list) {
        f73733c = new ArrayList(list);
    }
}
