package com.ishumei.smantifraud.l111l11111I1l;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.proguard.C33844oi;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class l111l1111l1Il {
    private static final int l1111l111111Il = -1;
    private static final FileFilter l111l11111lIl = new FileFilter() { // from class: com.ishumei.smantifraud.l111l11111I1l.l111l1111l1Il.1
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            String name = file.getName();
            try {
                if (name.startsWith("cpu")) {
                    for (int i11 = 3; i11 < name.length(); i11++) {
                        if (!Character.isDigit(name.charAt(i11))) {
                            return false;
                        }
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            return false;
        }
    };

    public static class l1111l111111Il {
        public String l1111l111111Il = "";
        public String l111l11111lIl = "";
    }

    private static int l1111l111111Il(String str) throws Throwable {
        FileInputStream fileInputStream;
        int i11 = -1;
        BufferedReader bufferedReader = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(fileInputStream));
                try {
                    String line = bufferedReader2.readLine();
                    if (line != null && line.matches("0-[\\d]+$")) {
                        i11 = Integer.parseInt(line.substring(2)) + 1;
                    }
                    com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l1111l111111Il((Closeable) bufferedReader2);
                } catch (IOException unused) {
                    bufferedReader = bufferedReader2;
                    com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l1111l111111Il((Closeable) bufferedReader);
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l1111l111111Il((Closeable) bufferedReader);
                    com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l1111l111111Il((Closeable) fileInputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException unused3) {
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
        com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l1111l111111Il((Closeable) fileInputStream);
        return i11;
    }

    public static int l111l11111I1l() throws Throwable {
        FileInputStream fileInputStream;
        Throwable th2;
        try {
            int iL111l11111lIl = l111l11111lIl();
            int i11 = -1;
            for (int i12 = 0; i12 < iL111l11111lIl; i12++) {
                File file = new File("/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        fileInputStream2.read(bArr);
                        int i13 = 0;
                        while (i13 < 128 && Character.isDigit(bArr[i13])) {
                            i13++;
                        }
                        int i14 = Integer.parseInt(new String(bArr, 0, i13));
                        if (i14 > i11) {
                            i11 = i14;
                        }
                    } catch (NumberFormatException unused) {
                    } catch (Throwable th3) {
                        com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l1111l111111Il((Closeable) fileInputStream2);
                        throw th3;
                    }
                    com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l1111l111111Il((Closeable) fileInputStream2);
                }
            }
            if (i11 == -1) {
                try {
                    fileInputStream = new FileInputStream("/proc/cpuinfo");
                    try {
                        int iL1111l111111Il = l1111l111111Il("cpu MHz", fileInputStream) * 1000;
                        if (iL1111l111111Il > i11) {
                            i11 = iL1111l111111Il;
                        }
                        com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l1111l111111Il((Closeable) fileInputStream);
                    } catch (Throwable th4) {
                        th2 = th4;
                        com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l1111l111111Il((Closeable) fileInputStream);
                        throw th2;
                    }
                } catch (Throwable th5) {
                    fileInputStream = null;
                    th2 = th5;
                }
            }
            return i11;
        } catch (Exception unused2) {
            return -1;
        }
    }

    public static int l111l11111lIl() {
        try {
            int iL1111l111111Il = l1111l111111Il("/sys/devices/system/cpu/possible");
            if (iL1111l111111Il == -1) {
                iL1111l111111Il = l1111l111111Il("/sys/devices/system/cpu/present");
            }
            return iL1111l111111Il == -1 ? l111l1111l1Il() : iL1111l111111Il;
        } catch (SecurityException | Exception unused) {
            return -1;
        }
    }

    private static int l1111l111111Il(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[1024];
        try {
            int i11 = fileInputStream.read(bArr);
            int i12 = 0;
            while (i12 < i11) {
                byte b11 = bArr[i12];
                if (b11 == 10 || i12 == 0) {
                    if (b11 == 10) {
                        i12++;
                    }
                    int i13 = i12;
                    while (i13 < i11) {
                        int i14 = i13 - i12;
                        if (bArr[i13] != str.charAt(i14)) {
                            break;
                        }
                        if (i14 == str.length() - 1) {
                            while (i13 < 1024) {
                                byte b12 = bArr[i13];
                                if (b12 == 10) {
                                    break;
                                }
                                if (Character.isDigit(b12)) {
                                    int i15 = i13 + 1;
                                    while (i15 < 1024 && Character.isDigit(bArr[i15])) {
                                        i15++;
                                    }
                                    return Integer.parseInt(new String(bArr, 0, i13, i15 - i13));
                                }
                                i13++;
                            }
                            return -1;
                        }
                        i13++;
                    }
                }
                i12++;
            }
        } catch (IOException | NumberFormatException unused) {
        }
        return -1;
    }

    @TargetApi(16)
    public static long l111l11111Il() {
        Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
        if (context == null) {
            return 0L;
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        } catch (Exception unused) {
            return 0L;
        }
    }

    private static int l111l11111lIl(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.parseInt(str.substring(2)) + 1;
    }

    private static int l111l1111l1Il() {
        try {
            return new File("/sys/devices/system/cpu/possible").listFiles(l111l11111lIl).length;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static int l1111l111111Il(byte[] bArr, int i11) {
        byte b11;
        while (i11 < 1024 && (b11 = bArr[i11]) != 10) {
            if (Character.isDigit(b11)) {
                int i12 = i11 + 1;
                while (i12 < 1024 && Character.isDigit(bArr[i12])) {
                    i12++;
                }
                return Integer.parseInt(new String(bArr, 0, i11, i12 - i11));
            }
            i11++;
        }
        return -1;
    }

    public static l1111l111111Il l1111l111111Il() {
        l1111l111111Il l1111l111111il = new l1111l111111Il();
        try {
            Iterator<String> it = com.ishumei.smantifraud.l111l1111llIl.l111l1111l1Il.l111l11111lIl("/proc/cpuinfo").iterator();
            while (it.hasNext()) {
                String[] strArrSplit = it.next().split(C33844oi.f71346o);
                if (2 == strArrSplit.length) {
                    String strTrim = strArrSplit[0].trim();
                    String strTrim2 = strArrSplit[1].trim();
                    if ("Hardware".equals(strTrim)) {
                        l1111l111111il.l111l11111lIl = strTrim2;
                    }
                    if (TextUtils.equals("Processor", strTrim) || TextUtils.equals("model name", strTrim)) {
                        l1111l111111il.l1111l111111Il = strTrim2;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return l1111l111111il;
    }
}
