package p387k;

import android.content.Context;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;

/* JADX INFO: renamed from: k.d */
/* JADX INFO: loaded from: classes23.dex */
public class C40829d {
    /* JADX WARN: Code duplicated, block: B:42:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static String m89337b(Context context, String str) throws Throwable {
        Throwable th2;
        FileInputStream fileInputStreamOpenFileInput;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            fileInputStreamOpenFileInput = context.openFileInput(str);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, fileInputStreamOpenFileInput.available()));
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i11 = fileInputStreamOpenFileInput.read(bArr);
                        if (i11 < 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i11);
                    }
                    String str2 = new String(Base64.decode(byteArrayOutputStream.toByteArray(), 0));
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (Exception unused) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused2) {
                    }
                    return str2;
                } catch (Exception unused3) {
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (Exception unused4) {
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        return null;
                    }
                    try {
                        byteArrayOutputStream.close();
                        return null;
                    } catch (Exception unused5) {
                        return null;
                    }
                } catch (Throwable th3) {
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    th2 = th3;
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (Exception unused6) {
                        }
                    }
                    if (byteArrayOutputStream2 == null) {
                        throw th2;
                    }
                    try {
                        byteArrayOutputStream2.close();
                        throw th2;
                    } catch (Exception unused7) {
                        throw th2;
                    }
                }
            } catch (Exception unused8) {
                byteArrayOutputStream = null;
                if (fileInputStreamOpenFileInput != null) {
                    fileInputStreamOpenFileInput.close();
                }
                if (byteArrayOutputStream != null) {
                    return null;
                }
                byteArrayOutputStream.close();
                return null;
            } catch (Throwable th4) {
                th2 = th4;
            }
        } catch (Exception unused9) {
            fileInputStreamOpenFileInput = null;
        } catch (Throwable th5) {
            th2 = th5;
            fileInputStreamOpenFileInput = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m89338c(Context context, String str, String str2) {
        if (context != null) {
            try {
                byte[] bArrEncode = Base64.encode(str2.getBytes(), 0);
                m89336a(context, str);
                context.openFileOutput(str, 0).write(bArrEncode);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m89336a(Context context, String str) {
        context.deleteFile(str);
    }
}
