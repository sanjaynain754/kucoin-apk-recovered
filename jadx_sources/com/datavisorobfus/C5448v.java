package com.datavisorobfus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: com.datavisorobfus.v */
/* JADX INFO: loaded from: classes34.dex */
public class C5448v {
    /* JADX INFO: renamed from: a */
    public static String m7418a(String str, String str2) throws Throwable {
        IOException e11;
        Throwable th2;
        BufferedReader bufferedReader;
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            try {
                File file = new File(str, str2);
                if (!file.exists()) {
                    return null;
                }
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb2.append(line);
                    } catch (IOException e12) {
                        e11 = e12;
                        bufferedReader2 = bufferedReader;
                        C5415f0.m7139a(e11);
                        if (bufferedReader2 == null) {
                            return "";
                        }
                        try {
                            bufferedReader2.close();
                            return "";
                        } catch (Throwable unused) {
                            return "";
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                String string = sb2.toString();
                try {
                    bufferedReader.close();
                } catch (Throwable unused2) {
                }
                return string;
            } catch (Throwable th4) {
                th2 = th4;
                bufferedReader = bufferedReader2;
            }
        } catch (IOException e13) {
            e11 = e13;
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (Throwable unused3) {
            }
        }
        throw th2;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7419a(String str) {
        try {
            if (C5457z0.m7480a(str)) {
                return false;
            }
            return new File(str).exists();
        } catch (Throwable th2) {
            C5415f0.m7139a(th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m7420b(String str, String str2) {
        Throwable th2;
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(new File(str), false);
            try {
                fileWriter.write(str2);
                try {
                    fileWriter.close();
                } catch (IOException unused) {
                }
                return 0;
            } catch (Throwable th3) {
                th2 = th3;
                try {
                    C5415f0.m7137a(C5420h.f7256a, th2.getMessage());
                    if (fileWriter == null) {
                        return -1;
                    }
                    try {
                        return -1;
                    } catch (IOException unused2) {
                        return -1;
                    }
                } finally {
                    if (fileWriter != null) {
                        try {
                            fileWriter.close();
                        } catch (IOException unused3) {
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            fileWriter = null;
        }
    }
}
