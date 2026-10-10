package com.sumsub.sentry.android;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.UUID;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: renamed from: com.sumsub.sentry.android.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C27918f {

    /* JADX INFO: renamed from: b */
    public static String f57031b;

    /* JADX INFO: renamed from: a */
    public static final C27918f f57030a = new C27918f();

    /* JADX INFO: renamed from: c */
    public static final Charset f57032c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final synchronized String m68999a(Context context) {
        try {
            if (f57031b == null) {
                File file = new File(context.getFilesDir(), "SNS_INSTALLATION");
                try {
                    if (!file.exists()) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            String string = UUID.randomUUID().toString();
                            fileOutputStream.write(string.getBytes(f57032c));
                            fileOutputStream.flush();
                            CloseableKt.closeFinally(fileOutputStream, null);
                            f57031b = string;
                            return string;
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                CloseableKt.closeFinally(fileOutputStream, th2);
                                throw th3;
                            }
                        }
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        byte[] bArr = new byte[(int) randomAccessFile.length()];
                        randomAccessFile.readFully(bArr);
                        String str = new String(bArr, f57032c);
                        CloseableKt.closeFinally(randomAccessFile, null);
                        f57031b = str;
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            CloseableKt.closeFinally(randomAccessFile, th4);
                            throw th5;
                        }
                    }
                } catch (Throwable th6) {
                    throw new RuntimeException(th6);
                }
            }
            return f57031b;
        } catch (Throwable th7) {
            throw th7;
        }
    }
}
