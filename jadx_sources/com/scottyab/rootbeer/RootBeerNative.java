package com.scottyab.rootbeer;

import gb0.C37859a;

/* JADX INFO: loaded from: classes59.dex */
public class RootBeerNative {

    /* JADX INFO: renamed from: a */
    public static boolean f56430a;

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z11);

    /* JADX INFO: renamed from: a */
    public boolean m68566a() {
        return f56430a;
    }

    static {
        try {
            System.loadLibrary("toolChecker");
            f56430a = true;
        } catch (UnsatisfiedLinkError e11) {
            C37859a.m85438b(e11);
        }
    }
}
