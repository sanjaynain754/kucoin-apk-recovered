package com.blankj.utilcode.util;

import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.blankj.utilcode.util.m */
/* JADX INFO: compiled from: FileIOUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C5282m {

    /* JADX INFO: renamed from: a */
    public static int f6556a = 524288;

    /* JADX INFO: renamed from: com.blankj.utilcode.util.m$a */
    /* JADX INFO: compiled from: FileIOUtils.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void m6273a(double d11);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m6269a(File file, InputStream inputStream, boolean z11, a aVar) throws Throwable {
        if (inputStream == null || !C5299u0.m6483f(file)) {
            Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file, z11), f6556a);
            try {
                try {
                    try {
                        if (aVar == null) {
                            byte[] bArr = new byte[f6556a];
                            while (true) {
                                int i11 = inputStream.read(bArr);
                                if (i11 == -1) {
                                    break;
                                }
                                bufferedOutputStream2.write(bArr, 0, i11);
                            }
                            inputStream.close();
                            bufferedOutputStream2.close();
                            return true;
                        }
                        double dAvailable = inputStream.available();
                        aVar.m6273a(0.0d);
                        byte[] bArr2 = new byte[f6556a];
                        int i12 = 0;
                        while (true) {
                            int i13 = inputStream.read(bArr2);
                            if (i13 == -1) {
                                break;
                            }
                            bufferedOutputStream2.write(bArr2, 0, i13);
                            i12 += i13;
                            aVar.m6273a(((double) i12) / dAvailable);
                        }
                        inputStream.close();
                        bufferedOutputStream2.close();
                        return true;
                        inputStream.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                    bufferedOutputStream2.close();
                    return true;
                } catch (IOException e12) {
                    e12.printStackTrace();
                    return true;
                }
            } catch (IOException e13) {
                e = e13;
                bufferedOutputStream = bufferedOutputStream2;
                e.printStackTrace();
                try {
                    inputStream.close();
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
                if (bufferedOutputStream != null) {
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException e15) {
                        e15.printStackTrace();
                    }
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = bufferedOutputStream2;
                try {
                    inputStream.close();
                } catch (IOException e16) {
                    e16.printStackTrace();
                }
                if (bufferedOutputStream == null) {
                    throw th;
                }
                try {
                    bufferedOutputStream.close();
                    throw th;
                } catch (IOException e17) {
                    e17.printStackTrace();
                    throw th;
                }
            }
        } catch (IOException e18) {
            e = e18;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m6271c(File file, String str, boolean z11) throws Throwable {
        if (file == null || str == null) {
            return false;
        }
        if (!C5299u0.m6483f(file)) {
            Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file, z11));
                try {
                    bufferedWriter2.write(str);
                    try {
                        bufferedWriter2.close();
                        return true;
                    } catch (IOException e11) {
                        e11.printStackTrace();
                        return true;
                    }
                } catch (IOException e12) {
                    e = e12;
                    bufferedWriter = bufferedWriter2;
                    e.printStackTrace();
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (IOException e14) {
                            e14.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e15) {
                e = e15;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6270b(String str, InputStream inputStream) {
        return m6269a(C5299u0.m6495r(str), inputStream, false, null);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m6272d(String str, String str2, boolean z11) {
        return m6271c(C5299u0.m6495r(str), str2, z11);
    }
}
