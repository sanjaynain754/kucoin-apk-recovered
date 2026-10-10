package com.kubi.utils.netdiagno;

import android.text.TextUtils;
import com.tencent.bugly.proguard.C33627eb;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ro.C44127a;
import w70.C45750c;

/* JADX INFO: renamed from: com.kubi.utils.netdiagno.b */
/* JADX INFO: compiled from: LDNetPing.java */
/* JADX INFO: loaded from: classes54.dex */
public class C27076b {

    /* JADX INFO: renamed from: a */
    public a f54407a;

    /* JADX INFO: renamed from: b */
    public final int f54408b;

    /* JADX INFO: renamed from: com.kubi.utils.netdiagno.b$a */
    /* JADX INFO: compiled from: LDNetPing.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo66808a(String str);
    }

    /* JADX INFO: renamed from: com.kubi.utils.netdiagno.b$b */
    /* JADX INFO: compiled from: LDNetPing.java */
    public class b {

        /* JADX INFO: renamed from: a */
        public String f54409a;

        public b(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f54409a = str;
            Matcher matcher = Pattern.compile("(?<=\\().*?(?=\\))").matcher(str);
            if (matcher.find()) {
                this.f54409a = matcher.group();
            }
        }

        /* JADX INFO: renamed from: a */
        public String m66820a() {
            return this.f54409a;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m66818a(String str, boolean z11) throws Throwable {
        b bVar = new b(str);
        StringBuilder sb2 = new StringBuilder(256);
        String strM66819b = m66819b(bVar, z11);
        if (Pattern.compile("(?<=from ).*(?=: icmp_seq=1 ttl=)").matcher(strM66819b).find()) {
            C44127a.m97250j("LDNetPing", "status" + strM66819b);
            sb2.append("\t" + strM66819b);
        } else if (strM66819b.length() == 0) {
            sb2.append("unknown host or network error");
        } else {
            sb2.append("timeout");
        }
        this.f54407a.mo66808a(C45750c.m100999a(str, sb2.toString()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.kubi.utils.netdiagno.b$b] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Process] */
    /* JADX INFO: renamed from: b */
    public final String m66819b(b bVar, boolean z11) throws Throwable {
        BufferedReader bufferedReader;
        InterruptedException e11;
        ?? r11;
        IOException e12;
        ?? r12;
        ?? r13;
        ?? r14;
        String str = z11 ? "ping -s 8185 -c  " : "ping -c ";
        String str2 = "";
        ?? r15 = 0;
        r15 = 0;
        try {
            try {
                bVar = Runtime.getRuntime().exec(str + this.f54408b + C33627eb.f69716f + bVar.m66820a());
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(bVar.getInputStream()));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            str2 = str2 + line;
                        } catch (IOException e13) {
                            e12 = e13;
                            r12 = bVar;
                            e12.printStackTrace();
                            r14 = r12;
                            r13 = r12;
                            if (bufferedReader != null) {
                            }
                            r13.destroy();
                            return str2;
                        } catch (InterruptedException e14) {
                            e11 = e14;
                            r11 = bVar;
                            e11.printStackTrace();
                            r13 = r11;
                            if (bufferedReader != null) {
                                r14 = r11;
                            }
                            r13.destroy();
                            return str2;
                        }
                    }
                    bufferedReader.close();
                    bVar.waitFor();
                    r14 = bVar;
                } catch (IOException e15) {
                    e12 = e15;
                    bufferedReader = null;
                    r12 = bVar;
                } catch (InterruptedException e16) {
                    e11 = e16;
                    bufferedReader = null;
                    r11 = bVar;
                } catch (Throwable th2) {
                    th = th2;
                    if (r15 != 0) {
                        try {
                            r15.close();
                        } catch (Exception unused) {
                            throw th;
                        }
                    }
                    bVar.destroy();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                r15 = str;
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
            bVar = 0;
        }
        try {
            bufferedReader.close();
            r13 = r14;
            r13.destroy();
        } catch (Exception unused2) {
        }
        return str2;
    }

    public C27076b(a aVar, int i11) {
        this.f54407a = aVar;
        this.f54408b = i11;
    }
}
