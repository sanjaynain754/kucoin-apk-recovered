package com.tencent.bugly.proguard;

import android.os.StrictMode;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ke */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33756ke {

    /* JADX INFO: renamed from: a */
    public static final boolean f70660a = false;

    /* JADX INFO: renamed from: b */
    public static final String f70661b = "ProcStatsUtil";

    /* JADX INFO: renamed from: c */
    public static final int f70662c = 1024;

    /* JADX INFO: renamed from: a */
    public static String m73814a(String str) {
        String strM73815a = m73815a(str, (byte) 10);
        if (strM73815a == null) {
            return null;
        }
        int iIndexOf = strM73815a.indexOf("\u0000\u0000");
        if (iIndexOf != -1) {
            strM73815a = strM73815a.substring(0, iIndexOf);
        }
        return strM73815a.replace("\u0000", C33627eb.f69716f);
    }

    /* JADX INFO: renamed from: b */
    public static String m73816b(String str) {
        return m73815a(str, (byte) 10);
    }

    /* JADX INFO: renamed from: a */
    public static String m73815a(String str, byte b11) {
        boolean z11;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(str);
                try {
                    byte[] bArr = new byte[1024];
                    ByteArrayOutputStream byteArrayOutputStream = null;
                    do {
                        int i11 = fileInputStream.read(bArr);
                        if (i11 <= 0) {
                            break;
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 >= i11) {
                                i12 = -1;
                                break;
                            }
                            if (bArr[i12] == b11) {
                                break;
                            }
                            i12++;
                        }
                        z11 = i12 != -1;
                        if (z11 && byteArrayOutputStream == null) {
                            String str2 = new String(bArr, 0, i12);
                            fileInputStream.close();
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            return str2;
                        }
                        if (byteArrayOutputStream == null) {
                            byteArrayOutputStream = new ByteArrayOutputStream(1024);
                        }
                        if (z11) {
                            i11 = i12;
                        }
                        byteArrayOutputStream.write(bArr, 0, i11);
                    } while (!z11);
                    if (byteArrayOutputStream == null) {
                        fileInputStream.close();
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        return "";
                    }
                    String string = byteArrayOutputStream.toString();
                    fileInputStream.close();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    return string;
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e11) {
                Logger.INSTANCE.exception(f70661b, "Failed to open proc file", e11);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return null;
            }
        } catch (Throwable th4) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th4;
        }
    }
}
