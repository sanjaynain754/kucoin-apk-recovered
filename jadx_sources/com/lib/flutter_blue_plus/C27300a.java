package com.lib.flutter_blue_plus;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

/* JADX INFO: renamed from: com.lib.flutter_blue_plus.a */
/* JADX INFO: compiled from: FlutterBluePlusPlugin.java */
/* JADX INFO: loaded from: classes23.dex */
public final class C27300a {

    /* JADX INFO: renamed from: com.lib.flutter_blue_plus.a$a */
    /* JADX INFO: compiled from: FlutterBluePlusPlugin.java */
    /* JADX INFO: loaded from: classes59.dex */
    @FunctionalInterface
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo67640a(String str, String str2);
    }

    /* JADX INFO: renamed from: com.lib.flutter_blue_plus.a$b */
    /* JADX INFO: compiled from: FlutterBluePlusPlugin.java */
    /* JADX INFO: loaded from: classes59.dex */
    @FunctionalInterface
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo67641a(boolean z11);
    }

    /* JADX INFO: renamed from: a */
    public void m67639a(Context context, b bVar, a aVar) {
        if (context == null) {
            Log.d("[FBP-Android-Settings]", "Context cannot be null.");
            aVar.mo67640a("openAppSettings", "Android context cannot be null.");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            context.startActivity(intent);
            bVar.mo67641a(true);
        } catch (Exception unused) {
            bVar.mo67641a(false);
        }
    }
}
