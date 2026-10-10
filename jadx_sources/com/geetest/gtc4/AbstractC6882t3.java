package com.geetest.gtc4;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.geetest.gtc4.t3 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6882t3 {
    /* JADX INFO: renamed from: a */
    public static void m12717a(final int i11, SharedPreferences sharedPreferences) {
        InterfaceC6873s3 interfaceC6873s3 = new InterfaceC6873s3() { // from class: v7.d
            @Override // com.geetest.gtc4.InterfaceC6873s3
            /* JADX INFO: renamed from: a */
            public final void mo12709a(SharedPreferences.Editor editor) {
                editor.putInt("gt_scr_st", i11);
            }
        };
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        interfaceC6873s3.mo12709a(editorEdit);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: a */
    public static void m12719a(SharedPreferences sharedPreferences) {
        InterfaceC6873s3 interfaceC6873s3 = new InterfaceC6873s3() { // from class: v7.c
            @Override // com.geetest.gtc4.InterfaceC6873s3
            /* JADX INFO: renamed from: a */
            public final void mo12709a(SharedPreferences.Editor editor) {
                editor.remove("gt_scr_st");
            }
        };
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        interfaceC6873s3.mo12709a(editorEdit);
        editorEdit.apply();
    }
}
