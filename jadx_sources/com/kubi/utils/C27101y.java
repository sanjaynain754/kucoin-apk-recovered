package com.kubi.utils;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: com.kubi.utils.y */
/* JADX INFO: compiled from: IOUtils.java */
/* JADX INFO: loaded from: classes23.dex */
public class C27101y {
    /* JADX INFO: renamed from: c */
    public static String m66927c(String str) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
            try {
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            String string = stringBuffer.toString();
                            try {
                                bufferedReader.close();
                                return string;
                            } catch (IOException e11) {
                                e11.printStackTrace();
                                return string;
                            }
                        }
                        stringBuffer.append(line);
                        th = th;
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException e12) {
                                e12.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Exception e13) {
                    e = e13;
                    e.printStackTrace();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e14) {
                            e14.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
            }
        } catch (Exception e15) {
            e = e15;
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m66925a(Context context, String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(str), "utf-8"));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        }
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x006a A[Catch: IOException -> 0x0066, TRY_LEAVE, TryCatch #3 {IOException -> 0x0066, blocks: (B:40:0x0062, B:44:0x006a), top: B:52:0x0062 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static String m66926b(Context context, String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(context.getAssets().open(str));
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i11 = bufferedInputStream2.read(bArr);
                        if (i11 != -1) {
                            byteArrayOutputStream.write(bArr, 0, i11);
                        } else {
                            String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                            try {
                                bufferedInputStream2.close();
                                byteArrayOutputStream.close();
                                return string;
                            } catch (IOException e11) {
                                e11.printStackTrace();
                                return string;
                            }
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                    bufferedInputStream = bufferedInputStream2;
                    try {
                        e.printStackTrace();
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e13) {
                                e13.printStackTrace();
                                return "";
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                            return "";
                        }
                        return "";
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                            } catch (IOException e14) {
                                e14.printStackTrace();
                                throw th;
                            }
                        } else if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                    } else if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    throw th;
                }
            } catch (Exception e15) {
                e = e15;
                byteArrayOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
            }
        } catch (Exception e16) {
            e = e16;
            byteArrayOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            byteArrayOutputStream = null;
        }
    }
}
