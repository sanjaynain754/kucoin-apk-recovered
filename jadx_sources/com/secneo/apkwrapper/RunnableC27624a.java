package com.secneo.apkwrapper;

import android.widget.Toast;

/* JADX INFO: renamed from: com.secneo.apkwrapper.a */
/* JADX INFO: loaded from: classes.dex */
class RunnableC27624a implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f56488a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f56489b;

    RunnableC27624a(String str, int i11) {
        this.f56488a = str;
        this.f56489b = i11;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public void run() throws Exception {
        try {
            int[] iArr = new int[0];
            Toast.makeText(C27623H.sApp.getBaseContext(), this.f56488a, this.f56489b).show();
        } catch (Exception ex1) {
            throw ex1;
        }
    }
}
