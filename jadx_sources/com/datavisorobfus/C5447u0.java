package com.datavisorobfus;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.datavisor.vangogh.bridge.crypto;

/* JADX INFO: renamed from: com.datavisorobfus.u0 */
/* JADX INFO: loaded from: classes34.dex */
public class C5447u0 {
    /* JADX INFO: renamed from: a */
    public static synchronized void m7406a(Context context, String str, int i11) {
        if (context != null) {
            if (!C5411e.m7128a(str)) {
                try {
                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("DV", 0).edit();
                    editorEdit.putInt(str, i11);
                    editorEdit.apply();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized String m7411b(Context context, String str, String str2) {
        if (context != null) {
            if (!C5411e.m7128a(str) && !C5411e.m7128a(str2)) {
                try {
                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("DV", 0).edit();
                    editorEdit.putString(str, str2);
                    editorEdit.apply();
                    return str2;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static String m7417f(Context context, String str) {
        try {
            String strM7416e = m7416e(context, str);
            if (C5411e.m7131b(strM7416e)) {
                byte[] bArrDecryptL = crypto.decryptL(Base64.decode(strM7416e, 2), context.getFilesDir().getAbsolutePath(), context.getFilesDir().getParentFile().getAbsolutePath() + crypto.convert("dI2WyGrZo/8fQpF4Aw=="));
                if (bArrDecryptL != null) {
                    return new String(bArrDecryptL);
                }
            }
            return null;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m7407a(Context context, String str, long j11) {
        if (context != null) {
            if (!C5411e.m7128a(str)) {
                try {
                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("DV", 0).edit();
                    editorEdit.putLong(str, j11);
                    editorEdit.apply();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m7412b(Context context, String str) {
        if (context != null) {
            if (!C5411e.m7128a(str)) {
                try {
                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("DV", 0).edit();
                    editorEdit.remove(str);
                    editorEdit.apply();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized int m7414c(Context context, String str) {
        if (context != null) {
            if (!C5411e.m7128a(str)) {
                try {
                    return context.getSharedPreferences("DV", 0).getInt(str, -1);
                } catch (Throwable unused) {
                    return -1;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static synchronized long m7415d(Context context, String str) {
        if (context != null) {
            if (!C5411e.m7128a(str)) {
                try {
                    return context.getSharedPreferences("DV", 0).getLong(str, -1L);
                } catch (Throwable unused) {
                    return -1L;
                }
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized String m7416e(Context context, String str) {
        if (context != null) {
            if (!C5411e.m7128a(str)) {
                try {
                    return context.getSharedPreferences("DV", 0).getString(str, "");
                } catch (Throwable unused) {
                    return "";
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m7408a(Context context, String str, String str2) {
        if (context == null || C5411e.m7128a(str) || C5411e.m7128a(str2)) {
            return;
        }
        try {
            m7411b(context, str, Base64.encodeToString(crypto.encryptL(str2.getBytes(), context.getFilesDir().getAbsolutePath(), context.getFilesDir().getParentFile().getAbsolutePath() + crypto.convert("dI2WyGrZo/8fQpF4Aw==")), 2));
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m7413b(Context context, String str, boolean z11) {
        if (context != null) {
            if (!C5411e.m7128a(str)) {
                try {
                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("DV", 0).edit();
                    editorEdit.putBoolean(str, z11);
                    editorEdit.apply();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m7409a(Context context, String str) {
        if (context != null) {
            if (!C5411e.m7128a(str)) {
                try {
                    return context.getSharedPreferences("DV", 0).contains(str);
                } catch (Throwable unused) {
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m7410a(Context context, String str, boolean z11) {
        if (context != null) {
            if (!C5411e.m7128a(str)) {
                try {
                    return context.getSharedPreferences("DV", 0).getBoolean(str, z11);
                } catch (Throwable unused) {
                    return z11;
                }
            }
        }
        return z11;
    }
}
