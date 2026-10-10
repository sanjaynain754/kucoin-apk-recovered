package com.kubi.utils.netdiagno;

import com.tencent.bugly.proguard.C33627eb;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes54.dex */
public class LDNetTraceRoute {

    /* JADX INFO: renamed from: d */
    public static LDNetTraceRoute f54370d;

    /* JADX INFO: renamed from: b */
    public InterfaceC27072a f54372b;

    /* JADX INFO: renamed from: a */
    public final String f54371a = "LDNetTraceRoute";

    /* JADX INFO: renamed from: c */
    public boolean f54373c = true;

    /* JADX INFO: renamed from: com.kubi.utils.netdiagno.LDNetTraceRoute$a */
    public interface InterfaceC27072a {
        /* JADX INFO: renamed from: b */
        void mo66802b();

        /* JADX INFO: renamed from: e */
        void mo66803e(String str);
    }

    /* JADX INFO: renamed from: com.kubi.utils.netdiagno.LDNetTraceRoute$b */
    public class C27073b {

        /* JADX INFO: renamed from: a */
        public String f54374a;

        public C27073b(String str) {
            this.f54374a = str;
            Matcher matcher = Pattern.compile("(?<=\\().*?(?=\\))").matcher(str);
            if (matcher.find()) {
                this.f54374a = matcher.group();
            }
        }

        /* JADX INFO: renamed from: a */
        public String m66804a() {
            return this.f54374a;
        }
    }

    /* JADX INFO: renamed from: com.kubi.utils.netdiagno.LDNetTraceRoute$c */
    public class C27074c {

        /* JADX INFO: renamed from: a */
        public final String f54376a;

        /* JADX INFO: renamed from: b */
        public int f54377b;

        public C27074c(String str, int i11) {
            this.f54376a = str;
            this.f54377b = i11;
        }

        /* JADX INFO: renamed from: a */
        public int m66805a() {
            return this.f54377b;
        }

        /* JADX INFO: renamed from: b */
        public String m66806b() {
            return this.f54376a;
        }

