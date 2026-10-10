package com.ishumei.smantifraud.l111l11111lIl;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes56.dex */
public final class l111l11111lIl {
    private static final String l1111l111111Il = "cloudms.conf";
    private static final String l111l11111lIl = "conf";

    private static String l1111l111111Il(Context context) {
        return context.getSharedPreferences(l1111l111111Il, 0).getString(l111l11111lIl, null);
    }

    private static void l1111l111111Il(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(l1111l111111Il, 0).edit();
        editorEdit.putString(l111l11111lIl, str);
        editorEdit.apply();
    }
}
