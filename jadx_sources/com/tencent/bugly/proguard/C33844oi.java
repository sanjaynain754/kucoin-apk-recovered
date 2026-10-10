package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.CancellationSignal;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.oi */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33844oi {

    /* JADX INFO: renamed from: a */
    public static final String f71332a = "Matrix.Backtrace.WarmUp";

    /* JADX INFO: renamed from: b */
    public static final String f71333b = "bugly-backtrace";

    /* JADX INFO: renamed from: c */
    public static final String f71334c = "saving-cache";

    /* JADX INFO: renamed from: d */
    public static final String f71335d = "warmed-up";

    /* JADX INFO: renamed from: e */
    public static final String f71336e = "disk-usage.timestamp";

    /* JADX INFO: renamed from: f */
    public static final String f71337f = "clean-up.timestamp";

    /* JADX INFO: renamed from: g */
    public static final String f71338g = "blocked-list";

    /* JADX INFO: renamed from: h */
    public static final String f71339h = "unfinished";

    /* JADX INFO: renamed from: i */
    public static final long f71340i = 604800000;

    /* JADX INFO: renamed from: j */
    public static final long f71341j = 259200000;

    /* JADX INFO: renamed from: k */
    public static final long f71342k = 172800000;

    /* JADX INFO: renamed from: l */
    public static final long f71343l = 172800000;

    /* JADX INFO: renamed from: m */
    public static final long f71344m = 259200000;

    /* JADX INFO: renamed from: n */
    public static final int f71345n = 3;

    /* JADX INFO: renamed from: o */
    public static final String f71346o = ":";

    /* JADX INFO: renamed from: p */
    public static final String f71347p = "|";

    /* JADX INFO: renamed from: a */
    public static File m74460a(Context context) {
        File file = new File(context.getFilesDir().getAbsolutePath() + "/bugly-backtrace/clean-up.timestamp");
        file.getParentFile().mkdirs();
        return file;
    }

    /* JADX INFO: renamed from: b */
    public static File m74467b(Context context) {
        File file = new File(context.getFilesDir().getAbsolutePath() + "/bugly-backtrace/disk-usage.timestamp");
        file.getParentFile().mkdirs();
        return file;
    }

    /* JADX INFO: renamed from: c */
    public static String m74469c(C33865pi.c cVar) {
        return m74468b(cVar) ? cVar.f71481b : m74461a(cVar);
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.oi$a */
    /* JADX INFO: compiled from: BUGLY */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static Map<String, Integer> f71348a;

        /* JADX INFO: renamed from: a */
        public static int m74478a(Context context, String str) {
            if (f71348a == null) {
                f71348a = C33844oi.m74474g(context);
            }
            Integer num = f71348a.get(str);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }

        /* JADX INFO: renamed from: b */
        public static boolean m74481b(Context context, String str, int i11) {
            String strM74463a = C33844oi.m74463a(str, i11);
            int iM74478a = m74478a(context, strM74463a);
            if (iM74478a >= 3) {
                return false;
            }
            f71348a.put(strM74463a, Integer.valueOf(iM74478a + 1));
            C33844oi.m74464a(context, f71348a);
            return true;
        }

        /* JADX INFO: renamed from: a */
        public static boolean m74480a(Context context, String str, int i11) {
            return m74478a(context, C33844oi.m74463a(str, i11)) < 3;
        }

        /* JADX INFO: renamed from: a */
        public static void m74479a(Context context, String str, int i11, boolean z11) {
            String strM74463a = C33844oi.m74463a(str, i11);
            int iM74478a = m74478a(context, strM74463a);
            if (z11) {
                f71348a.remove(strM74463a);
            } else {
                f71348a.put(strM74463a, Integer.valueOf(iM74478a + 1));
            }
            C33844oi.m74464a(context, f71348a);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Map<String, Integer> m74474g(Context context) throws Throwable {
        HashMap map = new HashMap();
        File fileM74476i = m74476i(context);
        String strM74462a = m74462a(fileM74476i, 512000);
        if (strM74462a == null) {
            C33858pb.m74522e(f71332a, "Read unfinished maps file failed, file size %s", Long.valueOf(fileM74476i.length()));
            if (fileM74476i.length() > 512000) {
                fileM74476i.delete();
                return map;
            }
        } else {
            for (String str : strM74462a.split(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE)) {
                int iLastIndexOf = str.lastIndexOf("|");
                if (iLastIndexOf >= 0) {
                    try {
                        map.put(str.substring(0, iLastIndexOf), Integer.valueOf(Integer.parseInt(str.substring(iLastIndexOf + 1))));
                    } catch (Throwable th2) {
                        C33858pb.m74518a(f71332a, th2, "", new Object[0]);
                    }
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: i */
    public static File m74476i(Context context) {
        File file = new File(context.getFilesDir().getAbsolutePath() + "/bugly-backtrace/unfinished");
        file.getParentFile().mkdirs();
        if (!file.exists()) {
            try {
                file.createNewFile();
                return file;
            } catch (IOException e11) {
                C33858pb.m74518a(f71332a, e11, "", new Object[0]);
            }
        }
        return file;
    }

    /* JADX INFO: renamed from: j */
    public static File m74477j(Context context) {
        File file = new File(context.getFilesDir().getAbsolutePath() + "/bugly-backtrace/warmed-up");
        file.getParentFile().mkdirs();
        return file;
    }

    /* JADX INFO: renamed from: a */
    public static String m74461a(C33865pi.c cVar) {
        return cVar.f71480a.getFilesDir().getAbsolutePath() + "/bugly-backtrace/saving-cache/";
    }

    /* JADX INFO: renamed from: b */
    public static boolean m74468b(C33865pi.c cVar) {
        if (cVar.f71481b == null) {
            return false;
        }
        try {
            if (new File(cVar.f71481b).getCanonicalPath().startsWith(cVar.f71480a.getFilesDir().getParentFile().getCanonicalFile().getAbsolutePath())) {
                return true;
            }
            C33858pb.m74519b(f71332a, "Saving path should under private storage path %s", cVar.f71480a.getFilesDir().getParentFile().getAbsolutePath());
        } catch (IOException e11) {
            C33858pb.m74518a(f71332a, e11, "", new Object[0]);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static void m74471d(Context context) {
        File fileM74460a = m74460a(context);
        try {
            fileM74460a.createNewFile();
            fileM74460a.setLastModified(System.currentTimeMillis());
        } catch (IOException e11) {
            C33858pb.m74518a(f71332a, e11, "", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m74472e(Context context) {
        File fileM74467b = m74467b(context);
        try {
            fileM74467b.createNewFile();
            fileM74467b.setLastModified(System.currentTimeMillis());
        } catch (IOException e11) {
            C33858pb.m74518a(f71332a, e11, "", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m74473f(Context context) {
        File fileM74460a = m74460a(context);
        if (!fileM74460a.exists()) {
            try {
                fileM74460a.createNewFile();
            } catch (IOException e11) {
                C33858pb.m74518a(f71332a, e11, "", new Object[0]);
            }
            return false;
        }
        if (System.currentTimeMillis() - fileM74460a.lastModified() < 172800000) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m74475h(Context context) {
        File fileM74467b = m74467b(context);
        if (!fileM74467b.exists()) {
            try {
                fileM74467b.createNewFile();
            } catch (IOException e11) {
                C33858pb.m74518a(f71332a, e11, "", new Object[0]);
            }
            return false;
        }
        if (System.currentTimeMillis() - fileM74467b.lastModified() < 259200000) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static String m74463a(String str, int i11) {
        return str + f71346o + i11;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m74470c(Context context) {
        return m74477j(context).exists();
    }

    /* JADX INFO: renamed from: a */
    public static void m74464a(Context context, Map<String, Integer> map) {
        File fileM74476i = m74476i(context);
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            stringBuffer.append(entry.getKey() + "|" + entry.getValue() + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        m74466a(fileM74476i, stringBuffer.toString());
    }

    /* JADX INFO: renamed from: a */
    public static void m74465a(File file, CancellationSignal cancellationSignal, FileFilter fileFilter) {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    m74465a(file2, cancellationSignal, fileFilter);
                    cancellationSignal.throwIfCanceled();
                }
                return;
            }
            return;
        }
        fileFilter.accept(file);
        cancellationSignal.throwIfCanceled();
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        com.tencent.bugly.proguard.C33858pb.m74518a(com.tencent.bugly.proguard.C33844oi.f71332a, r8, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m74462a(File file, int i11) throws Throwable {
        FileReader fileReader;
        FileReader fileReader2 = null;
        if (file.isFile()) {
            try {
                StringBuilder sb2 = new StringBuilder(4096);
                fileReader = new FileReader(file);
                try {
                    char[] cArr = new char[1024];
                    int i12 = 0;
                    do {
                        int i13 = fileReader.read(cArr);
                        if (i13 > 0) {
                            sb2.append(cArr, 0, i13);
                            i12 += i13;
                        } else {
                            String string = sb2.toString();
                            try {
                                fileReader.close();
                                return string;
                            } catch (IOException e11) {
                                C33858pb.m74518a(f71332a, e11, "", new Object[0]);
                                return string;
                            }
                        }
                    } while (i12 <= i11);
                    fileReader.close();
                    return null;
                } catch (Exception e12) {
                    e = e12;
                    try {
                        C33858pb.m74518a(f71332a, e, "", new Object[0]);
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (IOException e13) {
                                C33858pb.m74518a(f71332a, e13, "", new Object[0]);
                            }
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileReader2 = fileReader;
                        fileReader = fileReader2;
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (IOException e14) {
                                C33858pb.m74518a(f71332a, e14, "", new Object[0]);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (fileReader != null) {
                        fileReader.close();
                    }
                    throw th;
                }
            } catch (Exception e15) {
                e = e15;
                fileReader = null;
            } catch (Throwable th4) {
                th = th4;
                fileReader = fileReader2;
                if (fileReader != null) {
                    fileReader.close();
                }
                throw th;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m74466a(File file, String str) {
        FileWriter fileWriter;
        if (file.isFile()) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    fileWriter = new FileWriter(file);
                    try {
                        fileWriter.write(str);
                        try {
                            fileWriter.close();
                            return true;
                        } catch (IOException e11) {
                            C33858pb.m74518a(f71332a, e11, "", new Object[0]);
                            return true;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        fileWriter2 = fileWriter;
                        C33858pb.m74518a(f71332a, e, "", new Object[0]);
                        if (fileWriter2 != null) {
                            try {
                                fileWriter2.close();
                            } catch (IOException e13) {
                                C33858pb.m74518a(f71332a, e13, "", new Object[0]);
                            }
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileWriter != null) {
                            try {
                                fileWriter.close();
                            } catch (IOException e14) {
                                C33858pb.m74518a(f71332a, e14, "", new Object[0]);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileWriter = fileWriter2;
                }
            } catch (Exception e15) {
                e = e15;
            }
        }
        return false;
    }
}
