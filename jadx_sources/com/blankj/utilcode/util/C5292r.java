package com.blankj.utilcode.util;

import android.content.Intent;
import android.net.Uri;
import androidx.webkit.internal.AssetHelper;
import java.io.File;

/* JADX INFO: renamed from: com.blankj.utilcode.util.r */
/* JADX INFO: compiled from: IntentUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C5292r {
    /* JADX INFO: renamed from: a */
    public static Intent m6388a(Intent intent, boolean z11) {
        return z11 ? intent.addFlags(268435456) : intent;
    }

    /* JADX INFO: renamed from: b */
    public static Intent m6389b(String str, boolean z11) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + str));
        return m6388a(intent, z11);
    }

    /* JADX INFO: renamed from: c */
    public static Intent m6390c(String str, Uri uri) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setType("image/*");
        return m6388a(intent, true);
    }

    /* JADX INFO: renamed from: d */
    public static Intent m6391d(String str, File file) {
        if (file == null || !file.isFile()) {
            return null;
        }
        return m6390c(str, C5299u0.m6486i(file));
    }

    /* JADX INFO: renamed from: f */
    public static Intent m6393f(String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", str);
        return m6388a(intent, true);
    }

    /* JADX INFO: renamed from: e */
    public static Intent m6392e(String str, String str2) {
        if (C5299u0.m6469G(str2)) {
            return null;
        }
        return m6391d(str, new File(str2));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m6394g(Intent intent) {
        if (C5287o0.m6331a().getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
            return true;
        }
        return false;
    }
}