        /* JADX INFO: renamed from: c */
        public void m66807c(int i11) {
            this.f54377b = i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x016d A[EXC_TOP_SPLITTER, PHI: r3 r4
      0x016d: PHI (r3v2 java.lang.Process) = (r3v1 java.lang.Process), (r3v7 java.lang.Process), (r3v8 java.lang.Process) binds: [B:57:0x0183, B:46:0x016b, B:51:0x0177] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r4v3 java.io.BufferedReader) = (r4v2 java.io.BufferedReader), (r4v5 java.io.BufferedReader), (r4v6 java.io.BufferedReader) binds: [B:57:0x0183, B:46:0x016b, B:51:0x0177] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final void m66798b(C27074c c27074c) throws Throwable {
        Pattern patternCompile = Pattern.compile("(?<=From )(?:[0-9]{1,3}\\.){3}[0-9]{1,3}");
        Pattern patternCompile2 = Pattern.compile("(?<=from ).*(?=: icmp_seq=1 ttl=)");
        Pattern patternCompile3 = Pattern.compile("(?<=time=).*?ms");
        Process processExec = null;
        boolean z11 = false;
        BufferedReader bufferedReader = null;
        while (!z11) {
            try {
                try {
                    if (c27074c.m66805a() >= 30) {
                        break;
                    }
                    String str = "";
                    processExec = Runtime.getRuntime().exec("ping -c 1 -t " + c27074c.m66805a() + C33627eb.f69716f + c27074c.m66806b());
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            str = str + line;
                        } catch (IOException e11) {
                            e = e11;
                            bufferedReader = bufferedReader2;
                        } catch (InterruptedException e12) {
                            e = e12;
                            bufferedReader = bufferedReader2;
                            e.printStackTrace();
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused) {
                                }
                            }
                            processExec.destroy();
                            this.f54372b.mo66802b();
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused2) {
                                    throw th;
                                }
                            }
                            processExec.destroy();
                            throw th;
                        }
                    }
                    bufferedReader2.close();
                    processExec.waitFor();
                    Matcher matcher = patternCompile.matcher(str);
                    StringBuilder sb2 = new StringBuilder(256);
                    if (matcher.find()) {
                        String strGroup = matcher.group();
                        String strM66797a = m66797a(new C27073b(strGroup));
                        if (strM66797a.length() == 0) {
                            sb2.append("unknown host or network error\n");
                            z11 = true;
                        } else {
                            Matcher matcher2 = patternCompile3.matcher(strM66797a);
                            if (matcher2.find()) {
                                String strGroup2 = matcher2.group();
                                sb2.append(c27074c.m66805a());
                                sb2.append("\t\t");
                                sb2.append(strGroup);
                                sb2.append("\t\t");
                                sb2.append(strGroup2);
                                sb2.append("\t");
                            } else {
                                sb2.append(c27074c.m66805a());
                                sb2.append("\t\t");
                                sb2.append(strGroup);
                                sb2.append("\t\t timeout \t");
                            }
                            this.f54372b.mo66803e(sb2.toString());
                            c27074c.m66807c(c27074c.m66805a() + 1);
                        }
                    } else {
                        Matcher matcher3 = patternCompile2.matcher(str);
                        if (matcher3.find()) {
                            String strGroup3 = matcher3.group();
                            Matcher matcher4 = patternCompile3.matcher(str);
                            if (matcher4.find()) {
                                String strGroup4 = matcher4.group();
                                sb2.append(c27074c.m66805a());
                                sb2.append("\t\t");
                                sb2.append(strGroup3);
                                sb2.append("\t\t");
                                sb2.append(strGroup4);
                                sb2.append("\t");
                                this.f54372b.mo66803e(sb2.toString());
                            }
                            z11 = true;
                        } else {
                            if (str.length() == 0) {
                                sb2.append("unknown host or network error\t");
                                z11 = true;
                            } else {
                                sb2.append(c27074c.m66805a());
                                sb2.append("\t\t timeout \t");
                                c27074c.m66807c(c27074c.m66805a() + 1);
                            }
                            this.f54372b.mo66803e(sb2.toString());
                        }
                    }
                    bufferedReader = bufferedReader2;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e13) {
                e = e13;
            } catch (InterruptedException e14) {
                e = e14;
            }
            e.printStackTrace();
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            processExec.destroy();
            this.f54372b.mo66802b();
        }
        if (bufferedReader != null) {
            bufferedReader.close();
        }
        processExec.destroy();
        this.f54372b.mo66802b();
    }

    public native void startJNICTraceRoute(String str);

    /* JADX INFO: renamed from: c */
    public static LDNetTraceRoute m66796c() {
        if (f54370d == null) {
            f54370d = new LDNetTraceRoute();
        }
        return f54370d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0045: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:70), block:B:9:0x0045 */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.kubi.utils.netdiagno.LDNetTraceRoute$b] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Process] */
    /* JADX INFO: renamed from: a */
    public final String m66797a(C27073b c27073b) throws Throwable {
        BufferedReader bufferedReader;
        InterruptedException e11;
        ?? r11;
        IOException e12;
        ?? r12;
        BufferedReader bufferedReader2;
        ?? r13;
        ?? r14;
        String str = "";
        BufferedReader bufferedReader3 = null;
        try {
            try {
                c27073b = Runtime.getRuntime().exec("ping -c 1 " + c27073b.m66804a());
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(c27073b.getInputStream()));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            str = str + line;
                        } catch (IOException e13) {
                            e12 = e13;
                            r12 = c27073b;
                            e12.printStackTrace();
                            r14 = r12;
                            r13 = r12;
                            if (bufferedReader != null) {
                            }
                            r13.destroy();
                            return str;
                        } catch (InterruptedException e14) {
                            e11 = e14;
                            r11 = c27073b;
                            e11.printStackTrace();
                            r13 = r11;
                            if (bufferedReader != null) {
                                r14 = r11;
                            }
                            r13.destroy();
                            return str;
                        }
                    }
                    bufferedReader.close();
                    c27073b.waitFor();
                    r14 = c27073b;
                } catch (IOException e15) {
                    bufferedReader = null;
                    e12 = e15;
                    r12 = c27073b;
                } catch (InterruptedException e16) {
                    bufferedReader = null;
                    e11 = e16;
                    r11 = c27073b;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader3 != null) {
                        try {
                            bufferedReader3.close();
                        } catch (Exception unused) {
                            throw th;
                        }
                    }
                    c27073b.destroy();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader3 = bufferedReader2;
            }
        } catch (IOException e17) {
            bufferedReader = null;
            e12 = e17;
            r12 = 0;
        } catch (InterruptedException e18) {
            bufferedReader = null;
            e11 = e18;
            r11 = 0;
        } catch (Throwable th4) {
            th = th4;
            c27073b = 0;
        }
        try {
            bufferedReader.close();
            r13 = r14;
            r13.destroy();
        } catch (Exception unused2) {
        }
        return str;
    }

    /* JADX INFO: renamed from: d */
    public void m66799d(InterfaceC27072a interfaceC27072a) {
        this.f54372b = interfaceC27072a;
    }

    /* JADX INFO: renamed from: e */
    public void m66800e() {
        if (f54370d != null) {
            f54370d = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m66801f(String str) throws Throwable {
        m66798b(new C27074c(str, 1));
    }
}
