package ro;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.kubi.log.core.C17473a;

/* JADX INFO: renamed from: ro.a */
/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes12.dex */
public final class C44127a {
    /* JADX INFO: renamed from: a */
    public static void m97241a(String str, Throwable th2) {
        m97251k(6, 4, str, null, th2);
    }

    /* JADX INFO: renamed from: b */
    public static void m97242b(String str) {
        m97243c(null, str);
    }

    /* JADX INFO: renamed from: c */
    public static void m97243c(String str, String str2) {
        m97252l(3, str, str2, null);
    }

    /* JADX INFO: renamed from: d */
    public static void m97244d(String str) {
        m97246f(null, str, null);
    }

    /* JADX INFO: renamed from: e */
    public static void m97245e(String str, String str2) {
        m97246f(str, str2, null);
    }

    /* JADX INFO: renamed from: f */
    public static void m97246f(String str, String str2, Throwable th2) {
        m97252l(6, str, str2, th2);
    }

    /* JADX INFO: renamed from: g */
    public static void m97247g(String str, Throwable th2) {
        m97246f(str, null, th2);
    }

    /* JADX INFO: renamed from: h */
    public static void m97248h(Throwable th2) {
        m97246f(null, null, th2);
    }

    /* JADX INFO: renamed from: i */
    public static void m97249i(String str) {
        m97250j(null, str);
    }

    /* JADX INFO: renamed from: j */
    public static void m97250j(String str, String str2) {
        m97252l(4, str, str2, null);
    }

    /* JADX INFO: renamed from: l */
    public static void m97252l(int i11, @Nullable String str, @Nullable String str2, @Nullable Throwable th2) {
        m97251k(i11, 5, str, str2, th2);
    }

    /* JADX INFO: renamed from: m */
    public static void m97253m(String str) {
        m97254n(null, str);
    }

    /* JADX INFO: renamed from: n */
    public static void m97254n(String str, String str2) {
        m97252l(2, str, str2, null);
    }

    /* JADX INFO: renamed from: o */
    public static void m97255o(String str) {
        m97256p(null, str);
    }

    /* JADX INFO: renamed from: p */
    public static void m97256p(String str, String str2) {
        m97252l(5, str, str2, null);
    }

    /* JADX INFO: renamed from: k */
    public static void m97251k(int i11, int i12, @Nullable String str, @Nullable String str2, @Nullable Throwable th2) {
        if (TextUtils.isEmpty(str)) {
            str = C17473a.f32591a.m37856a().getDefaultTag();
        }
        C17473a.f32591a.m37856a().getProcessor().mo98544a(i11, i12, str, str2, th2);
    }
}
