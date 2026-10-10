package com.blankj.utilcode.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/* JADX INFO: renamed from: com.blankj.utilcode.util.k0 */
/* JADX INFO: compiled from: ThrowableUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5279k0 {

    /* JADX INFO: renamed from: a */
    public static final String f6551a = System.getProperty("line.separator");

    /* JADX INFO: renamed from: a */
    public static String m6258a(Throwable th2) {
        List<String> listM6259b;
        ArrayList arrayList = new ArrayList();
        while (th2 != null && !arrayList.contains(th2)) {
            arrayList.add(th2);
            th2 = th2.getCause();
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        int i11 = size - 1;
        List<String> listM6259b2 = m6259b((Throwable) arrayList.get(i11));
        while (true) {
            int i12 = size - 1;
            if (i12 < 0) {
                break;
            }
            if (i12 != 0) {
                listM6259b = m6259b((Throwable) arrayList.get(size - 2));
                m6260c(listM6259b2, listM6259b);
            } else {
                listM6259b = listM6259b2;
            }
            if (i12 == i11) {
                arrayList2.add(((Throwable) arrayList.get(i12)).toString());
            } else {
                arrayList2.add(" Caused by: " + ((Throwable) arrayList.get(i12)).toString());
            }
            arrayList2.addAll(listM6259b2);
            listM6259b2 = listM6259b;
            size = i12;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            sb2.append(f6551a);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public static List<String> m6259b(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        StringTokenizer stringTokenizer = new StringTokenizer(stringWriter.toString(), f6551a);
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf("at");
            if (iIndexOf != -1 && strNextToken.substring(0, iIndexOf).trim().isEmpty()) {
                arrayList.add(strNextToken);
                z11 = true;
            } else if (z11) {
                break;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static void m6260c(List<String> list, List<String> list2) {
        int size = list.size() - 1;
        for (int size2 = list2.size() - 1; size >= 0 && size2 >= 0; size2--) {
            if (list.get(size).equals(list2.get(size2))) {
                list.remove(size);
            }
            size--;
        }
    }
}
