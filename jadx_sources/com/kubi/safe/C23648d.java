package com.kubi.safe;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import ro.C44127a;

/* JADX INFO: renamed from: com.kubi.safe.d */
/* JADX INFO: compiled from: CommandUtils.java */
/* JADX INFO: loaded from: classes12.dex */
public class C23648d {
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:33:0x0071  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.BufferedInputStream, java.io.Closeable] */
    /* JADX INFO: renamed from: a */
    public static String m56358a(String str) throws Throwable {
        Process processExec;
        Closeable closeable;
        BufferedOutputStream bufferedOutputStream;
        ?? bufferedInputStream;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                processExec = Runtime.getRuntime().exec("sh");
                try {
                    bufferedOutputStream = new BufferedOutputStream(processExec.getOutputStream());
                    try {
                        bufferedInputStream = new BufferedInputStream(processExec.getInputStream());
                        try {
                            bufferedOutputStream.write(str.getBytes());
                            bufferedOutputStream.write(10);
                            bufferedOutputStream.flush();
                            bufferedOutputStream.close();
                            processExec.waitFor();
                            String strM56360c = m56360c(bufferedInputStream);
                            C23649e.m56361a(bufferedOutputStream);
                            C23649e.m56361a(bufferedInputStream);
                            processExec.destroy();
                            return strM56360c;
                        } catch (Exception e11) {
                            e = e11;
                            C44127a.m97248h(e);
                            C23649e.m56361a(bufferedOutputStream);
                            C23649e.m56361a(bufferedInputStream);
                            if (processExec != null) {
                                processExec.destroy();
                            }
                            return null;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        bufferedInputStream = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = null;
                        bufferedOutputStream2 = bufferedOutputStream;
                        C23649e.m56361a(bufferedOutputStream2);
                        C23649e.m56361a(closeable);
                        if (processExec != null) {
                            processExec.destroy();
                        }
                        throw th;
                    }
                } catch (Exception e13) {
                    e = e13;
                    bufferedOutputStream = null;
                    bufferedInputStream = bufferedOutputStream;
                    C44127a.m97248h(e);
                    C23649e.m56361a(bufferedOutputStream);
                    C23649e.m56361a(bufferedInputStream);
                    if (processExec != null) {
                        processExec.destroy();
                    }
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    closeable = null;
                    C23649e.m56361a(bufferedOutputStream2);
                    C23649e.m56361a(closeable);
                    if (processExec != null) {
                        processExec.destroy();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e14) {
            e = e14;
            processExec = null;
            bufferedOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            processExec = null;
            closeable = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m56359b(String str) {
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
        } catch (Exception e11) {
            C44127a.m97248h(e11);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m56360c(BufferedInputStream bufferedInputStream) {
        int i11;
        if (bufferedInputStream == null) {
            return "";
        }
        byte[] bArr = new byte[512];
        StringBuilder sb2 = new StringBuilder();
        do {
            try {
                i11 = bufferedInputStream.read(bArr);
                if (i11 > 0) {
                    sb2.append(new String(bArr, 0, i11));
                }
            } catch (Exception e11) {
                C44127a.m97248h(e11);
            }
        } while (i11 >= 512);
        return sb2.toString();
    }
}
