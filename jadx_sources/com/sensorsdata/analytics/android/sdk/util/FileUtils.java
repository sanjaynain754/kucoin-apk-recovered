package com.sensorsdata.analytics.android.sdk.util;

import com.sensorsdata.analytics.android.sdk.SALog;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes59.dex */
public class FileUtils {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r7v4 */
    public static String readFileToString(File file) throws Throwable {
        ?? r11;
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i11 = bufferedInputStream.read(bArr, 0, 1024);
                            if (i11 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i11);
                            SALog.printStackTrace(e);
                            return null;
                        }
                        String string = byteArrayOutputStream.toString();
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e12) {
                            SALog.printStackTrace(e12);
                        }
                        return string;
                    } catch (IOException e13) {
                        e = e13;
                        SALog.printStackTrace(e);
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e14) {
                            e14.printStackTrace();
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e15) {
                                SALog.printStackTrace(e15);
                            }
                        }
                        return null;
                    }
                } catch (IOException e16) {
                    e = e16;
                    byteArrayOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    r11 = 0;
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e17) {
                        e17.printStackTrace();
                    }
                    if (r11 == 0) {
                        throw th;
                    }
                    try {
                        r11.close();
                        throw th;
                    } catch (IOException e18) {
                        SALog.printStackTrace(e18);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                r11 = file;
            }
        } catch (Exception e19) {
            SALog.printStackTrace(e19);
            return null;
        }
    }

    public static void writeToFile(File file, String str) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        fileOutputStream2.write(str.getBytes());
                        fileOutputStream2.close();
                    } catch (Exception e11) {
                        e = e11;
                        fileOutputStream = fileOutputStream2;
                        SALog.printStackTrace(e);
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e12) {
                                SALog.printStackTrace(e12);
                            }
                        }
                        throw th;
                    }
                } catch (Exception e13) {
                    e = e13;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e14) {
            SALog.printStackTrace(e14);
        }
    }
}
