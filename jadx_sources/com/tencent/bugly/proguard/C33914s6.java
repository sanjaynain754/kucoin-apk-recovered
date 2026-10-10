package com.tencent.bugly.proguard;

import android.annotation.SuppressLint;
import android.system.Os;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.p145fd.cluser.FdCluster;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.s6 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33914s6 extends AbstractC34048z0 {

    /* JADX INFO: renamed from: i */
    public static final String f71830i = "RMotnior_FdLeak_ProcFdDump";

    /* JADX INFO: renamed from: j */
    public static final String f71831j = "/proc/self/fd";

    /* JADX INFO: renamed from: k */
    public static final String f71832k = "/proc/self/limits";

    /* JADX INFO: renamed from: l */
    public static final String f71833l = "Max open files";

    /* JADX INFO: renamed from: m */
    public static final int f71834m = 1;

    /* JADX INFO: renamed from: n */
    public static final String f71835n = "[^0-9]+";

    /* JADX INFO: renamed from: o */
    public static final Pattern f71836o = Pattern.compile(f71835n);

    /* JADX INFO: renamed from: p */
    public static int f71837p = -1;

    /* JADX INFO: renamed from: q */
    public static String f71838q;

    /* JADX INFO: renamed from: h */
    public final FdCluster f71839h = new FdCluster();

    /* JADX INFO: renamed from: d */
    public static int m74917d() {
        File[] fileArrListFiles = new File(f71831j).listFiles();
        if (fileArrListFiles != null) {
            return fileArrListFiles.length;
        }
        return Integer.MAX_VALUE;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static String m74920e(String str) throws Throwable {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        IOException e11;
        InputStream inputStream;
        InputStream inputStream2 = null;
        BufferedReader bufferedReader2 = null;
        if (AndroidVersion.isOverL()) {
            try {
                String str2 = Os.readlink(str);
                f71838q = null;
                return str2;
            } catch (Exception e12) {
                f71838q = e12.getMessage();
                C33648fb.m73043b(f71830i, "Os.readlink(" + str + ") failed: " + e12.getMessage());
            }
        } else {
            String strM73937a = C33770l7.m73937a("sh -c readlink -f ", str);
            try {
                inputStream = Runtime.getRuntime().exec(strM73937a).getInputStream();
                try {
                    inputStreamReader = new InputStreamReader(inputStream);
                    try {
                        bufferedReader = new BufferedReader(inputStreamReader);
                        try {
                            String line = bufferedReader.readLine();
                            C33772l9.m73938a(inputStream);
                            C33772l9.m73938a(inputStreamReader);
                            C33772l9.m73938a(bufferedReader);
                            return line;
                        } catch (IOException e13) {
                            e11 = e13;
                            try {
                                C33648fb.m73043b(f71830i, strM73937a + " failed: " + e11.getMessage());
                                C33772l9.m73938a(inputStream);
                                C33772l9.m73938a(inputStreamReader);
                                C33772l9.m73938a(bufferedReader);
                                return null;
                            } catch (Throwable th2) {
                                th = th2;
                                inputStream2 = inputStream;
                                inputStream = inputStream2;
                                bufferedReader2 = bufferedReader;
                                C33772l9.m73938a(inputStream);
                                C33772l9.m73938a(inputStreamReader);
                                C33772l9.m73938a(bufferedReader2);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedReader2 = bufferedReader;
                            C33772l9.m73938a(inputStream);
                            C33772l9.m73938a(inputStreamReader);
                            C33772l9.m73938a(bufferedReader2);
                            throw th;
                        }
                    } catch (IOException e14) {
                        e11 = e14;
                        bufferedReader = null;
                    } catch (Throwable th4) {
                        th = th4;
                        C33772l9.m73938a(inputStream);
                        C33772l9.m73938a(inputStreamReader);
                        C33772l9.m73938a(bufferedReader2);
                        throw th;
                    }
                } catch (IOException e15) {
                    e11 = e15;
                    inputStreamReader = null;
                    bufferedReader = null;
                    C33648fb.m73043b(f71830i, strM73937a + " failed: " + e11.getMessage());
                    C33772l9.m73938a(inputStream);
                    C33772l9.m73938a(inputStreamReader);
                    C33772l9.m73938a(bufferedReader);
                    return null;
                } catch (Throwable th5) {
                    th = th5;
                    inputStreamReader = null;
                    bufferedReader = null;
                    inputStream2 = inputStream;
                    inputStream = inputStream2;
                    bufferedReader2 = bufferedReader;
                    C33772l9.m73938a(inputStream);
                    C33772l9.m73938a(inputStreamReader);
                    C33772l9.m73938a(bufferedReader2);
                    throw th;
                }
            } catch (IOException e16) {
                e11 = e16;
                inputStream = null;
            } catch (Throwable th6) {
                th = th6;
                inputStreamReader = null;
                bufferedReader = null;
                inputStream = inputStream2;
                bufferedReader2 = bufferedReader;
                C33772l9.m73938a(inputStream);
                C33772l9.m73938a(inputStreamReader);
                C33772l9.m73938a(bufferedReader2);
                throw th;
            }
        }
        return null;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC34016x8
    /* JADX INFO: renamed from: a */
    public int mo72778a() {
        return 1;
    }

    @Override // com.tencent.bugly.proguard.AbstractC34048z0
    /* JADX INFO: renamed from: c */
    public C33706i6 mo72780c(String str) throws Throwable {
        BufferedWriter bufferedWriter;
        Writer fileWriter;
        List<String> listM74916c = m74916c();
        Map<Integer, C33933t5> mapM77174a = this.f71839h.m77174a(listM74916c);
        if (listM74916c.isEmpty() || mapM77174a.isEmpty()) {
            return m75569a(11, f71838q);
        }
        float size = listM74916c.size();
        Writer writer = null;
        try {
            fileWriter = new FileWriter(str);
            try {
                bufferedWriter = new BufferedWriter(fileWriter);
                try {
                    m74924a(mapM77174a, size, bufferedWriter);
                    bufferedWriter.flush();
                    C33706i6 c33706i6M75570a = m75570a(str, mapM77174a);
                    C33772l9.m73938a(fileWriter);
                    C33772l9.m73938a(bufferedWriter);
                    return c33706i6M75570a;
                } catch (IOException e11) {
                    e = e11;
                    writer = fileWriter;
                    try {
                        Logger.INSTANCE.exception(f71830i, "dump failed", e);
                        C33706i6 c33706i6M75569a = m75569a(5, e.getMessage());
                        C33772l9.m73938a(writer);
                        C33772l9.m73938a(bufferedWriter);
                        return c33706i6M75569a;
                    } catch (Throwable th2) {
                        th = th2;
                        fileWriter = writer;
                        writer = bufferedWriter;
                        C33772l9.m73938a(fileWriter);
                        C33772l9.m73938a(writer);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    writer = bufferedWriter;
                    C33772l9.m73938a(fileWriter);
                    C33772l9.m73938a(writer);
                    throw th;
                }
            } catch (IOException e12) {
                e = e12;
                bufferedWriter = null;
            } catch (Throwable th4) {
                th = th4;
                C33772l9.m73938a(fileWriter);
                C33772l9.m73938a(writer);
                throw th;
            }
        } catch (IOException e13) {
            e = e13;
            bufferedWriter = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedWriter = null;
            fileWriter = writer;
            writer = bufferedWriter;
            C33772l9.m73938a(fileWriter);
            C33772l9.m73938a(writer);
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m74921f() {
        return f71831j;
    }

    /* JADX INFO: renamed from: g */
    public static int m74922g() throws Throwable {
        BufferedReader bufferedReader;
        Throwable th2;
        FileReader fileReader;
        IOException e11;
        int i11 = f71837p;
        if (i11 != -1) {
            return i11;
        }
        BufferedReader bufferedReader2 = null;
        try {
            fileReader = new FileReader(f71832k);
            try {
                try {
                    bufferedReader = new BufferedReader(fileReader);
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            if (line.contains(f71833l)) {
                                f71837p = m74918d(line);
                            }
                        } catch (IOException e12) {
                            e11 = e12;
                            bufferedReader2 = bufferedReader;
                            Logger.INSTANCE.exception(f71830i, "get fd max count failed", e11);
                            C33772l9.m73938a(fileReader);
                            C33772l9.m73938a(bufferedReader2);
                        } catch (Throwable th3) {
                            th2 = th3;
                            C33772l9.m73938a(fileReader);
                            C33772l9.m73938a(bufferedReader);
                            throw th2;
                        }
                    }
                    C33772l9.m73938a(fileReader);
                    C33772l9.m73938a(bufferedReader);
                } catch (IOException e13) {
                    e11 = e13;
                }
            } catch (Throwable th4) {
                bufferedReader = bufferedReader2;
                th2 = th4;
            }
        } catch (IOException e14) {
            e11 = e14;
            fileReader = null;
        } catch (Throwable th5) {
            bufferedReader = null;
            th2 = th5;
            fileReader = null;
        }
        return f71837p;
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: a */
    public final void m74924a(Map<Integer, C33933t5> map, float f11, BufferedWriter bufferedWriter) throws IOException {
        for (Integer num : map.keySet()) {
            num.intValue();
            C33933t5 c33933t5 = map.get(num);
            bufferedWriter.write(String.format("%s,%d,%s", m74915b(c33933t5.m75041d()), Integer.valueOf(c33933t5.m75036a()), m74923a(c33933t5.m75036a() / f11)));
            bufferedWriter.newLine();
            for (C33973v5 c33973v5 : c33933t5.m75040c()) {
                bufferedWriter.write(String.format("%s,%d", c33973v5.m75287b(), Integer.valueOf(c33973v5.m75286a())));
                bufferedWriter.newLine();
            }
            bufferedWriter.newLine();
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m74915b(int i11) {
        switch (i11) {
            case 1:
                return "socket";
            case 2:
                return InterfaceC33953u5.f72216l;
            case 3:
                return "ashmem";
            case 4:
                return "dmabuf";
            case 5:
                return "file";
            case 6:
                return "pipe";
            case 7:
                return "gpu";
            case 8:
                return "device";
            case 9:
                return "system_file";
            default:
                return InterfaceC33953u5.f72221q;
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m74918d(String str) {
        String[] strArrSplit = f71836o.split(str);
        String str2 = strArrSplit.length > 1 ? strArrSplit[1] : null;
        if (str2 == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str2);
        } catch (NumberFormatException unused) {
            C33648fb.m73043b(f71830i, "parseMaxOpenFiles failed: ".concat(str2));
            return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m74923a(float f11) {
        return (((int) (f11 * 10000.0f)) / 100.0f) + "%";
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static List<String> m74916c() throws Throwable {
        File[] fileArrListFiles = new File(f71831j).listFiles();
        if (fileArrListFiles == null) {
            C33648fb.m73045d(f71830i, "dumpFdList failed");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            String strM74920e = m74920e(file.getAbsolutePath());
            if (strM74920e != null) {
                arrayList.add(strM74920e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static String m74919e() {
        return f71832k;
    }
}
