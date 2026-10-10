package com.tencent.liteav.base.util;

import android.content.Context;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.tencent.liteav.base.util.f */
/* JADX INFO: loaded from: classes59.dex */
public final class C34741f {
    /* JADX INFO: renamed from: a */
    public static File m76108a(Context context, String str) {
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        File file = new File(externalFilesDir.getAbsolutePath() + File.separator + str);
        try {
            if (file.exists() && file.isFile()) {
                file.delete();
            }
            if (!file.exists()) {
                file.mkdirs();
                return file;
            }
        } catch (Exception e11) {
            LiteavLog.m76084e("FileUtil", "mkdirs failed.", e11);
        }
        return file;
    }

    /* JADX INFO: renamed from: a */
    public static long m76107a(File file, int i11) {
        long length;
        long j11 = 0;
        if (i11 <= 0) {
            return 0L;
        }
        try {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    length = m76107a(file2, i11 - 1);
                } else {
                    length = file2.length();
                }
                j11 += length;
            }
            return j11;
        } catch (Exception e11) {
            LiteavLog.m76087i("FileUtil", "getFolderSize exception " + e11.toString());
            return j11;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m76110a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int i11 = inputStream.read(bArr);
            if (i11 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i11);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m76111a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isFile();
    }

    /* JADX INFO: renamed from: a */
    public static void m76109a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
