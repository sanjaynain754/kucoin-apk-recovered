package com.tencent.bugly.proguard;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.rmonitor.common.logger.LogState;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.bh */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33570bh {

    /* JADX INFO: renamed from: a */
    public static final String f69296a = "-{5}\\spid\\s\\d+\\sat\\s\\d+-\\d+-\\d+\\s\\d{2}:\\d{2}:\\d{2}\\s-{5}";

    /* JADX INFO: renamed from: b */
    public static final String f69297b = "-{5}\\send\\s\\d+\\s-{5}";

    /* JADX INFO: renamed from: c */
    public static final String f69298c = "Cmd\\sline:\\s(\\S+)";

    /* JADX INFO: renamed from: d */
    public static final String f69299d = "\".+\"\\s(daemon\\s){0,1}prio=\\d+\\stid=\\d+\\s.*";

    /* JADX INFO: renamed from: e */
    public static final String f69300e = "yyyy-MM-dd HH:mm:ss";

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.bh$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ c f69301a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f69302b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f69303c;

        @Override // com.tencent.bugly.proguard.C33570bh.d
        /* JADX INFO: renamed from: a */
        public boolean mo72564a(String str, long j11, long j12) {
            return true;
        }

        public a(c cVar, String str, boolean z11) {
            this.f69301a = cVar;
            this.f69302b = str;
            this.f69303c = z11;
        }

        @Override // com.tencent.bugly.proguard.C33570bh.d
        /* JADX INFO: renamed from: a */
        public boolean mo72563a(String str, int i11, String str2, String str3, boolean z11) {
            C34012x4.m75434a("new thread %s", str);
            c cVar = this.f69301a;
            if (cVar.f69306a > 0 && cVar.f69308c > 0 && cVar.f69307b != null) {
                if (cVar.f69309d == null) {
                    cVar.f69309d = new HashMap();
                }
                this.f69301a.f69309d.put(str, new String[]{str2, str3, C33986vi.m75326a("", i11)});
            }
            return true;
        }

        @Override // com.tencent.bugly.proguard.C33570bh.d
        /* JADX INFO: renamed from: a */
        public boolean mo72562a(long j11, long j12, String str) {
            C34012x4.m75434a("new process %s", str);
            if (!str.equals(this.f69302b)) {
                return true;
            }
            c cVar = this.f69301a;
            cVar.f69306a = j11;
            cVar.f69307b = str;
            cVar.f69308c = j12;
            return this.f69303c;
        }

        @Override // com.tencent.bugly.proguard.C33570bh.d
        /* JADX INFO: renamed from: a */
        public boolean mo72561a(long j11) {
            C34012x4.m75434a("process end %d", Long.valueOf(j11));
            c cVar = this.f69301a;
            return cVar.f69306a <= 0 || cVar.f69308c <= 0 || cVar.f69307b == null;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.bh$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ c f69304a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f69305b;

        @Override // com.tencent.bugly.proguard.C33570bh.d
        /* JADX INFO: renamed from: a */
        public boolean mo72564a(String str, long j11, long j12) {
            return true;
        }

        public b(c cVar, boolean z11) {
            this.f69304a = cVar;
            this.f69305b = z11;
        }

        @Override // com.tencent.bugly.proguard.C33570bh.d
        /* JADX INFO: renamed from: a */
        public boolean mo72563a(String str, int i11, String str2, String str3, boolean z11) {
            C34012x4.m75434a("new thread %s", str);
            c cVar = this.f69304a;
            if (cVar.f69309d == null) {
                cVar.f69309d = new HashMap();
            }
            this.f69304a.f69309d.put(str, new String[]{str2, str3, C33986vi.m75326a("", i11)});
            return true;
        }

        @Override // com.tencent.bugly.proguard.C33570bh.d
        /* JADX INFO: renamed from: a */
        public boolean mo72562a(long j11, long j12, String str) {
            C34012x4.m75434a("new process %s", str);
            c cVar = this.f69304a;
            cVar.f69306a = j11;
            cVar.f69307b = str;
            cVar.f69308c = j12;
            return this.f69305b;
        }

        @Override // com.tencent.bugly.proguard.C33570bh.d
        /* JADX INFO: renamed from: a */
        public boolean mo72561a(long j11) {
            C34012x4.m75434a("process end %d", Long.valueOf(j11));
            return false;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.bh$c */
    /* JADX INFO: compiled from: BUGLY */
    public static class c {

        /* JADX INFO: renamed from: a */
        public long f69306a;

        /* JADX INFO: renamed from: b */
        public String f69307b;

        /* JADX INFO: renamed from: c */
        public long f69308c;

        /* JADX INFO: renamed from: d */
        public Map<String, String[]> f69309d;
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.bh$d */
    /* JADX INFO: compiled from: BUGLY */
    public interface d {
        /* JADX INFO: renamed from: a */
        boolean mo72561a(long j11);

        /* JADX INFO: renamed from: a */
        boolean mo72562a(long j11, long j12, String str);

        /* JADX INFO: renamed from: a */
        boolean mo72563a(String str, int i11, String str2, String str3, boolean z11);

        /* JADX INFO: renamed from: a */
        boolean mo72564a(String str, long j11, long j12);
    }

    /* JADX INFO: renamed from: a */
    public static c m72555a(String str, String str2, boolean z11) throws Throwable {
        if (str != null && str2 != null) {
            c cVar = new c();
            m72558a(str2, new a(cVar, str, z11));
            if (cVar.f69306a > 0 && cVar.f69308c > 0 && cVar.f69307b != null) {
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static String m72560b(BufferedReader bufferedReader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < 3; i11++) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return null;
            }
            stringBuffer.append(line.concat(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE));
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    public static c m72556a(String str, boolean z11) throws Throwable {
        if (str == null) {
            C34012x4.m75437b("path:%s", str);
            return null;
        }
        c cVar = new c();
        m72558a(str, new b(cVar, z11));
        if (cVar.f69306a > 0 && cVar.f69308c > 0 && cVar.f69307b != null) {
            return cVar;
        }
        C34012x4.m75437b("first dump error %s", cVar.f69306a + C33627eb.f69716f + cVar.f69308c + C33627eb.f69716f + cVar.f69307b);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m72558a(String str, d dVar) throws Throwable {
        BufferedReader bufferedReader;
        if (str == null || dVar == null) {
            return;
        }
        File file = new File(str);
        if (!file.exists() || !dVar.mo72564a(str, file.lastModified(), file.length())) {
            return;
        }
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    Pattern patternCompile = Pattern.compile(f69296a);
                    Pattern patternCompile2 = Pattern.compile(f69297b);
                    Pattern patternCompile3 = Pattern.compile(f69298c);
                    Pattern patternCompile4 = Pattern.compile(f69299d);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                    while (true) {
                        Object[] objArrM72559a = m72559a(bufferedReader, patternCompile);
                        if (objArrM72559a != null) {
                            Object[] objArrM72559a2 = m72559a(bufferedReader, patternCompile3);
                            if (objArrM72559a2 == null) {
                                C34012x4.m75444f("Failed to find process name.", new Object[0]);
                                try {
                                    bufferedReader.close();
                                    return;
                                } catch (IOException e11) {
                                    if (C34012x4.m75432a(LogState.WARN, e11)) {
                                        return;
                                    }
                                    e11.printStackTrace();
                                    return;
                                }
                            }
                            String[] strArrSplit = objArrM72559a[1].toString().split("\\s");
                            long j11 = Long.parseLong(strArrSplit[2]);
                            long time = simpleDateFormat.parse(strArrSplit[4] + C33627eb.f69716f + strArrSplit[5]).getTime();
                            Matcher matcher = patternCompile3.matcher(objArrM72559a2[1].toString());
                            matcher.find();
                            matcher.group(1);
                            if (!dVar.mo72562a(j11, time, matcher.group(1))) {
                                try {
                                    bufferedReader.close();
                                    return;
                                } catch (IOException e12) {
                                    if (C34012x4.m75438b(e12)) {
                                        return;
                                    }
                                    e12.printStackTrace();
                                    return;
                                }
                            }
                            while (true) {
                                Object[] objArrM72559a3 = m72559a(bufferedReader, patternCompile4, patternCompile2);
                                if (objArrM72559a3 != null) {
                                    if (objArrM72559a3[0] == patternCompile4) {
                                        String string = objArrM72559a3[1].toString();
                                        Matcher matcher2 = Pattern.compile("\".+\"").matcher(string);
                                        matcher2.find();
                                        String strGroup = matcher2.group();
                                        String strSubstring = strGroup.substring(1, strGroup.length() - 1);
                                        boolean zContains = string.contains("NATIVE");
                                        Matcher matcher3 = Pattern.compile("tid=\\d+").matcher(string);
                                        matcher3.find();
                                        String strGroup2 = matcher3.group();
                                        if (!dVar.mo72563a(strSubstring, Integer.parseInt(strGroup2.substring(strGroup2.indexOf("=") + 1)), m72560b(bufferedReader), m72557a(bufferedReader), zContains)) {
                                            try {
                                                bufferedReader.close();
                                                return;
                                            } catch (IOException e13) {
                                                if (C34012x4.m75438b(e13)) {
                                                    return;
                                                }
                                                e13.printStackTrace();
                                                return;
                                            }
                                        }
                                    } else {
                                        if (dVar.mo72561a(Long.parseLong(objArrM72559a3[1].toString().split("\\s")[2]))) {
                                            break;
                                        }
                                        try {
                                            bufferedReader.close();
                                            return;
                                        } catch (IOException e14) {
                                            if (C34012x4.m75438b(e14)) {
                                                return;
                                            }
                                            e14.printStackTrace();
                                            return;
                                        }
                                    }
                                } else {
                                    break;
                                }
                            }
                        } else {
                            try {
                                bufferedReader.close();
                                return;
                            } catch (IOException e15) {
                                e = e15;
                                if (C34012x4.m75438b(e)) {
                                    return;
                                }
                            }
                        }
                        e.printStackTrace();
                        return;
                    }
                } catch (Exception e16) {
                    e = e16;
                    bufferedReader2 = bufferedReader;
                    if (!C34012x4.m75438b(e)) {
                        e.printStackTrace();
                    }
                    C34012x4.m75431a(LogState.WARN, "trace open fail:%s : %s", e.getClass().getName(), "" + e.getMessage());
                    if (bufferedReader2 == null) {
                        return;
                    }
                    try {
                        bufferedReader2.close();
                    } catch (IOException e17) {
                        e = e17;
                        if (C34012x4.m75432a(LogState.WARN, e)) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                            throw th3;
                        } catch (IOException e18) {
                            if (!C34012x4.m75438b(e18)) {
                                e18.printStackTrace();
                                throw th3;
                            }
                            throw th3;
                        }
                    }
                    throw th3;
                }
            } catch (Exception e19) {
                e = e19;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = bufferedReader2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object[] m72559a(BufferedReader bufferedReader, Pattern... patternArr) throws IOException {
        if (bufferedReader != null && patternArr != null) {
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                for (Pattern pattern : patternArr) {
                    if (pattern.matcher(line).matches()) {
                        return new Object[]{pattern, line};
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m72557a(BufferedReader bufferedReader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null || line.trim().length() <= 0) {
                break;
            }
            stringBuffer.append(line.concat(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE));
        }
        return stringBuffer.toString();
    }
}
