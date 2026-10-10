package p795yf;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: yf.c */
/* JADX INFO: compiled from: CpuUtils.java */
/* JADX INFO: loaded from: classes13.dex */
public class C46477c {
    /* JADX WARN: Code duplicated, block: B:39:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static String m102514b() throws Throwable {
        Throwable th2;
        BufferedReader bufferedReader;
        Exception e11;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
                try {
                    String str = bufferedReader.readLine().split(":\\s+", 2)[1];
                    try {
                        bufferedReader.close();
                        return str;
                    } catch (Exception e12) {
                        e12.printStackTrace();
                        return str;
                    }
                } catch (Exception e13) {
                    e11 = e13;
                    e11.printStackTrace();
                    if (bufferedReader == null) {
                        return "N/A";
                    }
                    try {
                        bufferedReader.close();
                        return "N/A";
                    } catch (Exception e14) {
                        e14.printStackTrace();
                        return "N/A";
                    }
                }
            } catch (Throwable th3) {
                th2 = th3;
                if (0 != 0) {
                    try {
                        bufferedReader2.close();
                    } catch (Exception e15) {
                        e15.printStackTrace();
                    }
                }
                throw th2;
            }
        } catch (Exception e16) {
            bufferedReader = null;
            e11 = e16;
        } catch (Throwable th4) {
            th2 = th4;
            if (0 != 0) {
                bufferedReader2.close();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m102513a(String str) {
        StringBuilder sb2 = new StringBuilder();
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = new ProcessBuilder("/system/bin/cat", str).start().getInputStream();
                    byte[] bArr = new byte[24];
                    while (inputStream.read(bArr) != -1) {
                        sb2.append(new String(bArr));
                    }
                    inputStream.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                    sb2 = new StringBuilder("N/A");
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (IOException e12) {
                e12.printStackTrace();
            }
            return sb2.toString().trim();
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m102515c() {
        return m102513a("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
    }

    /* JADX INFO: renamed from: d */
    public static String m102516d() {
        return m102513a("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq");
    }
}
