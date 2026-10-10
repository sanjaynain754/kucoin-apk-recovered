package com.tencent.bugly.proguard;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.y6 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34034y6 extends AbstractC34048z0 {

    /* JADX INFO: renamed from: h */
    public static final String f72549h = "RMonitor_FdLeak_ThreadsDumper";

    @Override // com.tencent.bugly.proguard.InterfaceC34016x8
    /* JADX INFO: renamed from: a */
    public int mo72778a() {
        return 2;
    }

    @Override // com.tencent.bugly.proguard.AbstractC34048z0
    /* JADX INFO: renamed from: c */
    public C33706i6 mo72780c(String str) throws Throwable {
        BufferedWriter bufferedWriter;
        Writer fileWriter;
        Writer writer = null;
        try {
            fileWriter = new FileWriter(str);
            try {
                bufferedWriter = new BufferedWriter(fileWriter);
                try {
                    List<C34014x6> listM75485c = m75485c();
                    Iterator<C34014x6> it = listM75485c.iterator();
                    while (it.hasNext()) {
                        bufferedWriter.write(it.next().toString());
                        bufferedWriter.newLine();
                        bufferedWriter.newLine();
                    }
                    bufferedWriter.flush();
                    C33706i6 c33706i6M75570a = m75570a(str, listM75485c);
                    C33772l9.m73938a(fileWriter);
                    C33772l9.m73938a(bufferedWriter);
                    return c33706i6M75570a;
                } catch (IOException e11) {
                    e = e11;
                    writer = fileWriter;
                    try {
                        C33648fb.m73043b(f72549h, "dump failed: " + e.getMessage());
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

    /* JADX INFO: renamed from: a */
    public static List<String> m75484a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(stackTraceElementArr.length);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(stackTraceElement.toString());
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static List<C34014x6> m75485c() {
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        ArrayList arrayList = new ArrayList(allStackTraces.size());
        for (Thread thread : allStackTraces.keySet()) {
            arrayList.add(new C34014x6(thread, m75484a(allStackTraces.get(thread))));
        }
        return arrayList;
    }
}
