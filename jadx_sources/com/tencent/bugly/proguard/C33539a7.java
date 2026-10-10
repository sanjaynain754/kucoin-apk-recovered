package com.tencent.bugly.proguard;

import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.common.logger.LogState;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.a7 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33539a7 {

    /* JADX INFO: renamed from: a */
    public static final int f68806a = 2;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.a7$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements FilenameFilter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f68807a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f68808b;

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str != null && str.startsWith(this.f68807a) && str.endsWith(this.f68808b);
        }

        public a(String str, String str2) {
            this.f68807a = str;
            this.f68808b = str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m72315a(File file, String str, long j11, boolean z11) {
        if (file == null) {
            return false;
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, z11));
            boolean zM72316a = m72316a(bufferedWriter, str, file.length(), j11);
            bufferedWriter.close();
            return zM72316a;
        } catch (Throwable th2) {
            C34012x4.m75438b(th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.a7$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements Comparator {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (AndroidVersion.isOverKitKat()) {
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
            }
            File file = (File) obj;
            File file2 = (File) obj2;
            if (file.lastModified() > file2.lastModified()) {
                return 1;
            }
            if (file.lastModified() < file2.lastModified()) {
                return -1;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m72316a(Writer writer, String str, long j11, long j12) {
        return m72317a(writer, str.toCharArray(), str.length(), j11, j12);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m72317a(Writer writer, char[] cArr, int i11, long j11, long j12) {
        if (j11 >= j12) {
            return false;
        }
        try {
            if (((long) (i11 * 2)) + j11 <= j12) {
                writer.write(cArr, 0, i11);
            } else {
                writer.write(cArr, 0, (int) ((j12 - j11) / 2));
            }
            writer.flush();
            return true;
        } catch (IOException e11) {
            C34012x4.m75438b(e11);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m72313a(String str, String str2, String str3, long j11) {
        try {
            int i11 = 0;
            for (File file : m72311a(str, str2, str3, j11, false, null)) {
                C34012x4.m75434a("File %s is to be deleted.", file.getName());
                if (file.delete()) {
                    i11++;
                }
            }
            C34012x4.m75434a("Number of overdue trace files that has deleted: " + i11, new Object[0]);
        } catch (Throwable th2) {
            C34012x4.m75438b(th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static List<File> m72311a(String str, String str2, String str3, long j11, boolean z11, Comparator<File> comparator) {
        List<File> listM72312a;
        List<File> arrayList = new ArrayList<>();
        if (str2 != null && str3 != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                try {
                    File[] fileArrListFiles = file.listFiles(new a(str2, str3));
                    if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                        if (z11) {
                            listM72312a = m72312a(fileArrListFiles, str2, str3, jCurrentTimeMillis - j11, jCurrentTimeMillis);
                        } else {
                            listM72312a = m72312a(fileArrListFiles, str2, str3, 0L, jCurrentTimeMillis - j11);
                        }
                        arrayList = listM72312a;
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    C34012x4.m75438b(th2);
                }
            }
            if (comparator != null) {
                Collections.sort(arrayList, comparator);
            }
            return arrayList;
        }
        C34012x4.m75444f("prefix %s and/or postfix %s is null.", str2, str3);
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static List<File> m72312a(File[] fileArr, String str, String str2, long j11, long j12) {
        ArrayList arrayList = new ArrayList();
        for (File file : fileArr) {
            long jM72310a = m72310a(file.getName(), str, str2);
            if (jM72310a >= 0 && j11 <= jM72310a && jM72310a <= j12) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static long m72310a(String str, String str2, String str3) {
        if (str == null) {
            C34012x4.m75444f("File name is null.", new Object[0]);
            return -1L;
        }
        try {
            if (str.startsWith(str2) && str.endsWith(str3)) {
                return Long.parseLong(str.substring(str2.length(), str.indexOf(str3)));
            }
        } catch (Throwable th2) {
            C34012x4.m75438b(th2);
        }
        return -1L;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m72318a(String str, String str2, int i11) {
        C34012x4.m75434a("rqdp{  sv sd start} %s", str);
        if (str2 != null && str2.trim().length() > 0) {
            File file = new File(str);
            try {
                if (!file.exists()) {
                    if (file.getParentFile() != null) {
                        file.getParentFile().mkdirs();
                    }
                    file.createNewFile();
                }
                long j11 = i11;
                return m72315a(file, str2, j11, file.length() < j11);
            } catch (Throwable th2) {
                if (!C34012x4.m75432a(LogState.WARN, th2)) {
                    th2.printStackTrace();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static void m72314a(File[] fileArr) {
        try {
            Arrays.sort(fileArr, new b());
        } catch (Throwable th2) {
            C34012x4.m75438b(th2);
        }
    }
}
