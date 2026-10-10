package p649u1;

import android.net.Uri;

/* JADX INFO: renamed from: u1.b */
/* JADX INFO: compiled from: MediaStoreUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class C45090b {
    /* JADX INFO: renamed from: b */
    public static boolean m99696b(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX INFO: renamed from: d */
    public static boolean m99698d(int i11, int i12) {
        return i11 != Integer.MIN_VALUE && i12 != Integer.MIN_VALUE && i11 <= 512 && i12 <= 384;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m99695a(Uri uri) {
        if (m99696b(uri) && !m99699e(uri)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m99697c(Uri uri) {
        if (m99696b(uri) && m99699e(uri)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m99699e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
