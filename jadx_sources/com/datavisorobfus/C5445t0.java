package com.datavisorobfus;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.util.Base64;
import com.datavisor.vangogh.bridge.crypto;
import java.io.File;

/* JADX INFO: renamed from: com.datavisorobfus.t0 */
/* JADX INFO: loaded from: classes34.dex */
public class C5445t0 {
    /* JADX INFO: renamed from: a */
    public static synchronized String m7399a(Context context, String str) {
        String str2 = null;
        if (context == null) {
            return null;
        }
        try {
            String strM7401b = m7401b(context, str);
            if (C5457z0.m7482b(strM7401b)) {
                File externalFilesDir = Build.VERSION.SDK_INT >= 29 ? context.getExternalFilesDir(null) : Environment.getExternalStorageDirectory();
                if (externalFilesDir == null) {
                    return null;
                }
                File file = new File(externalFilesDir, str);
                byte[] bArrDecryptL = crypto.decryptL(Base64.decode(strM7401b, 2), file.getAbsolutePath(), file.getParentFile().getAbsolutePath());
                if (bArrDecryptL != null) {
                    str2 = new String(bArrDecryptL);
                }
            }
            return str2;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized String m7401b(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            File externalFilesDir = Build.VERSION.SDK_INT >= 29 ? context.getExternalFilesDir(null) : Environment.getExternalStorageDirectory();
            if (externalFilesDir == null) {
                return null;
            }
            File file = new File(externalFilesDir, str);
            if (file.exists()) {
                return C5448v.m7418a(file.getParentFile().getAbsolutePath(), str);
            }
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m7400a(Context context, String str, String str2) {
        try {
            if (!C5457z0.m7480a(str) && !C5457z0.m7480a(str2) && context != null) {
                File externalFilesDir = Build.VERSION.SDK_INT >= 29 ? context.getExternalFilesDir(null) : Environment.getExternalStorageDirectory();
                if (externalFilesDir == null) {
                    return;
                }
                File file = new File(externalFilesDir, str);
                if (!file.exists()) {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        try {
                            parentFile.mkdirs();
                        } catch (Throwable unused) {
                        }
                    }
                    file.createNewFile();
                }
                m7402b(context, str, Base64.encodeToString(crypto.encryptL(str2.getBytes(), file.getAbsolutePath(), file.getParentFile().getAbsolutePath()), 2));
            }
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized String m7402b(Context context, String str, String str2) {
        File parentFile;
        if (str2 == null || context == null) {
            return null;
        }
        try {
            File externalFilesDir = Build.VERSION.SDK_INT >= 29 ? context.getExternalFilesDir(null) : Environment.getExternalStorageDirectory();
            if (externalFilesDir == null) {
                return null;
            }
            File file = new File(externalFilesDir, str);
            if (!file.exists() && (parentFile = file.getParentFile()) != null) {
                try {
                    parentFile.mkdirs();
                } catch (Throwable unused) {
                }
            }
            C5448v.m7420b(file.getAbsolutePath(), str2);
            return str2;
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return null;
        }
    }
}
