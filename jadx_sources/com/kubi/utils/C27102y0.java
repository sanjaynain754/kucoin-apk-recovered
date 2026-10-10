package com.kubi.utils;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.camera.core.RetryPolicy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: com.kubi.utils.y0 */
/* JADX INFO: compiled from: Themis.java */
/* JADX INFO: loaded from: classes23.dex */
public class C27102y0 {

    /* JADX INFO: renamed from: a */
    public static final FileFilter f54462a = new a();

    /* JADX INFO: renamed from: a */
    public static int m66928a(byte[] bArr, int i11) {
        byte b11;
        while (i11 < bArr.length && (b11 = bArr[i11]) != 10) {
            if (Character.isDigit(b11)) {
                int i12 = i11 + 1;
                while (i12 < bArr.length && Character.isDigit(bArr[i12])) {
                    i12++;
                }
                return Integer.parseInt(new String(bArr, 0, i11, i12 - i11));
            }
            i11++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static int m66929b() {
        int i11 = -1;
        for (int i12 = 0; i12 < m66933f(); i12++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists() && file.canRead()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        int i13 = 0;
                        while (Character.isDigit(bArr[i13]) && i13 < 128) {
                            i13++;
                        }
                        int i14 = Integer.parseInt(new String(bArr, 0, i13));
                        if (i14 > i11) {
                            i11 = i14;
                        }
                    } catch (NumberFormatException unused) {
                    } catch (Throwable th2) {
                        fileInputStream.close();
                        throw th2;
                    }
                    fileInputStream.close();
                }
            } catch (IOException unused2) {
                return -1;
            }
        }
        if (i11 == -1) {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
            try {
                int iM66938k = m66938k("cpu MHz", fileInputStream2) * 1000;
                if (iM66938k > i11) {
                    i11 = iM66938k;
                }
            } finally {
                fileInputStream2.close();
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: c */
    public static int m66930c(String str) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream2));
                String line = bufferedReader.readLine();
                bufferedReader.close();
                int iM66931d = m66931d(line);
                try {
                    fileInputStream2.close();
                } catch (IOException unused) {
                }
                return iM66931d;
            } catch (IOException unused2) {
                fileInputStream = fileInputStream2;
                if (fileInputStream == null) {
                    return -1;
                }
                try {
                    fileInputStream.close();
                    return -1;
                } catch (IOException unused3) {
                    return -1;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m66933f() {
        try {
            int iM66930c = m66930c("/sys/devices/system/cpu/possible");
            if (iM66930c == -1) {
                iM66930c = m66930c("/sys/devices/system/cpu/present");
            }
            return iM66930c == -1 ? new File("/sys/devices/system/cpu/").listFiles(f54462a).length : iM66930c;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: com.kubi.utils.y0$a */
    /* JADX INFO: compiled from: Themis.java */
    public class a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i11 = 3; i11 < name.length(); i11++) {
                if (!Character.isDigit(name.charAt(i11))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m66931d(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.parseInt(str.substring(2)) + 1;
    }

    /* JADX INFO: renamed from: e */
    public static String m66932e() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            String str = "";
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                str = line;
            }
            if (str.contains("Hardware")) {
                return str.split(":\\s+", 2)[1];
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        }
        return Build.HARDWARE;
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: g */
    public static long m66934g(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    /* JADX INFO: renamed from: k */
    public static int m66938k(String str, FileInputStream fileInputStream) {
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
                    for (int i13 = i12; i13 < i11; i13++) {
                        int i14 = i13 - i12;
                        if (bArr[i13] != str.charAt(i14)) {
                            break;
                        }
                        if (i14 == str.length() - 1) {
                            return m66928a(bArr, i13);
                        }
                    }
                }
                i12++;
            }
            return -1;
        } catch (IOException | NumberFormatException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m66935h() {
        m66932e();
        int iM66929b = m66929b() / 1000;
        if (iM66929b <= 1600) {
            return 0;
        }
        if (iM66929b <= 2000) {
            return 1;
        }
        if (iM66929b <= 2500) {
            return 2;
        }
        return 3;
    }

    /* JADX INFO: renamed from: i */
    public static int m66936i(Context context) {
        int iM66937j = m66937j(context);
        int iM66935h = m66935h();
        if (iM66937j != 0 && iM66937j != 1 && iM66935h != 0) {
            if (iM66937j == 2 && iM66935h >= 1) {
                return 1;
            }
            if (iM66937j > 2) {
                if (iM66935h <= 1) {
                    return 1;
                }
                return 2;
            }
            return -1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public static int m66937j(Context context) {
        long jM66934g = m66934g(context) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        if (jM66934g <= 2000) {
            return 0;
        }
        if (jM66934g <= 3000) {
            return 1;
        }
        if (jM66934g <= 4000) {
            return 2;
        }
        if (jM66934g <= RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS) {
            return 3;
        }
        return 4;
    }
}
